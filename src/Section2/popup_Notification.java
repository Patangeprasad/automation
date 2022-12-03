package Section2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class popup_Notification {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mi.com/in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		Thread.sleep(2500);
		driver.close();
		

		
		
		
		
	}

}
