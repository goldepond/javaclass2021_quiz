package mwthod0304;

public class Computer extends Calculator 
{
	double rect(double a)
	{
		double abc = a*a;
		System.out.println(abc + " 2-1 abc");
		return abc;
	}
	
	double rect(double a,double b)
	{
		double abc = a*b;

		System.out.println(abc + " 2-2 abc");
		return abc;
	}
	
	double rect(double a,double b,double c)
	{
		double abc = a*b*c;
		System.out.println(abc + " 2-3 abc");
		return abc;
	}
	
}
