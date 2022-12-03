package Section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario_Skillrary1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();
		
		Set<String> child = driver.getWindowHandles();
		for (String a: child) {
			driver.switchTo().window(a);	
		}
		
		WebElement mousehover = driver.findElement(By.id("course"));
		Actions a=new Actions(driver);
		a.moveToElement(mousehover).perform();
		driver.findElement(By.xpath("//a[text()='Selenium Training']")).click();
		
		WebElement doubleclk = driver.findElement(By.id("add"));
		a.doubleClick(doubleclk).perform();
		
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		driver.switchTo().alert().accept();
		
		driver.quit();
		
		
		
		
		
	}

}
