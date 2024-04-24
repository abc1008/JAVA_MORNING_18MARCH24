package polymorphism;

public class Child extends Parent {
	
	
	private final static int a = 80;
	
	
	int b = 100;
	
	
//	public void marry()
//	{
//		System.out.println("marry - child");
//	}
	
	public static void car() 
	{
		System.out.println("car - Child");
	}
	
	
	public static void main(int [] args) {
		
		
		System.out.println("Main method of int child");
		
	}
	
	public static void main(String[] args) 
	{
		
		
		int [] array2 = {1,12};	
		
		Parent p = new Child();
		p.car();  // method hiding
		
		System.out.println("Check");
		p.main(array2);
		
		System.out.println(p.b);
		
		
		Child c = new Child();
		c.home();
		c.marry();
		c.car();;
		
		
		c.main(array2);
		
		System.out.println(c.b);
		
		
		
		
		Parent p2 = new Parent();
		p2.car();
		
		String [] array1 = {"abc", "prr"};
		
		
		
		Parent.main(array2, 't');
		System.out.println(p2.b);
		
		
//		a = 20;
//		
//		System.out.println(c.a);
		
		
		
	}
	
	
	

	
	
	

}
