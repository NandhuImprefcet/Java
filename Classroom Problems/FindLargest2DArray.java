class FindLargest2DArray
{
    public static void main(String []args)
    {
        System.out.println("Enter the array numbers");
        int arr[][]=new int[3][3];
        int n =0;
        int largest=Integer.parseInt(args[0]);
        System.out.println("The given array is:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int num=Integer.parseInt(args[n]);
                n++;
                arr[i][j]=num;
                if(num>largest)
                    largest=num;
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}