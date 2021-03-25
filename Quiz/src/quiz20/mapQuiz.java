package quiz20;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class mapQuiz {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		System.out.println("음식 관리 메인매뉴");
		System.out.println("1. 신규메뉴 등록");
		System.out.println("2. 메뉴판 전체 보기");
		System.out.println("3. 메뉴수정");
		System.out.println("4. 메뉴 삭제");
		System.out.println("5. 종료");
		

		while(true){
			try {
			System.out.println();
			System.out.println("음식 관리 메인매뉴");
			Scanner scan = new Scanner(System.in);
			int  select = scan.nextInt();
			switch(select){
				case(1):{
							System.out.println("1. 신규메뉴 등록");
					String menuName = scan.next();
					int menuPrice = scan.nextInt();
					map.put(menuName, menuPrice);
					break;
				}
				case(2):{
					System.out.println("2. 메뉴판 전체 보기");
					Set<Entry<String,Integer>> set = map.entrySet();
					for(Entry<String,Integer> e : set)
					{ 
						System.out.println(e.getKey() + e.getValue());
					}
					break;
				}
				case(3):{
					System.out.println("3. 메뉴수정");
					System.out.println("수정할 메뉴를 입력해 주세요.");
					String menuName = scan.next();
					if(map.containsKey(menuName)){
						int menuPrice = scan.nextInt();
						map.put(menuName, menuPrice);
					}
					else{
						System.out.println("수정할 메뉴가 목록에 없습니다.");
					}
					break;
				}
				case(4):{
					System.out.println("4. 메뉴 삭제");
					System.out.println("삭제할 메뉴를 입력해 주세요.");
					String menuName = scan.next();
					
					
					
					
					if(map.containsKey(menuName)){
						map.remove(menuName);
						
					}
					else{
						System.out.println("삭제할 메뉴가 목록에 없습니다.");
					}
					break;
				}
				case(5):{
					System.out.println("5. 종료");
					Scanner scanmenu = new Scanner(System.in);
					System.exit(0);
				}
				default:
				{
					System.out.println("오류. 다시 입력해주세요");
					break;
				}
			}
		}

			catch(Exception e)
			{
				System.out.println("오류입니다.");
			}
	}
	}
}
