package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group_Test5 {
	
	@Test(groups = "FT")
	public void Test1() {
		Reporter.log("functional",true);
	}
	

}
