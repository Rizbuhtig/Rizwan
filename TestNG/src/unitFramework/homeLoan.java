package unitFramework;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class homeLoan {
	
	@Test
	public void WebHomeLoan()
	{
		System.out.println("WebHome Loan");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileHomeLoan()
	{
		System.out.println("MobileHomeLoan");
	}
	
	
	@BeforeTest
	public void APIHomeLoan()
	{
		System.out.println("API Home Loan - Before Test");
	}
}
