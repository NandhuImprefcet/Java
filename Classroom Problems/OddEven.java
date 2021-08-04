import java.util.*;
class OddEven
{
    public static void main()
    {
        System.out.println("Enter a number to be checked if it is odd or even");
        Scanner nandhu = new Scanner(System.in);
        int number=nandhu.nextInt();
        if(number%2==0)
            System.out.println(number+" is an Even Number");
        else
            System.out.println(number+" is an Odd Number");
    }
}
