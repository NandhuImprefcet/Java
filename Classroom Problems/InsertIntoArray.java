import java.util.*;
public class Insert
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array in the initial stage");
        int n = sc.nextInt();
        int arr[]=new int [n+1];
        System.out.println("Enter the elements of the array");
        for(int i =0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("The original array");
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println("\nEnter the position at which it has to be inserted");
        int pos=sc.nextInt();
        System.out.println("Enter the number to be inserted");
        int num=sc.nextInt();
        int temp;
        for(int i=n;i>=pos;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[pos-1]=num;
        for(int i:arr)
            System.out.print(i+" ");
        System.out.println();
    }
}
