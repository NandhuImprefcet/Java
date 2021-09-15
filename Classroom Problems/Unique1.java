import java.util.*;
class Unique1
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String word="";
        for(int i=0;i<line.length();i++)
        {
            char let=line.charAt(i);
            if((let==' ')||(let == '.')||(i==line.length()-1))
            {
                if(line.indexOf(word)==line.lastIndexOf(word))
                    System.out.println(word);
                word="";
            }
            else
                word+=let;
        }
    }
}