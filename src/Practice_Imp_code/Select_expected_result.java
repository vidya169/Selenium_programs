package Practice_Imp_code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Select_expected_result {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(options);
	
	driver.get("https://www.google.com/");
	
	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("redmi");
	Thread.sleep(2000);
	String exp="redmi Note 10";
	
	List<WebElement> all = driver.findElements(By.xpath("(//div[@class='OBMEnb'])[1]"));
	
	for(WebElement s1:all)
	{
		String act=s1.getText();
		if(exp.equals(act))
		{
			s1.click();
			break;
		}
		
	}
	

}
}
