package TestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class example9_DisableTCExecution2_From_sample1
{
 
	@Test
	public void TC1()
	{
		Reporter.log("running TC1",true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("running TC2",true);
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("running TC3",true);
	}

}
