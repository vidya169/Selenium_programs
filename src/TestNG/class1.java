package TestNG;

import org.testng.annotations.DataProvider;

public class class1 {
@DataProvider(name="loginpage")
	public Object[][] getData()
{
	Object[][] data= {{"cvd@jj","vidya"},{"asd@fgh","vidya"}};
	return data;
	
}
}