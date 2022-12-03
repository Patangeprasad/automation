//open the browser enter the url of tripodeal.com and click on hotel
//search the city and click on book room
package basic;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario8 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tripodeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.linkText("HOTEL")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.name("destination")).sendKeys("bengaluru");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		Set<String> child = driver.getWindowHandles();
		for (String a : child) {
			driver.switchTo().window(a);
		}
		driver.findElement(By.xpath("//div[text()='Book now']")).click();
		
		
				
	}

}
