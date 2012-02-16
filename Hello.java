public class Hello {

  private static String getSimpleGreeting() {
    return "Hello, git users!  You're looking awesome today!";
  }

  private static String getFancyGreeting() {
    return "~~~ You're a fancy fellow.  Here's a fancy greeting. ~~~\n"
        + "___ Ooooh la la ___";
  }

  public static void main(String[] args) {
    String greeting;
    if (args.length > 0 && "-f".equals(args[0])) {
      greeting = getFancyGreeting();
    } else {
      greeting = getSimpleGreeting();
    }
    System.out.println(greeting);
  }
}