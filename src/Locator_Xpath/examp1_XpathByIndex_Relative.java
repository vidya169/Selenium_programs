package Locator_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class examp1_XpathByIndex_Relative{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//click on create new acc link
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("vidya");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("chavan");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("1111111111111111");
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("vidya123");

}
}
