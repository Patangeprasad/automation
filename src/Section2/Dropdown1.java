package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement drop = driver.findElement(By.id("cars"));
		Select a=new Select(drop);
		a.selectByIndex(1);
		a.selectByValue("199");
		a.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		
		a.deselectAll();
//		a.deselectByIndex(0);
//		a.deselectByValue("199");
//		a.deselectByVisibleText("INR 200 - INR 299 ( 3 ) ");
		
		}

}
