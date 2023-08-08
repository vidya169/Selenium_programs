package Locator_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;





public class ex3_XpathByAttribute {
	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32 (1)\\chromedriver.exe");
		
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("chavanvidya16@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("vidya@123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		Thread.sleep(2000);
		driver.close();
		

}
}
