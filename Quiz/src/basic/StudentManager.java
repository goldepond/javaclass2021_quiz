package basic;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StudentManager {

	public void list(int a)
	{
		//nameList[a];
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] nameList = new String[100];
		String[] genderList = new String[100];
		int[] ageList = new int[100];
	//현재 사람수가 몇명이 저장되어있는가
		int count =0;
		//ㅑndex 위치조정 변수
		int index = 0;
		
		System.out.printf(Arrays.toString(ageList));
	while(true)
	{
		System.out.println();
		System.out.printf("[info]고객수 : %d, 현재 포인터 %s :\n", count, index);
		System.out.printf("[menu](i)Insert, (p)Prev, (n)Next, (c)Current, (u)Update, (d)Delete, (q)Quit");

		System.out.println();
		String menu = scan.next();
		switch(menu)
		{
		case("i"):
			System.out.println("====고객 정보 입력======");
			for(int i=0; i<100; i++)
			{
				if(ageList[i]==0 )
				{
					System.out.printf("고객 이름 입력 : ");
					String name = scan.next();
					nameList[i] = name;
					System.out.println();
					
					System.out.printf("고객 성별 입력 : ");
					String gender = scan.next();
					genderList[i] = gender;
					System.out.println();
					
					System.out.printf("고객 나이 입력 : ");
					int age = scan.nextInt();
					ageList[i] = age;
					System.out.println();
					break;
				}
			}
			break;
		
		case("c"):
				System.out.printf(" 이름 : %s, 성별 : %s, 나이 : %d ",nameList[index],genderList[index],ageList[index] );
			break;
		
		case("n"):
			if(ageList[index+1] == 0 && ageList[index]==0)
			{
				System.out.println("다음에 해당하는 정보가 없다");
			}
			else if(index == 100)
			{
				System.out.println("다음 정보가 없습니다. ");
			}
			else
			{
				index++;
				System.out.println("다음 정보가 확인되었습니다.");
			}
			break;
		
		case("p"):
			if(index == 0)
			{
				System.out.println("이전 정보가 없습니다. ");
			}
			else
			{
				index--;
				System.out.println("이전 정보가 확인되었습니다.");
			}
			break;
		
		case("u"):
			System.out.println("정보를 수정하겠습니다. 새로운 정보를 입력해 주십시오");
		
			System.out.printf("고객 이름 입력 : ");
			String name = scan.next();
			nameList[index] = name;
			System.out.println();
		
			System.out.printf("고객 성별 입력 : ");
			String gender = scan.next();
			genderList[index] = gender;
			System.out.println();
		
			System.out.printf("고객 나이 입력 : ");
			int age = scan.nextInt();
			ageList[index] = age;
			System.out.println();
			
			System.out.printf(" 이 름: %s, 성별 : %s, 나이 : %d 로 수정되었습니다. ",nameList[index],genderList[index],ageList[index] );
			break;
		
		case("d"):
			System.out.println("정보를 삭제하겠습니다.");
			if(index != 100)
			{
				for(int q=index; q<99; q++)
				{
				nameList[q] = nameList[q+1];
				genderList[q] = genderList[q+1];
				ageList[q] = ageList[q+1];
				System.out.println("삭제중입니다.");
				}
			}
			else
			{
				nameList[index] = null; genderList[index] = null; ageList[index] = 0;
			}
			break;
		
		case("q"):
			break;
		}
	}
}
}
