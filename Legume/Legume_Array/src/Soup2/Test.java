package Soup2;

public class Test
{
  public static void main(String[] args)
  {
    Soup s = new Soup();
    s.add(new Potatoe(0.3, 10));
    s.add(new Carrot(0.25, 30));
    System.out.println(s.getPeelingWeight()); // affiche: 0.155
    Vegetable.setPeelingWeight(0.05);
    System.out.println(s.getPeelingWeight()); // affiche: 0.1275

    System.out.println(s);
  }
}
