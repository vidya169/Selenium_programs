package POM_Practice;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testclass {
	Login LoginPage1;
	Home_AddtoCard AddtoCard;
	Verify_Card vefyCard;
	Logout Close;
	
	WebDriver driver;
	org.apache.poi.ss.usermodel.Sheet sh1;
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file = new FileInputStream("C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\TestData\\12 March A.xlsx");
	    sh1 = WorkbookFactory.create(file).getSheet("DDF1");
	    
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
	    ChromeOptions option=new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	   // ChromeOptions options=new ChromeOptions();
	//	options.addArguments("--remote-allow-origins=*");
			
	    
	    driver=new ChromeDriver(option);
	    
	    driver.get("https://www.saucedemo.com/v1/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    LoginPage1=new Login(driver);
	    AddtoCard = new Home_AddtoCard(driver);
	    vefyCard = new Verify_Card(driver);
	    Close = new Logout(driver);
	    
	}
	@BeforeMethod
	public void loginbrowser()
	{
	LoginPage1.set_userid(sh1.getRow(1).getCell(0).getStringCellValue());
	LoginPage1.set_pass(sh1.getRow(0).getCell(1).getStringCellValue());
	LoginPage1.Click_Login();
	

	AddtoCard.Click_Add_to_card();
	//Close.Clickoimg();
	//Close.clickoback();
	}
	@Test
	public void verifytext1()
	{
	String Actresult = vefyCard.Verify_Add_to_Card();
	String Experesult= sh1.createRow(1).getCell(2).getStringCellValue();
	}
	
	@AfterMethod
	public void LogoutBrowser()
	{
		Close.Clickoimg();
		Close.clickoback();
		
		
		
	}
	@AfterClass
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
		    
	    
	}
	

}
