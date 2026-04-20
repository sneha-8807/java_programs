//static method
class Rectangle
{
    public static int area( int l,int b)
    {
        return(l*b);
    }
}
class Circle
{
    public static void area(int r)
    {
        float a;
        a = 3.14f*r*r;
        System.out.println(" The area of the circle is "+ a);
    }
}
class StaticMethod
{
    public static void main(String a[])
    {
        int aa;
        aa = Rectangle.area( 2,4);
        System.out.println(" The area of the rectangle is "+ aa);
        Circle.area(2);
    }
}
