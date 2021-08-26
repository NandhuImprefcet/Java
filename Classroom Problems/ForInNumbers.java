class ForInNumbers
{
    public static void main()
    {
        int []numbers={10,20,30,40,50};
        boolean n[]=new boolean[2];
        for(int i: numbers)
            System.out.println(i);
        for(boolean i:n)
            System.out.println(i);
    }
}