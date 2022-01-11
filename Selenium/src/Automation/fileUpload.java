package Automation;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fileUpload {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.freepdfconvert.com/pdf-to-jpg");
		
		driver.findElement(By.cssSelector("a[class*=upload-btn]")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\nishantht\\Documents\\check\\fileupload.exe");
	}

}



