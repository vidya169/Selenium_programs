package POM_DDF_TestNG_BaseClass_Utilityclass_PropertyFile_FailedTCScreenshot;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//super class

public class BaseClass 
{
	WebDriver driver;
	public void initializeBrowser() throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\Browsers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    
	   // System.setProperty("webdriver.gecko.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\geckodriver-v0.31.0-win32\\geckodriver.exe");
	//	driver=new FirefoxDriver();
		
	    driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get(UtilityClass.getPFData("URL"));		
	}

}

