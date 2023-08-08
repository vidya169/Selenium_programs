package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ex5_Annotations {
	/*
	
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("--open browser--",true);
	}
	@BeforeMethod
	public void loginToApp()
	{
		Reporter.log("--Login to App--",true);
	}
	@Test
	public void verifyUserID2()
	{
		Reporter.log("running verify user ID TC@",true);
	}
    @Test
	public void verifyUserID1()
	{
		Reporter.log("running verify user ID TC@",true);
	}
    @AfterMethod
    public void logoutFromApp()
    {
    	Reporter.log("--logout from app--",true);
    }
    @AfterClass
    public void closeBrowser()
    {
    	Reporter.log("--close browser--",true);
    }
    */
	
	
	
	@BeforeClass
	public void openbrowser()
	{
		Reporter.log("open browser",true);
	}
	@BeforeMethod
	public void loginbrowser()
	{
		Reporter.log("login browser",true);
	}
	@Test
	public void verify()
	{
		Reporter.log("verify user id",true);
	}
	@AfterMethod()
	public void logout()
	{
		Reporter.log("logout browser",true);
	}
	@BeforeClass
	public void closebrowser()
	{
	Reporter.log("close browser",true);	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
