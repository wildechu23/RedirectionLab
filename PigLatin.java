public class PigLatin {
  static String vowels = "aeiou";
  static String digraph = "bl br ch ck cl cr dr fl fr gh gl gr ng ph pl pr qu sc sh sk sl sm sn sp st sw th tr tw wh wr";
  public static void main(String[] args) {
    pigLatinSimple("hello");
    pigLatinSimple("airplane");
    pigLatinSimple("panda");
  }
  
  public static String pigLatinSimple(String s) {
    if(vowels.contains(s.substring(0,1))) {
      return s + "hay";
    } else {
      return s.substring(1) + s.substring(0,1) + "ay";
    }
  }

  public static String pigLatin(String s) {
    if (digraph.contains(s.substring(0, 2))) {
      return s.substring(2) + s.substring(0, 2) + "ay";
    } else if (vowels.contains(s.substring(0, 1))) {
      return s + "hay";
    } else {
      return s.substring(1) + s.substring(0, 1) + "ay";
    }
  }
}
