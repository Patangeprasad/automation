package Section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Scenario_Skillrary2 {
	public static void main(String[] args) throws InterruptedException {
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
		
		WebElement dropdown = driver.findElement(By.name("addresstype"));
		Select s=new Select(dropdown);
		s.selectByValue("category.php?category=testing");
		
		WebElement b1 = driver.findElement(By.xpath("(//a[text()='Selenium Training'])[2]"));
		WebElement b2 = driver.findElement(By.id("mycart"));
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.dragAndDrop(b1, b2).perform();
		
		WebElement scroll= driver.findElement(By.xpath("(//i[@class='fa fa-facebook'])[2]"));
		Point loc = scroll.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
		scroll.click();
		
		driver.quit();
		
		
	}

}
