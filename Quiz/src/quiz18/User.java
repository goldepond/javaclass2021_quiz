package quiz18;

import java.util.ArrayList;
import java.util.List;

public class User {
	//���� 2��
	private String name;
	private int age;

	List ar = new ArrayList();
	public User(String _name ,int _age) 
	{
		name = _name;
		age =_age;
		ar.add(name);
		ar.add(age);
	}
	
	public String getName() {
		return name;
	}

}
