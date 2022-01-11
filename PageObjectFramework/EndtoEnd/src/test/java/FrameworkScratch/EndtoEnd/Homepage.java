package FrameworkScratch.EndtoEnd;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.ForgotPassword;
import pageObjects.landingpage;
import pageObjects.loginpage;
import resources.base;

public class Homepage extends base {
	public static Logger log = LogManager.getLogger(base.class.getName());
	
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = initializedriver();
		//driver.get("https://qaclickacademy.com");
		
	}
	
	@Test(dataProvider="getData")
	public void basepagenavigation(String username, String password, String comment) 
	{
		driver.get("https://qaclickacademy.com");
		landingpage l = new landingpage(driver);
		loginpage lp=l.getLogin();
		
		 
		lp.getEmail().sendKeys(username);
		lp.getPassword().sendKeys(password);
		
		log.info(comment);
		//System.out.println(comment);
		ForgotPassword fp = lp.getforgotPassword();
		fp.getEmail().sendKeys("rahul@gmail.com");
		fp.getInstructions().click();
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data = new Object[2][3];
		data[0][0] = "test@email.com";
		data[0][1] = "abcdes";
		data[0][2] = "Restricted data";
		
		data[1][0] = "demo@email.com";
		data[1][1] = "password";
		data[1][2] = "Normal user";
		
		return data;
		
	}

}
