import java.util.*;
class Patient
{
    String name;
    double weight,height;
    public Patient(String name,double weight,double height)
    {
        /*double this.weight=0.0,this.height=0.0;
        String this.name="";*/
        this.name=name;
        this.weight=weight;
        this.height=height;
        //System.out.print(this.kl);
    }

    //int kl=0;
    /*
     * This will work even with kl being initialized after the constructor it is available
     * from the initial stage itself just like other variables
     */
    
    public double BMI()
    {
        double BMI= (this.weight/(this.height*this.height))*703;
        return BMI;
    }
}

public class Patients
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name\n");
        String name=sc.nextLine();
        System.out.print("Enter the height\n");
        double height=sc.nextDouble();
        System.out.print("Enter the weight\n");
        double weight=sc.nextDouble();
        Patient p1 = new Patient(name,weight,height);
        System.out.println("BMI is "+p1.BMI());
    }
}