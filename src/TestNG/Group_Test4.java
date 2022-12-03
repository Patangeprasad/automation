package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group_Test4 {
	
	@Test(groups = "smoke")
	public void Test1() {
		Reporter.log("smoke",true);
	}
	

}
