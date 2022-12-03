//open browser enter the url of demowebshop click on register
//enter the credentials and click on register
//take the screenshot of application
package basic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario7 {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("prasad");
		driver.findElement(By.id("LastName")).sendKeys("patange");
		driver.findElement(By.id("Email")).sendKeys("prasadpatange1@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("prasad7411");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("prasad7411");
		driver.findElement(By.id("register-button")).click();
		
		Thread.sleep(5000);
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File desc=new File("./photo/regiterss.png");
		FileUtils.copyFile(scr, desc);
		
		driver.quit();
		
		
		
		
		
		
		
	}

}
