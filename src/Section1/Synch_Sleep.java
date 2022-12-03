package Section1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Synch_Sleep {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("prasad");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("7411051221");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[4]")).click();
		
		driver.close();
	}

}
