package method;

public class Student {
	int no ;
	int kor ;
	int eng;
	int math;
	Student(String _name, int _no, int _kor, int _eng, int _math)
	{
		String name = _name;
		int no = _no;
		int kor = _kor;
		int eng = _eng;
		int math = _math;
	}

	public double gettotal()
	{
		double total = kor + eng + math;
		return total;
	}
	
	public double getAvg()
	{
		double avg = (kor + eng + math)/3;
		return avg;
	}
	
}
