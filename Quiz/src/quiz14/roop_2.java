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
				System.out.println("���� ! �õ�Ƚ�� :" + index);
				break;
			}
			else if (a<random)
			{
				System.out.println("zŭ");
			}
			else if (a>random)
			{
				System.out.println("����.");
			}
			else
			{
				System.out.println("�߸� �Էµ� ���Դϴ�.");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("�߸� �Էµ� ���Դϴ�.");
		}
	}


	

}
}
