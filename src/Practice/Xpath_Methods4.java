package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Methods4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DW-0820/Desktop/htmlfiles/sample1.html");
		
		WebElement first = driver.findElement(By.xpath("(//input[@id='html'])[2]"));
		boolean a = first.isSelected();
		System.out.println(a);
		first.click();
		boolean b = first.isSelected();
		System.out.println(b);
		
		
		
		
		
		
		
	}
}
