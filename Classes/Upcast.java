class AU
{
    void m1()
    {
        System.out.println("Inside A's m1 method");
    }
}

class BU extends AU
{
    void m1()
    {
        System.out.println("Inside B's m1 method");
    }
    void disp()
    {
        System.out.println("Inside B's disp method");
    }
}

public class Upcast
{
    public static void main(String []args)
    {
        AU a = new AU();
        BU b = new BU();
        AU ref;
        ref=a;
        ref.m1();
        ref=b;
        ref.m1();
        //ref.display();
        /*
         * The varible which was created using the parent class
         * name cannot access the method which is owned only by the 
         * child class only
         * 
         * In short, it can acces only the inhereted or over-riden
         * by the child class.. the class which was created in child
         * class only can't be accessed.
         */
    }
}
