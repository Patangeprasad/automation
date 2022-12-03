package Section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_FileUplod3_Robot {
	public static void main(String[] args) throws AWTException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
		WebElement up = driver.findElement(By.xpath("//input[@id='file-upload']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();",up);
		
		Robot r=new Robot();
		r.delay(2000);
		
		//put path to file in clipboard
		StringSelection ss=new StringSelection("C:\\Users\\Admin\\Downloads\\Sunilkumar Resume.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//paste the path
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.delay(2000);
		
		//enter the button
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
