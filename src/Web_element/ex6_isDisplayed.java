package Web_element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6_isDisplayed {
	public static void main(String[] args) {
		
	

	System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	

	driver.get("https://www.facebook.com/");
	
	
	boolean v1 = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
	System.out.println(v1);
	
	if(v1==true)
	{
		System.out.println("Element found");
	}
	else 
	{
		System.out.println("Element not found");
	}
	
}

}
