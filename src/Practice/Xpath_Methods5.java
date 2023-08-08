
package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Methods5 {
	
		public static void main(String[] args) throws InterruptedException {
			
			

			System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			

			driver.get("https://www.facebook.com/");
			
					driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
					
					Thread.sleep(2000);		
					
					
					WebElement result = driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
					result.click();
					
					boolean s1 = result.isSelected();
					
					
					if(s1==true)
					{
						System.out.println("redio button selected");
					}
					else
					{
						System.out.println("redio button is not selected");
					}
	}

}
