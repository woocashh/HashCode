import java.io.File;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class main {

  private static Map<Integer, Integer> booksValue = new HashMap<>();

  public static void main(String[] args) {
    Scanner scanner;
    try {
      scanner = new Scanner(new File(args[0]));
    } catch (Exception e){
      scanner = new Scanner(System.in);
    }

    int numberOfBooks = scanner.nextInt();
    int numberOfLibraries = scanner.nextInt();
    int days = scanner.nextInt();

    for (int i = 0; i < numberOfBooks; i++){
      booksValue.put(i, scanner.nextInt());
    }

    Library[] libraries = new Library[numberOfLibraries];

    for (int i = 0; i < numberOfLibraries; i++){
      libraries[i] = new Library()
    }


  }

}
