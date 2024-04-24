package encapsulation_discussion;

public class Class1 {
	
	
	private double accBalance = 1000.00;
	
	
	
	public double getBalance()
	{
		
		return accBalance;
	}
	
	
	
	public double addBalance(double amountToadd)
	{
		
		accBalance = accBalance + amountToadd;

		return accBalance;
	}
	
	
	

}
