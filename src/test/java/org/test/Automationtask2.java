package org.test;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automationtask2 {
public static void main(String[] args) throws Exception {
	File file = new File("C:\\Users\\HP\\eclipse-workspace\\FaceBook\\sheet\\automation task 2l.xlsx");
	FileInputStream stream = new FileInputStream(file);
	WebDriverManager.chromedriver().setup();
	Workbook wrbk =new XSSFWorkbook(stream);
WebDriver driver = new ChromeDriver();
//driver.get("http://demo.automationtesting.in/Register.html"); 
	Sheet sheet = wrbk.getSheet("sheet1");
//	Row row = sheet.getRow(5);
//	Cell cell=row.getCell(1);

for (int i=0; i<sheet.getPhysicalNumberOfRows();i++) {
Row row=sheet.getRow(i);
for(int j=0;j<row.getPhysicalNumberOfCells();j++) {
	Cell cell=row.getCell(j);
	System.out.println(cell);
}


}
}
}