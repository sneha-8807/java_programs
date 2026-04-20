//addition of two object using function
import java.util.Scanner;
class Rectangle 
{
    private int length, breadth;
    public Rectangle ( int len,int bre)
    {
        length=len;
        breadth=bre;
    }
    public void display()
    {
        System.out.println(" The area of the rectangle is "+ length*breadth);
    }
    public Rectangle sum( Rectangle r)
    {
        int x,y;
        x = this.length + r.length;
        y= this.breadth + r.breadth;
        Rectangle r3= new Rectangle( x,y);
        return r3;
    }
}
class sumOfTwoObject
{
     public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter length of 1st rectangle: ");
        int l=sc.nextInt();
        System.out.println(" Enter breadthof 1st rectangle : ");
        int b=sc.nextInt();
        Rectangle r1 = new Rectangle(l,b);
        System.out.println(" Enter length of 2nd rectangle : ");
        l=sc.nextInt();
        System.out.println(" Enter breadth of 2nd rectangle : ");
        b=sc.nextInt();
        Rectangle r2 = new Rectangle(l,b);
        Rectangle r4;
        r4= r1.sum(r2);
        r4.display();
    }
}