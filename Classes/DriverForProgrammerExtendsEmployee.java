class Employee
{
    int Salary;
    Employee()
    {
        Salary=10000;
    }
}

class Programmer extends Employee
{
    int bonus=0;
    Programmer(int sal,int bon)
    {
        this.Salary=sal;
        this.bonus=bon;
    }
}

public class DriverForProgrammerExtendsEmployee
{
    public static void main(String []args)
    {
        Programmer pg = new Programmer(20000,200);
        System.out.println(pg.Salary);
        System.out.println(pg.bonus);
        Employee e = new Employee();
        System.out.println(e.Salary);
    }
}