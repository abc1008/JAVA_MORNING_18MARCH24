package testpack1;

public class ConstructorBasics {
	
//	SYNTAX:
		
//	public ClassName()
//	{
//		// constructor body
//	}
	
	int aa = 50; 
	
	public ConstructorBasics()
	{
		System.out.println("Constructor1 is running.");
		aa = 0;
	}
	
	private ConstructorBasics(int a)
	{
		System.out.println("Constructor2 is running.");
	}
 
	public ConstructorBasics(char b)
	{
		System.out.println("Constructor3 is running.");
	}
	
	public ConstructorBasics(int a, char b, double c)
	{
		this(); 
		System.out.println("Constructor4 is running.");
	}
	
	public ConstructorBasics(char b,int a, double c)
	{
		System.out.println("Constructor5 is running.");
	}
	
	
	public static void main(String[] args) {
		
		
	ConstructorBasics cb = new ConstructorBasics();	

//	ConstructorBasics cb2 = new ConstructorBasics(6);
//		
//	ConstructorBasics cb3 = new ConstructorBasics('y');
	
//	ConstructorBasics cb4 = new ConstructorBasics(4,'y',5.6);
	
	System.out.println(cb.aa);
	
//	ConstructorBasics cb5 = new ConstructorBasics('y',4,5.6);
	}

}
