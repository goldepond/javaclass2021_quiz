package quiz20;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class mapQuiz {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		System.out.println("���� ���� ���θŴ�");
		System.out.println("1. �űԸ޴� ���");
		System.out.println("2. �޴��� ��ü ����");
		System.out.println("3. �޴�����");
		System.out.println("4. �޴� ����");
		System.out.println("5. ����");
		

		while(true){
			try {
			System.out.println();
			System.out.println("���� ���� ���θŴ�");
			Scanner scan = new Scanner(System.in);
			int  select = scan.nextInt();
			switch(select){
				case(1):{
							System.out.println("1. �űԸ޴� ���");
					String menuName = scan.next();
					int menuPrice = scan.nextInt();
					map.put(menuName, menuPrice);
					break;
				}
				case(2):{
					System.out.println("2. �޴��� ��ü ����");
					Set<Entry<String,Integer>> set = map.entrySet();
					for(Entry<String,Integer> e : set)
					{ 
						System.out.println(e.getKey() + e.getValue());
					}
					break;
				}
				case(3):{
					System.out.println("3. �޴�����");
					System.out.println("������ �޴��� �Է��� �ּ���.");
					String menuName = scan.next();
					if(map.containsKey(menuName)){
						int menuPrice = scan.nextInt();
						map.put(menuName, menuPrice);
					}
					else{
						System.out.println("������ �޴��� ��Ͽ� �����ϴ�.");
					}
					break;
				}
				case(4):{
					System.out.println("4. �޴� ����");
					System.out.println("������ �޴��� �Է��� �ּ���.");
					String menuName = scan.next();
					
					
					
					
					if(map.containsKey(menuName)){
						map.remove(menuName);
						
					}
					else{
						System.out.println("������ �޴��� ��Ͽ� �����ϴ�.");
					}
					break;
				}
				case(5):{
					System.out.println("5. ����");
					Scanner scanmenu = new Scanner(System.in);
					System.exit(0);
				}
				default:
				{
					System.out.println("����. �ٽ� �Է����ּ���");
					break;
				}
			}
		}

			catch(Exception e)
			{
				System.out.println("�����Դϴ�.");
			}
	}
	}
}
