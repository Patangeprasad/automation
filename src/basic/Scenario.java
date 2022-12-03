//open the browser enter the actitime url click on forget your password and 
//click on return login page and click on keeplogging checkbox and click on actitime inc
//
package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Return to login page")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		driver.close();

	}

}
