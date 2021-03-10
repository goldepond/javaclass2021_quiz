package method;

import java.util.Arrays;

public class MethodQuiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lottonum(lotto); // 랜덤 로또번호 생성
		lottorun(lotto2); 
		
	}
	static int []lotto = new int[6];
	static int []lotto2 = new int[6];
	static long money;
	
	static void lottonum(int [] lotto)
	{
		for(int a=0;a<lotto.length;a++)
		{
			int random = (int)(Math.random() * 45)+1;
			lotto[a]=random;
			for(int b=0;b<a;b++)
			{	
				if(lotto[a]==lotto[b])
				{
					a--;
					break;
				}
			}
		}
		Arrays.sort(lotto);
	}
	//=============================================================
	static long lottorun(int [] arr)
	{

		System.out.println(Arrays.toString(lotto2) + " first");
		
		while(!(Arrays.equals(lotto,lotto2)))
		{
			lottonum(lotto2); // 랜덤 로또번호 생성
			money += 1000;
			Arrays.sort(lotto2); 
			System.out.println(Arrays.toString(lotto2) + " 로또 당첨번호");
		}
		System.out.println(Arrays.toString(lotto) + " : 내가 찍은 번호");
		System.out.println(money + " 원입니다.");
		return money;
		
	}
}
