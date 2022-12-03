package Section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchbox = driver.findElement(By.name("q"));
		if (searchbox.isDisplayed()) {
			System.out.println("pass:element is displayed");
			searchbox.sendKeys("selenium");
			Thread.sleep(2500);
		} 
		else {
			System.out.println("fail:element is not displayed");
		}
		
		driver.close();
	}

}
