/*
 * 3. Write a program to enter marks of five 
 * subjects and calculate total, average and percentage.
 */
import java.util.*;
class Percentage
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        
        float marks[]=new float[5];
        float total=0;
        System.out.println("Enter total marks for each subject");
        int outof=sc.nextInt();
        System.out.println("Enter the 5 subject marks");
        
        for(int i=0;i<5;i++)
        {
            marks[i]=sc.nextFloat();
            total+=marks[i];
        }
        
        float mean=total/5;
        float percentage=mean/outof*100;
        
        System.out.println("Total: "+total);
        System.out.println("Mean: "+mean);
        System.out.println("Percentage: "+percentage);
    }
}