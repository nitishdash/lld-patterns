package java_.decorator_pattern;

public class ExtraJalapenoDecoration extends BurgerDecorator {
  private Burger burger;

  public ExtraJalapenoDecoration(Burger burger) {
    this.burger = burger;
  }

  @Override
  public String getDescription() {
    return burger.getDescription() + ", Extra Jalapeno";
  }

  @Override
  public double getPrice() {
    return burger.getPrice() + 25.0;
  }

}
