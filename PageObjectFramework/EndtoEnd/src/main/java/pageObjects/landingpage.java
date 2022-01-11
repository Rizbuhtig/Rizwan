package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landingpage {
	
	public WebDriver driver;
	
	public landingpage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By pageTitle = By.cssSelector("div[class='text-center'] h2");
	
	By login = By.xpath("//span[contains(text(),'Login')]");

	By headersection = By.xpath("//ul[@class='nav navbar-nav navbar-right']");
	
	public WebElement getpageTitle() 
	{
		
		 return driver.findElement(pageTitle);
	}

	public WebElement getHeaderSection() {
		
		return driver.findElement(headersection);
	}
	
	public loginpage getLogin()
	{
		driver.findElement(login).click();
		loginpage lp = new loginpage(driver);
		return lp;
	
	}
}
