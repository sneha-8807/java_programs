//method overloading
//how to overload a constructor
class Rectangle
{
    protected int length,breadth;
    public Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    public void display()
    {
        System.out.println("the area is"+length*breadth);
    }
    public Rectangle(int x)
    {
        length=x;
        breadth=x;
    }
}
class methodOverloading
{
     public static void main(String args [])
     {
        Rectangle r1=new Rectangle(4);
        Rectangle r2=new Rectangle(6,2);
        r1.display();
        r2.display();

     }
}