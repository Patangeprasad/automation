package TestNG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Skillrary_TC2 {
	public WebDriver driver;
	
	@BeforeMethod
	public void openApp() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();
		Set<String> child = driver.getWindowHandles();
		for (String b : child) {
			driver.switchTo().window(b);
		}
		WebElement dropdown = driver.findElement(By.name("addresstype"));
		Select s=new Select(dropdown);
		s.selectByValue("category.php?category=testing");
		WebElement a1 = driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]"));
		WebElement a2 = driver.findElement(By.id("cartArea"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.dragAndDrop(a1, a2).perform();
		WebElement scroll = driver.findElement(By.xpath("(//i[@class='fa fa-facebook'])[2]"));
		Point loc = scroll.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		scroll.click();	
	}
	
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}

}
