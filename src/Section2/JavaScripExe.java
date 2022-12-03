
package Section2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScripExe {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//to enter the data
		WebElement search = driver.findElement(By.name("q"));
		js.executeScript("arguments[0].value='phone';",search);
		
		Thread.sleep(2500);
		//to clear the entered data
		js.executeScript("arguments[0].value=' ';",search);
		
		Thread.sleep(2500);
		
		//to click the element
		WebElement schtb = driver.findElement(By.xpath("//div[@class='iblpc']"));
		js.executeScript("arguments[0].click();",schtb);
		
		Thread.sleep(2500);
		
		//to refresh the page 
		js.executeScript("history.go(0);");
	}

}
