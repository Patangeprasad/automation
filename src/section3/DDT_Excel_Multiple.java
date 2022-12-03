package section3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_Excel_Multiple {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fls=new FileInputStream("./multiple.xlsx");
		Workbook wb = WorkbookFactory.create(fls);
		Sheet sh = wb.getSheet("Sheet1");
		int rcount = sh.getLastRowNum();
		
		for(int i=0;i<=rcount;i++) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.findElement(By.id("email")).sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
			driver.findElement(By.id("pass")).sendKeys(sh.getRow(i).getCell(1).getStringCellValue());
			
			driver.close();
			
		}
		
		
	}

}
