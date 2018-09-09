package Soup2;

public class Vegetable
{
  public double poids;
  public int car;
  public static double peelingWeight;

  public Vegetable(double p, int c)
  {
    poids = p;
    car = c;
    peelingWeight = 0.1;
  }

  public static void setPeelingWeight(double p)
  {
    peelingWeight = p;
  }
}
