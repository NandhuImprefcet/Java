class Positive
{
    public static void main(String[] args)
    {
        int sum=0;
        for(String i: args)
        {
            int num=Integer.parseInt(i);
            if(num<0)

                continue;

            else

                sum+=num;

        }
        System.out.println(sum);
    }
}
