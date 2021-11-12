package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {

	public static void main(String[] args) throws IOException {
		
		
		File excelLoc = new File("C:\\Users\\Divya Lokesh\\eclipse-workspace\\MavenProject\\ExcelData\\testdata.xlsx");
		FileInputStream fileInput = new FileInputStream(excelLoc);
		Workbook w = new XSSFWorkbook(fileInput);
		
		Sheet s = w.getSheet("Data");
		
		Row r = s.getRow(0);
		
		Cell c = r.getCell(0);
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row row = s.getRow(i);
	
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
			System.out.print(cell+" ");
			}
			System.out.println();
		}
	}

}
  