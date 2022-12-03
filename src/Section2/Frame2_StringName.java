package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2_StringName {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame("iframe-name");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Courses")).click();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();
		driver.close();
		
		
	}

}
