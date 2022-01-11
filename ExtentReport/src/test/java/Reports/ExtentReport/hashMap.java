package Reports.ExtentReport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class hashMap {
	
	public static final String EXCELFILELOCATION = "./TestDataExcel.xlsx";
	
	private static  FileInputStream fis;
	private static  XSSFWorkbook workbook;
	private static  XSSFSheet sheet;
	private static  XSSFRow row;
	
	public static void loadExcel() throws Exception {
		
		File file = new File(EXCELFILELOCATION);
		fis = new FileInputStream(file);
		workbook = new XSSFWorkbook(fis);
		sheet = workbook.getSheet("TestData");
		fis.close();
		
	}
	
	
	public static  Map<String,Map<String,String>> getDataMap() throws Exception
	{
		if(sheet == null)
		{
			loadExcel();
		}
		
		
		Map<String,Map<String, String>> excelFile = new HashMap<String,Map<String, String>>();
		Map<String, String> data = new HashMap<String, String>();
		
		for(int i = 1; i < sheet.getLastRowNum() + 1; i++)
		{
			//Checking the row
			row = sheet.getRow(i);
			String keycell = row.getCell(0).getStringCellValue();
			
			int colnum = row.getLastCellNum();
			for(int j =1;j<colnum;j++)
			{
				String value = row.getCell(j).getStringCellValue();
				data.put(keycell,value);
			}
			excelFile.put("MASTERDATA",data);
		}
		
		return excelFile;
		
	
	}
	
	
	public static String getValue(String key) throws Exception{
		Map<String, String> myval = getDataMap().get("MASTERDATA");
		String retvalue = myval.get(key);
		
		return retvalue;
	}
	
	public static void main (String[] args) throws Exception
	{
		System.out.println(getValue("baseurl"));
		System.out.println(getValue("username"));
		System.out.println(getValue("password"));
		System.out.println(getValue("FirstName"));
		System.out.println(getValue("LastName"));
	
		
	}
}
