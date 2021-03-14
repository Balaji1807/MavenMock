package org.datadriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExampleDatadriven {
	
	public static void main(String[] args) throws IOException {
		
		File f=new File("C:\\Users\\Balaji\\eclipse-workspace\\MavenMock\\Excelsheet\\newmock.xlsx");
		
		FileInputStream fin =new FileInputStream(f);
		
		Workbook w=new XSSFWorkbook(fin);
		
		Sheet sheet =w.getSheet("Sheet1");
		
		Row row =sheet.getRow(2);
		
		Cell cell = row.getCell(3);
		
		int Rows = sheet.getPhysicalNumberOfRows();
		
		int cells = row.getPhysicalNumberOfCells();
		
		System.out.println(Rows);
		
		System.out.println(cells);
		
	
		
		
		
		
		
		
		
		
		
		
	}

}
