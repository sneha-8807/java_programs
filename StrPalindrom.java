import java.util.*;
class StrPalindrom
{
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter a string : ");
        String input = sc.nextLine();
        if( isPalindrom(input))
        {
            System.out.print(" This string is palindrom.");
        }
        else 
        {
            System.out.print(" This string is palindrom.");
        }
    }
    public static  boolean isPalindrom(String strr)
    {
        int left=0;
        int right=strr.length()-1;
        while(left < right)
        {
            if(strr.charAt(left) != strr.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
 }

