package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	@DataProvider
	public Object[][] getData() {
		Object[][] a=new Object[3][2];
		a[0][0]="shankar";
		a[0][1]="mercury";
		
		a[1][0]="john";
		a[1][1]="mercury";
		
		a[2][0]="gopi";
		a[2][1]="mercury";
		return a;
		
	}
	
	@Test(dataProvider = "getData")
	public void demo(String username,String pwd) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
		Thread.sleep(3000);
		driver.close();
	}

}
