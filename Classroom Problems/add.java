import java.util.Random;
class add
{
    public static void main()
    {
        Random rd = new Random();
        int a = rd.nextInt(70000);
        int sum=0;
        System.out.println(a);
        while(a>0)
        {
            sum+=a%10;
            a/=10;
        }
        System.out.println(sum);
    }
}