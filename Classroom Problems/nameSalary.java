import java.util.Scanner;
class nameSalary
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.nextLine();
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Enter the Salary");
        float salary=sc.nextFloat();
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
}