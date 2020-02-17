package com.epam.cleancode.construction;

public class CompoundInterest {
float initial_per_balance;
float interest_rate;
int number_of_times;
float no_of_timeperiods;
void getValues(){
	this.initial_per_balance=1000.00F;
	this.interest_rate=2.00F;
	this.number_of_times=3;
	this.no_of_timeperiods=2.00F;
}
float CalculateCompoundInterest() {
return (float)(initial_per_balance*Math.pow((1+interest_rate/number_of_times),number_of_times*no_of_timeperiods));
}
}
