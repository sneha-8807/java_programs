//array of object
import java.lang.*;
import java.util.Scanner;
class Box
{
    private int length,breadth,height;
    public Box(int x,int y,int z)
    {
        length =x;
        breadth=y;  
        height=z;  
    }
    public void display()
    {
        System.out.println(" The area is"+ length*breadth*height);
    }
}
class Demo_box_object
{
    public static void main(String a[])
    {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the no of boxs: ");
        int n=sc.nextInt();
        Box r[]=new Box[n];
        for(int i=0;i<n;i++)
        {
            System.out.println(" Enter the length: ");
            x=sc.nextInt();
            System.out.println(" Enter the breadth: ");
            y=sc.nextInt();
            System.out.println(" Enter the height: ");
            z=sc.nextInt();
            r[i]=new Box(x,y,z);
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(" Box no. : " + (i+1));
            r[i].display();
        }
    }
}