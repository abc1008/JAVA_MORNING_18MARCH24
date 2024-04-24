package inheritance;

import access_modifiers.ClassA;

public class Protected_Child extends ClassA{
	
	
	public static void main(String[] args) {
		
		
		Protected_Child cc = new Protected_Child(); 
		cc.m3();  // accessing protected method
		 
		
		System.out.println(cc.c); // accessing protected variable
		
		
		
	}
	
	
	
	

}
