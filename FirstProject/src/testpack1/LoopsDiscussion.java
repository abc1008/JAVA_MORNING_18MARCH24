package testpack1;

public class LoopsDiscussion {
	
	
	public static void main(String[] args) {
		

//		System.out.println("Loop");
//		
//		System.out.println("Loop");
//		System.out.println("Loop");
//		System.out.println("Loop");
		
		
		
//		SYNTAX
		
//		while(boolean condition)
//		{
//			 // code to repeat/iterate
//		}
		
		int i = 0;
		
		while(i < 4)
		{
			System.out.println("Loop");
			i++;
		}
		
		
		System.out.println("After while loop");
		

		System.out.println();
		System.out.println("**** DO_WHILE ******");
		System.out.println();
		
		
		
//		SYNTAX:
		
//		do 
//		{
//			// code to repeat
//		}
//		while(boolean condition);
		
		int x = 0;
		do
		{
			// concatination = appending 
			System.out.println("Value of x is : " + x);
			
			
			x++;
			
			if(x==2)
			 break;
			
			
		}
		while(x < 4);  // condtion is false.
		
		System.out.println("After do-while loop");
		
		
		
		
		System.out.println();
		System.out.println("**** For Loop ******");
		System.out.println();
		
		
		
//		SYNTAX:
		
//					1	        2,5,8			4,7
//		for(initialization; condition; increment/decrement)
//		{
					
//					3,6,9
//			// code to repeat
//		}
		
		
		for(int j =0; j<4; j++)				// j = 0,1,2,3,4									
		{
			System.out.print("Loop ");
			
			// ln = new line

		}
		System.out.println(); // shift the focus to next line
		System.out.println("After for loop");
		System.out.println("yyy");
		
		
		System.out.println();
		System.out.println("**** Array Loop ******");
		System.out.println();
		
		int [] arrray1 = new int [5];
		
		arrray1[0] = 50;
		arrray1[1] = 51;
		arrray1[2] = 52;
		arrray1[3] = 53;
		arrray1[4] = 54;
		
		
		for(int w = 0; w < 5; w++)
		{
			System.out.println(arrray1[w]);
			
			if( arrray1[w] == 52 )
				continue;  // Skip the condition
			
			System.out.println("after continue keyword");
			
		}
		
	
		System.out.println("After array loop");
		
		
		
		System.out.println();
		System.out.println("**** ForEach Loop ******");
		System.out.println();
		
	
		
//			SYNTAX:
			
//			for(  DataType variable : dataStructure )
//			{
//				// logic or code to repeat
//			}
		
		
		for( int num : arrray1  )
		{
			
			if(num == 52)
			 continue; // to skip the current condition and jump to next one
			
			
			System.out.println(num);
		}
		
		
		System.out.println("After for-each loop");
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
