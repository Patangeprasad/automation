package Section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlankPage {
	public static void main(String[] args) {
		
		WebDriver  driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		
	
	}

}
