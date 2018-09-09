package Soup1;

public class Carrot
{
  public double poids;
  public int longueur;

  public Carrot(double p, int l)
  {
    poids = p;
    longueur = l;
  }

  public String toString()
  {
    return "Carotte: [" + poids + "kg - " + longueur + " cm]";
  }
}