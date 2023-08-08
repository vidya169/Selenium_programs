package Practice_Imp_code;

import org.testng.annotations.Test;

public class dataprovider_anotherclass2 {
	@Test(dataProvider="logindata",dataProviderClass =dataprovider_anotherclass1.class )
	public void login(String name, String eid)
	{
		System.out.println(name+" "+eid);
	}

}
