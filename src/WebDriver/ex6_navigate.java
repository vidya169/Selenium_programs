package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6_navigate {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				
				driver.navigate().to("https://www.w3schools.com/");
				Thread.sleep(2000);
				
				driver.navigate().to("https://www.google.com/");
				Thread.sleep(2000);
				
				driver.navigate().back();
				Thread.sleep(2000);
				
				driver.navigate().forward();
				Thread.sleep(2000);
				
				driver.navigate().refresh();
				driver.close();
				Thread.sleep(2000);
	}
}
