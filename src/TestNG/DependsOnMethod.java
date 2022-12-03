package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test(dependsOnMethods = "Login")
	public void HomePage() {
		Reporter.log("im from home",true);
	}
	
	@Test()
	public void Login() {
		Reporter.log("im from login",true);
	}
	
	@Test(dependsOnMethods = "HomePage")
	public void ClosePage() {
		Reporter.log("im from close",true);
	}
	

}
