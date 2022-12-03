//open FB and get title, url and page source
package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String source=driver.getPageSource();
		System.out.println(source);
		driver.close();
		
		}
}

