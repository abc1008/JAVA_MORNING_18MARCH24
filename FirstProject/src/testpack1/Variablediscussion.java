package testpack1;

public class Variablediscussion 
{

//	static dataType variableName = value;

	static int num1 = 10;  // declaration + initialization
	static int num2;        // variable declaration
	static boolean b1;
	
	// dataType variableName = value;
	int num5 = 100;      // declaration + initialization
	long num6;           // variable declaration
	

	
	
	public void m1()
	{
		// by varialeName when called inside non-static method
		System.out.println(num5);
		
		// by Object when variable is in another class
		MethodDicsussion m1 = new MethodDicsussion();
		System.out.println(m1.c2);
	}
	
	
	
	public static void main(String[] args) 
	{

		System.out.println(num1);  // by variableName
		
		// by className when variable is in another class
		System.out.println(TestClass1.num3); 
		
		
		// by using object reference. 
		// Its not recommended because of unnecessary memory utilization
		Variablediscussion v = new Variablediscussion();
		System.out.println(v.num1);
		
		
		String s2 = MethodDicsussion.s1;
		System.out.println(s2);
		
		
		System.out.println(v.num5);
		
		System.out.println(v.num6);
		System.out.println(num2);
		System.out.println(b1);
		
		
		
		MethodDicsussion m1 = new MethodDicsussion();
		int anotherClassVariable = m1.c2;
		
		System.out.println(anotherClassVariable);
		
		
//		Variablediscussion vv = new Variablediscussion();
		v.m1();
		
		System.out.println(MethodDicsussion.s1);
		
		
		
	}
	

	
	

}
