package quiz21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//=======================================
		DateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy");
		Date date = new Date();       
		String dateToStr = dateFormat.format(date);
		//============================================
		String name = "E:\\file\\";
		FileWriter fos = null;
		BufferedWriter bf = null;
		//=============================================
		FileReader fr = null;
		BufferedReader bff = null;
		int result;
		//=============================================
		try {
			fos = new FileWriter(name+ dateToStr+".txt");
			bf = new BufferedWriter(fos);
			bf.write("굳굳굳굳");
			bf.flush();
			
			fr = new FileReader(name+ dateToStr+".txt");
			bff = new BufferedReader(fr);
			String strr;
			while(((strr = bff.readLine())) != null)
			{
				System.out.println(strr);				
			}
		} catch (FileNotFoundException e) {

			System.out.println("파일이름 에러");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("프로그램 종료");
		}
	}

}
