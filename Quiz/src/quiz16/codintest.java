package quiz16;

import java.util.Arrays;
import java.util.Scanner;

public class codintest {

	public static void main(String[] args) 
	{
		System.out.println(1);
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int sub=0;
		while(true)
		{
			if(a<10) 
			{
				sub += a;
				break;
			}
			System.out.println(a);
			sub += a%10;
			a /=10;
		}
		System.out.println(sub + " гу╟Х");
		
		System.out.println(2);
		
		
		int sub2=0;
		String b = sc.next();
		String[] arr = b.split("");
		for(int i =0; i<arr.length;i++)
		{
			sub2 += Integer.parseInt(arr[i]);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(sub2);
		
		String c = sc.next();
		
		int result123 = 0;
		for(int i =0; i< c.length(); i++)
		{
			result123 += c.charAt(i)-'0';
		}
		System.out.println(result123);
		
		
	}

}
