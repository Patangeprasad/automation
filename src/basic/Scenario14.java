package basic;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Scenario14 {
	@Test
	public void FB() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("8147571685");
		driver.findElement(By.id("pass")).sendKeys("Prasad@7411");
		driver.findElement(By.cssSelector("[type=submit]")).click();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		//assertEquals(url,"https://www.facebook.com/");
		SoftAssert s=new SoftAssert();
		s.assertEquals(url,"https://www.facebook./");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
		
	}

}
