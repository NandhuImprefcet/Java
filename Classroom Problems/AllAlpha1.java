import java.util.*;
class AllAlpha1
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String sent=sc.nextLine();
        int length=sent.length();
        int alpha[]= new int[26];
        for(int i =0;i<length;i++)
        {
            int temp=sent.charAt(i);
            if((temp>='a')&&(temp<='z'))
                alpha[temp-'a']=1;
            else if((temp>='A')&&(temp<='Z'))
                alpha[temp-'A']=1;
        }
        for(int i: alpha)
        {
            if(i==0)
            {
                System.out.println("Not all letters are present");
                return;
            }
        }
        System.out.println("All letters are present");
    }
}
