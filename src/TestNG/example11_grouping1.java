package TestNG;


	import org.testng.Reporter;
	import org.testng.annotations.Test;

	public class example11_grouping1
	{
		@Test(groups= "Profile")
		public void TC1()
		{
			Reporter.log("running TC1",true);
		}
		
		@Test(groups="Profile")
		public void TC2()
		{
			Reporter.log("running TC2",true);
		}
		
		@Test(groups="Wishlist")
		public void TC3()
		{
			Reporter.log("running TC3",true);
		}
		
		@Test(groups="Orders")
		public void TC4()
		{
			Reporter.log("running TC4",true);
		}

	}


