package Section2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {
	public static void main(String[] args) {
		
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.ebay.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			WebElement drop = driver.findElement(By.id("gh-cat"));
			Select a=new Select(drop);
			a.selectByIndex(2);
			a.selectByValue("2984");
			a.selectByVisibleText("Books");
			
			List<WebElement> all = a.getOptions();//  all
			System.out.println(all.size());
			for (WebElement s : all) {
				System.out.println(s.getText());	
			}
			
			WebElement all1 = a.getFirstSelectedOption(); //selected option
			System.out.println(all1.getSize());
			System.out.println(all1.getText());
	}

}
