package Section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		WebElement t= driver.findElement(By.className("_8esl"));
//		System.out.println(t.getText());
//		driver.close();
		
		WebElement a = driver.findElement(By.className("_58mk"));
		System.out.println(a.getText());
		driver.close();
	}

}
