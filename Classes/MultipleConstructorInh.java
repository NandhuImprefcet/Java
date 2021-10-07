class A
{
    int a;
    A(int val)
    {
        a=val;
        System.out.println("in class A");
    }

    A()
    {
        a=10;
        System.out.println("in class A");
    }
}

class B extends A
{
    int b;
    B()
    {
        super(200);
        b=20;
        System.out.println("in class B constructor");
    }
}

public class MultipleConstructorInh
{
    public static void main(String []args)
    {
        B b = new B();
        System.out.println(b.a+" "+b.b);   
    }
}
