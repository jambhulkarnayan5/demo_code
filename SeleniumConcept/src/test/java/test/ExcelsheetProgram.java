package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelsheetProgram {
	
	
	public static void main(String[] args) throws IOException {
		
		File excelSheet= new File("D:\\My Tool\\Eclipse\\Eclipse workspace\\MavenProject\\src\\test\\resources\\Testdata\\Data.xlsx");
		FileInputStream input = new FileInputStream(excelSheet);
		String d= WorkbookFactory.create(input).getSheet("Login").getRow(0).getCell(1).getStringCellValue();
		System.out.println(d);
	}

}
