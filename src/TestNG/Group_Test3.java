package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group_Test3 {
	
	@Test(groups = "ST")
	public void Test1() {
		Reporter.log("system",true);
	}
	

}
