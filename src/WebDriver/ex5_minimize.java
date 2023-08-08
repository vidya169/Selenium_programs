package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex5_minimize {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.w3schools.com/");
				Thread.sleep(3000);
				
				driver.manage().window().minimize();
				
				//Options s1 = driver.manage();
				//Window s2 = s1.window();
				//s2.minimize();
	}
}
