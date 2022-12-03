package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test5 {
	
	@Test(timeOut = 500)
	public void tc5() throws InterruptedException {
		Thread.sleep(600);
		Reporter.log("hello",true);
		
	}

}
