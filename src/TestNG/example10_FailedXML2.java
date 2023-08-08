package TestNG;


	import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.Test;

	public class example10_FailedXML2
	{
		@Test
		public void TC4()
		{
			Reporter.log("running TC4",true);
		}
		
		@Test
		public void TC5()
		{
			Reporter.log("running TC5",true);
		}
		
		@Test
		public void TC6()
		{
			String actResult="hi";
			String expResult="hello";
			Assert.assertEquals(actResult, expResult,"fAILED: both results are diff:  ");
			
			Reporter.log("running TC6", true);
		}

}
