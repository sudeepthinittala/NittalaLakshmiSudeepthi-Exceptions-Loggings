package com.epam.cleancode.construction;
import java.io.*;
public class SimpleInterest {
float principle;
float time;

float rate_of_interest;
//	SimpleInterest(){
//		System.out.println("Required values of :\n 1.principle\n2.time\n3.rate_of_interest\n");
//	}
	void getValues() {
		this.principle=1000.00F;
		this.time=2.00F;
		this.rate_of_interest=2.00F;
	}
	float CalculateSimpleInterest() {
		return principle*time*rate_of_interest/100;
	}
}
