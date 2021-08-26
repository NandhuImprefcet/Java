import java.util.*;
class PalindromeString
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int last=str.length()-1;
        int first=0;
        while(last>first)
        {
            if(str.charAt(last)!= str.charAt(first))
            {
                System.out.println("Not a palindrome String");
                return;
            }
            first++;
            last--;
        }
        System.out.println("Palindrome String");
    }
}