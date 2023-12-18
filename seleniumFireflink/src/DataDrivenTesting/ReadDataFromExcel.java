package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Step 1 : Create object of FileInputStream
		FileInputStream fs = new FileInputStream("./PropertyFiles/Book1.xlsx");
		
		//Create respective file type object
		Workbook wb = WorkbookFactory.create(fs);
		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
		String un = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println(un);
		String pwd = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(pwd);
		
		LocalDateTime date = wb.getSheet("Sheet1").getRow(1).getCell(3).getLocalDateTimeCellValue();
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		
		int num = (int)wb.getSheet("Sheet1").getRow(1).getCell(4).getNumericCellValue();
		System.out.println();
	}

}
