package testpack1;

public class ArrayDiscussion 
{
	// camel casing or camel conventions: 
	
	// package :  all letters lowercase
	// class :  Initial letter in Upper Case
	// method:  1st lower and then every new word initials in upper case
	// variable :  1st lower and then every new word initials in upper case
	
	
	public static void main(String[] args) {
	
	      
	      
	      int a = 10;
		  int b = 20;
		  int c = 30;
		  int d = 40;
		  
		  
		  // data structure which stores multiple varibles/data inside it.
		 
		  // SYNTAX:  dataType [] variableName = {value1, value2, value3..};
		  
		  int [] array1 = { a, b, c , d};
		  	// index       0 , 1 , 2, 3		
		  
		  
		   System.out.println(array1[2]);
		   
		   int sum = array1[0] + array1[2];
		   
		  System.out.println(sum);
		  
		  
		 int array1Size  = array1.length;
		 System.out.println(array1Size);
		  
		 // last index of array = Array size - 1
		 
		 
		 
//		 int [][] array2 = {   {a, b}, {c , d}   };
		 
		 
	// SYNTAX:
		 
	//	 dataType [] variableName = new dataType [array size];
		 int [] array2 = new int [5];
		 
		 array2[0] = 50;
		 array2[3] = 90;
		 
		 System.out.println(array2[4]);
		 
		 
		 System.out.println("yyjgjgjghjghjghjhg    %$#@ 12355 ");
		 
		 
	//   dataType variableName = value;
		 String s1 = "ABC %^& 456";
		 
		 System.out.println(s1);
		 
		 
		 
		 String [] stringArray = {"abc", "&^%", "123"};
		 
		 
		 System.out.println(stringArray[0]);
		  
		 
		 
		 
	}
	
	
	
	
	
	
	
	
	
	

	


}

