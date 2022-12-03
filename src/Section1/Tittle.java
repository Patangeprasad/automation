package Section1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tittle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cowin.gov.in/");
		String s=driver.getTitle();
		System.out.println(s);
		driver.close();

	}

}
