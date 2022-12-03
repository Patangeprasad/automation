package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/core-java-for-selenium-training");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.switchTo().frame(0); // switch to frame
		driver.findElement(By.xpath("//div[@class='play-icon']")).click();
		driver.switchTo().defaultContent(); // back from frame
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.close();
		
		
	}

}
