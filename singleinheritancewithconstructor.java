//single inheritance with constructor
class Rectangle
{
    protected int length,breadth;
    Rectangle(int l,int b)
    {
        this.length=l;
        this.breadth=b;
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

class singleinheritancewithconstructor
{
    public static void main(String args [])
    {
       NewRectangle r1=new NewRectangle(4,2);
       r1.display();
    }
}