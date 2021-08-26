import java.util.*;
class Unique
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int n =str.length();
        if(str.charAt(n-1)=='.')
            n--;
        int count=0;
        for(int i =0;i<n;i++)
        {
            if(str.charAt(i)==' ')
                count++;
        }
        String []array=new String[count+1];
        for(int i =0;i<=count;i++)
        {
            array[i]="";
        }
        int temp=0;
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)==' ')
                temp++;
            else
                array[temp]+=str.charAt(i);
        }
        
        //added each word in a separate array
        
        for(int i=0;i<=count;i++)
        {
            int flag=0;
            for(int j=i+1;j<=count;j++)
            {
                if(array[i].equals(array[j]))
                {
                    flag=1;
                    array[j]="";
                }
            }
            if((flag==0)&&(!(array[i].equals(""))))
                System.out.println(array[i]);
        }
    }
}