package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.id("gh-ac")).sendKeys("watches");
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(2500);
		String s=driver.findElement(By.xpath("//div[@class='srp-controls__row-cells']//div/h1")).getText();
		System.out.println(s);
	}

}
