package section3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_Excel_Alldata {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fls=new FileInputStream("./registerexcel.xlsx");
		Workbook wb=WorkbookFactory.create(fls);
		Sheet sh = wb.getSheet("Sheet1");
		int row = sh.getPhysicalNumberOfRows();
		int cell = sh.getRow(0).getPhysicalNumberOfCells();
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < cell; j++) {
				System.out.println(sh.getRow(i).getCell(j).toString());
				
			}
			
		}
		
	}

}
