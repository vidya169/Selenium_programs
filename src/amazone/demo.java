package amazone;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demo {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");

		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32 (1)\\chromedriver.exe");
//System.setProperty("webdriver.chrome.driver","C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32 (1)\\chromedriver.exe");
		

ChromeOptions options = new ChromeOptions();
//options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
//options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
options.addArguments("--remote-allow-origins=*");

WebDriver driver=new ChromeDriver(options);
driver.get("https://www.amazon.in/");
//driver.get("https://google.com");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
		driver.findElement(By.xpath("//span[text()='Your Orders']")).click();
		driver.findElement(By.xpath("(//span[text()='All']([2]")).click();
		driver.findElement(By.xpath("(//a[text()='Best Sellers'])[2]")).click();  


	

}
}
