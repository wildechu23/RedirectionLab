import java.util.Scanner;

public class PigLatin {
  static String vowels = "aeiou";
  static String digraph = "bl br ch ck cl cr dr fl fr gh gl gr ng ph pl pr qu sc sh sk sl sm sn sp st sw th tr tw wh wr";
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    while(s.hasNextLine()) {
      Scanner s2 = new Scanner(s.nextLine());
      while(s2.hasNext()) {
        System.out.print(pigLatinBest(s2.next()).toLowerCase());
        if(s2.hasNext()) {
          System.out.print(" ");
        }
      }
      if(s.hasNextLine()) {
        System.out.println();
      }
    }
    s.close();
  }
  
  public static String pigLatinSimple(String s) {
    if(vowels.contains(s.substring(0,1))) {
      return s + "hay";
    } else {
      return s.substring(1) + s.substring(0,1) + "ay";
    }
  }

  public static String pigLatin(String s) {
    if (digraph.contains(s.substring(0, 2).toLowerCase())) {
      return s.substring(2) + s.substring(0, 2) + "ay";
    } else if (vowels.contains(s.substring(0, 1).toLowerCase())) {
      return s + "hay";
    } else {
      return s.substring(1) + s.substring(0, 1) + "ay";
    }
  }
  
  public static String pigLatinBest(String s) {
    String punc = "";
    String token = s;
    if(!Character.isLetter(token.charAt(token.length()-1)) && !Character
        .isDigit(token.charAt(token.length() - 1))) {
      punc = token.substring(token.length()-1);
      token = token.substring(0, token.length()-1);
    }
    if(!Character.isLetter(token.charAt(0))) {
      return token + punc;
    } else if (token.length() >= 2 && digraph.contains(token.substring(0, 2).toLowerCase())) {
      return token.substring(2) + token.substring(0, 2) + "ay" + punc;
    } else if (vowels.contains(token.substring(0, 1).toLowerCase())) {
      return token + "hay" + punc;
    } else {
      return token.substring(1) + token.substring(0, 1) + "ay" + punc;
    }
  }
}
