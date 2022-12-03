package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario20 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("virat");
		//driver.findElement(By.xpath("//div[@class='iblpc']")).click();
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
	}

}
