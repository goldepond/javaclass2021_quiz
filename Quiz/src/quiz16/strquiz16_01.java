package quiz16;

import java.util.Arrays;
import java.util.Scanner;

public class strquiz16_01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String id;
		while(true)
		{
			System.out.println("아이디를 입력해주십시오.");
			id = sc.next();
			if(id.length()>4)
			{
				break;
			}
			else
			{
				System.out.println("잘못 입력했습니다.");
			}
		}
		Scanner sct = new Scanner(System.in);
		
		
		char boy ='1';
		char girl ='2';
		while(true)
		{
			System.out.println("주민번호를 입력해주십시오.");
			String ads;
			ads = sct.next();
			if(id.length()<13)
			{
				String adst = ads.trim();
				String[] adsarr1 = adst.split("-");
				System.out.println(Arrays.toString(adsarr1));
				
				if(adsarr1[1].charAt(0)==1)
				{
					System.out.println("여자입니다");
					break;
				}
				else if(adsarr1[1].charAt(0)==boy)
					
				{
					System.out.println("남자입니다");
					break;
				}
				else
				{
					System.out.println("잘못 입력했습니다123.");

				}
			}
			else
			{
				System.out.println("잘못 입력했습니다.");
			}
		}
		
	}
	
	
	
}
