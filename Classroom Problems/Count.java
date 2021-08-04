import java.util.*;
class Count
{
    public static void main()
    {
        Random rd = new Random();
        int arr[]=new int[10];
        int i;
        int n=10;
        System.out.print("The array: ");
        for(i=0;i<n;i++)
        {
            arr[i]=rd.nextInt(5);
            System.out.print(arr[i]+" ");
        }
        for (i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

        int number=arr[0];
        int temp=arr[0];
        i=0;
        int max=0;
        System.out.println();
        while(i<n)
        {
            int count=1;
            int j;
            for(j =i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                    count++;
                else
                {
                    if(count>max)
                    {
                        max=count;
                        number=arr[j];
                    }
                    i=j;
                    break;
                }
            }
            if(j==n)
            {
                if(count>max)
                {
                    max=count;
                    number=arr[j];
                }
                i=j;

                break;
            }

        }
        System.out.println("Max count: "+max);
        System.out.println("Number: "+number);
    }
}
