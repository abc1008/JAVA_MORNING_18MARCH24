package interface_discussion;



public class Class2 extends Class1 {
	
//	static int a = 400;
	

	public void m5() {

		System.out.println("m5 method of Class2");
	}


	public void m6() {

		System.out.println("m6 method of Class2");
	}


	public void m7() {
		System.out.println("m7 method of Class2");
		
	}

	
	
	public static void main(String[] args) {
		
		Class2 c2 = new Class2();
		c2.m1();
		c2.m2();
		c2.m3();
		c2.m4();
		c2.m5();
		c2.m6();
		
		
		System.out.println("************");
		
		Class1 c1 = new Class2();  // parent ref and child obj 
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();
		c1.m5();
		c1.m6();
		
		System.out.println("************");
		
		Interface1 i = new Class2();  // interface ref and child class obj
		i.m1();
		i.m2();
		i.m3();
		
		System.out.println("************");
		Interface2 i2 = new Class2();
		
		i2.m4();
		i2.m5();
		i2.m6();
		
		
		

	   Interface1.m8();
		
	   System.out.println("***** Variable in Interface **************");
		
		System.out.println(c2.a);
		
		System.out.println(Class2.a);
		System.out.println(Interface2.a);
		
		System.out.println(a);  
		
		
//		Interface2.a = 50;  // cannot change final variable
		
	}




	

}
