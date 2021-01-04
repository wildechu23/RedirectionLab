import java.util.Scanner;

public class MakeStars {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    while(s.hasNextLine()) {
      Scanner s2 = new Scanner(s.nextLine());
      while(s2.hasNext()) {
        // System.out.println()
        String token = s2.next();
        for(int i = 0; i < token.length(); i++) {
          System.out.print("*");
        }
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}