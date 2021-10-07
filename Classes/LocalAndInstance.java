class A
{
    int val=0;
    A(int a){}
    A(){}
}

class B extends A
{
    int val=0;
    void set(int val)
    {
        val+=10;
        this.val=val+20;
        super.val*=2;
        System.out.println("Arg: "+val+" B: "+this.val+" Super: "+super.val);
    }
}

public class LocalAndInstance
{
    public static void main(String []args)
    {
        B b = new B();
        b.set(20);
    }
}
