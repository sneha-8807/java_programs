import java.util.*;
class JavaMaxMin
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter the range of the array: ");
        int n=sc.nextInt();
        System.out.print("Enter the elements one by one: ");
        int a[]=new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int Max=a[0],Min=a[0];
        for(int i=1;i<n;i++)
        {
            if(Max<a[i])
            {
                Max=a[i];
            }
            if(Min>a[i])
            {
                Min=a[i];
            }
        }
        System.out.print("The maximun is"+ Max + "The minimun is "+ Min);

    }

}