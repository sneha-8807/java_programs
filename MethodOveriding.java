//method overriding
class  Method
{
    public void display()
    {
        System.out.println("Batch 2024");
    }
}
class Overiding extends Method
{
    public void display()
    {
        System.out.println("Batch 2025");
        System.out.println("Bye");
    }
}
class MethodOveriding
{
    public static void main(String a[])
    {
        Overiding obj= new Overiding();
        obj.display();
    }
}