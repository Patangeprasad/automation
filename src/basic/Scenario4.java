//open FB enter credentials and login and get forget pasword text
package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario4 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("8147571685");
		driver.findElement(By.id("pass")).sendKeys("Prasad@7411");
		driver.findElement(By.cssSelector("[type=submit]")).click();
		String s=driver.findElement(By.className("_9ay7")).getText();// to get forget passward text
		System.out.println(s);
		driver.close();
	}

}
