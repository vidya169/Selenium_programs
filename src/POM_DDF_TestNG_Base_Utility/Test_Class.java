package POM_DDF_TestNG_Base_Utility;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Class extends Base_Class {
	LoginPage1 login1;
	LoginPage2 login2;
	home_verify_page home;
	logoutPage logout;
	
	
	
	@BeforeClass
	public void OpenBrowser() throws EncryptedDocumentException, IOException
	{

		initialisingChromeBrowser();
	//	ChromeOptions option=new ChromeOptions();
		//option.addArguments("--disable-notifications");
		
		
		 login1 = new  LoginPage1(driver);
		 login2 = new  LoginPage2(driver);
		 home = new home_verify_page(driver);
		 logout = new logoutPage(driver);
	}
	@BeforeMethod
	public void KiteLogin() throws EncryptedDocumentException, IOException
	{
		login1.set_LoginPage1_id(utility_class.GetData(0, 0));
		login1.set_LoginPage1_pass(utility_class.GetData(0, 1));
		login1.set_LoginPage1_loginn();
		login2.set_LoginPage2_pinn(utility_class.GetData(0, 2));
		login2.set_LoginPage2_confimbtn();
	}
	@Test
	public void VerifyUser() throws EncryptedDocumentException, IOException
	{
		String Actrelt = home.set_home_verify_page_verify_userid();
		String expec = utility_class.GetData(0, 3);
		Assert.assertEquals(Actrelt, expec,"failed: due to result not match");
		
				
	}
	@AfterMethod
	public void KiteLogout()
	{
		logout.clickuser();
		logout.logoutt();
	}
	@AfterClass
	public void CloseBrowser() throws InterruptedException 
	{
		Thread.sleep(2000);
		driver.quit();
	}

}
