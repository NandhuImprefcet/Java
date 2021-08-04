import java.util.*;
class Special1
{
    public static void main()
    {
        Scanner nandhu= new Scanner(System.in);
        System.out.println("Enter the character to be checked");
        char c = nandhu.next().charAt(0);
        if((c>=65&&c<=90)||(c>=97&&c<=122))  //c>='A'&&c<='Z' or c>='a'&&c<='z'
            System.out.println("Character is an Alphabet");
        else if(c>=48&&c<=57)                //c>='0'&&c<='9'
            System.out.println("Character is a Digit");
        else
            System.out.println("Character is a Special");
    }
}
