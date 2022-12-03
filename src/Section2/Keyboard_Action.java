package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Action {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement Search=driver.findElement(By.name("q"));
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.SHIFT).sendKeys(Search,"selenium").perform(); //uppercase
		act.keyUp(Keys.SHIFT).sendKeys(Search,"selenium").perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("A").perform(); //select all
		act.keyDown(Keys.CONTROL).sendKeys("C").perform(); //copy
		
		driver.close();
		
		
	}

}
