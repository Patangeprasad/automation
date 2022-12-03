package section3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POM4 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Pom_WebShop w=new Pom_WebShop(driver);
		w.genderbtn();
		w.firstnamebox("prasad");
		w.lastnamebox("patange");
		w.emailid("prasad@gmail.com");
		w.passwardbox("prasad123");
		w.confirmpassward("prasad123");
		w.registerbutton();
		
		
	}

}
