import java.util.*;
class javaInitial
{
    public static void main(String ar[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name: ");
        String s=sc.nextLine();
        String s1=" ";
        s=s.trim();
        s=s.toUpperCase();
        String word[]=s.split(" ");
        int l=word.length,i;
        for(i=0;i<l-1;i++)
        {
            s1+=word[i].charAt(0)+" . ";
        }
        s1+=word[i].charAt(0)+word[i].substring(1).toLowerCase()+" . ";
        System.out.println("The requeird string is : "+s1);
     }
}