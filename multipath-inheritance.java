class App
{
    public void fruits()
    {
        System.out.println("Apple");
    }
}
class Fruits extends App
{
    public void apple()
    {
        System.out.println("sweety");
    }
}
class Grapes extends App
{
    public void taste()
    {
        System.out.println("sour");
    }
}
class Orange extends App, Grapes
{
    public void type()
    {
        System.out.println("fresh");
    }
}
class MultiPath
{
    public static void main(String[] args)
    {
        Fruits obj1 = new Fruits();
        Orange obj2 = new Orange();
        obj1.apple();
        obj2.taste();
    }
}
