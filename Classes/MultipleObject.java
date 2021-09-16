class Msg
{
    String msg="Hello ";
    String myname;
    void disp(String a)
    {
        myname=a;
        System.out.println(msg+myname);
    }
}

public class Str
{
    public static void main(String []args)
    {
        Msg m1=new Msg();
        Msg m2=new Msg();
        Msg m3= new Msg();
        m1.disp("Nandhu");
        m2.disp("Nandhakumar");
        m3.disp("Nandhakumar P Kathirvelu");
    }
}
