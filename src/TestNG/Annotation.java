package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Annotation {
	
	@BeforeMethod
	public void BeforeMethod() {
		Reporter.log("beforemethod",true);
	}
	
	@AfterMethod
	public void AfterMethod() {
		Reporter.log("aftermethod",true);
	}
	
	@BeforeClass
	public void BeforeClass() {
		Reporter.log("beforeclass",true);
	}
	
	@AfterClass
	public void AfterClass() {
		Reporter.log("afterclass",true);
	}
	
	@BeforeTest
	public void BeforeTest() {
		Reporter.log("beforetest",true);
	}
	
	@Test
	public void m1() {
		Reporter.log("test",true);
	}
	
	@org.testng.annotations.AfterTest
	public void AfterTest() {
		Reporter.log("aftertest",true);
	}
	
	@BeforeSuite
	public void BeforeSuite() {
		Reporter.log("beforesuite",true);
	}
	
	@AfterSuite
	public void AfterSuite() {
		Reporter.log("aftersuite",true);
	}
	

}
