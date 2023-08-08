package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex8_AssertClass6_asserNotNull {
	@Test
	public void assertNull()
	{
	String actResult=null;
	Assert.assertNotNull(actResult, "act result is  null");
	
	}
}
