class First
{
    static int a=10;
    void disp()
    {
        System.out.println(a);
    }
    public static void main(String []args)
    {
        System.out.println("main: "+a);
        First f = new First();
        f.disp();
    }
}