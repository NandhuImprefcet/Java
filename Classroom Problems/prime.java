import java.util.Scanner;
class PrimeChecker
{
    public boolean checkPrime(int number)
    {
        if(number==2)
            return true;
        else if(number%2==0)
            return false;
        int c=1;
        while(true)
        {
            if((c*c)>=number)
                break;
            c++;
        }
        for(int i=3;i<=c;i+=2)
            if(number%i==0)
                return false;
        return true;
    }
}

public class Prime
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound\t");
        int lower=sc.nextInt();
        System.out.print("Enter the upper bound\t");
        int upper=sc.nextInt();
        PrimeChecker pc = new PrimeChecker();
        int count=0;
        System.out.println("Prime numbers between "+lower+" and "+upper+" are:");
        for(int i=lower;i<=upper;i++)
        {
            if(pc.checkPrime(i))
            {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Total count: "+count);
    }
}