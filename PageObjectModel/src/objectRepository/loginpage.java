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
	
	

	By username = By.name("username");
	By password = By.name("password");
	By submit = By.xpath("//button[@title='Log In']");
	
	public WebElement Email() {
		
		return driver.findElement(username);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
	
	
}
