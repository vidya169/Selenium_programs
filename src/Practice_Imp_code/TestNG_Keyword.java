package Practice_Imp_code;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Keyword {
	
	@Test(priority = 5)
	public void TC1()
	{
		Reporter.log("running Tc",true);
	}
    @Test(priority=4)
	public void TC2()
    {
	Reporter.log("running tc", true);
    }
    @Test(enabled=true)
   	public void TC3()
       {
   	Reporter.log("running tc", true);
       }
    @Test(timeOut = 1000)
   	public void TC4()
       {
   	Reporter.log("running tc", true);
       }
    @Test(invocationCount=5)
   	public void TC5()
       {
   	Reporter.log("vidya", true);
       }
    @Test(dependsOnMethods= "TC7")
   	public void TC6()
       {
   	Reporter.log("running tc", true);
       }
    @Test(groups="login")
   	public void TC7()
       {
   	Reporter.log("running tc", true);
       }



}
