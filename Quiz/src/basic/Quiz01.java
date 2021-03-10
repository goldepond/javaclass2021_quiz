package basic;

public class Quiz01 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		
		System.out.println(y += 10 - x++); //13
		System.out.println(x+=2); //5 틀림 위줄에 x가 증가한걸 반영안함.
		System.out.println( !('A' <= c && c <='Z') );//T 틀림.
		System.out.println('C'-c);  //2
		System.out.println(c+1); //66
		System.out.println(++c); //b
		System.out.println(c++);//b
		System.out.println(c);  //C
		
		System.out.println("===================================");
		
		
		//===================================
		
		int a = (int)(Math.random() * 100)+1;
		String aa = (a %3 ==0) ? (" 3의 배수 "): (" ㄴㄴ ");
		System.out.println( a + aa);
		
		//===============================================
		
		int bb = (int)(Math.random() * 11)-5;
		int bbb= (bb  >= 0) ? (bb): (-bb);
		System.out.println(bbb + " : 2번 정답");
		
		//=============================================
		
		int cc = (int)(Math.random() * 200);
		int ccc= (cc%10 == 0) ? ( cc/10): ((cc/10)+1);
		System.out.println(ccc +" 개의 박스 필요");
		
		System.out.println("===================================");
		
		//숙제 뭐냐 빨리 써라
		// -10~10 까지의 랜덤수  / 랜덤한 값이 0인지, 양수 음수인지 판별 if else 없이
		
		int gg = (int)(Math.random() * 21)-10;
		
		String ggg = (gg == 0) ? ("이건 0"): ("");
		String gggg = (gg < 0) ? ("음수"): ("양수");
		
		
		System.out.println(gg);
		System.out.println(ggg);
		System.out.println(gggg);
		
		//---------숙제 컽-------------------------------------
		
		
		
		
	}
}
