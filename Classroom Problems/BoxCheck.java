import java.util.*;
class Box
{
    double width,height,depth;
    
    public Box(double w,double h, double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    /*
    void setWidth(double w)
    {
        
    }
    void setHeight(double h)
    {
        
    }
    void setDepth(double d)
    {
        
    }
    */
    double volume()
    {
        return width*height*depth;
    }
    
}
public class BoxCheck
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Width of the box\t");
        double width=sc.nextDouble();
        System.out.print("Enter the Height of the box\t");
        double height=sc.nextDouble();
        System.out.print("Enter the Depth of the box\t");
        double depth=sc.nextDouble();
        Box b=new Box(width,height,depth);
        System.out.println("The volume of the box is "+b.volume());
    }
}