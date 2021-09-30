class Super
{
    int a;
}
class Sub extends Super
{
    int b;
}
public class MainClass1
{
    public static void main(String[]args){
        Super sup = new Super();
        Sub sub = new Sub();
        sup.a=10;
        sub.a=20;
        sub.b=30;
        System.out.println(sup.a+" "+sub.a+" "+sub.b);
    }
}