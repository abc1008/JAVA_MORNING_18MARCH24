package access_modifiers;

  public class ClassA {
	
	
	static int a = 100;   // default variable
	private static int b = 200;  // private variable
	protected static int c = 500;  // protected variable
	
	void m1()  // default method
	{
		System.out.println("m1");
	}
	
	
	private void m2()  // private method
	{
		System.out.println("m2");
	}
	
	protected void m3()  // protected method
	{
		System.out.println("m3");
	}
	
	public static void main(String[] args) {
		
		
		
		ClassA aa = new ClassA();
		aa.m2();  // accessing private method
		
		System.out.println(b);
		
	}
	
	
	
	

}
