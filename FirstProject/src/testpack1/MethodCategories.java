package testpack1;

public class MethodCategories {
	
	
	
	public void m1(int a, int b)
	{
		
//		int a = 60;
//		int b = 20;
		
		
		int c = a + b;
		
		System.out.println(c);
		
	}
	
	
	public static void subtractNums(int a, int b)
	{
		int d = 100;
		
		int c = (a - b) + d;
		

		System.out.println(c);
	}
	
	
	// void = nothing
	public double getUser(double c, double a)
	{
	
		double d = c +a;
		

		String user = "ABC";
		
		return d;

	}
	

	
	public static void main(String[] args) {
	
		MethodCategories m = new MethodCategories();
		m.m1(5,6);
		m.m1(90, 30);

		subtractNums(8,5);
		
		
		double doubleFromMethod = m.getUser(80.9, 63.2);
		
//		System.out.println(userFromMethod);
		
		
		System.out.println(doubleFromMethod + " XYZ");
		
		
		
	}
	
	
	
	
	
	
	

}
