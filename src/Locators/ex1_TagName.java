package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_TagName {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/DW-0820/Desktop/htmlfiles/try.html");
		
		Thread.sleep(2000);
		
		//click on link
		//enter FN
		driver.findElement(By.tagName("input")).sendKeys("vidya");
		
		//enter LN
		
		driver.findElement(By.tagName("input")).sendKeys("chvan");
		

}
}