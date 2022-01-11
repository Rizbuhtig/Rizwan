package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import objectRepository.loginpage;

public class loginapplication {
	
	@Test
	public void Login() 
	{
		System.setProperty("webdriver.gecko.driver","D://geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	
		driver.get("https://www.website.com/sign-in/?source=SC&country=IN");
		
		loginpage login = new loginpage(driver);
		login.Email().sendKeys("user@email.com");
		login.Password().sendKeys("password");
		login.submit().click();
		
	}
	
	  
}
