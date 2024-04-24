package polymorphism;

public class Class2 extends Class1 {
	
	// overloaded
	public void m1(boolean b, int c)
	{
		System.out.println("Child m1 method 2 arg");
	}
	
	// overridden
	public void m1()
	{
		System.out.println("Child m1 method with 1 args");
	}
	
	public void m2()
	{
		System.out.println("Child m2 method with zero args");
	}
	
	

	public static void main(String[] args) {
		
		Class2 c2 = new Class2();  		// child ref + child obj
		c2.m1();            // overridden of child - based on object 
		c2.m1(5);           // overloaded method of parent - based on ref variable
		c2.m1(true, 8);     // overloaded method of child - based on ref variable
		c2.m2();            // overridden - based on object 
		
		Class1 c1 = new Class1();      // parent ref + parent obj 
		c1.m1();   // overridden of child - based on object 
		c1.m1(6);  // overloaded method of parent - based on ref variable
		c1.m2();   // overridden - based on object 
	
		Class1 p1 = new Class2();    // parent ref + child obj  
		p1.m1();    // overridden - based on object        
		p1.m1(8);  // overloaded method of parent - based on ref variable
		p1.m2();    // overridden - based on object       
		
		
		
//		Class2 p2 = new Class1();   // child ref + parent obj not possible 
		
		
		// overriding = object will decide method execution
		// overloading = ref variable will decide method execution
		
		
		// Runtime Polymorphism  / late binding
		// Compiletime Polymorphism /  early binding
		


		
	}
	
	
	

}
