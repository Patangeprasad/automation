package Section2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_FileUpload2_SendKeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
		Thread.sleep(2500);
		WebElement up = driver.findElement(By.xpath("//input[@id='file-upload']"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;		
		js.executeScript("arguments[0].value='C:\\Users\\Admin\\Downloads\\Sunilkumar Resume.docx';", up);
	
	}

}
