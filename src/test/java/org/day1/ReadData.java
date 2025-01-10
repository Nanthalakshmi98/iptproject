package org.day1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	public static void main(String[] args) throws IOException {
		File f =new File("C:\\Users\\Vigneshwaran\\Downloads\\Book.xlsx");
		FileInputStream stream = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(stream);
		Sheet sheet = book.getSheet("data");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(1);
		String stringCellValue = cell.getStringCellValue();
		System.out.println(stringCellValue);
	}

}

