class parse
{
    public static void main(String[]args)
    {
        double sum=0;
        int lenght=args.length;
        for(int i=0;i<lenght;i++)
        {
            int a=Integer.parseInt(args[i]);
            
            sum+=a;
        }
        System.out.println(sum);
    
        /*int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        System.out.println(a+b);*/
    }
}
