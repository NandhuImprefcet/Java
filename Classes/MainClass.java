class subClass
{
    String msg="Hellow Welcome to Classes";
    void disp()
    {
        System.out.println(msg);
    }
}

public class MainClass
{
    public static void main(String []args)
    {
        subClass sc = new subClass();
        sc.disp();
    }
}
