import java.util.*;                                   //javac AdouptSeries.java    ...to create .class file
class AdouptSeries                                    // java AdoubtSeries         ...to run code
{
    static int myPow(int b,int p)
    {
        int res=1,i;
        for(i=1;i<=p;i++)
        {
            res=res*b;
        }
        return res;
    }
    static int myRev(int n)
    {
        int res=0,r;
        while(n!=0)
        {
            r=n%10;
            res=res*10+r;
            n=n/10;
        }
        return res;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,lr,ur,n,nSq,nRev,nRevSq,nSqRev;
        System.out.println(" Enter the lower bound and upper bound : ");
        lr=sc.nextInt();
        ur=sc.nextInt();
        for(i=lr;i<=ur;i++)
        {
            n=i;
            nSq=myPow(n,2);
            nRev=myRev(n);
            nRevSq=myPow(nRev,2);
            nSqRev=myRev(nSq);
            if(nRevSq==nSqRev)
            {
                System.out.println("\t"+ n);
            }
        }
    }
}