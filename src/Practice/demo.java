package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver s1=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		
		s1.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		s1.switchTo().frame("iframeResult");
		
		s1.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
		
		Thread.sleep(2000);
		s1.switchTo().parentFrame();
		s1.findElement(By.xpath("//a[@id='tryhome']")).click();
		s1.manage().deleteAllCookies();
	}
	

}
