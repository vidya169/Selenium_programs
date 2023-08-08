package Practice_Imp_code;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_SameClass {
	@Test(dataProvider="logindata")
	public void login(String name, String eid)
	{
		System.out.println(name+"    "+eid);
	}
	
	@DataProvider(name="logindata")
	Object[][]  getData()
	{
		Object[][] data= {{"name","bgdh@hdgf"},{"vidya","vidya@123"}};
		return data;
	}

}
