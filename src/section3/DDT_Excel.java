package section3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.excelant.util.ExcelAntWorkbookUtilFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_Excel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fls=new FileInputStream("./data1.xlsx");
		Workbook wb = WorkbookFactory.create(fls);
		
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).toString();
		String username = wb.getSheet("Sheet1").getRow(1).getCell(1).toString();
		String passward = wb.getSheet("Sheet1").getRow(1).getCell(2).toString();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(passward);
		
		
		
		
		
		

	}

}
