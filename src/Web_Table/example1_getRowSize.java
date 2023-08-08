package Web_Table;


	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class example1_getRowSize
	{
		public static void main(String[] args)
		{		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("file:///C:/Users/DW-0820/Desktop/htmlfiles/webelment.html");
			
//			List<WebElement> allRows = driver.findElements(By.xpath("//table[@id='1234']/tbody/tr"));
//			int rowSize = allRows.size();
//			System.out.println(rowSize);
			
			
			int rowsize = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
			System.out.println(rowsize);
			
			
		//	System.out.println(driver.findElements(By.xpath("//table[@id='1234']//tr")).size());
		}

	}


