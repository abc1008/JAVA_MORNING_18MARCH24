package abstractDicsussion;

public abstract class ClassA 
{
	
	// abstract - unclear/vague
	
	int a = 100;
	
	
	public ClassA()
	{
		a = 50;
		System.out.println("Constructor of abstract class.");
	}
	

	
	public void m2()  // concrete methods
	{
		System.out.println("m2 method of abstract class");
	}
	
	
	public abstract void personalLoan();  // abstract/incomplete method
	
	public abstract void m1();
	
	public abstract void m3();
	
	
	
	
	
	
	
	

}
