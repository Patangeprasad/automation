package Section2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshoot2 {
	public static void main(String[] args) throws IOException {
		
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement ele= driver.findElement(By.xpath("(//div[@class='a-cardui-body'])[12]"));
	
	File scr = ele.getScreenshotAs(OutputType.FILE);
	File desc=new File("./photo/am.png");
	FileUtils.copyFile(scr, desc);
	
	driver.close();
}

}
