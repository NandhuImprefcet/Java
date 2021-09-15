import java.util.*;
class StringMul
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word=sc.next();
        int length= word.length();
        word=word.substring(0,2);
        String res=new String("");
        for(int i=0;i<length;i++)
            res+=word;
        System.out.println(res);
    }
}