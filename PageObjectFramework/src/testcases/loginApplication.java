package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import objectRepository.loginpage;

public class loginApplication {
	
	@Test
	public void login()
	{
		System.setProperty("webdriver.gecko.driver","D://geckodriver//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://sso.teachable.com/secure/9521/identity/login");
		
		loginpage login = new loginpage(driver);
		login.Email().sendKeys("hello");
		login.password().sendKeys("hello");
		login.submit().click();
		
		
	}

}
