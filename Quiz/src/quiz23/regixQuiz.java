package quiz23;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regixQuiz {
	public static void main(String[] args) {
		
		String str = "123123-456456 GS25(마늘햄쌈) 4,400원";
		String str2 = "111111-22222222 GS25(치킨도시락) 5,500원";
		String str3 = "2222222-333333 MINISTOP(제육볶음) 6,700원";
		
		String pattern1 = "[0-9]{6}\\-[0-9]{6}";
		String pattern2 = "[A-Z]+[0-9]*";
		String pattern3 = "\\(\\D+\\)";
		String pattern4 = "\\d+\\,?\\d+원";
		
		String [] arr = {str,str2,str3};
		String []pattern = {pattern1,pattern2,pattern3,pattern4};
		
		for(String a: arr)
		{
			for(String p : pattern)
			{
				Matcher m5 = (Pattern.compile(p)).matcher(a);
				while(m5.find())
				{
					System.out.println(m5.group());
				}
			}
		}
		
	}
}
