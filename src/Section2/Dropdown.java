package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement drop = driver.findElement(By.id("gh-cat"));
		Select a=new Select(drop);
		a.selectByIndex(2);
		a.selectByValue("2984");
		a.selectByVisibleText("Books");
	
		System.out.println(a.isMultiple());
//		if (a.isMultiple()) {
//			System.out.println("it is a mutiple dropdown");
//			
//		} else {
//			System.out.println("it is a single dropdown");
//
//		}
		
	}

}
