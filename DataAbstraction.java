abstract class Rectangle
{
    protected int length,breadth;
    public Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    abstract public void display();
}
class NewRectangle extends Rectangle
{ 
    public NewRectangle(int l,int b)
    {
        super(l,b);
    }
    public void display()
    {
        System.out.println(" The length is"+length*breadth);
    }
}
class DataAbstraction
{
    public static void main(String args [])
    {
       NewRectangle r1=new NewRectangle(4,2);
       r1.display();
    }
}