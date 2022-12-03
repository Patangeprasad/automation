package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario19 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.name("pwd")).sendKeys("patange");
		Thread.sleep(2500);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2500);
		driver.findElement(By.id("username")).sendKeys("parasd");
	
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2500);

	}

}
