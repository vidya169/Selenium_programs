package Locator_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_XpathByAttribute {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32 (1)\\chromedriver.exe");

				WebDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/");
				
				//driver.findElement("locator")
				//driver.findElement(By.xpath("xpathExpression"))
				
				//enter UN
				driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vidya");
				
				//enter pass
				driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("123");
				
				//click login
				driver.findElement(By.xpath("//button[@name='login']")).click();
				
				//Thread.sleep(2000);
				//driver.close();
				

}
}
