//import java.util.*;
class Reverse2DArray
{
    public static void main(String []args)
    {
        /*int arr[][]={{1,2},{3,4}};
        Scanner sc = new Scanner(System.in);

        int arr[][]=new int[2][2];

        for(int i=0;i<2;i++)
        for(int j=0;j<2;j++)
        arr[i][j]=sc.nextInt();
         */
        int arr[][]=new int[2][2];
        int n=0;
        System.out.println("The given array is:");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                int num=Integer.parseInt(args[n]);
                arr[i][j]=num;
                n++;
                System.out.print(num+" ");
            }
            System.out.println();
        }

        System.out.println("The reversed array is:");
        for(int i=1;i>=0;i--)
        {
            for(int j=1;j>=0;j--)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}