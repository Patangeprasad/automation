package TestNG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Skillrary_TC1 {
public WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@Test(priority = 1)
	public void Login() {
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();
		Set<String> child = driver.getWindowHandles();
		for (String b: child) {
			driver.switchTo().window(b);
		}
		Actions a=new Actions(driver);
		WebElement mousehover = driver.findElement(By.id("course"));
		a.moveToElement(mousehover).perform();
		driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
		WebElement doubleclk = driver.findElement(By.id("add"));
		a.doubleClick(doubleclk).perform();
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		driver.switchTo().alert().accept();
		
		
	}
	
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}
	
	


}