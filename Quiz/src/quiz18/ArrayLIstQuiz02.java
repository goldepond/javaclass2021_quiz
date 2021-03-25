package quiz18;

import java.util.ArrayList;
import java.util.List;

public class ArrayLIstQuiz02 {
	//¹®Á¦ 2¹ø 

	public static void main(String[] args) {
		User u = new User("±èÀÌÅÃ",12);
		User u1 = new User("±èÅ×Çü",132);
		User u3 = new User("È«±æÀÚ",132);
		User u4 = new User("È«±æµ¿",132);
		
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
