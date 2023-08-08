import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demo2_dataprovider {
	@Test(dataProvider ="logininfo", dataProviderClass = demo3.class )
	public void loginTest(int no,String fname,String lname)
	{
		System.out.println(no+" "+fname+" "+lname);
	}
	@Test(dataProvider ="logindata", dataProviderClass = demo_dataprovider.class )
	public void loginTest2(int no,String fname,String lname)
	{
		System.out.println(no+" "+fname+" "+lname);
	}

}
