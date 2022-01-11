package dataExcel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {
	
	public ArrayList<String> getData(String testcasename) throws IOException
	{
		FileInputStream fin = new FileInputStream("D:\\DataDrivenExcel\\dataexcel.xlsx");
		XSSFWorkbook w = new XSSFWorkbook(fin);
		
		
		ArrayList a = new ArrayList();
		//Get the sheetcount in workbook
		int sheetcount = w.getNumberOfSheets();
		
		for(int i=0;i<sheetcount;i++)
		{	
			//comparing the sheet name at ith index with sheet1
			if(w.getSheetName(i).equalsIgnoreCase("Sheet1"))
			{
				//sheet access
				XSSFSheet sheetdata  = w.getSheetAt(i);
				
				//access the rows
				Iterator <Row> rows = sheetdata.iterator();
				
				//checking the rows by performing next operation
				Row firstrow = rows.next();
				
				//accessing the cell data
				Iterator<Cell> ce = firstrow.cellIterator();
				
				int k = 0;
				int column =0;
				while(ce.hasNext())
				{
					Cell value = ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("har"))
					{
						column = k;
					}
					k++;
				}
				System.out.println(column);
				
				while(rows.hasNext())
				{
					Row r = rows.next();
					
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename))
					{
						Iterator<Cell> cv = r.cellIterator();
						
						while(cv.hasNext())
						{
							Cell c= cv.next();
							if(c.getCellType()==CellType.STRING)
							{
								a.add(c.getStringCellValue());
							}
							else
							{
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));	
							}
							
							
						}
					}
					
				}
			}
			
			
			
		}
		
		return a;
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//getData("har");
		
	}

}
