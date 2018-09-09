package Soup3;

public class Test
{
  public static void main(String[] args)
  {
    Potatoe p1 = new Potatoe(0.3, 10);
    Carrot c1 = new Carrot(0.25, 30);
    Soup s = new Soup();
    s.add(p1);
    s.add(c1);
    System.out.println("Les quantifiables :");
    Quantifiable quantifiables[] = {p1, c1 ,s};
    for(Quantifiable quantifiable : quantifiables) {
    	System.out.println(quantifiable);
    }
  }
}
