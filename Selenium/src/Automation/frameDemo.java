package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class frameDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		Actions a = new Actions(driver);
		WebElement option = driver.findElement(By.cssSelector("iframe[class='demo-frame']"));
		driver.switchTo().frame(option);
		/*WebElement dragelement = driver.findElement(By.id("draggable"));
		WebElement dropelement = driver.findElement(By.id("droppable"));
		a.dragAndDrop(dragelement, dropelement).build().perform();*/
		a.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		
		
		
	}

}
