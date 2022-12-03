package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown5_DOB {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
	
		WebElement day = driver.findElement(By.id("day"));
		WebElement mon = driver.findElement(By.id("month"));
		WebElement yr = driver.findElement(By.id("year"));
		
		Select s=new Select(day);
		s.selectByIndex(1);
		Thread.sleep(2500);
		Select s1=new Select(mon);
		s1.selectByIndex(0);
		Thread.sleep(2500);
		Select s2=new Select(yr);
		s2.selectByVisibleText("2000");
		Thread.sleep(2500);
		
		driver.close();
	}

}
