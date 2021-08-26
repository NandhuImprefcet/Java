import java.util.Scanner;
class Calculator
{
    public static int powerInt(int num1,int num2)
    {
        int prod=1;
        for(int i=0;i<num2;i++)
            prod*=num1;
        return prod;
    }
    public static double powerDouble(double num1,int num2)
    {
        double prod=1;
        for(int i=0;i<num2;i++)
            prod*=num1;
        return prod;
    }
}

public class CalculatorCheck
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.PowerInt");
        System.out.println("2.PowerDouble");
        System.out.print("Enter your choice\t");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
                System.out.print("Enter num1\t");
                int num1=sc.nextInt();
                System.out.print("Enter num2\t");
                int num2=sc.nextInt();
                System.out.println(num1+"^"+num2+"="+Calculator.powerInt(num1,num2));
                break;
            case 2:
                System.out.print("Enter num1\t");
                double n1=sc.nextDouble();
                System.out.print("Enter num2\t");
                int n2=sc.nextInt();
                System.out.println(n1+"^"+n2+"="+Calculator.powerDouble(n1,n2));
                break;
        }
    }
}
