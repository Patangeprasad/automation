package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scenario10 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	
		driver.findElement(By.name("username")).sendKeys("prasad");
		
		driver.findElement(By.name("password")).sendKeys("7411051221");
		
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		
		String t = driver.getTitle();
		System.out.println(t);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (t.equals("instagram")) {
			System.out.println("pass:home page is displayed");
			
		} else {
			System.out.println("fail:home page is not displayed");

		}
		
		driver.close();
	}

}
