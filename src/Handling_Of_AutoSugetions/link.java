package Handling_Of_AutoSugetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class link {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.google.com/");
		
	/*	driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");
		String exp = "redmi note 10";
		List<WebElement> alllinks = driver.findElements(By.xpath("(//a"));//inspect all page
		System.out.println(alllinks.size());
		for(WebElement s1:alllinks)
		{
			System.out.println(s1.getText());
		}
*/
	/*	//driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("redmi");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		String exp = "redmi note 10";
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		System.out.println(alllinks.size());
		for(WebElement s1:alllinks)
		{
			System.out.println(s1.getText());
		} */
		
	
		/*driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		String exp = "Redmi Note 10";
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		System.out.println(alllinks.size());
		
		for(WebElement s1:alllinks)
		{
			System.out.println(s1.getText());
		}
		Thread.sleep(2000);
		driver.close();
		*/
		
		driver.findElement(By.xpath("//textarea[@type='search']")).sendKeys("redmi");
		//String exp="redmi note 9";
		List<WebElement> s1 = driver.findElements(By.xpath("//a"));
		System.out.println(s1.size());
		
		for(WebElement s2:s1)
			
		{
			System.out.println(s2.getText());
		}
}
}
