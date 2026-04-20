import java.io.*;
import java.util.Scanner;
class Calculator
{
    public static void main(String a[])
    {
        while(true)
        {
            System.out.println(" 1 for Addition\n 2 for subtraction\n 3 for Multiplecation\n 4 for Division\n 5 for Exit");
            System.out.print(" Enter your choice: ");
            Scanner ch= new Scanner(System.in);
            int choice=ch.nextInt();
            switch(choice)
            {
                case 1: addition();
                break;
                case 2: subtraction();
                break;
                case 3: multiplecation();
                break;
                case 4: division();
                break;
                case 5: System.exit(1);
                break;
                default : System.out.println(" You entered wrong choice !");
            }
        }
    }
    public static void addition()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter 1st number: ");
        int n1=sc.nextInt();
        System.out.print(" Enter 2nd number: ");
        int n2=sc.nextInt();
        int result=n1+n2;
        System.out.println("The sum is "+ result);

    }
    public static void subtraction()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter 1st number: ");
        int n1=sc.nextInt();
        System.out.print(" Enter 2nd number: ");
        int n2=sc.nextInt();
        int result=n1-n2;
        System.out.println("The subtraction is "+ result);

    }
    public static void multiplecation()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter 1st number: ");
        int n1=sc.nextInt();
        System.out.print(" Enter 2nd number: ");
        int n2=sc.nextInt();
        int result=n1*n2;
        System.out.println("The multiplecation is "+ result);

    }
    public static void division()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter 1st number: ");
        int n1=sc.nextInt();
        System.out.print(" Enter 2nd number: ");
        int n2=sc.nextInt();
        int result=n1/n2;
        System.out.println("The division is "+ result);

    }
}