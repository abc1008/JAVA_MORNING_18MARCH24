package inheritance;

import access_modifiers.ClassA;

public class Protected_Child2 extends ClassA{
	
	
	public static void main(String[] args) {
		
		
		Protected_Child2 cc = new Protected_Child2(); 
		cc.m3();  // accessing protected method
		 
		
		System.out.println(cc.c); // accessing protected variable
		
		
		
	}
	
	
	
	

}
