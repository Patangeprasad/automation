package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Parallel {
	public WebDriver driver;
	
	@Parameters({"browsername"})
	@Test
	public void demo(String browser) {
		if(browser.equals("chrome")) {
			driver=new ChromeDriver(); // to open chrome browser
		}
		else
		{
			driver=new EdgeDriver(); // to open microsoft browser
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys("8147571685");
		driver.findElement(By.id("pass")).sendKeys("Prasad@7411");
		driver.findElement(By.name("login")).click();
		String url = driver.getCurrentUrl();
		Reporter.log(url,true);
		String tittle = driver.getTitle();
		Reporter.log(tittle,true);
		driver.close();
	
	}

}
