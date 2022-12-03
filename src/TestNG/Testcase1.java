package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testcase1 {
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
		String tittle = driver.getTitle();
		Reporter.log(tittle,true);
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
}
