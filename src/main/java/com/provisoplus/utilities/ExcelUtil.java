package com.provisoplus.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ExcelUtil {
	/**
	 * This method will load spcified row into the lIst form excel
	 * @param filePath name of excel file 
	 * @param sheetName name of shett form which you want to load row 
	 * @param rowNum form which you want all data 
	 */
  
	public void getRowFromExcel(String filePath, String sheetName, int rowNum)  {
		List data = new ArrayList<>();
		try {
			FileInputStream fis = new FileInputStream(filePath);
			XSSFWorkbook book = new XSSFWorkbook(fis);
			XSSFSheet sheet = book.getSheet(sheetName);
			XSSFRow row = sheet.getRow(rowNum);
			for (int i = 0; i < row.getLastCellNum(); i++) {
//				Cell cell = row.getCell(i);
//				Cell cell = row.getCell(i);
//				switch (cell.getCellType()) {   
//				case STRING;
//				data.add(Cell.getStringCellValue());
//				break;
//				case NLMERIC;
//				data.add(cell.getNumer8cValue());
//				break;
//				case BLANK:
//					data.add("");
//					break;
//					break;
//					default:
//						break;
						
						
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		return data;
	}
	
	public void loadExcelToMap(String FilePath, String sheetName) {

	}
	/*Use this method to load any colum form the excel sheet into the list
	 * @param filePath from which you want to load the column 
	 * @param sheetName from which you want column data 
	 * @param colNum index of column from which you want to load data
	 * @return list containing data form column
	 */
	public List getColumeFromExcel(String filePath, String sheetName, int colNum) {
		return new ArrayList<>();

	}
}
