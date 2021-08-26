import java.util.*;
class Vowel
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        char []vowel={'a','e','i','o','u'};
        String name=sc.nextLine();
        String n1=name.toLowerCase();
        int count=0;
        for(char letter:vowel)
            for(int i=0;i<name.length();i++)
                if(n1.charAt(i)==letter)
                    count++;
        System.out.println("No of vowels in \""+name+"\" = "+count);
    }
}