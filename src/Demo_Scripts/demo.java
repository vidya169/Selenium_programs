package Demo_Scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demo {
	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
	//	options.addArguments("--disable notifications");
		WebDriver driver=new ChromeDriver(options);

		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Shivaji Nagar, Pune");
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Madiwala, Bangalore");
		
	}

}
