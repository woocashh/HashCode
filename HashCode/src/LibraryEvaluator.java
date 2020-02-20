import java.util.ArrayList;
import java.util.List;

public class LibraryEvaluator {

  public static List<Library> getRankedLibraries(int numDaysLeft, List<Library> libraries) {
    List<Library> topLibraries = new ArrayList<>();

    for (int i = 0; i < libraries.size(); i++) {
      // The scores are in the order of the library list
      List<Integer> libScores = new ArrayList<>();

      for (Library lib : libraries) {
        int maxNumBooks = (numDaysLeft - lib.getSignup()) * lib.getBooksPerDay();

        maxNumBooks = Math.min(maxNumBooks, lib.getNumberOfBooks());
        int score = 0;
        for (int k = 0; k < maxNumBooks; k++) {
          Book book = lib.getSortedBooks[k];

          if (!book.isTaken()) {
            score += book.getScore();
            book.take();
          }
        }

        libScores.add(score);
      }

      int topLibIndex = 0;
      for (int k = 0; k < libScores.size(); k++) {
        if (libScores.get(k) > libScores.get(topLibIndex)) {
          topLibIndex = k;
        }
      }

      Library topLibrary = libraries.get(topLibIndex);
      topLibraries.add(topLibrary);
      numDaysLeft -= topLibrary.getSignup();

      if (numDaysLeft <= 0) {
        break;
      }
    }

    return topLibraries;
  }
}
