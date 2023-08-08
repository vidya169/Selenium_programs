package scrolllll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class practice1 {
	public static void main(String[] args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-300)");
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(300.0)");
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(-300,0)");
		Thread.sleep(2000);
		
		
		facebook.click();
		
	}

}
