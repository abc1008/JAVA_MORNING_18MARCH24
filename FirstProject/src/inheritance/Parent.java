package inheritance;

import access_modifiers.ClassA;

public class Parent {
	
	public static void m1()
	{
		
	}
	
	public Parent()
	{
		System.out.println("Parent class constructor");
	}
	
	public Parent(int a)
	{
		System.out.println("Parent class 1 arg constructor");
	}
	
	public Parent(int a, char c)
	{
		System.out.println("Parent class 2 arg constructor");
		System.out.println(a);
		System.out.println(c);
	}
	

	public static void parentM1()
	{
		System.out.println("parentM1");
	}
	
	
	public static void main(String[] args) {
		
		
//		System.out.println(ClassA.a);
		
		ClassA aa = new ClassA();
//		aa.m1()
		
//		aa.m3(); 
		
		
		
		
		
		
		
		

	}
	
	
	
	
	
	
	

}
