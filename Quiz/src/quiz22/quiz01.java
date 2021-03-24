package quiz22;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class quiz01 
{
	public static void main(String[] args) 
	{
		//1buffrtrdReader로 파일 읽기 readline()으로 읽기
		//2.구분자 , 단위로 잘라 data클래스 한줄단위로 저장 data는 getter/setter를 갖는 은닉 클래스, 한 줄 단위로 저장
		//3.ㅣList<Data>에 추가
		//4/ 람다식으로 
		String name = "E:\\file\\";		
		FileInputStream fr = null;
		BufferedReader bff = null;
		int result;
		try 
		{
			fr = new FileInputStream(name+"aa2.csv");
			bff = new BufferedReader(new InputStreamReader(fr));
			String strr;
			List<Data> dataList = new ArrayList<>();
				while(((strr = bff.readLine())) != null)
				{
					Data data =new Data();
					String[] splitArray = strr.split(",");
					data.setRegion(splitArray[0]);
					data.setSize(splitArray[1]);
					data.setYear(splitArray[2]);
					data.setMonth(splitArray[3]);
					if(splitArray.length>4)
					{
						data.setPrive(splitArray[4]);
					}
					
					dataList.add(data);
				}
				
			List<Data> DList = dataList.stream()
					.filter((a)->a.getRegion() !=null
					&& a.getRegion().equals("서울")
					&&  Integer.parseInt(a.getMonth()) < 6 
					&& Integer.parseInt(a.getPrive()) > 4000)
					.collect(Collectors.toList());
			DList.stream().forEach((v)->{System.out.println(v.getMonth() + "  " +v.getYear());});	
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
