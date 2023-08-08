package Practice_Imp_code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class parallal_parametrisation {
	
	@Parameters("BrowserName")
	@Test
	
	public void TC(String BrowserName)
	{
	WebDriver driver=null;
	if(BrowserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","path");
		driver= new ChromeDriver();
	}
	else if(BrowserName.equals("edge"))
	{
		System.setProperty("webdriver.chrome.driver","");
		driver=new EdgeDriver();
	}
	}

}
