package quiz14;

import java.util.Scanner;

public class roop_2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int random = (int)(Math.random() * 100)+1;
	int index =0;
	
	while(true)
	{
		int a = Integer.parseInt(sc.nextLine());
		try 
		{
			index ++;	
			if(1<a && a<100)
			{
				if(a == random)
				{
					System.out.println("정답임네다 :" + index);				break;
				}
				else if (a<random)
				{
					System.out.println("더큼");
				}				
				else if (a>random)
				{
					System.out.println("더작음.");
				}				
				else
				{
					System.out.println("장난 ㄴㄴ.");
				}
			
			}
			else
			{
				throw new Exception("우린끝났어ㅓㅓ");
			}
			
		}
		catch(Exception e)
		{
			if(1>a || a>100)
			{
				System.out.println("숫자만 입력");
				index ++;
			}
			else
			{
				System.out.println("문디 정수만입력");
			}
		}
	}


	

}
}
