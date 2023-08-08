package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class practice_test {
	Ex3_POM_DDF_TestNGLoginPage1 login1;
	Ex3_POM_DDF_TestNG_LoginPage2 login2;
	 Ex3_POM_DDF_TestNG_HomePage home;
	 Ex3_POM_DDF_TestNG_LogoutPage logout;
	 Sheet sh;
	WebDriver driver;
	
	
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\12 March A.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");
        driver=new ChromeDriver(opt);
        
       login1=new Ex3_POM_DDF_TestNGLoginPage1(driver);
       login2=new Ex3_POM_DDF_TestNG_LoginPage2(driver);
        home=new Ex3_POM_DDF_TestNG_HomePage(driver);
       logout=new Ex3_POM_DDF_TestNG_LogoutPage(driver);

		
	}
	@BeforeMethod
	public void loginkite()
	{
		login1.Set_KiteLoginUserId(sh.getRow(0).getCell(0).getStringCellValue());
		login1.Set_KiteLoginPassword(sh.getRow(0).getCell(1).getStringCellValue());
		login1.Set_KiteLoginClickOnLogin();
		login2.Set_KiteLogin_Pin(sh.getRow(0).getCell(2).getStringCellValue());
		login2.Set_KiteLogin_ClickON_CTN();
		
	}
	@Test
	public void verify()
	{
		
	}
	@AfterMethod
	public void logoutkite()
	{
		
	}
	@AfterClass
	public void closebrowser()
	{
		
	}
	
		
	

}
