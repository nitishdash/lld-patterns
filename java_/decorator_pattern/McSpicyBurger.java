package java_.decorator_pattern;

public class McSpicyBurger extends Burger {
  private String description;
  private double price;

  public McSpicyBurger() {
    this.description = "McSpicy Burger";
    this.price = 200.0;
  }

  @Override
  public String getDescription() {
    return description;
  }

  @Override
  public double getPrice() {
    return price;
  }
}
