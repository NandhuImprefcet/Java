import java.util.*;
class Calc
{
    int add(int a,int b)
    {
        return a+b;
    }

    int sub(int a,int b)
    {
        return a-b;
    }

    int mul(int a,int b)
    {
        return a*b;
    }

    int div(int a, int b)
    {
        return a/b;
    }

    int mod(int a, int b)
    {
        return a%b;
    }
    
}
public class Calculator
{
    
    public static void main(String []args)
    {
        Calc c = new Calc();
        System.out.println(c.add(10,15));
        System.out.println(c.sub(10,15));
        System.out.println(c.mul(10,15));
        System.out.println(c.div(10,15));
        System.out.println(c.mod(10,15));
    }
    
}