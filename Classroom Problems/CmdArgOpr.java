class ArgOpr
{
    public static void main(String[]args)
    {
        int a=Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println("a is "+a);
        System.out.println("b is "+b);
        System.out.println(a+" + "+b+" = "+(a+b));
        System.out.println(a+" - "+b+" = "+(a-b));
        System.out.println(a+" * "+b+" = "+(a*b));
        if(b==0)
            System.out.println("0 can be divisor");
        else{
            System.out.println(a+" / "+b+" = "+a/b);
            System.out.println(a+" % "+b+" = "+a%b);
        }
    }
}
