package Adv;

public class Dog5
{
    private String name;

    public Dog5(String name)
    {
        this.name = name;
    }

    public boolean equals(Dog5 other)//d1=Rufus //d2=Sally
    {
        return  this.name == other.name;
    }

    public static void main(String[] args)
    {
        Dog5 d1 = new Dog5("Rufus");//d1.name="Rufus"
        Dog5 d2 = new Dog5("Sally");//d2.name ="Sally"
        Dog5 d3 = new Dog5("Rufus");//d3.name="Rufus"
        Dog5 d4 = d3;// d4.name="Rufus"
        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d3));
        System.out.println(d1.equals(d3));
        System.out.println(d3.equals(d4));
    }
}
