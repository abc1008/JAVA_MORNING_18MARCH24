package typecasting;

public class Child extends Parent {
	
	
	public void m1() 
	{
		System.out.println("m1 method of Child");
	}
	
	
	
	public static void main(String[] args) {
		
		
		Child cc = new Child();
		cc.m1();              
		
		
		Parent zz = (Parent)cc;    // Parent zz = new Child();
		zz.m1();              	   // child method will be called           
		
		
		
		System.out.println(" ********* Explicit Typecasting **********");
		
		
		
		
		Parent p1 = new Parent();
		p1.m1();
		
		
		try 
		{
			Child x = (Child)p1;  // reference variable of parent class is converted into child
			x.m1();
			
		}
		catch (Exception e) 
		{
			System.out.println("Exception found : "+e.getMessage());
		}
		
		
//		 Child x = new Parent();    
		
		System.out.println("After exception handling");

	
		
	}
	
	

}
