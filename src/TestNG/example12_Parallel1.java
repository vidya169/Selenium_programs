package TestNG;


	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

	public class example12_Parallel1
	{
		@Test
		public void openKiteApp() throws InterruptedException
		{
			//System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
			
			//WebDriver driver=new ChromeDriver();
		
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("https://kite.zerodha.com/");
		
			Thread.sleep(5000);
			
			driver.close();
			
		}

}
