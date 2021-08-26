import java.io.*;
class Report
{
    public static void main() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name\t");
        String name= br.readLine();
        int subject[]=new int[5];
        int sum=0;
        for(int i=0;i<5;i++)
        {
            System.out.print("Enter your "+(i+1)+"mark\t");
            String temp=br.readLine();
            subject[i]=Integer.parseInt(temp);
            sum+=subject[i];
        }
        double avg=sum/5.0;
        System.out.print(name+" has an average of "+avg);
    }
}