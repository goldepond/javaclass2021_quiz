package quiz20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapquiz {
	public static void main(String[] args) 
	{
		Map<String,String> map = new HashMap<>();
		map.put("1", "1");
		map.put("2", "궁궁궁");
		map.put("3", "차차차");
		map.put("4", "키키키");
		boolean idpass = false;
		Scanner sc = new Scanner(System.in);

		Set<Entry<String,String>> mapSet = map.entrySet();
		while(true)
		{
			String id = sc.next();
			String ps = sc.next();
			for(Entry<String,String> e : mapSet)
			{
				if(id.equals(e.getKey()))
				{
					if(ps.equals(e.getValue()))
					{
						
					}
				}
				
			}
			break;
		}
		
		
		
		
		
		
		
		
		
		
		while(true)
		{
			System.out.println(idpass);
			if(idpass == true)
			{
				break;
			}
			String id = sc.next();
			String ps = sc.next();

					if((map.containsKey(id)))
					{
						if(ps.equals((map.get(id))))
						{
							System.out.println( (map.get(id).equals(ps)));
							idpass = true;
							System.out.println("로그인 되었습니다..");
							break;
						}
						else
						{
							System.out.println("비번이 없습니다.");
							break;
						}
					}
					else
					{
						System.out.println("아이디가 없습니다.");
						break;
					}
		}
	}

}
