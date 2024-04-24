package inheritance;

import interface_discussion.Interface2;

public class Child1 extends Parent
{
	
	Child1()
	{
		super(8,'t');
		System.out.println("Child1 class constructor");
	}
	
	public Child1(int y)
	{
		super(8,'t');
		System.out.println("Child1 class constructor");
	}
	
	
	public static void main(String[] args) 
	{
		
//		parentM1();
		
		Child1 c1 = new Child1();
		
		
		
		m1();
		
		
		
		System.out.println(Interface2.a);

	}

}
