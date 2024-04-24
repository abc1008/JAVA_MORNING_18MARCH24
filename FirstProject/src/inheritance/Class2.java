package inheritance;

public class Class2 extends Class1{
	
	public static int b = 90;
	
	
	public void m5()
	{
		System.out.println("m5 method of 'Class2'");
	}
	
	public static void main(String[] args) {
		
		Class1 c2 = new Class1();
		c2.m1();
		
		Class2 c22 = new Class2();
		c22.m1();
		
		m2();
		
		// home loan - 8 %    -  500 lines
		// educaion - 5 %    -      500 lines
		// personal loan - 13 %  - 500 lines
		
		
		// common logic for calculation of rates : 100 lines
		
		
		// parent class - method with common logic for calculation of rates : 100 lines
		
		
		
		System.out.println(Class1.a);
		System.out.println(access_modifiers.Class1.a);
		
		
		
	}
	
	
	
	
	
	
	

}
