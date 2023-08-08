package TestNG;

	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	public class example12_Parallel2
	{
		@Test
		public void openFacebookApp() throws InterruptedException
		{
			System.setProperty("webdriver.chrome", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.get("https://www.facebook.com/");
		
			Thread.sleep(5000);
			
			driver.close();
			
		}

}
