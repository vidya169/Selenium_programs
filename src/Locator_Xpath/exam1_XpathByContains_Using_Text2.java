package Locator_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exam1_XpathByContains_Using_Text2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//click on crete new acc link using contains by text
		
		driver.findElement(By.xpath("//a[contains(text(),'Account')]")).click();
		
}
}
