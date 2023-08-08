package TestNG;

import org.testng.Assert;

public class ex8_AssertClass2_assertNotEquals 
{
	public void assertNotEquals()
	{
		String actresult="hi";
		String expresult="hillo";
		
		Assert.assertNotEquals(actresult, expresult,"failed act & exp result are same");
		
	}
	
	

}
