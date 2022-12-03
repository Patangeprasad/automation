package Section2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_ChildBrowser2 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='X']")).click();
		
		String parent = driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
		
		Set<String> child = driver.getWindowHandles();
		
//		Iterator<String> id = child.iterator();
//		String parentid = id.next();
//		String childid = id.next();
//		System.out.println(parentid);
//		System.out.println(childid);
		
		ArrayList Windowid = new ArrayList(child);
		String parentwindowid = (String) Windowid.get(0);
		Object childwindowid = Windowid.get(1);
		System.out.println(parentwindowid);
		System.out.println(childwindowid);
		
		driver.switchTo().window((String) childwindowid);
		driver.findElement(By.id("mytext")).sendKeys("sadgakjhajsa");
		
		driver.switchTo().window(parentwindowid);
		driver.findElement(By.xpath("//a[text()=' GEARS ']")).click();
		

		
		
		
	}

}
