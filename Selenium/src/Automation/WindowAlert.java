package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("alertbtn")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.accept();
		
		driver.findElement(By.id("confirmbtn")).click();
		
		driver.switchTo().alert();
		System.out.println(alert.getText());
		
		alert.accept();
		
		driver.quit();
		
		
	}

}
