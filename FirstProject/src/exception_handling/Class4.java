package exception_handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Class4 {
	
	
	public static void m1()
	{

		int   a = 10;
		int b = 5;
		
		if(b > a)
		{
			throw new NullPointerException("My exception is found.");
		}
		else
		{
			throw new ArithmeticException("Arithmactic exception found.");
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {

		m1();
		
		
	}
	
	
	
	
	

}
