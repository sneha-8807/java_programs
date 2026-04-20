//array of object
import java.lang.*;
import java.util.Scanner;
class Rectangle
{
    private int length,breadth;
    public Rectangle(int x,int y)
    {
        length =x;
        breadth=y;    
    }
    public void display()
    {
        System.out.println(" The area is"+length*breadth);
    }
}
class Demo_area_objects
{
    public static void main(String a[])
    {
        int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the no of rectangles: ");
        int n=sc.nextInt();
        Rectangle r[]=new Rectangle[n];
        for(int i=0;i<n;i++)
        {
            System.out.println(" Enter the length: ");
            x=sc.nextInt();
            System.out.println(" Enter the breadth: ");
            y=sc.nextInt();
            r[i]=new Rectangle(x,y);
        }
        for(int i=1;i<=n;i++)
        {
            System.out.println(" Rectangle no. :" + i);
            r[i].display();
        }
    }
}