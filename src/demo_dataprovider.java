import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class demo_dataprovider {
	@Test(dataProvider ="logindata" )
	public void loginTest(int no,String fname,String lname)
	{
		System.out.println(no+" "+fname+" "+lname);
	}
	@DataProvider(name="logindata")
	public Object[][] getData()
	{
		Object [][] data= {{121,"vidya","chavan"},{234,"rajat","date"},{275,"snehal","mane"}};
		return data;
	}

}
