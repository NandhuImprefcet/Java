class Student
{
    public Student()
    {
        this("Name");
        System.out.println("zero param");
    }
    public Student(String fname)
    {
        this("I am",fname);
        System.out.println("one param");
    }
    public Student(String fname,String lname)
    {
        System.out.println(fname+" "+lname);
    }
}
public class Const
{
    public static void main(String []args)
    {
        System.out.println("Now calling with zero parameter");
        Student t = new Student();
        System.out.println("\n\n\n\nNow calling with one parameter");
        Student t1 = new Student("Nandhu");
        System.out.println("\n\n\n\nNow calling with one parameter");
        Student t2 = new Student("Nandha","Kumar");
    }
}