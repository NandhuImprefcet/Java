class FindMaxMin
{
    public static void main(String []args)
    {
        int minimum=Integer.parseInt(args[0]);
        int maximum=Integer.parseInt(args[0]);
        for(int i =1;i<args.length;i++)
        {
            int number=Integer.parseInt(args[i]);
            if(number>maximum)
                maximum=number;
            if(number<minimum)
                minimum=number;
        }
        System.out.println("The maximum number among the given elements is: "+maximum);
        System.out.println("The minimum number among the given elements is: "+minimum);
    }
}
