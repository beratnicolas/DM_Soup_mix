package Soup2;

import java.util.ArrayList;

public class Soup
{
  ArrayList<Vegetable> legumes;

  public Soup()
  {
    legumes = new ArrayList<Vegetable>();
  }

  public void add(Vegetable v)
  {
    legumes.add(v);
  }

  public double getPeelingWeight()
  {
    double r = 0;
    for (Vegetable legume : legumes)
    {
      r += legume.poids * legume.peelingWeight;
      if (legume instanceof Potatoe)
        r += 0.01 * legume.car;
    }
    return r;
  }

  public String toString()
  {
    String s = "";
    s += "Soupe" + System.lineSeparator();
    s += "------" + System.lineSeparator();
    for (Vegetable legume : legumes)
    {
      s += legume.toString() + System.lineSeparator();
    }
    return s;
  }
}