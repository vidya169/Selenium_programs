package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex8_AssertClass5_asserNull {
	@Test
	public void assertNull()
	{
	String actResult="abc";
	Assert.assertNull(actResult, "act result is not null");
	
	}
}
