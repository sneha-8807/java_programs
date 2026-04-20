import java.util.*;
class Box
{
    private int length,breadth,height;
    public Box(int l,int b,int h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    private int cal()
    {
        return(length * breadth * height);
    }
    public void display()
    {
        System.out.println(" The volume of the box is "+ cal());
    }
}
class BoxVolumeCalculate
{
    public static void main(String a[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the box lenght: ");
        int l=sc.nextInt();
        System.out.println("Enter the box breadth: ");
        int b=sc.nextInt();
        System.out.println("Enter the box height: ");
        int w=sc.nextInt();
        Box b1=new Box(l,b,w);
        b1.display();
    }
}