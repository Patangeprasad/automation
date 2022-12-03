package Section2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup_Fileupload {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\fileupload\\fileupload.exe");
		
		Thread.sleep(3000);
		driver.close();

	}

}
