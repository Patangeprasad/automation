package basic;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario22 {
	
	public static WebDriver driver;
	public static void switchingwindow( Set<String> allid) {
		
		for (String id : allid) {
			driver.switchTo().window(id);
		}
	}
	
	public static void switchingbackwindow(String id) {
		driver.switchTo().window(id);
	}
	
	public static void backword() {
		for(int i=1;i<=2;i++) {
			driver.navigate().back(); }
	}
	
	public static void scroll(WebDriver driver,int x,int y) {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy("+x+","+y+")");
			
	}
	
	
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsumg phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		driver.findElement(By.xpath("(//span[contains(text(),'SAMSUNG')])[2]")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		backword();
		
		driver.findElement(By.xpath("(//span[contains(text(),'SAMSUNG')])[3]")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
		backword();
		
		WebElement thrd = driver.findElement(By.xpath("(//span[contains(text(),'SAMSUNG')])[4]"));
		Point loc = thrd.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		scroll(driver, x, y);
		thrd.click();
		driver.findElement(By.id("add-to-cart-button")).click();
		backword();
		
		driver.findElement(By.xpath("(//span[contains(text(),'SAMSUNG')])[5]")).click();
		driver.findElement(By.id("add-to-cart-button")).click();


		
		
		
		
		
	
		
		
		
		
		
		
	}

}
