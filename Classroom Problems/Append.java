import java.util.*;
public class Append
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the original String: ");
        String original = new String(sc.nextLine());
        System.out.println("Enter the index at which String must be appended: ");
        int n = sc.nextInt();
        System.out.println("Enter the String to be appended: ");
        sc.nextLine();
        String toappend=new String(sc.nextLine());
        System.out.println("toappend got");
        String res=new String("");
        for(int i=0;i<original.length();i++)
        {
            if(i==n)
                res+=toappend;
            res+=original.charAt(i);
        }
        System.out.println(res);
    }
}