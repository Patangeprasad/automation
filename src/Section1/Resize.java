package Section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resize {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
	    String s=driver.getTitle();
	    System.out.println(s);
		driver.manage().window().setSize(new Dimension(200,500));
		driver.manage().window().setPosition(new Point(300,100));
	    
	    driver.close();
	}

}
