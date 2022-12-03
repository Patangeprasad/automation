package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario9 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://crmaccess.vtiger.com/log-in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement us = driver.findElement(By.name("username"));
		us.sendKeys("prasad");
		Thread.sleep(2500);
		us.clear();
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("7411060");
		Thread.sleep(2500);
		pwd.clear();
		
		driver.findElement(By.linkText("Sign in")).submit();
		
		
		
		
	}

}
