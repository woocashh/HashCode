public class Book implements Comparable<Book>{


  private int score;
  private boolean taken;

  public Book(int score){
    this.score = score;
    this.taken = false;
  }

  public void take(){
    taken =  true;
  }

  public boolean isTaken(){
    return taken;
  }

  public int getScore() {
    return score;
  }

  @Override
  public int compareTo(Book other){
    return Integer.compare(score, other.score);
  }

}
