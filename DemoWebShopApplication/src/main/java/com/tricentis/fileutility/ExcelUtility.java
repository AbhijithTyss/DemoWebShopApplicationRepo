package com.tricentis.fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	
	public String getDataFromExcel(String sheetname,int rowNum,int colNum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/DemoWebShopProject.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		String data = workbook.getSheet(sheetname).getRow(rowNum).getCell(colNum).toString();
		return data;
	}
	
	public String[][] getAllDataFromExcelInString(String sheetname) throws Exception{
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/DemoWebShopProject.xlsx");
		Workbook workbook = WorkbookFactory.create(fis);
		int rowCount = workbook.getSheet(sheetname).getPhysicalNumberOfRows();
		int colCount = workbook.getSheet(sheetname).getRow(0).getPhysicalNumberOfCells();
		String[][] data=new String[rowCount][colCount];
		for (int i=0;i<rowCount;i++) {
			for (int j=0;j<colCount;j++) {
				data[i][j]=workbook.getSheet(sheetname).getRow(i).getCell(j).toString();
			}
		}
		return data;
	}
}
