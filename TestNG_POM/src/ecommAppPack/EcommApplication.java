package ecommAppPack;

import basePack.BaseTest;
import pageClasses.AddressBookPage;
import pageClasses.EditAccountPage;

public class EcommApplication extends BaseTest {
	
	
//	 EditAccountPage editAccountPage =  new EditAccountPage(driver);
	
	private static EditAccountPage _editAccountPage;
	public static EditAccountPage editAccountPage()
	{
		_editAccountPage = new EditAccountPage(driver);
		
		return _editAccountPage;
	}
	
	
	private static AddressBookPage _addressBookPage;
	public static AddressBookPage addressBookPage()
	{
		_addressBookPage = new AddressBookPage(driver);
		
		return _addressBookPage;
	}
	
	
	
	
	
	
	

}
