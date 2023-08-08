package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class class2 {
	@Test(dataProvider="loginpage")
	public void testlogin(String pass,String user) {
		System.out.println(pass+" "+user);
	}
	@DataProvider(name="loginpage")
	public Object[][] getData()
	{
		Object[][] data= {{"asd@","vidya"},{"zxcv","vidya"}};
		return data;
	}

}
