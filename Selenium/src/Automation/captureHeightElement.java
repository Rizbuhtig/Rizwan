package Automation;

public class captureHeightElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.setProperty("webdriver.gecko.driver", "D:/geckodriver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(5000);
		
		//switching window
		driver.switchTo().window(WindowType.TAB);
		
		Set <String> handle = driver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		driver.get("https://rahulshettyacademy.com");
		String coursename = driver.findElements(By.cssSelector("a[href='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentId);
		
		WebELement name =driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(coursename);
		
		//Screenshot and copying file
		name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("logo.png"));
		
		
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getHeight());
		
		driver.quit();
		
		
		
		
		
		*/
	}

}
