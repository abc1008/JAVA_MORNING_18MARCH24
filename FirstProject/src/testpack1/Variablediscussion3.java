package testpack1;

public class Variablediscussion3 
{

	int num = 80;  
	static int num2 = 70;


	public static void main(String[] args) 
	{
		
		Variablediscussion3 v1 = new Variablediscussion3();
		v1.num = 90;
		System.out.println(v1.num);
		
		
		Variablediscussion3 v2 = new Variablediscussion3();
		System.out.println(v2.num);
		
		
		Variablediscussion3 v3 = new Variablediscussion3();
		System.out.println(v3.num);
		
		System.out.println();
		System.out.println("*************");
		System.out.println();
		
		
		v1.num2 = 60;
		System.out.println(v1.num2);
		System.out.println(v2.num2);
		
		v1.num2 = 50;
		
		System.out.println(v3.num2);
		System.out.println(v1.num2);
		System.out.println(v2.num2);
		
		
		
	
	}
	

	
	

}
