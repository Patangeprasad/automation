package Section2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_Childbrowser1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='X']")).click();
		
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
		
		Set<String> child = driver.getWindowHandles();
		for (String a: child) {
			driver.switchTo().window(a);	
		}
		
		Thread.sleep(2500);
		driver.findElement(By.id("mytext")).sendKeys("prasad");
		driver.close();
		

	}

}
