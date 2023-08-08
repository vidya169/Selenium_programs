package Framework;





	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class example2_with_DDF
	{
		public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
		{
			FileInputStream file=new FileInputStream("C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\12 March A.xlsx");
			Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			
			driver.get("https://kite.zerodha.com/");
			
			
			//Enter UN
			String UN = sh.getRow(0).getCell(0).getStringCellValue();
			driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(UN);
			
			//Enter pwd
			String PWD = sh.getRow(0).getCell(1).getStringCellValue();
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(PWD);
					
			//click on login btn
			driver.findElement(By.xpath("//button[text()='Login ']")).click();
			
			
			//enter pin
			String PIN = sh.getRow(0).getCell(2).getStringCellValue();
			driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);
			
			//click on continue btn
			driver.findElement(By.xpath("//button[text()='Continue ']")).click();
			
			
			String actUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
			String expUserID = sh.getRow(0).getCell(3).getStringCellValue();
			
			if (actUserID.equals(expUserID))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
			
			
			Thread.sleep(3000);
			
			driver.close();
			}
			}
			











