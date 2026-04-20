import java.lang.*;
import java.util.*;
class rect
{
    private int len,wid;
    public rect(int l,int w)
    {
        len=l;
        wid=w;
    }
    public rect()
    {
        len=5;
        wid=2;
    }
    public void display()
    {
        int a;
        a=areaCalculate();
        System.out.println("\nThe area is"+ a);
    }
    private int areaCalculate()
    {
        return(len*wid);
    }
}
class rectangleAreaCalculate
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int l=sc.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int w=sc.nextInt();
        rect r1=new rect(l,w);
        rect r2=new rect();
        r1.display();
        r2.display();
    }
}