package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(5000);
		/*int i=1;
		while(i<5)
		{
			
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}*/
		
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		driver.quit();
		
	}

}
