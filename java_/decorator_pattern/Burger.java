package java_.decorator_pattern;

public abstract class Burger {
  private String description;
  private double price = 200.0;

  public abstract String getDescription();

  public abstract double getPrice();
}