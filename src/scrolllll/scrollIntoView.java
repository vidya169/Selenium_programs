package scrolllll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class scrollIntoView {
public static void main(String[] args) throws InterruptedException {
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
	//WebDriver driver=new ChromeDriver();

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(options);
	// Launch the application
	driver.get("http://demo.guru99.com/test/guru99home/");

	// find Facebook webelement
	WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
	
	Thread.sleep(3000);
	
	// This will scroll the page till the element is found
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", facebook);

	
}
}


