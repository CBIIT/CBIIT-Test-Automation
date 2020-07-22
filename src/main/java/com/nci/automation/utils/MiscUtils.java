package com.nci.automation.utils;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import com.nci.automation.common.Constants.OSType;
import com.nci.automation.xceptions.TestingException;



public class MiscUtils {

	/**
	 * Swaps the given two element array.
	 * 
	 * @param tobeSwapped
	 *            tobeSwapped the list of long values to be swapped, only two
	 *            numbers are expected.
	 * 
	 * @return Returns the swapped array of two numbers.
	 * 
	 * @throws IndexOutofBoundException
	 *             if {@code tobeSwapped} is less than two numbers.
	 * 
	 *             NOTE: This method expects exactly two numbers additional
	 *             parameters values are silently ignored.
	 */
	public static long[] swap(long... tobeSwapped) {
		long[] swappedArray = new long[2];

		swappedArray[0] = tobeSwapped[1];
		swappedArray[1] = tobeSwapped[0];

		return swappedArray;
	}

	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		}
		catch(InterruptedException e) {
			CucumberLogUtils.logError(e.getMessage());
		}
	}


	/**
	 * Closes objects that implement Closeable
	 * @param closeable
	 */
	public static void closeQuietly(Closeable... closeable)
	{
		for (Closeable obj2Close : closeable)
		{
			if(obj2Close != null)
			{
				try
				{
					obj2Close.close();
				}
				catch(IOException e)
				{
					CucumberLogUtils.logDebug("Exception encountered while closing the stream:\n" + e);
					continue;
				}
			}
		}
	}

	public static void setClipboardText(String s) {

		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection stringSelection = new StringSelection(s);
		clipboard.setContents(stringSelection, null);

	}

	public static String getClipboardText() {

		String data = "";

		try {
			data = (String) Toolkit.getDefaultToolkit().
					getSystemClipboard().getData(DataFlavor.stringFlavor);
			return data;
		}
		catch(Exception e) {
			CucumberLogUtils.logError(e.getMessage());
			return null;
		}

	}

	/**
	 * Retrieve Operating system type
	 * @return OS as String
	 */
	public static OSType getOSType()
	{
		String os = System.getProperty("os.name");
		OSType osType = OSType.Other;

		if(StringUtils.isNotBlank(os))
		{
			os = os.toLowerCase();

			if(StringUtils.contains(os, "win"))
			{
				osType = OSType.Windows;
			}
			else if(StringUtils.contains(os, "nix"))
			{
				osType = OSType.Unix;
			}
			else if(StringUtils.contains(os, "mac"))
			{
				osType = OSType.MacOS;
			}
		}

		return osType;
	}

	public static String getOsName() {
		return System.getProperty("os.name");
	}
	
	/**
	 * Returns the OS level tmp directory of the user.
	 */
	public static String getSystemTempDir() {
		return System.getProperty("java.io.tmpdir");
	}

	/**
	 * Returns a unique random string
	 */
	public static String getUniqueId() {
		return UUID.randomUUID().toString();
	}

	@Test
	public void printUniqueID()
	{
		System.out.println(getUniqueId());
	}

	public static String makeStringHtmlSafe(String str)
	{
		return StringEscapeUtils.escapeHtml(str);
	}
	
//	public static void saveObjectAsEvidence(EvidenceReady objToSaveAsFile, String folderPath) throws TestingException
//	{
//		if(StringUtils.isBlank(folderPath))
//			throw new TestingException("Folder Path i");
//			
//		String fileName = objToSaveAsFile.getFileNameForObject();
//		
//		if(StringUtils.isBlank(fileName))
//			fileName = "File_"+System.currentTimeMillis();
//		
//		String targetFilePath = folderPath + File.separator + fileName;
//		FileUtils.saveStringToFile(objToSaveAsFile.getFileContentsForObject(), targetFilePath);
//	}
//    
	private static String DEFLT_DATE_FORMAT = "MM/dd/yyyy";
	
    public static List<Date> convertToDateList(List<String> columnValues, String formatStr)
    {
    	List<Date> returnValue = new ArrayList<Date>();
    	SimpleDateFormat strDateFormat = new SimpleDateFormat(StringUtils.isBlank(formatStr) ? DEFLT_DATE_FORMAT : formatStr);
    	
    	for (String dateStr : columnValues)
    	{
    		try
    		{
    			Date date = new Date();
    			if ("-".equals(dateStr.trim()))
    			{
    				SimpleDateFormat tmpDateFormat = new SimpleDateFormat(DEFLT_DATE_FORMAT);
    		    	date = tmpDateFormat.parse("01/01/1901");
    			}
    			else
    			{
    				date = strDateFormat.parse(dateStr);
    			}
    			returnValue.add(date);
    		}
    		catch (Exception ex)
    		{
    			continue;
    		}
    	}
    	
    	return returnValue;
    }

    /**
     * Convert a list of strings to a list of Doubles
     * @param columnValues
     * @return List<Double>
     */
    public static List<Double> convertToDoubleList(List<String> columnValues)
    {
    	ArrayList<Double> returnValue = new ArrayList<Double>();
    	
    	for (String dblStr : columnValues)
    	{
    		try
    		{
    			Double dbl = new Double(dblStr.replace("%", ""));
    			returnValue.add(dbl);
    		}
    		catch (Exception ex)
    		{
    			continue;
    		}
    	}
    	
    	return returnValue;
    }
	
	/**
	 * Return a java.io.Reader object from a filePath 
	 * @param filePath
	 * @return
	 * @throws TestingException
	 */
	public static Reader getReaderFromFilePath(String filePath) throws TestingException	{
		try
		{
			return new FileReader(filePath);
		}
		catch (FileNotFoundException e)
		{
			throw new TestingException("File path ["+filePath+"] not found", e);
		}
	}
	
	public static void setupHttpsProxy() {
		String proxyHost = LocalConfUtils.getProperty("proxyHost");
		String proxyPort = LocalConfUtils.getProperty("proxyPort");
		
		System.setProperty("https.proxyHost", proxyHost);
		System.setProperty("https.proxyPort", proxyPort);
	}
	
	public static void clearHttpsProxy() {
		System.clearProperty("https.proxyHost");
		System.clearProperty("https.proxyPort");
	}
	
}
