//multiple inheritance
class Rectangle
{
    protected int length,breadth;
    public void input(int l,int b)
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
}
class Box extends NewRectangle
{
    protected int height;
    public void get_data(int h)
    {
        height=h;
    }
    public void display_volume()
    {
        System.out.println(" The volume is"+length*breadth*height);
    }
}
class multiple_inheritance
{
    public static void main(String args [])
    {
        Box b1=new Box();
        b1.input(4,2);
        b1.get_data(10);
        b1.display_volume();
    }
}