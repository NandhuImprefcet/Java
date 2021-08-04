import java.util.*;
class GCD
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        int num2=sc.nextInt();
        int large=num1>num2?num1:num2;
        int small=num1+num2-large;
        System.out.println("large "+large);
        System.out.println("small "+small);
        int gcd=0;
        do
        {
            int remainder=large%small;
            if(remainder==0)
            {
                gcd=small;
                break;
            }
            large=small;
            small=remainder;
        }while(true);
        System.out.println("The Gcd of "+num1+" and "+num2+" is "+gcd);
    }
}
