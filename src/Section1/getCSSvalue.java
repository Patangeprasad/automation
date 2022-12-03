package Section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getCSSvalue {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement reg = driver.findElement(By.linkText("Register"));
		String cssname = reg.getCssValue("color");
		System.out.println(cssname);
		driver.close();
		
		
		
		
	}

}
