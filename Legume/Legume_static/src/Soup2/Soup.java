package Soup2;

public class Soup
{
  Vegetable[] legumes;
  int pointeur;

  public Soup()
  {
    legumes = new Vegetable[10];
    pointeur = 0;
  }

  public void add(Vegetable v)
  {
    legumes[pointeur] = v;
    pointeur += 1;
  }

  public double getPeelingWeight()
  {
    double r = 0;
    for (int i = 0 ; i < pointeur; i++)
    {
      r += legumes[i].poids * Vegetable.peelingWeight;
      if (legumes[i] instanceof Potatoe)
        r += 0.01 * legumes[i].car;
    }
    return r;
  }

  public String toString()
  {
    String s = "";
    s += "Soupe" + System.lineSeparator();
    s += "------" + System.lineSeparator();
    for (int i = 0 ; i < pointeur; i++)
    {
      s += legumes[i].toString() + System.lineSeparator();
    }
    return s;
  }
}