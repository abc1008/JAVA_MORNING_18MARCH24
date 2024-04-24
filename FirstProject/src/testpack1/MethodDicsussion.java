package testpack1;

public class MethodDicsussion 
{
	
	static String s1 = "96@#ubjkb";
	
	int c2 = 700;

	public static void myFirstMethod()
	{
		System.out.println("m1 static method");
		System.out.println("m2 static method");
		System.out.println("m3 static method");
		System.out.println("m4 static method");
		System.out.println("jhjkhkhkkjhkh");
		
		MethodDicsussion m1 = new MethodDicsussion();
		m1.myFirstNonStaticMethod();
	}
	
	
	public void myFirstNonStaticMethod()
	{
		System.out.println("Non static method - myFirstNonStaticMethod");
		
//		myFirstMethod();
	}
	
	public void m3()
	{
		System.out.println("Non static method - m3");
		myFirstNonStaticMethod();   // non-static method of same class
		
		TestClass1 c1 = new TestClass1();
		c1.m2();  // non-static method of another class
		
	}
	
	public static void main(String[] args) 
	{
	
//	syntax for calling static method	
		
		// methodName();     if method is present in same class
//		myFirstMethod();

//		// className.methodName();  if method is present in another class
//		TestClass1.addition();
//		
//		System.out.println("eeeeee");
		
		MethodDicsussion m1 = new MethodDicsussion(); 
		m1.m3();
//		
		
//		TestClass1 t1 = new TestClass1(); 
//		t1.m2();  
//	
//		
//		m1.myFirstMethod();  // not recommended
		   
	}
	


}

