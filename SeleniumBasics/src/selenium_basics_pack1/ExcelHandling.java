package selenium_basics_pack1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling
{
	public static void main(String[] args) throws IOException
	{
		String path = "D:\\Trainings\\TESTOMETER\\Selenium_JAVA_18Mar24_WEEKDAY\\Excel_File.xlsx";
		
		FileInputStream file = new FileInputStream(path);  // to let java know about the file path
		XSSFWorkbook wb = new XSSFWorkbook(file);   // load/open the file
		XSSFSheet sh = wb.getSheet("ExcelRead");  // opening the exel sheet
		XSSFRow row = sh.getRow(2);     // to get the row
		XSSFCell cell = row.getCell(0);   // to get the cell
		 
		String data = cell.getStringCellValue();    // to get the string data from excel 
		System.out.println(data);
		
		XSSFRow row2 = sh.getRow(3);     // to get the row
		XSSFCell cell2 = row2.getCell(1);   // to get the cell
		
		try
		{
			String data2 = cell2.getStringCellValue();  // to read numeric data from excel
			System.out.println(data2);
		}
		catch (IllegalStateException ex)
		{
			 double data2 = cell2.getNumericCellValue();  // to read numeric data from excel
			System.out.println(data2);
		}
		
		
//		System.out.println();
//		System.out.println("***** for loop ******");
//		System.out.println();
//		
//		for(int r =0; r < 3; r++)
//		{
//			for(int c = 0; c <=2; c++)
//			{
//				XSSFRow row3 = sh.getRow(r);     // to get the row
//				XSSFCell cell3= row3.getCell(c);   // to get the cell
//				System.out.print(cell3.getStringCellValue() + " ");
//			}
//			System.out.println();
//		}
//		
//		System.out.println("Out of for loop");

		wb.close();
		
			
	}
	
	

}
