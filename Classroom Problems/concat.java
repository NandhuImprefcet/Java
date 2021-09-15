import java.util.*;
class concat
{
    public static void main(String []args)
    {
        Scanner nandhu = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1=new String(nandhu.next());
        System.out.print("Enter the second string: ");
        String s2=new String(nandhu.next());
        int l1=s1.length();
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.charAt(l1-1)==s2.charAt(0))
            s2=s2.substring(1);
        String res=s1+s2;
        System.out.println(res);
    }
}