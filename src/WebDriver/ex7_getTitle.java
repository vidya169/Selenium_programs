package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex7_getTitle {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
				
				WebDriver driver=new ChromeDriver();
				
				driver.get("https://www.w3schools.com/");
				
				String title = driver.getTitle();
				System.out.println(title);
				
			//	System.out.println(driver.getTitle());
				
				driver.close();
				Thread.sleep(3000);
				
				

}
}