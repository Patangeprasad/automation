package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario15 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(2500);
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.xpath("(//a[text()='org.openqa.selenium'])[1]")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(2500);
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.xpath("(//span[text()='Alert'])[1]")).click();
		driver.switchTo().defaultContent();
		
		Thread.sleep(2500);
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//a[text()='Help']")).click();
		driver.switchTo().defaultContent();
		
		driver.close();
		
	}

}
