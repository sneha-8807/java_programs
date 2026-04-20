import java.util.*;
class JavaSpecial
{
	static int specialno(int n)
	{
		if(n==1)
		 {
			  return 1;
		 }	  
		else
		 {
			 return n*specialno(n-1);
		 }
	}
public static void main(String a[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a number : ");
	int n= sc.nextInt();
	int sum=0,orgs,rem;
	orgs=n;
	while(n>0)
	{
		rem=n%10;
		sum=sum+specialno(rem);
		n=n/10;
	}
	if(orgs==sum)
	{
		System.out.print("The number is special");
	}
	else
	{
	        System.out.print("The number is not  special");

	}
}
}