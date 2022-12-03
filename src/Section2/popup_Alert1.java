package Section2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_Alert1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert a = driver.switchTo().alert();
		
		String txt = a.getText();
		System.out.println(txt);
		
		a.sendKeys("welcome");
		Thread.sleep(2500);
		
		a.accept();
		Thread.sleep(2500);
		
	
		driver.close();
		
		
		
	}
}
