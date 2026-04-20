//multiple inheritance with constructor
class Rectangle
{
    protected int length,breadth;
    public Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
}
class NewRectangle extends Rectangle
{
    public void display()
    {
        System.out.println(" The length is"+length*breadth);
    }
    public NewRectangle(int l,int b)
    {
        super(l,b);
    }
}
class Box extends NewRectangle
{
    protected int height;
    Box(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
    public void display()
    {
        System.out.println(" The volume is"+length*breadth*height);
    }
}
class multipleinheritancewithconstructor
{
    public static void main(String args [])
    {
        Box b1=new Box(4,3,2);
        b1.display();
    }
}