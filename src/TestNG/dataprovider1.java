package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider1 {
	@DataProvider
	public Object[][] getData() {
		Object[][] a=new Object[4][5];
		a[0][0]="prasad";
		a[0][1]="patange";
		a[0][2]="p@gmail.com";
		a[0][3]="pvp123456";
		a[0][4]="pvp123456";
		
		a[1][0]="chidambar";
		a[1][1]="kulkarni";
		a[1][2]="ch@gmail.com";
		a[1][3]="ch123456";
		a[1][4]="ch123456";
		
		a[2][0]="girish";
		a[2][1]="patil";
		a[2][2]="girish@gmail.com";
		a[2][3]="giri123456";
		a[2][4]="giri123456";
		
		a[3][0]="sunil";
		a[3][1]="valasang";
		a[3][2]="sunil@gmail.com";
		a[3][3]="sunil23456";
		a[3][4]="sunil23456";
	
		return a;	
	}
	
	@Test(dataProvider = "getData")
	public void demo(String FN,String LN,String EID,String pwd,String conpwd) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(FN);
		driver.findElement(By.id("LastName")).sendKeys(LN);
		driver.findElement(By.id("Email")).sendKeys(EID);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(conpwd);
		driver.findElement(By.id("register-button")).click();
		
		Thread.sleep(2500);
		driver.close();
	}

}
