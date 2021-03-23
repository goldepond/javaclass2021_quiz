package quiz17;

import java.util.Arrays;
import java.util.Scanner;

public class quiz01 {
public static void main(String[] args) {
	//math.ceil
	//1번 문제====================
	
	Scanner sc = new Scanner(System.in);
	double a = (sc.nextInt())*0.1;
	int aa = (int)Math.ceil(a);
	System.out.println(aa);
	System.out.println("//////////////////////////////////////////////////");
	//2번문제================================
	System.out.println("2번문제");
	String[] participant = {"홍길동", "홍길자","이순신", "김씨 ", "박분자"};
	String[] completion = {"이순신", "홍길동"};
	int k =0;
	Arrays.sort(participant);
	Arrays.sort(completion);
	System.out.println(Arrays.toString(participant));
	System.out.println(Arrays.toString(completion));
	for(int i=0;i<participant.length;i++ )
	{
		if(k < completion.length)
		{
			if(participant[i].equals(completion[k]))
			{
				k++;
			}
			else
			{
				System.out.println("완주 못한 사람 :  "+participant[i]);
			}
		}
		else
		{
			System.out.println("완주 못한 사람 :  "+participant[i]);
		}

	}
	
}
}
