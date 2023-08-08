package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_TagName2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/DW-0820/Desktop/htmlfiles/id.html");
		//Thread.sleep(2000);
		
		driver.findElement(By.id("1234")).sendKeys("vidya");
		driver.findElement(By.id("1234")).sendKeys("chvan");
		
		
		

}
}