package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_MouseHover {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement fashion = driver.findElement(By.xpath("(//a[text()='Fashion'])[2]"));
		
		Actions a=new Actions(driver);
		a.moveToElement(fashion).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Mens sunglasses']")).click();
		driver.close();
		
		
	}

}
