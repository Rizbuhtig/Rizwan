package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class frameAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		Actions a = new Actions(driver);
		//WebElement topframe = driver.findElement(By.name("frame-top"));
		
		driver.switchTo().frame("frame-top");
		
		//driver.switchTo().frame(driver.findElement(By.name("frameset-middle")));
		
		driver.switchTo().frame(("frame-middle"));
		System.out.println(driver.findElement(By.id("Content")).getText());		
	}

}
