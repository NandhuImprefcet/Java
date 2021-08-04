class CmdArg
{
    public static void main(String[]args)
    {
        String s="";
        for(String i:args)
            s+=i+" , ";
        System.out.println(s.substring(0,s.length()-3));
    }
}

/*
This is the program to get the the input in the command line argument and print the same like Bangalore
if the input is : Chennai Bangalore
Chennai, Bangalore
*/
