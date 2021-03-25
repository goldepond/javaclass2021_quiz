package quiz24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class main {

	public static void main(String[] args) {
		FileInputStream fr = null;
		BufferedReader bff = null;
		//==========================================================
		XSSFWorkbook xssfWb = null;
		XSSFSheet xssfSheet = null; // .xlsx
		XSSFRow xssfRow = null; // .xlsx
		XSSFCell xssfCell = null;// .xlsx
		//==========================================================
		try {
			fr = new FileInputStream("C:\\Users\\golde\\OneDrive\\바탕 화면\\java\\javaclass2021_quiz\\Quiz\\src\\quiz24\\gandom.txt");
			bff = new BufferedReader(new InputStreamReader(fr,"UTF-8"));
			String strr;

			List<Product> dataLista = new ArrayList<Product>();
			while(((strr = bff.readLine())) != null)
			{
			//	System.out.println(strr);
				String dayP = "[0-9]+\\-[0-9]+\\-[0-9]+";
				String storeP ="[가-힣]+ [가-힣]+";
				String gradeP ="\\[\\D{2,5}\\]";
				String priceP ="\\d+\\,*\\d+원";
				String []pattern = {dayP,storeP,gradeP,priceP};
				Product product = new Product();
				Matcher m1 = (Pattern.compile(pattern[0])).matcher(strr);
				Matcher m2 = (Pattern.compile(pattern[1])).matcher(strr);
				Matcher m3 = (Pattern.compile(pattern[2])).matcher(strr);
				Matcher m4 = (Pattern.compile(pattern[3])).matcher(strr);
				if(m1.find()&&m2.find()&&m3.find()&&m4.find())
				{
					product.setDay(m1.group());
					product.setStore(m2.group());
					product.setGrade(m3.group());
					String a = strr.substring (m3.end()+1 ,m4.start()-1);
					product.setDetail(a);
					product.setPrice(m4.group());
				}
				dataLista.add(product);	
			}
			dataLista.forEach((d)->System.out.println(d.toString()));

			//=====================================================
			
			Workbook xlsxWb = new XSSFWorkbook(); // Excel 2007 이상
			 
	        // *** Sheet-------------------------------------------------
	        // Sheet 생성
	        Sheet sheet1 = xlsxWb.createSheet("firstSheet");
	        // ----------------------------------------------------------
	        Row row = null;
	        Cell cell = null;
	        //----------------------------------------------------------
	       
	        // 첫 번째 줄
	        row = sheet1.createRow(0);
	         
	        // 첫 번째 줄에 Cell 설정하기-------------
	        for(int a=0;a<dataLista.size();a++)
	        {
	        	 sheet1.setColumnWidth(a, 10000);
	        	row = sheet1.createRow(a);
	
	  	       	cell = row.createCell(0);
	  	        cell.setCellValue(dataLista.get(a).getDay());
	  	        
	  	        cell = row.createCell(1);
	  	        cell.setCellValue(dataLista.get(a).getStore());
	  	        
	  	        cell = row.createCell(2);
	  	        cell.setCellValue(dataLista.get(a).getGrade());
	  	        
	  	        cell = row.createCell(3);
	  	        cell.setCellValue(dataLista.get(a).getDetail());
	  	        
	  	        cell = row.createCell(4);
	  	        cell.setCellValue(dataLista.get(a).getPrice());
	  	        
	        }
	          File xlsFile = new File("A:\\testExcel.xls");
	            FileOutputStream fileOut = new FileOutputStream(xlsFile);
	            xlsxWb.write(fileOut);
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
