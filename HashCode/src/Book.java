public class Book {


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


}
