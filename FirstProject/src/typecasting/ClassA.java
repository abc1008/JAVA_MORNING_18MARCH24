package typecasting;

public class ClassA {
	
	
	public byte m1()
	{
		
		return 20;
	}
	
	
	public int m2(int a)
	{
		

		int result = a + 100;
		
		return result;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		
		// m1();   // byte
		 
		// m2(int a);
		
		 
		
		
		
		
		byte b = 10;
		
		int y = (int)b; // changing the type of b into int
		
		System.out.println(y);
		
		
		
		// -128, -127, ... 0, 1,2,3...127 
		
		int cc = 130;
		
		byte vv = (byte)cc;    // changing higher order data type into lower order
		
		System.out.println(vv);
		
//		vv++;       //post increment  (internal typecasting) 
		
		byte d = 1;
		
		int bbb = vv + d;  
		
		System.out.println(bbb);
		
		
		
		// byte + byte = int 
		// short + short = int 
		// byte + short = int
		// int + int = int
		
		// long + double = double
		// int + long = long
		
		
		
		
		
	}
	
	
	
	
	
	

}
