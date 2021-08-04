import java.util.*;
class CheckPrime
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number=sc.nextInt();
        for(int i=2;i<number;i++)
            if(number%i==0)
            {
                System.out.println(number+" is Not a prime number");
                return;
            }
        System.out.println(number+ " is a prime number");
    }
}
