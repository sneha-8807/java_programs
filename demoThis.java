//use of this
import java.lang.*;
import java.util.Scanner;
class Rectangle
{
    private int length, breadth;
    Rectangle( int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }
    public int area()
    {
        return length*breadth;
    }
}
class Circle
{
    private int radius;
    public Circle( int radius)
    {
        this.radius=radius;
    }
    public double area()
    {
        return( 3.14*radius*radius);
    }
}
class demoThis
{
    public static void main( String a[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter the length and breadth: ");
        int l= sc.nextInt();
        int b =sc.nextInt();
        Rectangle r1=new Rectangle(l,b);
        System.out.println(" The area is "+r1.area());
        System.out.println(" Enter the radius: ");
        int r =sc.nextInt();
        Circle c=new Circle(r);
        System.out.println(" The area is "+c.area());
    }
}