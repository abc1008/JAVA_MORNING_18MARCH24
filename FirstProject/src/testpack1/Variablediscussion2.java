package testpack1;

public class Variablediscussion2 
{
	// static and non-static variables = Global variables
	int b = 123;
	int j = 100;
	static int h = 456;
	
	public void m1()
	{
		// local variable
		int b = 20;
		System.out.println(b);
		
//		this = keyword
		System.out.println(this.b);
		
		int h = 894;
		System.out.println(h);  // local
		System.out.println(this.h);  // not recommended
		System.out.println(Variablediscussion2.h);
		

//		Variablediscussion2 tt  = new Variablediscussion2();
//		System.out.println(tt.b);

	}
	
	
	public static void m2()
	{
		int j = 120;
		
		System.out.println(j);  // local
//		System.out.println(this.j);
		
		Variablediscussion2 tt  = new Variablediscussion2();
		System.out.println(tt.j);  // global
	}
	
	
	
	
	public static void main(String[] args) 
	{
		// local variable 
		//dataType variableName = value;
		int a = 10;
		
		Variablediscussion2 v2 = new Variablediscussion2();
		v2.m1();
		
		m2();
		
		
	}
	

	
	

}
