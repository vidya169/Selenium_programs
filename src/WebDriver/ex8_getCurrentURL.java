package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex8_getCurrentURL {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.w3schools.com/");
				
				String url = driver.getCurrentUrl();
				System.out.println(url);
				
			//	System.out.println(driver.getCurrentUrl());
				
				Thread.sleep(5000);
				driver.close();
				
	}
}
