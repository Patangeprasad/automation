package Section2;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_WebElement {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> atag = driver.findElements(By.tagName("a"));
		int count = atag.size();
		System.out.println(count);
		
//		for (WebElement a : atag) {
//			System.out.println(a.getText());
//		}
		
		for (int i = 0; i < count; i++) {
			String a1 = atag.get(i).getText();
			System.out.println(a1);
		}
		driver.close();
		
		
	}

}
