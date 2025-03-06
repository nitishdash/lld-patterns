package java_.decorator_pattern;

public class ExtraCheeseDecoration extends BurgerDecorator {
  private Burger burger;

  public ExtraCheeseDecoration(Burger burger) {
    this.burger = burger;
  }

  @Override
  public String getDescription() {
    return burger.getDescription() + ", Extra Cheese";
  }

  @Override
  public double getPrice() {
    return burger.getPrice() + 50.0;
  }

}
