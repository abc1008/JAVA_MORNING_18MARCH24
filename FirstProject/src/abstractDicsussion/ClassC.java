package abstractDicsussion;

public class ClassC extends ClassB{
	
	
	
	
	public void m3()
	{
		System.out.println("m3 method from ClassC");
	}
	
//	public void m1() 
//	{
//		System.out.println("m1 method from ClassC");
//	}
	
	
	
	
	
	public static void main(String[] args) {
		
		ClassC c = new ClassC(); // child ref and child obj
		System.out.println(c.a);
		System.out.println("Constructor check");
		c.m3();
		
		c.personalLoan();
		c.m1();
		
		
//		ClassB b = new ClassB();  // not possible
		
		
		System.out.println("*****************");
		
		ClassA a = new ClassC();  // parent ref and child obj
		
		a.m1();
		a.personalLoan();
		a.m3();
		a.m2();
		
		System.out.println(c.a);

		
		
		
	}
	
	
	

}
