package inheritance;

public class Class4 extends Class3 {
	
	int a = 1000;
	public static int cc = 800;
	
	public void m1()
	{
		Class4 c4 =  new Class4();
		
		System.out.println(c4.a);
		System.out.println(super.a);
	}
	
	public static void main(String[] args) {
		
		m2();
		
		Class4 c4 =  new Class4();
		c4.m5();
		
		c4.m1();
		
	}
	
	
	
	
	
	
	

}
