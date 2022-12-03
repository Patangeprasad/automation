package Section2;

import java.time.Duration;
import java.util.List;

import org.checkerframework.checker.units.qual.min;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown3 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement drop = driver.findElement(By.id("cars"));
		Select a=new Select(drop);
		a.selectByIndex(1);
		a.selectByValue("199");
		a.selectByVisibleText("INR 200 - INR 299 ( 3 ) ");
	
	List<WebElement> all1 = a.getAllSelectedOptions(); // to fetch selected option in DD
	System.out.println(all1.size());
	for (WebElement s1 : all1) {
		System.out.println(s1.getText());
	}
	
	List<WebElement> all = a.getOptions(); //to get all option in DD
	System.out.println(all.size());
	for (WebElement s : all) {
		System.out.println(s.getText());	
	}
	
	WebElement all2 = a.getFirstSelectedOption(); // tp get first index
	System.out.println(all2.getText());
	
	driver.close();
	}
}
