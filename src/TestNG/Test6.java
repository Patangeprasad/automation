package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test6 {
	
	@Test(invocationCount = 2, invocationTimeOut = 4000)
	public void tc6() {
		Reporter.log("login",true);
	}

}
