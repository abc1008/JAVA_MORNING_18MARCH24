package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Class1 {
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws  FileNotFoundException, InterruptedException{

		int a = 10;
		int b = 0;
		
		System.out.println("before divide operation");
		
//		try 
//		{
//			int c = a/b;   // risky code
//			// nullponter execption
//			
//		}
//		catch (Exception ex) 
//		{
//			System.out.println("Exception found : "+ex.getMessage());
//		}
//		finally 
//		{
//			System.out.println("finally block.");
//		}
		
		
		Thread.sleep(3000);  // program execution will stop 
		
		System.out.println("After try-catch");	

		FileInputStream file = new FileInputStream("D:\\Trainings\\TESTOMETER\\Selenium_JAVA_18Mar24_WEEKDAY\\Excel_File2.xlsx");
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
