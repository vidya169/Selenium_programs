package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ex1_DataProviderMethod_From_Otherclass {
	
	/*
@Test(dataProvider = "logindataprovider",dataProviderClass = ex1_DataProviderMethod_From_Otherclass2.class)	
public void loginTest(String email,String pass)
{
	System.out.println(email+"      "+pass);
}
	*/


@Test(dataProvider = "login",dataProviderClass = ex1_DataProviderMethod_From_Otherclass2.class)
public void logintest(String email,String name)
{
	System.out.println(email+"   "+name);
}







	
}
