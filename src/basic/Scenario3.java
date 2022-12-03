//open flipkart search one product and back from the search
package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("panties");
		Thread.sleep(2500);
		driver.findElement(By.cssSelector("[type=submit]")).click();
		Thread.sleep(2500);
		driver.navigate().back();
		driver.close();
	}

}
