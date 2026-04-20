//take an object and cpoy it another object
import java.lang.*;
import java.util.*;
class Rectangle
{
    protected int l,b;
    Rectangle(int len,int bre)
    {
       this.l=len;
       this.b=bre;
    }
    public Rectangle(Rectangle r)
    {
        this.l=r.l;
        this.b=r.b;
    }
    public void display() 
    {
        System.out.println("Rectangle Length: " + l + ", Breadth: " + b);
    }
}
class demoCopy
{
    public static void main(String args [])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Enter Rectangle's length : ");
        int l= sc.nextInt();
        System.out.println("Enter Rectangle's breadth : ");
        int b= sc.nextInt();
        Rectangle r1=new Rectangle(l,b);
        Rectangle r2;
        r2=new Rectangle(r1);
        System.out.println("Original Rectangle:");
        r1.display();
        System.out.println("Copied Rectangle:");
        r2.display();
    }
}