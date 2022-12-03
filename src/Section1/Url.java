package Section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Url {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		String s=driver.getCurrentUrl();
		System.out.println(s);

	}

}
