package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Class3 {
	
	
	public static void m1() throws FileNotFoundException
	{

		FileInputStream file = new FileInputStream("D:\\Trainings\\TESTOMETER\\Selenium_JAVA_18Mar24_WEEKDAY\\Excel_File.xlsx");
		System.out.println("After object");
	}
	
	public static void main(String[] args) throws FileNotFoundException {

		m1();
		
		
	}
	
	
	
	
	

}
