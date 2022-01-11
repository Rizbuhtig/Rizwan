package Automation;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver.WindowType;

public class newWindowDemo {
	
	//Uplod all 4.0 Java jar and run the test case

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(5000);
		driver.switchTo().window(WindowType.TAB);
		
		Set <String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		driver.get("https://rahulshettyacademy.com");
		String coursename = driver.findElements(By.cssSelector("a[href='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentId);
		
		driver.findElement(By.cssSelector("[name='name']")).sendKeys(coursename);
		
		*/
		
		
	}

	
}
