package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	
	@Test(priority = 0)
	public void setting()
	{
		Reporter.log("Setting",true);
	}
	
	@Test(priority = 1)
	public void chat()
	{
		Reporter.log("chat",true);
	}
	
	@Test(priority = -1)
	public void call()
	{
		Reporter.log("call",true);
	}

}
