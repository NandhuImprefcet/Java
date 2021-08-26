import java.util.*;
public class AllAlpha
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String line= sc.nextLine();
        int n=line.length();
        for(int i='A';i<='Z';i++)
        {
            int flag=0;
            for(int j=0;j<n;j++)
            {
                if((i==line.charAt(j))||(i+32==line.charAt(j)))
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println("The given string does not contain all the alphabets");
                return;
            }
        }
        System.out.println("Contains all the alphabets");
    }
}