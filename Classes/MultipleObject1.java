class MyClass
{
    int a;
    void display()
    {
        System.out.println(a);
    }
    
}

public class MultiObj
{
    public static void main(String []args)
    {
        MyClass m1=new MyClass();
        MyClass m2 = new MyClass();
        m1.a=20;
        m2.a=10;
        m1.display();
        m2.display();
        m1.a=15;
        m1.display();
        m2.display();
    }
}
