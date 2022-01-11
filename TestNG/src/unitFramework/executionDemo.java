package unitFramework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class executionDemo {
	
	@AfterTest
	public void  CarWebLoan()
	{
		System.out.println("Web Car Loan -- After test");
	}
	
	@Test
	public void CarMobileLoan()
	{
		System.out.println("Mobie Car Loan");
	}
	
	@BeforeSuite
	public void CarInsurance()
	{
		System.out.println("Car Insurance -- Before Suite");
	}
	
	
	@Test(groups= {"Smoke"})
	public void CarAPILoan()
	{
		System.out.println("API Car Loan");
	}
	
	@BeforeMethod
	
	public void CarService()
	{
		System.out.println("Car services -- Before Method");
	}
	
	
	@AfterMethod
	
	public void CarCoupons()
	{
		System.out.println("Car coupons - After method");
	}
}
