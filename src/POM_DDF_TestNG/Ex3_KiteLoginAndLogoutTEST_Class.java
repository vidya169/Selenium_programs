package POM_DDF_TestNG;

 import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ex3_KiteLoginAndLogoutTEST_Class 
{
	
	Ex3_POM_DDF_TestNGLoginPage1 LoginPage1;
	Ex3_POM_DDF_TestNG_LoginPage2 LoginPage2;
	Ex3_POM_DDF_TestNG_HomePage HomePage;
	Ex3_POM_DDF_TestNG_LogoutPage LogOut;
	WebDriver driver;
	Sheet sh;
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\12 March A.xlsx");
        sh = WorkbookFactory.create(file).getSheet("DDF");
		
        ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
		driver = new ChromeDriver(opt);
		
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LoginPage1 = new  Ex3_POM_DDF_TestNGLoginPage1(driver);
		LoginPage2 = new Ex3_POM_DDF_TestNG_LoginPage2(driver);
		HomePage = new Ex3_POM_DDF_TestNG_HomePage(driver);
		LogOut = new Ex3_POM_DDF_TestNG_LogoutPage(driver);
	}
	@BeforeMethod
	public void KiteLogin()
	{
		LoginPage1.Set_KiteLoginUserId(sh.getRow(0).getCell(0).getStringCellValue());
		LoginPage1.Set_KiteLoginPassword(sh.getRow(0).getCell(1).getStringCellValue());
        LoginPage1.Set_KiteLoginClickOnLogin();
        LoginPage2.Set_KiteLogin_Pin(sh.getRow(0).getCell(2).getStringCellValue());
		LoginPage2.Set_KiteLogin_ClickON_CTN();
	}
	@Test
	public void VerifyUserID()
	{
		String ActUID = HomePage.Set_Kite_verifyUserID();
		String ExpUID = sh.getRow(0).getCell(3).getStringCellValue();
		Assert.assertEquals(ActUID, ExpUID,"Failed: Act And Exp Result Are not Equal");
		
	}
	@AfterMethod
	public void KiteLogout()
	{
		LogOut.Set_KiteLogout_ClickOnUser();
		LogOut.Set_KiteLogout_clickonLogOut();
	}
 @AfterClass
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
	
	




}
