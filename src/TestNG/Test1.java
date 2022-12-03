package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

import graphql.schema.diff.reporting.CapturingReporter;

public class Test1 {
	@Test
	public void tc()
	{
		Reporter.log("hello prasad",true);
		Reporter.log("hello patange",false);
		
	}

}
