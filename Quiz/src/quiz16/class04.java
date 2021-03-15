package quiz16;

import java.util.Scanner;

public class class04 {
	
	public static void main(String[] args) {
		
		System.out.println(1);
		Scanner sc = new Scanner(System.in);

		String b12 = sc.nextLine();
		String b= b12.trim();
		char b1 = b.charAt(0);
		char b2 = b.charAt(b.length()-1);
		if(b1==b2)
		{
			System.out.println("같음");

			System.out.println(b1 + "b1");
			System.out.println(b2+ "b2");
		}
		else {
			System.out.println("다름");
		
		
	}

}}
