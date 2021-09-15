import java.util.*;
public class DoubleWord
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String word=sc.next();
        String result=word.substring(0,1);
        if(word.length()%2==1)
        {
            System.out.println("null");
            return;
        }
        for(int i=1;i<word.length();i++)
        {
            char c=word.charAt(i);
            if((c>='A')&&(c<='Z'))
            {
                System.out.println(result);
                return;
            }
            result+=c;
        }
        System.out.println(result);
    }
}