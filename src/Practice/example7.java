package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example7 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(@class,'_42ft _4jy0 ')])[3]")).click();
}
}
