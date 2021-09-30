class Employe
{
    int id,salary;
    String name;
    void setId(int id)
    {
        this.id=id;
    }
    void setName(String name)
    {
        this.name=name;
    }
    void setSalary(int salary)
    {
        this.salary=salary;
    }
    int getId()
    {
        return id;
    }
    String getName()
    {
        return name;
    }
    int getSalary()
    {
        return salary;
    }
    void disp()
    {
        System.out.println("Name:\t"+name+"\nId:\t"+id+"\nSalary:\t"+salary);
    }
}