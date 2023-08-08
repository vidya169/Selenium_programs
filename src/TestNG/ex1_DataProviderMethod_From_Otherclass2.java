package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ex1_DataProviderMethod_From_Otherclass2 {

	/*
	@DataProvider(name="logindataprovider")
	public Object[][] getData()
	{
	Object[][] data= {{"vidya@gmail.com","vidya"},{"sushant@gmail.com","sushaa"},{"rajat@gamil.com","rajat"},{"sneha@gmail.com","sneha"}};//mail id and pass
	return data;
	}
	*/
	
	@DataProvider(name="login")
	public Object[][]  getData()
	{
		
		Object[][] data= {{"fdghs@ghd","vidya"},{"bfgh@hjfng","chavan"}};
		
		
		return data;
		
	}
	

		
	
	
	
	
	
	
	
	
	
	
}
