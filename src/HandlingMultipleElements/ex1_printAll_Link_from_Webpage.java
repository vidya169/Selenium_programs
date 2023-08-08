package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_printAll_Link_from_Webpage {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
/*	List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
	System.out.println(allLinks.size());
	
	for(WebElement s1:allLinks)
	{
		System.out.println(s1.getText());
} */
	
	
	List<WebElement> alllinkis = driver.findElements(By.xpath("//a"));
	System.out.println(alllinkis.size());
	
	for(WebElement s1:alllinkis)
	{
		System.out.println(s1.getText());
	}
	
	
	
	
	
}
}
