package Section2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class popup_Notification1 {
	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-Notifications");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.mi.com/in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.close();
		
	}

}
