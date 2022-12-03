package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario18 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement mousehover = driver.findElement(By.id("course"));
		Actions a=new Actions(driver);
		//mouse hover
		Thread.sleep(2000);
		a.moveToElement(mousehover).perform();
		driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
		//double click
		WebElement doubleclk = driver.findElement(By.id("add"));
		Thread.sleep(2000);
		a.doubleClick(doubleclk).perform();
		driver.close();
	}

}
