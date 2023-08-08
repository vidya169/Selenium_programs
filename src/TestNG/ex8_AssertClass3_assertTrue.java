package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex8_AssertClass3_assertTrue {
	@Test
	public void assertTrue() {
		boolean  actresult=false;
		Assert.assertTrue(actresult,"failse act result is false");
	}

}
