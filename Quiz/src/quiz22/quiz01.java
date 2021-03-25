package quiz22;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class quiz01 {
	public static void main(String[] args) 
	{
		String name = "E:\\file\\";		
		FileInputStream fr = null;
		BufferedReader bff = null;
		int result;
		try 
		{
			
			fr = new FileInputStream("C:\\Users\\golde\\OneDrive\\바탕 화면\\java\\javaclass2021_quiz\\Quiz\\src\\quiz22\\aa2.csv");
			bff = new BufferedReader(new InputStreamReader(fr,"EUC-KR"));
			String strr;
			String splitstrr;
			List<Data> dataList = new ArrayList<>();
			ArrayList<String> dataLista = new ArrayList<String>();
			List<ArrayList<String>> dataList2a = new ArrayList<>();
				while(((strr = bff.readLine())) != null)
				{
					Data data =new Data();
					String[] splitArray = strr.split(",",5);
					//========================================
					
					for(int i =0;i<4;i++)
					{
						if(splitArray[i] != null)
						{
							dataLista.add(splitArray[i]);
						}
						System.out.println(splitArray[i]);
					}
					
					dataList2a.add(dataLista);
					/*
					data.setRegion(splitArray[0]);
					data.setSize(splitArray[1]);
					data.setYear(splitArray[2]);
					data.setMonth(splitArray[3]);
					if(splitArray.length>4)
					{
						data.setPrive(splitArray[4]);
					}
					
					dataList.add(data);
					*/
				}
				/*
			List<Data> DList = dataList.stream()
					.filter(
								(a)->a.getRegion() !=null
							&& 	a.getRegion().equals("�꽌�슱")
							&&  Integer.parseInt(a.getMonth()) < 6 
							&& 	Integer.parseInt(a.getPrive()) > 4000)
								.collect(Collectors.toList()
							);*/
			
			List<ArrayList<String>> DDList = dataList2a.stream().filter((a)-> a.get(0)!=null && a.get(1).equals("분당") 	
					&&  Integer.parseInt(a.get(3)) < 6 
					&& 	Integer.parseInt(a.get(4)) > 4000).collect(Collectors.toList()
							);
			System.out.println("sdfsd");
			DDList.stream().forEach((a)->
			{
				System.out.println(a.get(1) +" ");
			});
				/*DList.stream().forEach
				(
					(v)->
					{	
					System.out.println(v.getMonth() + "  " +v.getYear());
					}
				);	*/
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
