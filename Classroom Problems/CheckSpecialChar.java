import java.util.*;
class Special
{
    public static void main()
    {
        Scanner nandhu= new Scanner(System.in);
        System.out.println("Enter the character to be checked");
        char c = nandhu.next().charAt(0);
        if(Character.isAlphabetic(c))  
            System.out.println("Character is an Alphabet");
        else if(Character.isDigit(c))
            System.out.println("Character is a Digit");
        else
            System.out.println("Character is a Special");
    }
}
