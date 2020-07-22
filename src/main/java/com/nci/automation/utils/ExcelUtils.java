package com.nci.automation.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.FileUtils;
import com.nci.automation.xceptions.TestingException;

public class ExcelUtils {

	private static Logger logger = Logger.getLogger(ExcelUtils.class);
	
	/**
	 * @param filePath
	 * @param sql
	 * @param includeHeaders
	 * @return Example query: select users from [Sheet1$] 
	 */
	public static ArrayList<ArrayList<String>> getDataBySql(String filePath, String sql,
			boolean includeHeaders) {

		ArrayList<ArrayList<String>> ret = new ArrayList<ArrayList<String>>();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		int numCols;
		int i;

		if (FileUtils.fileExists(filePath)) {
			try {

				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String conStr = "jdbc:odbc:Driver={Microsoft Excel Driver " +
						"(*.xls)};DBQ=" + filePath + ";";

				connection = DriverManager.getConnection(conStr);

				statement = connection.createStatement();
				resultSet = statement.executeQuery(sql);

				numCols = resultSet.getMetaData().getColumnCount();

				if (includeHeaders) {
					ret.add(new ArrayList<String>());
					for(i=1;i<=numCols;i++) {
						ret.get(ret.size()-1).add(resultSet.getMetaData().getColumnName(i));
					}
				}

				while(resultSet.next()) {
					ret.add(new ArrayList<String>());
					for (i=1;i<=numCols;i++) {
						ret.get(ret.size()-1).add(resultSet.getString(i));
					}
				}

			}
			catch (Exception e) {
				CucumberLogUtils.logError(e.getMessage());
				logger.error(e.getMessage(), e);
			}
			finally {
				try {
					resultSet.close();
					statement.close();
					connection.close();
				} catch (SQLException e) {
					CucumberLogUtils.logError(e.getMessage());
					logger.error(e.getMessage(), e);
				}
			}

		}

		return ret;

	}

	/**
	 * Reads the data corresponding to the given {@code rowNum} from the
	 * {@code excelFile} and returns columnName, data value map.
	 *
	 * @param excelFile
	 *            the excel file to be read
	 *
	 * @param rowNum
	 *            the row number for which the data is to read from.
	 * @throws IOException
	 * @throws InvalidFormatException
	 */
	public static Map<String, String> getRowDataByRowNum(File excelFile,
			int rowNum) throws InvalidFormatException, IOException {
		Map<String, String> dataHash = new HashMap<String, String>();
		Map<String, String> columnNameValuePair = new HashMap<String, String>();
		columnNameValuePair.put("id", Integer.valueOf(rowNum).toString());

		dataHash = ExcelUtils.getDataValues(excelFile, columnNameValuePair);

		return dataHash;
	}

	/**
	 * This method returns map values corresponding to the given
	 * {@code columnName} and {@code columnValue}.
	 *
	 * @param columnName
	 *            the columnName
	 *
	 * @param columnValue
	 *            the columnValue
	 *
	 * @return the return the map that contains row data as described above.
	 * @throws Exception 
	 */
	public static Map<String, String> getRowDataByRowValue(File excelFile,
			String columnName, String columnValue) throws Exception {

		Map<String, String> dataHash = new HashMap<String, String>();
		Map<String, String> columnNameValuePair = new HashMap<String, String>();
		columnNameValuePair.put(columnName, columnValue);

		dataHash = ExcelUtils.getDataValues(excelFile,
				columnNameValuePair);

		return dataHash;
	}

	/**
	 * Returns row that contains the given value.
	 */
	private static Map<String, String> getDataValues(File excelFile,
			Map<String, String> cloumnNameValuePair)
			throws InvalidFormatException, IOException {
		Sheet sheet = getFirstSheet(excelFile);

		Map<String, String> dataValues = getValuesFromSheet(sheet,
				cloumnNameValuePair);

		return dataValues;
	}

	private static Map<String, String> getValuesFromSheet(Sheet sheet,
			Map<String, String> value) {
		Map.Entry<String, String> nameValue = value.entrySet().iterator()
				.next();

		String columnName = nameValue.getKey().trim();
		String columnValue = nameValue.getValue().trim();

		Row headerRow = sheet.getRow(sheet.getFirstRowNum());

		int cellNumForColumnName = getCorrespondingCellNum(headerRow,
				columnName);

		Row valueRow = getRowForValue(sheet, cellNumForColumnName, columnValue);

		return getCellValues(headerRow, valueRow);
	}

	/**
	 * Returns the row from the given {@code workSheet} that contains the given
	 * {@code columnValue} at the {@code releventCellNum}.
	 *
	 * @param sheet
	 *            the excel work sheet for which corresponding row is to be
	 *            returned.
	 *
	 * @param releventCellNum
	 *            the excel cell # in which the {@code columnValue} to be
	 *            checked for existence.
	 *
	 * @param columnValue
	 *            the excel cell value to be checked.
	 *
	 * @return Returns the excel row that contains the given {@code columnValue}
	 *         at the cell {@code releventCellNum}
	 */
	private static Row getRowForValue(Sheet sheet, int releventCellNum,
			String columnValue) {
		Row releventRow = null;

		int firstRowNum = sheet.getFirstRowNum() + 1;
		int lastRowNum = sheet.getLastRowNum();
		Row currentRow = null;
		for (int rowNum = firstRowNum; rowNum <= lastRowNum; rowNum++) {
			currentRow = sheet.getRow(rowNum);

			if (currentRow != null) {
				Cell releventCell = currentRow.getCell(releventCellNum);
				String cellValue = getCellValue(releventCell);

				if (StringUtils.isNotBlank(cellValue)
						&& cellValue.equals(columnValue)) {
					releventRow = currentRow;
					break;
				}
			}
		}

		return releventRow;
	}

	/**
	 * Returns the cell # for the cell that contains the given
	 * {@code columnName} in the given {@code headerRow} This method will return
	 * -1 if there is nor value corresponding to the given {@code columnName}
	 *
	 * @param headerRow
	 *            the excel row that will contains the given {@code columnName}
	 *            in one of its rows.
	 * @param columnName
	 *            the value of the cell whose number is required.
	 *
	 * @return the cell number as described above.
	 */
	static int getCorrespondingCellNum(Row headerRow, String columnName) {

		int releventCellNum = -1;

		if (headerRow != null && StringUtils.isNotBlank(columnName)) {
			int firstCellNum = headerRow.getFirstCellNum();
			int lastCellNum = headerRow.getLastCellNum();

			for (int cellNum = firstCellNum; cellNum <= lastCellNum; cellNum++) {
				Cell cell = headerRow.getCell(cellNum);
				String cellValue = getCellValue(cell);

				if (StringUtils.isNotBlank(cellValue)
						&& cellValue.equals(columnName)) {
					releventCellNum = cellNum;
					break;
				}
			}

		}

		return releventCellNum;
	}

	/**
	 * Returns the mapping of values in {@code headerRow} and respective values
	 * in {@code valuesRow}
	 */
	static Map<String, String> getCellValues(Row headerRow, Row valueRow) {
		Map<String, String> cellValues = new HashMap<String, String>();

		if (headerRow != null && valueRow != null) {
			int firstCellNum = headerRow.getFirstCellNum();
			int lastCellNum = headerRow.getLastCellNum();

			for (int cellNum = firstCellNum; cellNum <= lastCellNum; cellNum++) {

				String key = getCellValue(headerRow.getCell(cellNum));
				String value = getCellValue(valueRow.getCell(cellNum));
				cellValues.put(key, value);
			}
		}

		return cellValues;
	}

	/**
	 * Returns the first sheet from the excel workbook represented by the given
	 * {@code excelFile}
	 */
	static Sheet getFirstSheet(File excelFile)
			throws InvalidFormatException, IOException {
		InputStream inp = new FileInputStream(excelFile);

		Workbook workbook = WorkbookFactory.create(inp);
		Sheet sheet = workbook.getSheetAt(0);

		return sheet;
	}

	private static String getCellValue(Cell valueCell) {

		String cellVal = null;
//		if (valueCell != null) {
//			int cellType = valueCell.getCellType();
//
//			switch (cellType) {
//			case Cell.CELL_TYPE_BLANK:
//				cellVal = "";
//				break;
//			case Cell.CELL_TYPE_BOOLEAN:
//				Boolean val = valueCell.getBooleanCellValue();
//				cellVal = val.toString();
//				break;
//			case Cell.CELL_TYPE_NUMERIC:
//				Integer intVal = (int) valueCell.getNumericCellValue();
//				cellVal = intVal.toString();
//				break;
//			case Cell.CELL_TYPE_STRING:
//				cellVal = valueCell.getStringCellValue();
//				break;
//			}
//		}

		return cellVal;
	}

	public static void csvToXslx(String csvPath, String xlsxPath) {
		
		try {
			
			XSSFWorkbook workBook = new XSSFWorkbook();
			XSSFSheet sheet = workBook.createSheet("sheet1");
			String currentLine=null;
			int rowNum=0;
			BufferedReader br = new BufferedReader(new FileReader(csvPath));
			
			while ((currentLine = br.readLine()) != null) {

				String str[] = com.nci.automation.utils.
						StringUtils.splitLineIgnoringCommasInQuotes(currentLine);
				XSSFRow currentRow=sheet.createRow(rowNum);
				rowNum++;
				
				for(int i=0;i<str.length;i++){
					currentRow.createCell(i).setCellValue(str[i]);
				}
			
			}
			br.close();
			
			FileOutputStream fileOutputStream =  new FileOutputStream(xlsxPath);
			workBook.write(fileOutputStream);
			fileOutputStream.close();
			logger.info(String.format("Successfully created xlsx at %s", xlsxPath));
		}
		catch (Exception e) {
			logger.error(String.format("Creation of xlsx at %s failed", xlsxPath), e);
		}
	}
	
	public static void setRowFontToBold (String filePath, String sheetName, 
			int rowNum) {
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
			XSSFWorkbook workBook = new XSSFWorkbook(fis);

			XSSFSheet sheet = workBook.getSheet(sheetName);
			XSSFRow currentRow = sheet.getRow(rowNum);
			
			CellStyle cellStyle = getBoldCellStyle(workBook);
	        
	        XSSFCell currentCell;
	        for(int i=0;i<currentRow.getLastCellNum();i++) {
	        	currentCell = currentRow.getCell(i);
	        	currentCell.setCellStyle(cellStyle);
	        }

	        FileOutputStream fos = new FileOutputStream(filePath);
            workBook.write(fos);
            fos.close();
            
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static CellStyle getBoldCellStyle(XSSFWorkbook workBook) {
		
		CellStyle cellStyle = workBook.createCellStyle();
		Font font = workBook.createFont();
        //font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        cellStyle.setFont(font);
        
        return cellStyle;
        
	}
	
	public static CellStyle getGreenTextCellStyle(XSSFWorkbook workBook) {
		
		CellStyle cellStyle = workBook.createCellStyle();
		Font font = workBook.createFont();
       // font.setColor(HSSFColor.GREEN.index);
        cellStyle.setFont(font);
        
        return cellStyle;
        
	}
	
	public static CellStyle getRedTextCellStyle(XSSFWorkbook workBook) {
		
		CellStyle cellStyle = workBook.createCellStyle();
		Font font = workBook.createFont();
       // font.setColor(HSSFColor.RED.index);
        cellStyle.setFont(font);
        
        return cellStyle;
        
	}
	
	/*
	 * to load XLS WorkBook into the memory
	 * @param filePath
	 * @return XSSFWorkbook
	 */
	public static XSSFWorkbook loadXSSFWorkBook (String filePath) {
		
		XSSFWorkbook workBook = null;
		try {
			FileInputStream fis = new FileInputStream(filePath);
			workBook = new XSSFWorkbook(fis);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return workBook;
	}

	
	/*
	 * To load sheet in workbok into Collection
	 * 
	 * @param workBook
	 * @param sheetName
	 * @return ArrayList<ArrayList<String>> 
	 */
	public static ArrayList<ArrayList<String>> xlsToArrayList (XSSFWorkbook workBook, 
			String sheetName) throws TestingException {
		ArrayList<ArrayList<String>> ret = new ArrayList<ArrayList<String>>();
		ArrayList<String> row = null;
		int i, j;
		XSSFSheet sheet = workBook.getSheet(sheetName);
		for (i=sheet.getFirstRowNum(); i<=sheet.getLastRowNum(); i++) {
			XSSFRow currentRow = sheet.getRow(i);
			row = new ArrayList<String>();
//			System.out.println("i = " + i );
			for(j=currentRow.getFirstCellNum(); j<currentRow.getLastCellNum(); j++) {
				//set cell type to string, to read numbers, dates etc
				try{
//				System.out.print(" : " + j);
				//currentRow.getCell(j).setCellType(1);
				row.add(currentRow.getCell(j).getStringCellValue());
				}catch(NullPointerException npe){
//					System.out.println("NULL Value at i = " + (i+1) + " and j = " + (j+1));
					TestingException testException = new TestingException(npe.getMessage()
							+ "\nNULL Value at row = " + (i+1) + " and Col = " + (j+1), npe);
					throw testException;
				}
			}
			ret.add(row);
		}
		return ret;
	}
	
	public static ArrayList<ArrayList<String>> xlsToArrayList (String filePath, 
			String sheetName) {
		
		ArrayList<ArrayList<String>> ret = new ArrayList<ArrayList<String>>();
		ArrayList<String> row = null;
		int i, j;
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
			XSSFWorkbook workBook = new XSSFWorkbook(fis);

			XSSFSheet sheet = workBook.getSheet(sheetName);
			
			for (i=sheet.getFirstRowNum(); i<sheet.getLastRowNum(); i++) {
				
				XSSFRow currentRow = sheet.getRow(i);
				row = new ArrayList<String>();
				
				for(j=currentRow.getFirstCellNum(); j<currentRow.getLastCellNum(); j++) {
					//set cell type to string, to read numbers, dates etc
					//currentRow.getCell(j).setCellType(1);
					row.add(currentRow.getCell(j).getStringCellValue());
				}
				
				ret.add(row);

			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return ret;
		
	}

	public static void setColColorByResult(String filePath, 
			String sheetName, int colNumber) {
		
		try {
			FileInputStream fis = new FileInputStream(filePath);
			XSSFWorkbook workBook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workBook.getSheet(sheetName);
			
			CellStyle redCellStyle = getRedTextCellStyle(workBook);
			CellStyle greenCellStyle = getGreenTextCellStyle(workBook);

	        for(int i=sheet.getFirstRowNum();i<sheet.getLastRowNum();i++) {
	        	XSSFRow currentRow = sheet.getRow(i);
	        	XSSFCell currentCell = currentRow.getCell(colNumber);
	        	
	        	String currentCellText = "";
	        	
	        	try {
	        		currentCellText = currentCell.getStringCellValue();
	        	}
	        	catch(NullPointerException e) {
	        		currentCellText = "";
	        	}
	        	
	        	if (currentCellText.equalsIgnoreCase("fail"))
	        		currentCell.setCellStyle(redCellStyle);
	        	if (currentCellText.equalsIgnoreCase("pass"))
	        		currentCell.setCellStyle(greenCellStyle);	

	        }

	        FileOutputStream fos = new FileOutputStream(filePath);
            workBook.write(fos);
            fos.close();
            
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/*
	 * Update the specific row and cell with value in XLS file
	 * 
	 * @param filePath
	 * @param sheetName
	 * @param outputValue
	 * @return
	 * 
	 */
	public static void setValueinExcel(String filePath, 
			String sheetName, List<String> outputValue) {

		try {
			FileInputStream fis = new FileInputStream(filePath);
			XSSFWorkbook workBook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workBook.getSheet(sheetName);
			
			CellStyle redCellStyle = getRedTextCellStyle(workBook);
			CellStyle greenCellStyle = getGreenTextCellStyle(workBook);

			for(String rowOutput : outputValue){
				String [] splitVal = rowOutput.split("#");
		
		
				int rowNumber = Integer.parseInt(splitVal[0].trim());
				int colNumber = Integer.parseInt(splitVal[1].trim());
				String value = "No Edits Fired";
				if(splitVal.length == 3)
					value = (splitVal[2]!=null)?splitVal[2].trim():"";
		

				XSSFRow currentRow = sheet.getRow(rowNumber);
				XSSFCell currentCell = currentRow.getCell(colNumber);
				currentCell.setCellValue(value);
			
	        	if (value.equalsIgnoreCase("Failed"))
	        		currentCell.setCellStyle(redCellStyle);
	        	if (value.equalsIgnoreCase("Passed"))
	        		currentCell.setCellStyle(greenCellStyle);	

			 }

	        FileOutputStream fos = new FileOutputStream(filePath);
            workBook.write(fos);
            fos.close();
            
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
