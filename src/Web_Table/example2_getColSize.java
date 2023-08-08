package Web_Table;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_getColSize
{
	public static void main(String[] args)
	{	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");

		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/DW-0820/Desktop/htmlfiles/webelment.html");
		//for header
		int colSize = driver.findElements(By.xpath("//table[@id='1234']//tr[1]/th")).size();
		System.out.println(colSize);
		
		
//		int colSize = driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td")).size();
//		System.out.println(colSize);
		
	}

}