package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario23 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/Admin/Downloads/Assign6.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> clk = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement check : clk) {
			check.click();
		}
		

	}
}
