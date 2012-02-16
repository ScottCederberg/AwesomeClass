public class Hello {

  public static void main(String[] args) {
    if (args.length > 0 && "-f".equals(args[0])) {
      System.out.println("~~~ You're a fancy fellow.  Here's a fancy greeting. ~~~");
      System.out.println("___ Ooooh la la ___");
    } else {
      System.out.println("Hello, git users!  You're looking awesome today!");
    }
  }
}