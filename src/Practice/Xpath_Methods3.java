package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Methods3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='_2EGQY cqA0P'])[1]")).click();
		Thread.sleep(2000);
		
		//WebElement postpaid = driver.findElement(By.xpath("//label[text()='Postpaid']"));
		WebElement postpaid = driver.findElement(By.xpath("(//input[@name='serviceType'])[1]"));
		postpaid.click();
		
		boolean s1 =postpaid.isSelected();
	
		if(s1==true)
			
		{
			
			System.out.println("postpaid button selected");
		}
		else
		{
			System.out.println("postpaid button not selected");
		
		}
		
		
	}
}
