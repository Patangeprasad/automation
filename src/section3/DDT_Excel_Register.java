package section3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_Excel_Register {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		File fls=new File("./registerexcel.xlsx");
		Workbook wb=WorkbookFactory.create(fls);
		
		String url = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		String firstname = wb.getSheet("Sheet1").getRow(1).getCell(1).toString();
		String lastname = wb.getSheet("Sheet1").getRow(2).getCell(1).toString();
		String email = wb.getSheet("Sheet1").getRow(3).getCell(1).toString();
		String passward = wb.getSheet("Sheet1").getRow(4).getCell(1).toString();
		String conpwd = wb.getSheet("Sheet1").getRow(5).getCell(1).toString();
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstname);
		driver.findElement(By.id("LastName")).sendKeys(lastname);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(passward);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(conpwd);
		
		
	}

}
