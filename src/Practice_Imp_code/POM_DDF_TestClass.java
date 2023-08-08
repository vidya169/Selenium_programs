package Practice_Imp_code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POM_DDF_TestClass {
	POM_DDF_Login1 LOGIN;
	POM_DDF_Home_verify VERIFY;
	POM_DDF_Logout LOGOUT;
	
	WebDriver driver;
	Sheet sh;
	
	@BeforeClass
	public void open_broser() throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\12 March A.xlsx");
        sh=WorkbookFactory.create(file).getSheet("Sheet4");
        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DW-0820\\eclipse-workspace\\12Th MarchA Selenium soft\\chromedriver_win32(1)\\chromedriver.exe");

        ChromeOptions option= new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        
        driver=new ChromeDriver(option);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        LOGIN=new POM_DDF_Login1(driver);
        VERIFY= new POM_DDF_Home_verify(driver);
        LOGOUT= new POM_DDF_Logout(driver);
              
	}
	
	@BeforeMethod
	public void login_facebook ()
	{
	LOGIN.UserName(sh.getRow(0).getCell(1).getStringCellValue());
	LOGIN.Password(sh.getRow(0).getCell(2).getStringCellValue());
	LOGIN.loginpage();
	VERIFY.verifytext();
	LOGOUT.click_user();
	LOGOUT.log_out();
	}

	@Test
	public void verify_text()
	{
		String Act=VERIFY.verifytext();
		String exp=sh.getRow(0).getCell(4).getStringCellValue();
		Assert.assertEquals(Act, exp, "failed");
		
	}
	
	@AfterMethod
	public void Logout_facebook()
	{
		
		LOGOUT.click_user();
		LOGOUT.log_out();
	}
	
	
	@AfterClass
	public void CLose_broser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.close();
	}
	

	
}
