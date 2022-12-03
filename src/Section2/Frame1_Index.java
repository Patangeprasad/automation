package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame1_Index {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement sing = driver.findElement(By.xpath("//span[text()='Sign In']"));
		Actions a=new Actions(driver);
		a.moveToElement(sing).perform();
		
		driver.findElement(By.xpath("//a[text()='login']")).click();
		
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("userName")).sendKeys("8147571685");
		driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-delete-sign fnt-22']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.name("keyword")).sendKeys("phones");
		
	
	}

}
