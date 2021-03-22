package quiz21;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class fileQuiz {
	public static void main(String[] args) {

		System.out.println("파일 복사 프로토콜");
		Scanner scan = new Scanner(System.in);
		String fileName = scan.next();
		String name = "E:\\file\\";
		FileOutputStream fos = null;
		FileInputStream fis = null;
		int result;
		try {
			System.out.println("파일복사 시작");
			byte[]aee = new byte[100];
			fis = new FileInputStream(name+fileName+".jpg");
			fos = new FileOutputStream(name+"this\\"+fileName+".jpg");
			while((result = fis.read(aee)) != -1)
			{

				System.out.println("파일복사 중....");
				fos.write(aee, 0, result);
			}

		} catch (FileNotFoundException e) {

			System.out.println("파일이름 에러");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
				fis.close();
				scan.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("프로그램 종료");
		}
	}

}
