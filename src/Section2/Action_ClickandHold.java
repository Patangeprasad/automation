package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Action_ClickandHold {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.switchTo().frame(0);
		WebElement scr = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		
		Actions a=new Actions(driver);
		a.clickAndHold(scr).release(dest).perform();
		
		Thread.sleep(2500);
		driver.close();
		
	
	}

}
