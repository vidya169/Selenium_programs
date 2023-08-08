package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ex8_AssertClass1_assertEquals {
/*	@Test
	public void assertEquals()
	{
		String actresult="Hi";
		String expresult="Hi";
		
		Assert.assertEquals(actresult, expresult,"Failed:both results are diff: ");
	}
*/
	
	
	@Test
	public void sample()
	{
		SoftAssert soft=new SoftAssert();
		
	String act="hi";
	String exp="Hi";
	soft.assertEquals(act, exp,"failed:both results are diff:  ");
	soft.assertAll();
	
	}
	
	
	
	
	
	
}
