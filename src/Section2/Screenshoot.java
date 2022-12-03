package Section2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshoot {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//step1=type casting
		TakesScreenshot ts=(TakesScreenshot) driver;
		//step2=we can access the method and store it in RAM(its temp)
		File scr=ts.getScreenshotAs(OutputType.FILE);
		//step3=have specify the location 
		File dest=new File("./photo/amazon.png");
		//step4=copy and paste from RAM to required location
		FileUtils.copyFile(scr, dest);
		
		driver.close();
		
	}

}
