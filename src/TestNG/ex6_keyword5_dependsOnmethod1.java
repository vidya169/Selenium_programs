package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex6_keyword5_dependsOnmethod1 {
	@Test
	public void login()
	{
		Reporter.log("rumnning login tc",true);
	}
	@Test(dependsOnMethods = "login")
	public void logout()
	{
		Reporter.log("rumnning login tc",true);
	}

}
