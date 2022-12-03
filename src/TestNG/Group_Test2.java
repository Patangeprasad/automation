package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group_Test2 {
	
	@Test(groups = "IT")
	public void Test1() {
		Reporter.log("integration",true);
	}
	

}
