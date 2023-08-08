package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ex8_SoftAssert1 {
	@Test
	public void TC1()
	{
		SoftAssert soft=new SoftAssert();
		String actresult="hi";
		String expresult="hello";
		
		soft.assertEquals(actresult, expresult,"Failed1: both result are diff: ");
		
		boolean actresult1=false;
		soft.assertTrue(actresult1, "failes2:act result is false");
		
		soft.assertAll();
		
		
	}

}
