package basic;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		int sum1=0;
		System.out.println(" 정수 1> ");
		int num1 = scn.nextInt();
		System.out.println(" 정수 2> ");
		int num2= scn.nextInt();
		
		System.out.println(" 연산을 선택사십시오  [ +, *, -, / , %] ");
		String a = scn.next();
		
		switch(a)
		{
			case("+"):
			{
				sum1 =  num1 + num2;
				break;
			}
			case("-"):
			{
				sum1 =  num1 - num2;
				break;
			}
			case("*"):
			{
				sum1 =  num1 * num2;
				break;
			}
			case("/"):
			{
				sum1 =  num1 / num2;
				break;
			}
			case("%"):
			{
				sum1 =  num1 % num2;
				break;
			}
		}
		
		System.out.println(" 결과값은 :  " + sum1);
		
		//========================================================

		
	}

}
