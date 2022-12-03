package Section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_Windows {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2500);
		
		for (int i = 0; i < 10; i++) {
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			//Thread.sleep(200);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
//		r.keyPress(KeyEvent.VK_CANCEL);
//		r.keyRelease(KeyEvent.VK_CANCEL);
		
		driver.close();
		
	}

}
