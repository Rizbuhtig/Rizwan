package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
	
	public WebDriver driver;


	

	public loginpage(WebDriver driver)
	{
		this.driver = driver;
	}
	//Encapsulation is achieved by keeping data variables as private and the accessor methods are public and it is hiding of data 
	private By email = By.id("user_email");
	private By password = By.id("user_password");
	private By submit = By.name("commit");
	//regular expression of href is used- where part of link is mentioned in path
	private By forgotpassword = By.cssSelector("[href*='password/new']");
	
	
	
	public ForgotPassword getforgotPassword()
	{
		driver.findElement(forgotpassword).click();
		ForgotPassword fp = new ForgotPassword(driver);
		return fp;
		
		
	}
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	
	public WebElement getSubmit()
	{
		return driver.findElement(submit);
	}
	
}
