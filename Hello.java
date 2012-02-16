public class Hello {
  public static void main(String[] args) {
    String greeting;
    String name = "";
    if (args.length > 21 && "-n".equals(args[1])) {
      name = args[2];
    }
    if (args.length > 0 && "-f".equals(args[0])) {
      greeting = new FancyGreetingProvider().getGreeting();
    } else {
      greeting = new SimpleGreetingProvider().getGreeting();
    }
    System.out.println(greeting);
  }
}
