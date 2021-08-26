class console
{
    public static void main(String []args)
    {
        char [] a=System.console().readPassword();
        System.out.println(a);
    }
}