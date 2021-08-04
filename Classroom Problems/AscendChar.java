import java.util.*;
class AscendChar
{
    public static void main()
    {
        Scanner nandhu = new Scanner(System.in);
        System.out.println("Enter first character");
        char c1 = nandhu.next().charAt(0);
        System.out.println("Enter second character");
        char c2 = nandhu.next().charAt(0);
        if (c1<c2)
            System.out.println(c1+" , "+c2);
        else
            System.out.println(c2+" , "+c1);
    }
}
