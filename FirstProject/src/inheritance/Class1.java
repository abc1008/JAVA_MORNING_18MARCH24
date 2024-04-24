package inheritance;

public class Class1 {
	
	
	static int a = 10;
	
	
	public void m1()
	{
		System.out.println("m1 method of 'Class1'");
	}
	
	public static void m2()
	{
		System.out.println("m2 method of 'Class1'");
	}
	
	
	
	public static void main(String[] args) {
		
		Class1 c1 = new Class1();
		c1.m1();
		
		m2();
		
		Class2 c2 = new Class2();
		c2.m5();
		
//		c1.m5(); // calling of child method on basis of parent class object 
		
		
	}
	
	
	
	
	
	
	

}
