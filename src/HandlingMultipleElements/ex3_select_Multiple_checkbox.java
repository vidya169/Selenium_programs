package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_select_Multiple_checkbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Users/DW-0820/Desktop/htmlfiles/checkbox.html");
		//select multiple check box
		List<WebElement> Allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement s1:Allcheckbox )
		{
			s1.click();
			Thread.sleep(2000);
		}
		//deselected multiple checkbox
		
		for(int i=Allcheckbox.size()-1;i>=0;i--)
		{
			Allcheckbox.get(i).click();
			Thread.sleep(1000);
		}
}
	
	
}
