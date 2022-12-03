package Section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synch_Explicit {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(2));
		
		WebElement usertb = driver.findElement(By.name("username"));
		wait.until(ExpectedConditions.visibilityOf(usertb)).sendKeys("prasad123");
		
		WebElement button = driver.findElement(By.xpath("(//div[contains(@class,'qF0y9')])[4]"));
		wait.until(ExpectedConditions.elementToBeClickable(button)).click();
		
		String tit = driver.getTitle();
		wait.until(ExpectedConditions.titleContains("Instagram"));
		
		driver.close();
		
		
		
	}

}
