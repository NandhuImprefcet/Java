import java.util.*;
class circle
{
    float radius;
    public circle(float radius)
    {
        this.radius=radius;
    }
    
    public double circumference()
    {
        return this.radius*2*22/7;
    }
    
    public double area()
    {
        return this.radius*this.radius*22/7;
    }
}

public class CircleCheck
{
    public static void main(String []args)
    {
        Scanner nandhu = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:\t");
        float radius=nandhu.nextFloat();
        circle c= new circle(radius);
        System.out.println("Circumference: "+c.circumference());
        System.out.println("Area: "+c.area());
    }
}