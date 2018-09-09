package Soup1;

public class Potatoe
{
  public double poids;
  public int germes;

  public Potatoe(double p, int g)
  {
    poids = p;
    germes = g;
  }

  public Potatoe(double p)
  {
    poids = p;
    Double temp = p*10;
    germes = temp.intValue();
  }

  public String toString()
  {
    return "Patate: [" + poids + "kg - " + germes + " yeux]";
  }
}
