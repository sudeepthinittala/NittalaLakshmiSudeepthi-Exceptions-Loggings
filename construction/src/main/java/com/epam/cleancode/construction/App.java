package com.epam.cleancode.construction;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    		@SuppressWarnings("resource")
			Scanner sc=new Scanner(System.in);
    		SimpleInterest s=new SimpleInterest();
    		s.getValues();
    		LOGGER.info(s.CalculateSimpleInterest());
    		CompoundInterest c=new CompoundInterest();
    		c.getValues();
    		LOGGER.info(c.CalculateCompoundInterest());
    		Construction con=new Construction();
    		LOGGER.info("Enter Area of the house");
    		float area=sc.nextFloat();
    		LOGGER.info("Enter the type of material\n1.Standard \n2.Above Standard\n3.High Standard Materials\n4.High Standard Material and Fully Automated Home");
    		int flag=sc.nextInt();
    		LOGGER.info("Cost for Construction is:"+con.construct(flag,area));
    		
    }
}
