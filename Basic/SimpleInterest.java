/*
 * 4. Write a program to enter P, T, R and calculate Simple Interest. 
(principle,time,rate)
 */

import java.util.*;
class SimpleInterest
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Principal: ");
        float principle=sc.nextFloat();
        
        System.out.print("Enter the Time(in months): ");
        float time=sc.nextFloat();
        
        System.out.print("Enter the Rate(in percentage): ");
        float rate=sc.nextFloat();
        
        float si=principle*rate*time/100;
        System.out.println("Simple Interest for the given values is : "+si);
        
    }
}