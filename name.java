import java.io.*;
import java.util.Scanner;
class Main
{
    public static void main(String a[])
    {
        System.out.println("enter your name: ");
        Scanner name=new Scanner(System.in);
        String MyName=name.nextLine();
        System.out.println("Hello " + MyName);
        System.out.println("Have a nice day !");
        name.close();
    }
}