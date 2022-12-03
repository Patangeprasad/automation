package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario25 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("q")).sendKeys("virat kohli");
		Thread.sleep(2500);
//		driver.findElement(By.xpath("(//li[@class='sbct'])[7]")).click();
		List<WebElement> a = driver.findElements(By.xpath("//ul[@class='G43f7e']"));
		
		Thread.sleep(2500);
		for (WebElement sugg : a) {
			if(sugg.getText().contains("birthday"))
				sugg.click();	
			break;
		}
		
		//driver.close();
		}


}
