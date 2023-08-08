package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ex8_AssertClass3_assertFalse {
	@Test
	public void assertTrue() {
		boolean  actresult=true;
		Assert.assertFalse(actresult,"failse act result is true");
	}

}
