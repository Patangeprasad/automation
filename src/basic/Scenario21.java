package basic;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario21 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.xpath("//img[@alt='Fashion']")).click();
		
		WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
		Actions a=new Actions(driver);
		a.moveToElement(men).perform();
		driver.findElement(By.xpath("(//a[@title='Sweatshirts'])[1]")).click();
		
		WebElement scroll = driver.findElement(By.xpath("(//img[@class='_2r_T1I'])[20]"));
		Point loc = scroll.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		scroll.click();
		
		Set<String> child = driver.getWindowHandles();
		for (String ad : child) {
			driver.switchTo().window(ad);
		}
		
		driver.findElement(By.xpath("//a[text()='M']")).click();
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		
		driver.findElement(By.xpath("//button[text()='Enter Delivery Pincode']")).click();
		driver.findElement(By.xpath("//input[@type='TEXT']")).sendKeys("591115");
		driver.findElement(By.xpath("//div[text()='Submit']")).click();
		
		Thread.sleep(2500);
		driver.findElement(By.xpath("//span[text()='Place Order']")).click();
		
		
		
		
		
	}

}
