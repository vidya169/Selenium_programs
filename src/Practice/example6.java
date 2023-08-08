package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("(//input[@type='submit'])[4]")).click();
		
		//driver.navigate().back();
		//driver.findElement(By.xpath("(//a[@target='_top'])[1]")).click();

}
}
