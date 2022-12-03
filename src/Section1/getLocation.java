package Section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getLocation {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		Point loc = searchbox.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		System.out.println(x+" x coordinate");
		System.out.println(y+" y coordinate");
		
		driver.close();
		
		
	}

}
