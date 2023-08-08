package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vidya");
		
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@id='email']")).clear();
		
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chavan");
		
		
		
		WebElement vc = driver.findElement(By.xpath("//input[@id='email']"));
		      vc.sendKeys("vidya");
		      
		      Thread.sleep(2000);
		      
		      vc.clear();
		      
		      vc.sendKeys("chavan");
		      
		     
		
		
		

}
}
