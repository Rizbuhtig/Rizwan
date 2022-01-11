package unitFramework;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class vehicle {
	
	
	@Parameters({"URL"})
	@Test
	public void vehicleAccelerate(String urlname)
	{
		System.out.println("vehicle acceleration");
		System.out.println("url is " + urlname);
	}
	
	
	@Test(groups= {"Smoke"})
	public void vehicleWheels()
	{
		System.out.println("vehicle wheels");
	}
	
	@Parameters({"APIKey"})
	@Test
	public void vehiclespeedometer(String api)
	{
		System.out.println("vehicle speedometer");
		System.out.println(api);
	}
	
	@Test (dataProvider = "getData")
	public void Login(String username, String password)
	{
		System.out.println("Login and password combinations");
		System.out.println(username);
		System.out.println(password);
	}
	
	
	@AfterSuite
	@Test
	public void vehicleInsurance()
	{
		System.out.println("Vehicle Insurance -- AfterSuite");
		Assert.assertTrue(false);
	}
	
	@DataProvider
	@Test
	public  Object[][] getData()
	{
		Object d[][] = new Object[3][2];
		d[0][0] = "username1";
		d[0][1] = "password1";
		
		d[1][0] = "username2";
		d[1][1] = "password2";	
		
		d[2][0] = "username3";
		d[2][1] = "password3";
		
		return d;
	}
}
