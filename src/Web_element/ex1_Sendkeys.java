package Web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_Sendkeys {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	        //enter UN
			//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
			
		
			WebElement UN = driver.findElement(By.xpath("//input[@id='email']"));
			UN.sendKeys("abc");
					
		}

}
