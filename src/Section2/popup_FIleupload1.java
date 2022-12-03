package Section2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_FIleupload1 {
	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("(//span[text()='Jobseeker Login'])[3]")).click();
		driver.findElement(By.xpath("//a[text()='Register with us']")).click();
		driver.findElement(By.xpath("//span[text()='Choose CV']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\fileupload\\monstar.exe");
		//driver.close();
		
	}

}

