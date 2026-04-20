//how to prevent overriding
 final class Method
{
    final public void display()
    {
        System.out.println("Batch 2024");
    }
}
class Overiding
{
    public void show()
    {
        System.out.println("Batch 2025");
        System.out.println("Bye");
    }
}
class MethodOveridingPrevent
{
    public static void main(String a[])
    {
        Method obj1= new Method();
        obj1.display();
        Overiding obj2= new Overiding();
        obj2.show();
    }
}