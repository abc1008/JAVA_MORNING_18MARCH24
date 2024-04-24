package string;

public class StringMethods {
	
	static String s1 = "testomeTerthjkhkhkhkhjiohuihbjbjk";
	
	public static void main(String[] args) {
		
	// Test	
		
	// 1. 
		
		 char c1 = s1.charAt(6);
		 System.out.println(c1);
		
	// 2. 
		 
		 String ss = s1.concat(" Class");
		 System.out.println(ss);
		
		 
//		 3.  
		 
		 String s3 = "testometer";
		boolean result = s1.equals(s3);
		
		 System.out.println(result);
		 
		 
//		 4. Verify this method. its not working
		 
		 String s2 = "testometer";
		 
		 boolean result2 = s1.equalsIgnoreCase(s2);
		 System.out.println(result2);
		 
		 
//		 5. 
		 
		  int num = s1.length();
		 
		 System.out.println(num);
		 
		 
		 
		 
//		 String s1 = "Testometer";  (declared on top)

//		  6.
		 
		 
		String subString  = s1.substring(4);
		 
		 System.out.println(subString);

		 
		 String subString2 = s1.substring(4, 8);
		System.out.println(subString2);
		
		
		
//		7. 
		
		String replaced = s1.replace('o', 'X');
		System.out.println(replaced);
		
		
//		 String s1 = "Testometer";  (declared on top)

		
//		 8.
		
		
//		  s1.toUpperCase();
		  
		  System.out.println(s1.toUpperCase());
		  System.out.println(s1.toLowerCase());
		  
		  
//		  10 
		  
		  String x1 = "    Morning Batch    ";
		  
		  System.out.println(x1);
		  
		  System.out.println(x1.trim());
		  
		  
		  
//			 String s1 = "testomeTer";  (declared on top)
		  
//		  11.
		  
		  
		int mIndex =  s1.indexOf('t');
		
		System.out.println(mIndex);
		
		
//		12 
		
		int tLastIndex =  s1.lastIndexOf('t');
		System.out.println(tLastIndex);
		
		
		
//		13
		
//		 String s1 = "testomeTerthjkhkhkhkhjiohuihbjbjk";  (declared on top)
		
		boolean result3 = s1.contains(" meTer");
		
		System.out.println(result3);
		
		
		
//		14 
		
//		String s1 = "testomeTerthjkhkhkhkhjiohuihbjbjk";  (declared on top)
		
		  char[] sss = s1.toCharArray();
		
//		System.out.println(sss[6]);
		
//		for(int i = 0; i<= (s1.length() -1); i++)
//		{
//			System.out.println(sss[i]);
//		}
		
		
//		for(char j : sss)
//		{
//			System.out.println(j);
//		}
		
		
		
//		16
		
		char x = 'S';
		
		
		boolean isDigit = Character.isDigit(x);
		
		System.out.println(isDigit);
		
		
		
//		17  primitive data into non-primitive
		
		int num2 = 456;  // primitive
		
		System.out.println(num2 + 10);   // addition
		
		 String convertedString = String.valueOf(num2);
		
		System.out.println(convertedString + 10);  // conctination
		
	
		
// 18.    non-primitive into primitive data
		
		String s4 = "4500";
		
		System.out.println(s4 + 50);
		
		int converted = Integer.parseInt(s4);
		
		System.out.println(converted + 50);   // converted into int
		
		
//		wrapper classes
		
//		boolean --> Boolean
//		double  --> Double
//		short  -->  Short
		

		Double convDouble = Double.parseDouble(s4);
		
		System.out.println(convDouble);
		
		Boolean b = Boolean.parseBoolean(s4);
		System.out.println(b);
		
		
		
//		19
		
		String s5 = "abc,pqr,stu";
		
		
		
		String [] arr = s5.split(",");
		
		System.out.println(arr[2]);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
