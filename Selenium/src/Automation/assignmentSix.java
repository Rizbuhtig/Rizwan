package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class assignmentSix {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		
		//driver.findElement(By.xpath("//input[contains(text(),'Option 2'])")).isDisplayed();
		
		
		driver.findElement(By.cssSelector("input[id='checkBoxOption2']")).click();
		
		WebElement checkboxvalue = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]"));
	
		String checkboxoption = checkboxvalue.getText();
		
		WebElement dropdownvalue =driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));
		
		Select s = new Select(dropdownvalue);
		s.selectByVisibleText(checkboxoption);
		
		driver.findElement(By.xpath("//input[@name='enter-name']")).sendKeys(checkboxoption);
		
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		
		Alert  alert = driver.switchTo().alert();
		alert.getText();
		String alertresult = alert.getText();
		
		if(alertresult.contains(checkboxoption))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("Failed");
		}
		
		
		
		
	}

}
