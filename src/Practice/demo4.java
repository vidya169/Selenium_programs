package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.com/");
			
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("kurtis");
			Thread.sleep(2000);
			String exptext = "kurtis for women";
			List<WebElement> allopt = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
			
			
			for(WebElement s1:allopt)
			{
				String acttext=s1.getText();
				if(acttext.equalsIgnoreCase(exptext))
				{
					s1.click();
					break;
				}
			}
		}
}
