package Section2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshoot1 {
	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele= driver.findElement(By.id("username"));
				//sendKeys("trainee",Keys.TAB,"trainee",Keys.ENTER);
		
		File scr = ele.getScreenshotAs(OutputType.FILE);
		File desc=new File("./photo/actitime.png");
		FileUtils.copyFile(scr, desc);
		
		
		
	}

}
