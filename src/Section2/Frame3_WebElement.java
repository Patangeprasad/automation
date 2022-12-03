package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame3_WebElement {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tripodeal.com/hotels");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.id("tpcwl_iframe"));
		driver.switchTo().frame(ele);
		driver.findElement(By.name("destination")).sendKeys("bengaluru");
		Thread.sleep(3000);
		driver.close();
		
		
	}

}
