package quiz18;

import java.util.ArrayList;
import java.util.List;

public class ArrayLIstQuiz02 {
	//���� 2�� 

	public static void main(String[] args) {
		User u = new User("������",12);
		User u1 = new User("������",132);
		User u3 = new User("ȫ����",132);
		User u4 = new User("ȫ�浿",132);
		
		List<User> ar = new ArrayList<>();
		ar.add(u1);
		ar.add(u);
		ar.add(u3);
		ar.add(u4);
		
		for(User a : ar)
		{
			System.out.println(a.ar);
		}
		System.out.println("/////////////////////////////////////");
		
	
			if(ar.contains(u3))
			{
				System.out.println(u3.ar);
			}
			
			
			if(ar.contains(u4))
			{
				ar.remove(u4);
			}
			
			System.out.println("/////////////////////////////////////");
			for(User a : ar)
			{
				System.out.println(a.ar);
			}
	}
}
