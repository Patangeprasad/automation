package section3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadrivern1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		Properties p=new Properties();
		FileInputStream fil=new FileInputStream("./register.properties");
		p.load(fil);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(p.getProperty("firstname"));
		driver.findElement(By.id("LastName")).sendKeys(p.getProperty("lastname"));
		driver.findElement(By.id("Email")).sendKeys(p.getProperty("email"));
		driver.findElement(By.id("Password")).sendKeys(p.getProperty("passward"));
		driver.findElement(By.id("ConfirmPassword")).sendKeys(p.getProperty("confirmpwd"));
		
		Thread.sleep(2500);
		driver.findElement(By.id("register-button")).click();
		driver.close();
	}

}
