package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class e6_Keyword4_Timeout {
	@Test(timeOut = 5)
	public void TC1()
	{
		Reporter.log("running tc1",true);
	}

}
