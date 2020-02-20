import java.util.PriorityQueue;

public class Library {

  private int numberOfBooks;
  private int signup;
  private int booksPerDay;
  public PriorityQueue<Book> books;

  Library(int numberOfBooks, int signup, int booksPerDay) {
    this.numberOfBooks = numberOfBooks;
    this.signup = signup;
    this.booksPerDay = booksPerDay;
    books = new PriorityQueue<>();
  }

  public int getBooksPerDay() {
    return booksPerDay;
  }

  public int getNumberOfBooks() {
    return numberOfBooks;
  }

  public int getSignup() {
    return signup;
  }
}
