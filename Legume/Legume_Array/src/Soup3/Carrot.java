package Soup3;

public class Carrot extends Vegetable
{

  public Carrot(double p, int l)
  {
    super(p, l);
  }


  public double getPeelingWeight(double p)
  {	  
      double r = p * peelingWeight;
      return r;
  }
  public int getCalories()
  {
    /*double rp = (1-peelingWeight) * poids;*/
	double rp = (poids- getPeelingWeight(poids));
    return (int)(400 * rp);
  }
  
  public String toString()
  {
    return "Carotte: [" + getCalories() + " calories - " + poids + "kg - " + car + " cm]";
  }
}