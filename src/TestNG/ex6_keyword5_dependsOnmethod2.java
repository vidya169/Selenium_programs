package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex6_keyword5_dependsOnmethod2 {
	@Test
	public void login()
	{
		Reporter.log("rumnning login tc",true);
	}
	@Test
	public void login2()
	{
		Reporter.log("rumnning login tc",true);
	}
	@Test(dependsOnMethods = {"login","login2"})
	public void logout()
	{
		Reporter.log("rumnning login tc",true);
	}

}
