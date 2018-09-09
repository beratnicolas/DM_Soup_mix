package Soup3;

public class Soup implements Quantifiable
{
	Vegetable[] legumes;
	Vegetable[] new_legumes;
	int pointeur;

public Soup()
{
	legumes = new Vegetable[1];
	pointeur = 0;
}
  public void add(Vegetable v)
  {		
	new_legumes = new Vegetable[pointeur+1];
	new_legumes[pointeur] = v;
	for (int i = 0 ; i < pointeur; i++)
	{
		new_legumes[i] = legumes[i];
				
	}
	legumes = new_legumes;
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
	   int i = 0;
	   for (Vegetable legume : legumes) {
	      i += legume.getCalories();
	    }
	    s += i + " calories" + System.lineSeparator();
	    for (Vegetable legume : legumes)
	    {
	      s += legume.toString() + System.lineSeparator();
	    }
	    s += "------" + System.lineSeparator();
	    return s;
  }

  public int getCalories()
  {
    int r = 0;
    for (int i = 0 ; i < pointeur; i++)
      r += legumes[i].getCalories();
    return r;
  }
}



