package Automation;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class calendarDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		Thread.sleep(5000);
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch]")).getText().contains("April"))
				{
					driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
				}
		
		
		driver.findElement(By.cssSelector("[id='travel-date']")).click();
		List<WebElement> date =driver.findElements(By.className("day"));
		int datecount = driver.findElements(By.className("day")).size();
		
		for(int i =0;i<datecount;i++)
		{
			String dateclick =driver.findElements(By.className("day")).get(i).getText();
			if(dateclick.equalsIgnoreCase("23"))
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
		
		
		
	}

}
