package testpack1;

public class IfElseDiscussion {

	
	public static void main(String[] args) {
		

//		SYNTAX: If-Else control statement
		
//		if(boolean condition)
//		{
//			when condition is true
//		}
//		else 
//		{
//			when condition is false
//		}

		int a = 10;
		int b = 20;
		int c = 100;
		boolean result = (a < b);
		

		int x;  // variable declaration
		
		if(result) 
		{
			x =10;
		}  
		else if (c == 100)
		{
			System.out.println("else-if block is running");
			System.out.println("rrrr");
		}
		else 
		{
			System.out.println("else block is running");
		}

		System.out.println("After if");
		
	}
	
	
	
	
	
	
	
	
	
	

}
