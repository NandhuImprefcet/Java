import java.util.*;
class CountCharInString
{
    public static void main(String []args)
    {
        Scanner nandhu = new Scanner(System.in);
        System.out.print("Enter your mail id: ");
        String email=nandhu.nextLine();
        int length= email.length();
        int count=0;
        int upper=0;
        int lower=0;
        int special=0;
        int space=0;
        for(int i=0;i<length;i++)
        {
            char a=email.charAt(i);
            if((a>='0')&&(a<='9'))
                count++;
            else if((a>='a')&&(a<='z'))
                lower++;
            else if((a>='A')&&(a<='Z'))
                upper++;
            else if(a==' ')
                space++;
            else
                special++;
        }
        System.out.println("The string "+email+" contains");
        System.out.println("Digits: "+count);
        System.out.println("Upper case letters: "+upper);
        System.out.println("Lower case letters: "+lower);
        System.out.println("Spaces: "+space);
        System.out.println("Special characters: "+special);
        
    }
}