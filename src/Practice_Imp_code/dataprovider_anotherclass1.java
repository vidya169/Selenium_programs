package Practice_Imp_code;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider_anotherclass1 {
	
	@DataProvider(name="logindata")
	Object[][] getData()
	{
		Object[][] data= {{"vidya","vidya2asd"},{"chavan","abs@asd"}};
		return data;
	}
	

}
