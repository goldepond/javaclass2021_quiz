package quiz210305;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			User u = new User();
			
			User d = new User("김길동", 456456, 30);
			
			User[] arr = {u,d};
			for(User a : arr)
			{
				System.out.println(a.getAge());
			}
			
			
			User[] arr5 = new User[5];
	}

}
