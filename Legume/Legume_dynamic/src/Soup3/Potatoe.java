package Soup3;

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

  public double getPeelingWeight(double p)
  {	  
      double r = p * peelingWeight;
      r += 0.01 * car;
      return r;
  }
  public int getCalories()
  {
    //double rp = (1-peelingWeight) * poids;
    double rp = (poids- getPeelingWeight(poids));
    return (int)(800 * rp - 5 * car);
  }
  
  public String toString()
  {
    return "Patate: [" + getCalories() + " calories - " + poids + "kg - " + car + " yeux]";
  }
}
