class Rectangle
{
    private int length,breadth;
    public Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
    public void display()
    {
        System.out.println("Area is "+ length*breadth);
    }
}
class DemoConstructor
{
    public static void main(String args [])
    {
       Rectangle r1=new Rectangle(4,2);
       r1.display();
    }
}    