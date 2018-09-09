package Soup3;

public class Vegetable implements Quantifiable
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

  public int getCalories()
  {
    return 0;
  }
}