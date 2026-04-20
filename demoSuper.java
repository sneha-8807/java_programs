//using super
class x
{
    protected int a,b;
    x(int v1, int v2)
    {
        a=v1;
        b=v2;
    }
    final public void display()
    {
        System.out.println(a+b);
    }
}
class y extends x
{
    protected int c;
    public y(int v1,int v2, int v3)
    {
        super (v1,v2);
        c=v3;
    }
    public void show()
    {
        System.out.println(a+b+c);
    }
}
class demoSuper
{
    public static void main( String a[])
    {
        y obj = new y(4,3,2);
        obj.display();
        obj.show();
    }
}