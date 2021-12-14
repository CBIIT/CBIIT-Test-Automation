package com.nci.automation.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.lang.StringUtils;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.xceptions.TestingException;

/**
 * This class contains utility methods for file/folder manipulation
 */
public class FileUtils {
	private final static Logger LOG = LogManager.getLogger(FileUtils.class);

	public static ArrayList<String> txtToArrayList(String filePath) {
		ArrayList<String> ret = new ArrayList<String>();

		FileInputStream fis;
		DataInputStream dis;
		BufferedReader bReader;
		String line;

		try {
			fis = new FileInputStream(filePath);
			dis = new DataInputStream(fis);
			bReader = new BufferedReader(new InputStreamReader(dis));

			while ((line = bReader.readLine()) != null) {
				ret.add(line);
			}
			MiscUtils.closeQuietly(bReader, dis, fis);
		} catch (Exception e) {
			CucumberLogUtils.logError(e.getMessage());
		}

		return ret;

	}

	public static File listToTxt(List<String> arl, String outFilePath, String lineBreak, boolean overWrite) {
		FileWriter fw;
		BufferedWriter bw;
		File savedFile = null;

		if (arl.isEmpty())
			CucumberLogUtils.logError("Input array list is empty!");

		if (fileExists(outFilePath)) {
			if (overWrite)
				deleteFile(outFilePath);
			else
				CucumberLogUtils
						.logError("File '" + outFilePath + "' already exists! Set overWrite=true to skip this error");
		}

		if (lineBreak.isEmpty())
			lineBreak = System.getProperty("line.separator");

		savedFile = new File(outFilePath);

		try {
			fw = new FileWriter(savedFile);
			bw = new BufferedWriter(fw);

			for (String temp : arl) {
				bw.write(temp + lineBreak);
			}

			MiscUtils.closeQuietly(bw, fw);

		} catch (Exception e) {
			CucumberLogUtils.logError(e.getMessage());
		}

		return savedFile;
	}

	public static boolean deleteFile(String filePath) {
		File f = new File(filePath);

		if (!f.exists()) {
			CucumberLogUtils.logError("Can't delete file. File '" + filePath + "' doesn't exist");
			return false;
		} else if (!f.canWrite()) {
			CucumberLogUtils.logError("Can't delete file. File '" + filePath + "' is write protected");
			return false;
		} else if (f.isDirectory()) {
			CucumberLogUtils.logError("Can't delete file. Path '" + filePath + "' is a directory not a file");
			return false;
		}

		return f.delete();

	}

	public static void deleteDirectory(String dirPath) throws TestingException {
		File f = new File(dirPath);

		if (!f.exists()) {
			CucumberLogUtils.logError("Can't delete directory. Directory '" + dirPath + "' doesn't exist");
		} else if (!f.canWrite()) {
			CucumberLogUtils.logError("Can't delete directory. Directory '" + dirPath + "' is write protected");
		} else if (!f.isDirectory()) {
			CucumberLogUtils.logError("Can't delete directory. Path '" + dirPath + "' is not a directory");
		} else {
			try {
				org.apache.commons.io.FileUtils.deleteDirectory(f);
			} catch (IOException e) {
				throw new TestingException(e);
			}
		}
	}

	public static boolean fileExists(String filePath) {
		try {
			return (new File(filePath)).exists();
		} catch (NullPointerException e) {
			return false;
		}
	}


	public static void appendToFile(String filePath, List<String> newLines) throws TestingException {

		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(filePath, true)));

			for (String newLine : newLines) {
				out.println(newLine);
			}
			out.close();
		} catch (IOException e) {
			throw new TestingException("Couldn't append to File: " + e.getMessage());
		}

	}

	/**
	 * Copy a file to a specified directory
	 * 
	 * @param srcFilePath
	 * @param destDir
	 * @throws TestingException
	 */
	public static File copyFile(String srcFilePath, String destDir) throws TestingException {
		return copyFile(srcFilePath, destDir, null);
	}

	/**
	 * Copy a file to a specified directory with a specified target file name
	 * @param srcFilePath
	 * @param destDir
	 * @param destFileName
	 * @throws TestingException
	 */
	public static File copyFile(String srcFilePath, String destDir, String destFileName) throws TestingException {
		File newFile = null;

		try {
			if (StringUtils.isBlank(destFileName)) {
				newFile = new File(destDir, resolveFileName(srcFilePath));

				org.apache.commons.io.FileUtils.copyFileToDirectory(new File(srcFilePath), new File(destDir));
			} else {
				newFile = new File(destDir, destFileName);

				org.apache.commons.io.FileUtils.copyFile(new File(srcFilePath), newFile);
			}
		} catch (IOException e) {
			throw new TestingException("An exception occurred when copying the file", e);
		}

		confirmFileExists(newFile.getAbsolutePath());

		return newFile;
	}



	/**
	 * Given a file path, returns the file name
	 * @param filepath
	 * @return
	 */
	public static String resolveFileName(String filepath) {
		String fileName = "";

		File file = new File(filepath);

		if (file.isFile()) {
			fileName = file.getName();
		}

		return fileName;
	}

	/**
	 * Given a file path, returns the file name without the .ext
	 * @param filepath
	 * @return
	 */
	public static String resolveFileNameNoExt(String filepath) {
		String fileName = "";

		File file = new File(filepath);
		if (file.isFile()) {
			fileName = FilenameUtils.getName(filepath);
		}
		return fileName;
	}

	/**
	 * Returns a list of file paths to files in a given folder
	 * @param dirPath
	 * @param pattern
	 * @return
	 */
	public static List<String> listFilesInDirectory(String dirPath, String pattern) {
		File folder = new File(dirPath);
		File[] listOfFiles = folder.listFiles();
		List<String> fileNames = new ArrayList<String>();

		for (int i = 0; i < listOfFiles.length; i++) {
			if (listOfFiles[i].isFile()) {
				String fileName = listOfFiles[i].getName();
				if (pattern == null || fileName.indexOf(pattern) >= 0) {
					fileNames.add(fileName);
				}
			}
		}
		return fileNames;
	}

	/**
	 * Appends given string to the end of a file name
	 * @param fileName
	 * @return
	 */
	public static String appendToFileName(String fileName, String appendStr) {
		String newFileName = FilenameUtils.getBaseName(fileName) + "_" + appendStr + "."
				+ FilenameUtils.getExtension(fileName);

		return newFileName;
	}

	/**
	 * @param destDir
	 * @param fileName
	 * @throws TestingException
	 * @throws InterruptedException
	 */
	public static void confirmFileExists(String filePath) throws TestingException {
		File fileToCheck = new File(filePath);
		long timeout = 5000;
		long start = System.currentTimeMillis();
		long end = System.currentTimeMillis();

		while ((end - start) < timeout) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				throw new TestingException("Thread issue while sleeping", e);
			}

			if (fileToCheck.exists()) {
				break;
			}

			end = System.currentTimeMillis();
		}

		if (!fileToCheck.exists()) {
			throw new TestingException("File [" + filePath + "] was not found.");
		}
	}

	/**
	 * Formats results data for CSV file
	 *
	 * @param val
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static String getCSVString(Object val) {
		String ret = "";
		if (val != null) {
			if (val instanceof String) {
				ret = (String) val;
			} else if (val instanceof List) {
				List<String> lst = (List<String>) val;
				for (String item : lst) {
					ret = ret + item.trim() + ";";
				}
			} else {
				ret = val.toString();
			}
			ret = ret.trim();
			ret = ret.replace(',', ';');
			ret = ret.replace('\n', '^');
			ret = ret.replace('\r', '^');
		}
		return ret;
	}

	/**
	 * Shortens a file name to the given max length
	 * @param currentFileName
	 * @param maxLength
	 * @return
	 */
	public static String getShortenedFileName(String currentFileName, int maxLength) {
		if (StringUtils.isBlank(currentFileName) || currentFileName.length() <= maxLength)
			return currentFileName;
		else {
//			String shortenedName = FilenameUtils.getBaseName(currentFileName).substring(0, maxLength)
//									+ FilenameUtils.getExtension(currentFileName);

			String shortenedName = currentFileName.substring(currentFileName.length() - maxLength);

			return shortenedName;
		}
	}

	public static boolean cleanDirectory(File dir) {
		try {
			org.apache.commons.io.FileUtils.cleanDirectory(dir);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	public static boolean cleanDirectory(String dirPath) {
		return cleanDirectory(new File(dirPath));
	}

	public static List<File> getFilesByExtension(File folder, final String extension) {

		ArrayList<File> ret = new ArrayList<File>();
		FilenameFilter filenameFilter = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.endsWith(extension);
			}
		};

		File[] files = folder.listFiles(filenameFilter);
		for (File f : files) {
			ret.add(f);
		}
		return ret;
	}

	public static String getDirectoryPath(String filePath) {

		String ret = "";
		int i;
		filePath = filePath.replace("\\", "/");
		String[] pathArray = filePath.split("/");
		for (i = 0; i < pathArray.length - 1; i++) {
			ret += pathArray[i] + File.separator;
		}
		return ret.substring(0, ret.length() - 1);
	}

	public static String getFileName(String filePath) {

		filePath = filePath.replace("\\", "/");
		String[] pathArray = filePath.split("/");
		return pathArray[pathArray.length - 1];

	}

	/**
	 * @param str
	 * @param filePath
	 */
	public static void saveStringToFile(String str, String filePath) {
		try {
			Thread.sleep(200);

			File evidenceFile = new File(filePath);
			org.apache.commons.io.FileUtils.writeStringToFile(evidenceFile, str, "UTF-8");
			LOG.info("File [" + filePath + "] was " + (!evidenceFile.exists() ? "NOT " : "") + "created");
		} catch (IOException e) {
			CucumberLogUtils.logDebug("Error writing string content to a file");
		} catch (InterruptedException e) {
			// do nothing
		}
	}

	public static List<File> getFilesInDir(File dir) {
		return getFilesInDir(dir, "");
	}

	public static List<File> getFilesInDir(File dir, final String endsWith) {

		if ((endsWith == null) || endsWith.isEmpty())
			return new ArrayList<File>(Arrays.asList(dir.listFiles()));

		File[] filesArray = dir.listFiles(new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.toLowerCase().endsWith(endsWith);
			}
		});

		List<File> files = new ArrayList<File>(Arrays.asList(filesArray));

		return files;

	}

	public static void createDirectories(String dirPath) {
		File f = new File(dirPath);
		f.mkdirs();
	}

	public static void createDirectory(String dirPath) {
		File f = new File(dirPath);
		f.mkdir();
	}

	public static void listOfListsToTxt(String filePath, ArrayList<ArrayList<String>> results, String delimeter)
			throws TestingException {

		String newLine;
		if ((delimeter == null) || delimeter.isEmpty())
			delimeter = ",";
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(filePath, false)));

			for (List<String> fileLine : results) {
				newLine = "";
				for (String fileWord : fileLine) {
					newLine += fileWord + delimeter;
				}
				// Remove last delimeter
				newLine = newLine.substring(0, newLine.length() - 1);
				out.println(newLine);
			}
			out.close();
		} catch (IOException e) {
			throw new TestingException("Couldn't create File: " + e.getMessage());
		}

	}

	/*
	 * Compares the contents of two files to determine if they are equal or not.
	 * This method checks to see if the two files are different lengths or if they
	 * point to the same file, before resorting to byte-by-byte comparison of the
	 * contents.
	 * 
	 */
	public static boolean compareFiles(File file1, File file2) throws TestingException {
		try {
			return org.apache.commons.io.FileUtils.contentEquals(file1, file2);
		} catch (IOException e) {
			throw new TestingException("Couldn't compare the files " + e.getMessage());
		}

	}

}
