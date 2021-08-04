class FindArguments
{
    public static void main(String args[])
    {
        int length=args.length;
        System.out.println("The following arguments are: "+length);
        System.out.println("The arguments are:");
        for(int i=0;i<length;i++)
            System.out.println((i+1)+" "+ args[i]);
    }
}
/*
 * Find the sum of values given as cmd lines arguments
 * 
 * Find the largest number given in cmd line arguments
 */
