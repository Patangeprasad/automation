package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown6_DOB1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
	
		WebElement day = driver.findElement(By.id("day"));
		WebElement mon = driver.findElement(By.id("month"));
		WebElement yr = driver.findElement(By.id("year"));
		
		SelectDropDown(day, "2");
		SelectDropDown(mon, "Jan");
		SelectDropDown(yr, "2000");
		
		Thread.sleep(2500);
		
		driver.close();
	}
		
		public static void SelectDropDown(WebElement element,String value) {
			Select s=new Select(element);
			s.selectByVisibleText(value);
			
		}

}
