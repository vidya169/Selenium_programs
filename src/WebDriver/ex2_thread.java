package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_thread {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.facebook.com/");
		
				//driver.close();
				
				//driver.quit();
				
				Thread.sleep(7000);

}
}
