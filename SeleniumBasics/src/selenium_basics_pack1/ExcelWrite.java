package selenium_basics_pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite
{
	
	public static void main(String[] args) throws IOException
	{
		// locate the cell in whcih we want to write the data
		
		String path = "D:\\Trainings\\TESTOMETER\\Selenium_JAVA_18Mar24_WEEKDAY\\Excel_File.xlsx";
		FileInputStream file = new FileInputStream(path);  // to let java know about the file path
		XSSFWorkbook wb = new XSSFWorkbook(file);   // load/open the file
		XSSFSheet sh = wb.getSheet("ExcelRead");  // opening the exel sheet
		XSSFRow row = sh.getRow(3);     // to get the row
		XSSFCell cell = row.getCell(3);   // to get the cell

		
		// To write the data in excel
		FileOutputStream fOut = new FileOutputStream(path);
		cell.setCellValue("Edit_Password");    // update the cell value
	

		
		System.out.println("Completed update operation.");
		
		
		// writing data in empty cells of cells
		 XSSFRow createdRow = sh.createRow(7);
		  XSSFCell createdCell = createdRow.createCell(1);
		
		  createdCell.setCellValue("NewCellData");
		
			System.out.println("Inserted data into empty cell.");
			
			wb.write(fOut);     // save the updated workbook
			wb.close();
	}
	
	
	
	
	

}
