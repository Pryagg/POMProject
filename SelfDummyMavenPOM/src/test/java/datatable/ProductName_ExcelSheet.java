package datatable;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ProductName_ExcelSheet 
{
	public String ProductName()
	{
		String value = null;
		try
		{
		File file  	= new File("C:\\Users\\Pink Princess\\Desktop\\automation selenium\\Selenium_Data_Excels\\data.xlsx");
		FileInputStream fis = new FileInputStream(file);		
		XSSFWorkbook workbok = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbok.getSheet("Sheet1");			
		//int rowcount = sheet.getLastRowNum()+1; //it starts with 0
		//val = sheet.getRow(i).getCell(j).toString();
		value = sheet.getRow(1).getCell(1).toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return value;
	}

}
