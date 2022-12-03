package Section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabled {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement login = driver.findElement(By.id("loginButton"));
		if (login.isEnabled()) {
			System.out.println("pass:element is enabled");
			login.click();
			
		} else {
			System.out.println("fail:element is not enabled");
		}
		
		driver.close();
		
	}

}
