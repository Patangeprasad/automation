package TestNG;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion {
public WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void Login() {
		driver.findElement(By.id("email")).sendKeys("8147571685");
		driver.findElement(By.id("pass")).sendKeys("Prasad@7411");
		driver.findElement(By.name("login")).click();
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		//hard assert
		//Assert.assertEquals(url,"https://www.facebook.com/");
		
		//soft assert
		SoftAssert s=new SoftAssert();
		s.assertEquals(url,"https://www.facebook.com/");
		
		
		String tittle = driver.getTitle();
		Reporter.log(tittle,true);
		
		
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
}


