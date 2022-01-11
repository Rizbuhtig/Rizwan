package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://mypage.rediff.com/login/dologin");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(5000);
		
	
		//We need to switch to alert popup
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		//Clicks on ok button of alert pop-up
		alert.accept();
		
		//Alert will be dismissed - clicks on cancel b		466666644444444464444444444utton
		//alert.dismiss();
	}
	  
}
