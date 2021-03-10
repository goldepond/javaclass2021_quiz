package mwthod0304;

public class Calculator {
	int result=100;
	double pi=3.14;
	
	int multi(int a)
	{
		int resulta = result *a;
		System.out.println(resulta + " 1-1 resulta");
		return resulta;
	}
	int div(int b )
	{

		int resultb = result /b;
		System.out.println(resultb + " 1-2 resultb");
		return resultb;
	}
	double circle(int v)
	{
		double resultv = v*v*pi;
		System.out.println(resultv + " 1-3 resultv");
		return resultv;
	}
}
