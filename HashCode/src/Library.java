public class Library {

  private int numberOfBooks;
  private int signup;
  private int booksPerDay;
  public int[] books;

  Library(int numberOfBooks, int signup, int booksPerDay) {
    this.numberOfBooks = numberOfBooks;
    this.signup = signup;
    this.booksPerDay = booksPerDay;
    books = new int[numberOfBooks];
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
