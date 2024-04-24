package polymorphism;

public class Parent {
	
	int b= 80;
	
	
	
	
	
	public static void home()
	{
		System.out.println("home - Parent");
	
	}
	
	public void home(int a)
	{
		System.out.println("home - Parent");
	
	}
	
	public static void car()
	{
		System.out.println("car - Parent");

	}
	
	
	public final void marry()
	{
		System.out.println("marry - Parent");
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Main method of parent");
		
	}
	
	public static void main(int [] args) {
		
		
		System.out.println("Main method of int Parent");
		
	}
	
	public static void main(int [] args, char c) {
		
		
		System.out.println("Main method of int and char");
		
		
		
	}
	

}
