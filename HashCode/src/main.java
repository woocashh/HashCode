import java.io.File;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class main {

  private static Map<Integer, Book> booksValue = new HashMap<>();

  public static void main(String[] args) {
    Scanner scanner;
    try {
      scanner = new Scanner(new File(args[0]));
    } catch (Exception e) {
      scanner = new Scanner(System.in);
      System.out.println("not file found, " + e);
    }

    int numberOfBooks = scanner.nextInt();
    int numberOfLibraries = scanner.nextInt();
    int days = scanner.nextInt();

    for (int i = 0; i < numberOfBooks; i++) {
      booksValue.put(i, new Book(scanner.nextInt()));
    }

    Library[] libraries = new Library[numberOfLibraries];

    for (int i = 0; i < numberOfLibraries; i++) {
      libraries[i] = new Library(scanner.nextInt(),
          scanner.nextInt(), scanner.nextInt());
      for (int j = 0; j < libraries[i].getNumberOfBooks(); j++) {
        libraries[i].books.add(booksValue.get(j));
      }
    }
  }

}
