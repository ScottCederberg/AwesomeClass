public class Hello {
  public static void main(String[] args) {
    String greeting;
    if (args.length > 0 && "-f".equals(args[0])) {
      greeting = new FancyGreetingProvider().getGreeting();
    } else {
      greeting = new SimpleGreetingProvider().getGreeting();
    }
    System.out.println(greeting);
  }
}
