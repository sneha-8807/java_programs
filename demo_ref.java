//how to create a reference of an object
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
}
class demo_ref
{
     public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter length: ");
        int l=sc.nextInt();
        System.out.println(" Enter breadth: ");
        int b=sc.nextInt();
        Rectangle r1 = new Rectangle(l,b);
        Rectangle r2;
        r2=r1;
        r2.display();
    }
}
