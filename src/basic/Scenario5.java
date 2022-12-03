//open flipkart search nokia phone and get text
package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("nokia");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(2500);
		String s=driver.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText();
		System.out.println(s);
		driver.close();
	}

}
