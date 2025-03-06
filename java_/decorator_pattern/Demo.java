package java_.decorator_pattern;

public class Demo {
  public static void main(String[] args) {
    Burger burger = new McSpicyBurger();
    burger = new ExtraCheeseDecoration(burger);
    burger = new ExtraJalapenoDecoration(burger);
    System.out.println(burger.getDescription() + " Rs." + burger.getPrice());
  }

}
