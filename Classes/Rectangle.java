import java.util.*;
class Rectangle
{
    int length;
    int breath;
    int perimeter;
    int area;
    void setLength(int l)
    {
        length=l;
    }

    void setBreath(int b)
    {
        breath=b;
    }

    int area()
    {
        return (length*breath);
    }

    int perimeter()
    {
        return 2*length*breath;
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length in whole number:\t");
        int length=sc.nextInt();
        System.out.print("Enter the breath in whole number:\t");
        int breath=sc.nextInt();
        Rectangle r1= new Rectangle();
        r1.setLength(length);
        r1.setBreath(breath);
        System.out.println("Perimeter: "+r1.perimeter());
        System.out.println("Area: "+r1.area());

    }
}