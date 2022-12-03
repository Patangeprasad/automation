package basic;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario16 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Set<Cookie> c = driver.manage().getCookies();
		System.out.println(c.size());
		System.out.println(c);
		
		for (Cookie cook : c) {
			System.out.println(cook.getName()+" : "+cook.getValue());
		}
		
		driver.close();
	}

}
