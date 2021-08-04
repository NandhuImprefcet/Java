/*get the age and gender from the command line arguments
 * based on following condition
 * f    1-58    82
 * f    59-120  76
 * m    1-60    92
 * m    61-120  83
 */
class Percentage
{
    public static void main(String[] args)
    {
        int age=Integer.parseInt(args[1]);
        char gender=args[0].charAt(0);
        if((gender=='m')||(gender=='M'))
            if((age>=1&&age<=60))
                System.out.println("Interest = 9.2%");
            else if(age>=61&&age<=120)
                System.out.println("Interest = 8.3%");
            else
                System.out.println("Invalid Age");
        else if(gender=='F'||gender=='f')
            if((age>=1&&age<=58))
                System.out.println("Interest = 8.2%");
            else if(age>=59&&age<=120)
                System.out.println("Interest = 7.6%");
            else
                System.out.println("Invalid Age");
        else
            System.out.println("Invalid Gender");
    }
}
 
