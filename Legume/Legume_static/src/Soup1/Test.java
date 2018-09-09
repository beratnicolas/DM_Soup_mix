package Soup1;

public class Test
{
  public static void main(String[] args)
  {
    Carrot c = new Carrot(0.25, 30);
    System.out.println(c);

    Potatoe p = new Potatoe(0.3, 10);
    System.out.println(p);

    Potatoe pp = new Potatoe(0.3);
    System.out.println(pp);

    Potatoe ppp = new Potatoe(0.75);
    System.out.println(ppp);
  }
}