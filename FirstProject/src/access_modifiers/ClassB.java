package access_modifiers;

public class ClassB{
	
	
	
	public static void main(String[] args) {
		
		
		ClassA aa = new ClassA();
		aa.m1();
//		aa.m2();  // accessing private method
//		
//		System.out.println(ClassA.b);
		
		aa.m3();
		
	}
	
	
	
	

}
