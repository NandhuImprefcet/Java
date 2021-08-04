import java.util.*;
class RandomGen
{
    public static void main()
    {
        Random rd= new Random();
        int array[]=new int[10];
        int minimum=0;
        int maximum=0;
        int mini=0;
        int maxi=0;
        for(int i=0;i<10;i++)
        {
            array[i]=rd.nextInt(50);
            System.out.print(array[i]+" ");
            if(i==0)
            {
                minimum=array[i];
                maximum=array[i];
            }
            else
            {
                if(array[i]>=maximum)
                {
                    maxi=maximum;
                    maximum=array[i];
                }
                else if(array[i]>maxi)
                    maxi=array[i];
                if(array[i]<=minimum)
                {
                    mini=minimum;
                    minimum=array[i];
                }
                else if(array[i]<mini)
                    mini=array[i];
            }
        }
        System.out.println();
        System.out.println("Minimum: "+minimum);
        System.out.println("Maximum: "+maximum);
        System.out.println("2nd Minimum: "+mini);
        System.out.println("2nd Maximum : "+maxi);
    }
}
