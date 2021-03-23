package quiz17;

import java.util.ArrayList;
import java.util.Scanner;

public class listquiz {
	static boolean a;
	public static void main(String[] args) {
		System.out.println("1.등록 2.회원정보보기 3. 회원정보 검색 5.회원정보 삭제 5. 삭제");

		Scanner sc =  new Scanner(System.in);
		int index =0;
		ArrayList everyone = new ArrayList();
		ArrayList _name = new ArrayList();
		
		while(true)
		{
			System.out.println(a);
			ArrayList profile = new ArrayList();
			System.out.println(" 메뉴를 선택하십시오 ");
			int menu = sc.nextInt();
			switch(menu)
			{
				case(1):
				{
					System.out.println(" 1번을 선택했습니다");
					String name = sc.next();
					int age = sc.nextInt();
					profile.add(name);
					_name.add(name);
					profile.add(age);
					everyone.add(profile);
					System.out.println(_name);
					break;
				}
				case(2):
				{
					System.out.println("2번을 선택했습니다");
						System.out.println(everyone.toString());
					break;
				}
				
				case(3):
				{
					System.out.println("3번을 선택했습니다");
					String named = sc.next();
					for(int i=0;i<_name.size();i++)
					{
						if(named.equals(_name.get(i)))
						{
							System.out.println(everyone.get(i));
						}
					}
					break;
				}
				case(4):
				{
					System.out.println("4번을 선택했습니다.");
					String named = sc.next();
					for(int i=0;i<_name.size();i++)
					{
						if(named.equals(_name.get(i)))
						{
							everyone.remove(i);
							System.out.println(everyone);
						}
					}
					break;
				}
				case(5) :
				{
					System.out.println("5번을 선택했습니다.");
					a=true;
					break;
				}
				
			}
			if(a=true)
			{
				break;
			}
		}
	}

}
