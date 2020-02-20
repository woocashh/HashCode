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

  @Override
  public String toString() {
    StringBuilder strbuilder = new StringBuilder();
    strbuilder.append(numberOfBooks);
    strbuilder.append(" ");
    strbuilder.append(signup);
    strbuilder.append(" ");
    strbuilder.append(booksPerDay);
    strbuilder.append(" ");
    strbuilder.append("\n");
    for (int i =0; i< numberOfBooks; i++){
      strbuilder.append(books[i]);
      strbuilder.append(" ");
    }

    return strbuilder.toString();
  }
}
