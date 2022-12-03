package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario_Skillrary3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("core java for selenium");
		driver.findElement(By.xpath("//input[@value='go']")).click();
		driver.findElement(By.xpath("//a[text()=' Core Java For Selenium Trainin']")).click();
		
		driver.findElement(By.xpath("//a[text()='X']")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='play-icon']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='pause-icon']")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span[text()='Add To Wishlist']")).click();
		
		driver.close();
		
		
	}

}
