package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Methods2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("vidya");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		//driver.findElement(By.xpath("//span[contains(@class,'_7UhW9   xLCgt ')]")).click();
		//Thread.sleep(2000);
		
	/*	WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		text.sendKeys("vidya");
		Thread.sleep(2000);
		text.clear();*/
	}
}