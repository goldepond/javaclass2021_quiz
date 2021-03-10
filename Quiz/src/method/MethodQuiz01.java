package method;

public class MethodQuiz01 {

	public static void main(String[] args) 
	{
		
	//	method1();
	//	System.out.println(method2("���� ���� �Ű� ���� ����"));
	//	System.out.println(method3(1,2,11.11));
	//	System.out.println(method4(22));
	//	System.out.println(mexNum (4,12));
	//	method5(3,"��");
	//	System.out.println();
	//	System.out.println(abs(3));
		
	char[] arr = {'a','b','c','g','f'};
	System.out.println( method6(arr));
	}
	
	/*public static void method1()
	{
		System.out.println("�ȳ�");
	}
	
	public static  String method2 (String string)
	{
		return string;
	}
	
	public static double method3 (int a, int b, double d)
	{
		return a+b+d;
	}
	
	public static  String method4 (int a)
	{
		String abc;
		if(a%2==0)
		{
			abc = "¦��";
		}
		else
		{
			abc = "Ȧ��";
		}
		return abc;
	}
	public static void method5 (int a,String d)
	{
		for(int dd=1; dd<a; dd++)
		{
			System.out.printf(d);
		}
	}
	public static int mexNum (int a, int b)
	{
		int Max=0;
		int Min=0;
		if(a<=b) {
			a= Max;
			b= Min;
		}
		else {
			b= Max;
			a= Min;
		}
		
		return Max;
	}
	
	public static int abs (int a)
	{
		if(a<0)
		{
			a= -a;
		}
		return a;
	}*/
	
	public static  String method6 (char[] a)
	{
		String str = "";
		for(char b:a)
		{
			str +=b;
		}
		return str;
	}
	
	public static  String[] method8 (String a, String b)
	{
		String [] strd = {a,b,};
		
		return strd;
	}
}
