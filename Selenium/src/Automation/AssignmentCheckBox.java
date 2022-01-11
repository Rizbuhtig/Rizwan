package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class AssignmentCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id=checkBoxOption1]")).isSelected());
		driver.findElement(By.cssSelector("input[id=checkBoxOption1]")).click();
		
		System.out.println(driver.findElement(By.cssSelector("input[id=checkBoxOption1]")).isSelected());
		
		driver.findElement(By.cssSelector("input[id=checkBoxOption1]")).click();

		System.out.println(driver.findElement(By.cssSelector("input[id=checkBoxOption1]")).isSelected());

		//count of checkbox
		
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
	}

}
