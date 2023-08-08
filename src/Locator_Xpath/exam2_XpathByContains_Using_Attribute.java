package Locator_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exam2_XpathByContains_Using_Attribute {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("vidya");
		
		Thread.sleep(2000);
		
	driver.findElement(By.xpath("//input[contains(@class,'_9npi')]")).sendKeys("vidya@123");
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//button[contains(@class,' selected _51sy')]")).click();
}
}
