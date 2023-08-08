package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex3_EmailLableReport {
	@Test
	public void TC1()   //test case or test metho
	{
		Reporter.log("running TC1",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("running TC2",false);
	}	
	@Test
	public void TC3()
	{
		Reporter.log("running TC3",true);
	}

}
