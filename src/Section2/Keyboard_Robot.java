package Section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboard_Robot {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_CONTROL);// Select the TEXT
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_CONTROL);// Copy the TEXT
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_TAB);// Go to PASSWARD
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		r.keyPress(KeyEvent.VK_CONTROL);// Paste the TEXT
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		driver.close();
		
	}

}
