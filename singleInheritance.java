//single inheritance
import java.util.*;

class Rectangle {
    protected int len, wid; 
    public void input(int x, int y)
    {
        len = x;
        wid = y;
    }
    public void display() 
    {
        System.out.println("Area of Rectangle: " + (len * wid));
    }
}

class Box extends Rectangle {
    private int height;
    public void getdata(int x, int y, int z) 
    {
        len = x; 
        wid = y; 
        height = z;
    }
    public void show() 
    {
        System.out.println("Volume of Box: " + (len * wid * height));
    }
}

class singleInheritance {
    public static void main(String[] args) 
    {
        Box b1 = new Box();
        Box b2 = new Box();
        b1.getdata(4, 3, 2); 
        b1.show(); 
        b2.input(5, 6); 
        b2.display(); 
    }
}
