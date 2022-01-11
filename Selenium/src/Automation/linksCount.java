package Automation;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class linksCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footer =driver.findElement(By.id("gf-BIG"));
		
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		WebElement discount = footer.findElement(By.xpath("//table//tbody//tr//td[1]//ul"));
		
		System.out.println(discount.findElements(By.tagName("a")).size());
		
		// To open links in one space
		for(int i=0;i<discount.findElements(By.tagName("a")).size();i++)
		{
			//It will open links in new tab
			String clicklink = Keys.chord(Keys.CONTROL,Keys.ENTER);
			discount.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
			Thread.sleep(5000);
		}
		// switch to all tabs and get the title of tabs
			Set<String> w = driver.getWindowHandles();
			Iterator<String> it = w.iterator();
			
		
			
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
				
			}
			
			
		
		
		
	}
}

