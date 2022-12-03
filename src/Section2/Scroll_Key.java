package Section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Key {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_PAGE_UP);
		driver.close();
		
		
		
		
	}

}
