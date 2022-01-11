package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssignmentSynchronization {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();
		
		WebDriverWait w = new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
		
		System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());
	}

}
