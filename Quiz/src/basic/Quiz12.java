package basic;

import java.util.Scanner;

public class Quiz12 {
	public static void main(String[] args) {
		////////////////////////////////////
		//1. 1~3의 배수이거나 4의 배수일경우 4가로로 출력

		Scanner scn = new Scanner(System.in);
		/*System.out.println("[1번문제]");
		System.out.println("숫자를 입력하세여");
		int scan1 = scn.nextInt();
		int a1=0;
		while(a1 < scan1)
		{
			if(a1%3==0 || a1%4==0)
			{
				System.out.print(a1 + ", ");
			}
			a1++;
				
		}
		
		///////////////////////////////////////
		System.out.println();
		//2. 1~ 입력받은 수까지의 6의 배수의 합계
		System.out.println();
		System.out.println("[2번문제]");
		System.out.println("숫자를 입력하세여");
		int scan2 = scn.nextInt();
		int a2=0;
		int sum2=0;
		while(a2 < scan2+1)
		{
			if(a2%6==0)
			{
				sum2 +=a2; 
			}
			a2++;
				
		}
		System.out.println(sum2 +" : 6의 배수의 합계");
		/////////////////////////////////////////////////
		System.out.println();
		System.out.println("[3번문제]");
		//3. 1~1000
		int a3=0;
		int t4 =0;
		while(a3<1000)
		{
			if(a3%4==0 && a3%8!=0)
			{
				t4++;
				System.out.print(a3 + ", ");
			}
			a3++;
			
		}
		System.out.println();
		System.out.println(t4 + " : 4배수 이면서 8의배수가 아닌 숫자의 개수 ");
		/////////////////////////////////////////////////////////////////
		System.out.println();
		System.out.println("[4번문제]");
		//4
		int a4=1;
		int i4= 0;
		int t =1000;
		while(a4 < t)
		{
			if(t%a4 == 0)
			{
				i4++;
			}
			a4++;
			
		}
		System.out.println();
		System.out.println(i4+ ": 1000의 약수의 개수 ");
	//---------------------------------------------------------
		

		System.out.println("[문제 5]");
		int a = scn.nextInt();
		int b =0;
		while(a != 0)
		{
			System.out.print("정수입력 : " );
			a = scn.nextInt();
			b += a;
		}
		System.out.print("0 입력받음. 프로그램 종료. 입력한 자료  총 합 : " + b);
		scn.close();
	}
	*/
	//==========================================================
	int a=0;
	System.out.println( "ㅇㅇㅇㅇ");
	int scan1 = scn.nextInt();
	int arr[] = new int[scan1];
	while(a<scan1)
	{
		arr[a] =a;
		System.out.println(arr[a] + "배열 " + a );
		a++;
	}

	//==========================================================
	
	int[] arrd = {1000,500,100,50,10};
	int money = 17780;
	int aaa =0;
	int bbb = 0;
	int ccc = 0;
	int ddd = 0;
	int eee = 0;
	
	while(money >10)
	{
		while(money > 50)
		{
			while(money > 100)
			{
				while(money > 500)
				{
					while(money > 1000)
					{
						aaa++;
						money -= 1000;
					}
					bbb++;
					money -= 500;
				}
				ccc++;
				money -= 100;
			}
			ddd++;
			money -= 50;
		}
		eee++;
		money -= 10;
	}
	System.out.printf( "1000원 %d,500원 %d,100원 %d,50원 %d,10원 %d",aaa,bbb,ccc,ddd,eee);
	
	
	
	}
}
