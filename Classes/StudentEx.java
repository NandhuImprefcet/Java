class Person
{
    void message()
    {
        System.out.println("This is person class");
    }
}

class Student extends Person
{
    void message()
    {
        System.out.println("This is Student class");
    }
    void display()
    {
        message();
        super.message();
    }
}

public class StudentEx
{
    public static void main(String []args)
    {
        Person p = new Person();
        Student s = new Student();
        p.message();
        s.display();
        s.message();
    }
}
