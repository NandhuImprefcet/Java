/*
Ignore all the numbers in the array which are between 6 and 7 in the array
*/

import java.util.*;
class Ignore
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int [] arr=new int[n];
        int i;
        System.out.println("Enter the array");
        for(i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int sum=0;
        int check=0;
        int flag=0;
        for(int j : arr)
        {
            if(j==6&&flag==0)
            {
                flag=1;
                check+=j;
            }
            if(flag==0)
                sum+=j;
            if(j==7&&flag==1)
            {
                check=0;
                flag=0;
            }
            if(flag==1)
                check+=j;
        }
        sum+=check;
        System.out.println(sum);
    }
}
