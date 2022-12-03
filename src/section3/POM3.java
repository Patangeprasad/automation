package section3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Pom_Facebook a=new Pom_Facebook(driver);
		a.usernametextbox("8147571685");
		a.passwordtextbox("Prasad@7411");
		a.loginbutton();
	}

}
