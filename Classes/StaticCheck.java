class Number
{
    static int a=1;
    void add(int n)
    {
        a+=n;
    }
}

public class StaticCheck
{
    public static void main(String []args)
    {
        Number n1=new Number();
        
        Number n2 = new Number();
        n1.add(10);
        System.out.println(n1.a);
        n2.add(20);
        System.out.println(n2.a);

    }

}