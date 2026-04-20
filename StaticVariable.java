//static variable
class Rectangle
{
    private int length, breadth;
    static int count ;
    Rectangle( int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
        count++;
    }
    public void display()
    {
        System.out.println(" no. of count "+ count);
    }
}
class StaticVariable
{
    public static void main(String a[])
    {  
        Rectangle r1 , r2 ,r3;
        r1= new Rectangle(2,3);
        r2= new Rectangle(10,2);
        r1.display();
        r2.display();
        r3= new Rectangle(20,30);
        r3.display();
        r2.display();
        r1.display();
    }
}       