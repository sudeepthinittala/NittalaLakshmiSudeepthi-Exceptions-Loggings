package com.epam.cleancode.construction;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		Scanner sc=new Scanner(System.in);
    		SimpleInterest s=new SimpleInterest();
    		s.getValues();
    		System.out.println(s.CalculateSimpleInterest());
    		CompoundInterest c=new CompoundInterest();
    		c.getValues();
    		System.out.println(c.CalculateCompoundInterest());
    		Construction con=new Construction();
    		System.out.println("Enter Area of the house");
    		float area=sc.nextFloat();
    		System.out.println("Enter the type of material\n1.Standard \n2.Above Standard\n3.High Standard Materials\n4.High Standard Material and Fully Automated Home");
    		int flag=sc.nextInt();
    		System.out.println("Cost for Construction is:"+con.construct(flag,area));
    }
}
