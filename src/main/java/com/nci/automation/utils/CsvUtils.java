
package com.nci.automation.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import au.com.bytecode.opencsv.CSVReader;

import com.nci.automation.utils.MiscUtils;
import com.nci.automation.xceptions.TestingException;

public class CsvUtils {
	
	private static String RESOURCES_PATH = "src" + File.separator + "main"
			+ File.separator + "resources";

	public static List<List<String>> csvToList(String csvFilePath) throws TestingException {
		return csvToList(MiscUtils.getReaderFromFilePath(csvFilePath), ',');
	}

	public static List<List<String>> csvToList(String csvFilePath, char delimiter) throws TestingException {
		return csvToList(MiscUtils.getReaderFromFilePath(csvFilePath), delimiter);
	}
	
	public static List<List<String>> csvToList(Reader csvFileReader, char delimiter) throws TestingException {
		List<List<String>> ret = new ArrayList<List<String>>();
		
		try
		{
			CSVReader csvReader = new CSVReader(csvFileReader, delimiter);
			List<String[]> data;
			data = csvReader.readAll();
			
			for(String[] rowArr : data) {
				ret.add(Arrays.asList(rowArr));
			}
			
			csvReader.close();
		}
		catch (IOException e)
		{
			throw new TestingException("Issue encountered when reading content from CSV:\n"+e.getMessage(), e);
		}
		
		return ret;
	}

	public static Map<String,List<String>> csvToListMap(String fileName) throws TestingException {

		Map<String,List<String>> dataMap = new LinkedHashMap<String,List<String>>();
		List<String> row = null;
		
		String csvFilePath = getResourcesDir() + File.separator + "com" + 
				File.separator + "fanniemae" + File.separator + "ldng" + File.separator + 
				"automation" + File.separator + "datatables" + File.separator + 
				fileName;
		
		try{
			
			CSVReader csvReader = new CSVReader(new FileReader(csvFilePath), ',');
			List<String[]> data = csvReader.readAll();
			String fieldNickName = null;
			for(String[] rowArr : data) {
				row = new ArrayList<String>();
				for(String cell : rowArr) {
					row.add(cell);
					fieldNickName = rowArr[1];
				}
				dataMap.put(fieldNickName,row);
			}
			
			csvReader.close();
		}catch(IOException e){
			throw new TestingException("IOException: " + e.getMessage(), e);
		}

		return dataMap;
		
	}
	
	/**
	 * prepares a map( with header and cell value as key-value pair) for all rows in csv.
	 * @param fileName
	 * @return
	 * @throws TestingException 
	 */
	public static List<Map<String,String>> csvToMapList(File file) throws TestingException {
		
		List<String> headers = new LinkedList<String>();
		List<Map<String,String>> mapList = new LinkedList<Map<String,String>>();
		
		try
		{
			CSVReader csvReader = new CSVReader(new FileReader(file), ',');
			List<String[]> data = csvReader.readAll();
			int rowIndex = 0;
			for(String[] rowArr : data) {
				int colIndex =0;
				Map<String,String> dataMap = new LinkedHashMap<String,String>();
				for(String cell : rowArr) {
					// pick column headers
					if (rowIndex == 0)
					{
						headers.add(cell);
					}
					else
					{
						dataMap.put(headers.get(colIndex),cell);
					}
					colIndex++;
				}
				if(rowIndex != 0)
				  mapList.add(dataMap);
				rowIndex++;
			}
			
			csvReader.close();
		}catch(IOException e){
			throw new TestingException("IOException: " + e.getMessage(), e);
		}

		return mapList;
		
	}
	
	public static Map<String,Map<String, String>>  csvToMapKeyValuePair(String fileName) throws TestingException {

		Map<String,Map<String, String>> dataMap = new HashMap<String,Map<String, String>>();
		
//		List<String> row = null;
		
		String csvFilePath = getResourcesDir() + File.separator + "com" + 
				File.separator + "fanniemae" + File.separator + "ldng" + File.separator + 
				"automation" + File.separator + "datatables" + File.separator + 
				fileName;
		
		try{
			
			CSVReader csvReader = new CSVReader(new FileReader(csvFilePath), ',');
			List<String[]> data = csvReader.readAll();

			for(String[] rowArr : data) {
				String transformerKey = rowArr[0];
				String key = rowArr[1];
				String value = rowArr[2];
				
				Map<String, String> keyValue = new HashMap<String, String>();
				keyValue.put(key, value);
				
				if(dataMap.containsKey(transformerKey)){
					Map<String, String> keyValue1 = dataMap.get(transformerKey);
					keyValue1.putAll(keyValue);
					dataMap.put(transformerKey, keyValue1);
				}else{
					dataMap.put(transformerKey, keyValue);
				}
			}
			
			csvReader.close();
		}catch(IOException e){
			throw new TestingException("IOException: " + e.getMessage(), e);
		}

		return dataMap;
		
	}
	
	private static String getRootDir() {
		return System.getProperty("user.dir");
	}

	public static String getResourcesDir() {
		return getRootDir() + File.separator + RESOURCES_PATH;
	}
	
	public static void listOfListsToCsv(String filePath, 
			ArrayList<ArrayList<String>> results) throws TestingException {
		FileUtils.listOfListsToTxt(filePath, results, ",");
	}
	
	/**
	* Prepares a list of header values
	* @param file
	* @return
	* @throws TestingException
	*/
	public static List<String> csvHeader(File file) throws TestingException {
		List<String> headers = new LinkedList<String>();
		try {
			CSVReader csvReader = new CSVReader(new FileReader(file), ',');
			String[] headerLine=csvReader.readNext();
			headers = new ArrayList<String>(Arrays.asList(headerLine));
			csvReader.close();
		}catch(IOException e){
			throw new TestingException("IOException: " + e.getMessage(), e);
		}

		return headers;
	}
	
	
	/**
    *
    * @param baseDirectory - custom directory in resources
    * @param fileName - name of csv file
    * @param key - line identifier
    * @return map of csv line with identifier as key for values of line data
    * @throws TestingException
    */
   public static HashMap<String, String> csvToMapKeyValuePairOfGivenKey(String baseDirectory, String fileName, String key) throws TestingException {
       File csvFile = null;
       try {
           csvFile = getCsvFile(baseDirectory, fileName);
       } catch (URISyntaxException e) {
           e.printStackTrace();
       }
       HashMap<String, HashMap<String, String>> dataMap = getHashMapOfCsvFile(csvFile);
       return dataMap.get(key);
   }
   
   /**
   *
   * @param baseDirectory directory in resources under which csv file is located
   * @param fileName name of csv file in resources
   * @return file resource csv file based on baseDirectory and fileName
   * @throws URISyntaxException
   */
  public static File getCsvFile(String baseDirectory, String fileName) throws URISyntaxException {
      return Paths.get(CsvUtils.class.getClassLoader().getResource(baseDirectory + File.separator + fileName).toURI()).toFile();
  }
  
  /**
  *
  * @param file csv file with data
  * @return
  * @throws TestingException
  */
 private static HashMap<String, HashMap<String, String>> getHashMapOfCsvFile(File file) throws TestingException {
     HashMap<String, HashMap<String, String>> dataMap = new HashMap<String, HashMap<String, String>>();

     try {
         CSVReader e = new CSVReader(new FileReader(file), ',');

         String[] headerLine = e.readNext();
         ArrayList<String> headers = new ArrayList<String>(Arrays.asList(headerLine));

         List<String[]> data = e.readAll();

         for (String[] rowArr : data) {
             String transformerKey = rowArr[0];
             for (int i = 1; i < headers.size(); i++) {
                 String key = headers.get(i);
                 String value = rowArr[i];
                 HashMap<String, String> keyValue = new HashMap<String, String>();
                 keyValue.put(key, value);
                 if (dataMap.containsKey(transformerKey)) {
                     HashMap<String, String> keyValue1 = dataMap.get(transformerKey);
                     keyValue1.putAll(keyValue);
                     dataMap.put(transformerKey, keyValue1);
                 } else {
                     dataMap.put(transformerKey, keyValue);
                 }
             }
         }

         e.close();
         return dataMap;
     } catch (IOException var12) {
         throw new TestingException("IOException: " + var12.getMessage(), var12);
     }
 }
	
}
