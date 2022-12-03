package Section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {

	public static void main(String[] args) {

			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in/");
			String s=driver.getPageSource();
			System.out.println(s);
			driver.close();

	}

}
