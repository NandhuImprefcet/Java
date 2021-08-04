/*
 * 2. Write a program to enter two angles of a triangle and \
 * find the third angle.
 */
import java.util.*;
class Triangle
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first angle: ");
        float first=sc.nextFloat();
        System.out.print("Enter the Second angle: ");
        float second=sc.nextFloat();
        
        if((first+second)>180)
            System.out.println("The third angle can't be formed");
        else    
            System.out.println("The third angle is: "+(180-(first+second)));
        
    }
}