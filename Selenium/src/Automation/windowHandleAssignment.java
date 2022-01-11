package Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class windowHandleAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		
		Set<String> windows =driver.getWindowHandles();
		
		Iterator <String> it = windows.iterator();
		String parentID = it.next();
		String childID = it.next();
		
		driver.switchTo().window(childID);
		
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
		driver.switchTo().window(parentID);
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		
		
	}

}
