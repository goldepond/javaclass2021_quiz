package quiz14;

import java.util.Scanner;

public class roop_2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int random = (int)(Math.random() * 100)+1;
	int index =0;
	
	while(true)
	{
		try {
			index ++;
			int a = Integer.parseInt(sc.nextLine());
			
			if(a == random)
			{
				System.out.println("정답 ! 시도횟수 :" + index);
				break;
			}
			else if (a<random)
			{
				System.out.println("z큼");
			}
			else if (a>random)
			{
				System.out.println("작음.");
			}
			else
			{
				System.out.println("잘못 입력된 값입니다.");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("잘못 입력된 값입니다.");
		}
	}


	

}
}
