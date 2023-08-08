package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ex6_Keyword3_Priority2 {
	@Test(priority = 1)
	public void TC3() 
	{
	Reporter.log("running TC3",true);	
	}
	@Test(priority = 1)    //duplicate priority
	public void TC2() 
	{
	Reporter.log("running TC2",true);	
	}
	@Test                    //by defult priority 
	public void TC1() 
	{
	Reporter.log("running TC1",true);	
	}
	@Test(priority = -2)         //priority can be negative value
	public void TC4() 
	{
	Reporter.log("running TC4",true);	
	}

}
