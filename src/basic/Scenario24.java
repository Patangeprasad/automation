package basic;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario24 {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		
		
	}

}
