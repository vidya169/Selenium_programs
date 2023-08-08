package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ex1_DataProviderMethod_sameclass {

/*
@Test(dataProvider = "logindataprovider")	
public void loginTest(String email,String pass)
{
	System.out.println(email+"      "+pass);
}
	
	@DataProvider(name="logindataprovider")
	public Object[][] getData()
	{
	Object[][] data= {{"vidya@gmail.com","vidya"},{"sushant@gmail.com","sushaa"},{"rajat@gamil.com","rajat"},{"sneha@gmail.com","sneha"}};//mail id and pass
	return data;
	}  */
	
	
	
	@Test(dataProvider="login")
	public void testlogin(String email, String name)
	{
	System.out.println(email+"    "+name);	
	}
	
	@DataProvider(name="login")
	public Object[][] getData() {
		Object[][] data= {{"bfhhdjsj@hj","vidya"},{"gdhfj@gdh","pihu"}};
		
		return data;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
