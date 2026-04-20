// give an example of abstract class
abstract class abs
{
    abstract public void display();
    final public void show()
    {
        System.out.println(" Batch 2024 ");
    }
    abstract public void print();
}
class abss extends abs
{
    public void display()
    {
        System.out.println("Batch 2025");
    } 
    public void print()
    {
        System.out.println(" Batch 2026");
    }
}
class demoAbstract
{
    public static void main(String a[])
    {
        abss obj=new abss();
        obj.show();
        obj.display();
        obj.print();
    }
}