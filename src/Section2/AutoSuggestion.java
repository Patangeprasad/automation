package Section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("virat kholi");
		Thread.sleep(2000);
		List<WebElement> sugg=driver.findElements(By.xpath("//ul[@class='erkvQe']/div[1]/ul/li"));
		
		for (WebElement s : sugg) {
			System.out.println(s.getText());
			
		}
		driver.close();
	}

}

