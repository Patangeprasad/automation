package Section2;

import java.util.Iterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		for(int i=1;i<10;i++) {
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(2500);
		}
		
		
		for(int i=1;i<10;i++) {
		js.executeScript("window.scrollBy(0,-5000)");
		Thread.sleep(2500);
		}
		
	
	}

}
