package Section2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class popup_ChildBrowser3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[text()='X']")).click();
		
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Demo APP'])[2]")).click();
		
		Set<String> child = driver.getWindowHandles();
		ArrayList Windowid = new ArrayList(child);
		String parentwindowid = (String) Windowid.get(0);
		Object childwindowid = Windowid.get(1);
		//Object child1windowid = Windowid.get(2);
		System.out.println(parentwindowid);
		System.out.println(childwindowid);
		//System.out.println(child1windowid);
		
		driver.switchTo().window((String) childwindowid);
		driver.findElement(By.xpath("//a[text()='FEEDBACK']")).click();
		
		
		
		
		
	    
	}

}
