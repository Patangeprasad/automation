package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Skillrary_TC3 {
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(enabled = false)
	public void login() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("core java for selenium");
		driver.findElement(By.xpath("//input[@value='go']")).click();
		driver.findElement(By.xpath("//img[@title='Core Java for Selenium']")).click();
		driver.findElement(By.xpath("//a[text()='X']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='play-icon']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='pause-icon']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//span[text()='Add To Wishlist']")).click();
		
		}
	
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}

}
