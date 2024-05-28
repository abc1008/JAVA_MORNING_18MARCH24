package testScripts;

import basePack.BaseTest;
import ecommAppPack.EcommApplication;
import pageClasses.AddressBookPage;

public class EditAddressTestScript extends BaseTest{
	
	
	public boolean performEditAddress()
	{
		if(EcommApplication.addressBookPage().editAddress())
		{
			System.out.println("Perfomed Edit Address test successfully.");
			 return true;
		}
		else 
		{
			System.out.println("Account not successfully updated.");
			return false;
		}
		
	}
	
	
	
	
	

}
