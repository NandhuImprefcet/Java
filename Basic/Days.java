/*
 * 1. Write a program to convert days into years, weeks and days.
 */

import java.util.*;
class Days
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the days count: ");
        int days=sc.nextInt();

        int years=days/365;
        System.out.println("Year(s):"+years);
        days-=years*365;
        
        int months=days/30;
        System.out.println("Month(s):"+months);
        days-=months*30;
        
        System.out.println("Day(s):"+days);

    }
}