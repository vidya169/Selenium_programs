package Web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class all_web_element {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("//input[@name='email']"));
    Thread.sleep(2000);
	
    //driver.manage().timeouts().getImplicitWaitTimeout();
	
    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	Thread.sleep(2000);
	
	WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
	name.sendKeys("vidya");
//	Thread.sleep(2000);
	//name.clear();
	
	//Thread.sleep(1000);
	
	//driver.findElement(By.xpath(""))
	
	
	
}
}
