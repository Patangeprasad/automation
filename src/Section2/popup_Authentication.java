package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_Authentication {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		Thread.sleep(2500);
		driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();
		
		
//		Syntax
//		https://username:password@URL
//		https://admin:admin@https://the-internet.herokuapp.com/basic_auth
			
		
	}

}
