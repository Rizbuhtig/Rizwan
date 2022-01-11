package Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowHandleDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> window =driver.getWindowHandles(); //[parentId, childId]
		Iterator<String> it = window.iterator();
		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		
		driver.findElement(By.cssSelector(".im-para.red")).getText();
		
		String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parentId);
		
		driver.findElement(By.id(("username"))).sendKeys(emailId);
		
	}

}
