package quiz_12;

public class staticQuiz {
	
	static double pi = 3.14;
	public static double Circle(int r)
	{
		return pi*r*r;
	}
	
	String Color;
	staticQuiz(String _color)
	{
		Color = _color;
	}
	
	static int plus(int a, int b)
	{
		return a+b;
	}
	static int minus(int a, int b)
	{
		return a-b;
	}
	static int x (int a, int b)
	{
		return a*b;
	}
	static int divid(int a, int b)
	{
		return a/b;
	}
	private int result;


}
