package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll4_Console {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='X']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollTo(0,5000)");
//		js.executeScript("window.scrollBy(0,5000)");
//		Thread.sleep(5000);
//		js.executeScript("window.scrollBy(0,-5000)");
		
		js.executeScript("window.scrollBy(400,400)");
		driver.findElement(By.xpath("(//div[@class='detail_block'])[6]")).click();
		
		
		
		
	}

}
