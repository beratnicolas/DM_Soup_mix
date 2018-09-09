package Soup2;

public class Potatoe extends Vegetable
{
  public Potatoe(double p, int g)
  {
    super(p, g);
  }

  public Potatoe(double p)
  {
    super(p, (int)p*10);
  }

  public String toString()
  {
    return "Patate: [" + poids + "kg - " + car + " yeux]";
  }
}