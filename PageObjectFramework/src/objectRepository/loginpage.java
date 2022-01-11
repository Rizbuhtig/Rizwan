package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {

	WebDriver driver;
	
	public loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username = By.name("email");
	By password = By.name("password");
	By Go = By.name("commit");
	
	
	public WebElement Email()
	{
		return driver.findElement(username);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement submit()
	{
		return driver.findElement(Go);
	}
}


