// Compount Interest

import java.io.*;

class CompoundInterest 
{
    public static void main(String a[])
	{
        	double principal = 10000;  
        	double rate = 5;          
        	double time = 2;           
        	int n = 1;                 

        	double amount = principal * Math.pow((1 + rate / (n * 100)), n * time);
        	double compoundInterest = amount - principal;

        	System.out.println("Compound Interest = " + compoundInterest);
        	System.out.println("Total Amount = " + amount);
    	}
}