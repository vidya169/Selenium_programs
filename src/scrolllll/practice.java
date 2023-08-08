package scrolllll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.sun.jdi.connect.Connector.Argument;

public class practice {
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
	
	Thread.sleep(2000);
	
	//((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",facebook);
	((JavascriptExecutor)driver).executeScript("Arguments[0].scrollIntoView();",facebook);
	Thread.sleep(2000);
	
	facebook.click();
	Thread.sleep(2000);
	
	driver.quit();
	
	
	
	}
}