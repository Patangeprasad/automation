package Section1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRect {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement searchbox = driver.findElement(By.name("q"));
		Rectangle rect = searchbox.getRect();
		int h = rect.getHeight();
		int w = rect.getWidth();
		int x = rect.getX();
		int y = rect.getY();
		
		System.out.println(rect+" address of searchbox");
		System.out.println(h+" heigth");
		System.out.println(w+" width");
		System.out.println(x+" x coordinate");
		System.out.println(y+" y coordinate");
		
		driver.close();
	}

}
