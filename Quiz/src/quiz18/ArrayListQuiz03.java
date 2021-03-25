package quiz18;

import java.util.Scanner;

public class ArrayListQuiz03 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		//1. User瑜� ���옣�븷 �닔 �엳�뒗 list瑜� �꽑�뼵�빐 二쇱꽭�슂.
		
		while(true) {
			
			System.out.println("[1.�벑濡� | 2.�쉶�썝�젙蹂대낫湲� |3.�쉶�썝�젙蹂닿��깋 | 4.�쉶�썝�젙蹂댁궘�젣 | 5.醫낅즺");
			System.out.print("硫붾돱瑜� �엯�젰>");
			int menu = scan.nextInt();
			
			if(menu == 1) {
				//�뒪罹먮꼫濡� �씠由�, �굹�씠瑜� �엯�젰諛쏄퀬 User�뿉 ���옣, 由ъ뒪�듃�뿉 異붽�

			} else if(menu == 2) {
				//list�뿉 湲몄씠留뚰겮 �쉶�쟾�븯硫댁꽌 User媛앹껜�쓽 �씠由�, �굹�씠瑜� �닚�꽌��濡� 異쒕젰

			} else if(menu == 3) {
				//李얠쓣 �씠由꾩쓣 �엯�젰諛쏆뒿�땲�떎. �씠由꾩씠 �엳�떎硫�, �씠由꾧낵 �굹�씠瑜� 異쒕젰�빀�땲�떎.
				//李얜뒗 �씠由� �뾾�떎硫� "~~�떂�� 紐⑸줉�뿉 �뾾�뒿�땲�떎" 瑜� 異쒕젰�빀�땲�떎.

				
			} else if(menu == 4) {
				//�궘�젣�븷 �씠由꾩쓣 �엯�젰諛쏆뒿�땲�떎. �엯�젰諛쏆� �씠由꾧낵 �룞�씪�븯�떎硫� User媛앹껜瑜� �궘�젣.
				
			} else if(menu == 5) {
				//�봽濡쒓렇�옩 醫낅즺
			} else {
				System.out.println("�떎�떆 �엯�젰�븯�꽭�슂");
			}
			
			
		}
		
		
		
		
	}
}
