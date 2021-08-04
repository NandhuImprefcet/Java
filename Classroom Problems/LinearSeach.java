import java.util.*;
class Linear
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        Random rd=new Random();
        int array[]=new int[20];
        int i;
        for(i=0;i<20;i++)
        {
            array[i]=rd.nextInt(40);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Enter the element");
        int key=sc.nextInt();
        for(i=0;i<20;i++)
            if(array[i]==key)
            {
                System.out.println("The key is found at: "+(i+1));
                return;
            }
        System.out.println(-1);
    }
}
