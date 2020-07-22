package com.nci.automation.utils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import com.nci.automation.xceptions.TestingErrorCode;
import com.nci.automation.xceptions.TestingException;

/**
 * @author sohilz2
 *
 */
public class ZipUtils {
	private static String sourceFolder, targetFile;
	private static List<String> fileList;

	/**
	 * Archive a Source path into a zip file, created at the same level as the
	 * source path
	 * 
	 * @param source
	 * @param target
	 */
	public static void zip(String source) throws TestingException {
		zip(source, null);
	}

	/**
	 * Archive a Source path into a zip file, created at the specified target path
	 * 
	 * @param source
	 * @param target
	 */
	public static void zip(String source, String target) throws TestingException {
		if (StringUtils.isBlank(source)) {
			throw new TestingException(new IllegalArgumentException("Source was not provided"));
		} else if (!FileUtils.fileExists(source)) {
			throw new TestingException(new IllegalArgumentException("Provided source does not exist in file system"));
		} else {
			sourceFolder = source;
			FileOutputStream fos = null;
			ZipOutputStream zos = null;
			FileInputStream in = null;

			try {
				File sourceDirObj = new File(sourceFolder);

				// Recursively scan for all files/directories in source
				fileList = new ArrayList<String>();
				generateFileList(sourceDirObj);

				byte[] buffer = new byte[1024];

				// Handle case where target is not specified - create file at the same level as
				// source
				if (StringUtils.isNotBlank(target)) {
					if (target.indexOf(".zip") <= 0)
						targetFile = target + File.separator + sourceDirObj.getName() + ".zip";
					else
						targetFile = target;

					File targetFileObj = new File(targetFile);

					targetFileObj.getParentFile().mkdirs();
				} else {
					targetFile = sourceDirObj.getParent() + File.separator + sourceDirObj.getName() + ".zip";
				}

				fos = new FileOutputStream(targetFile);
				zos = new ZipOutputStream(fos);

				for (String file : fileList) {
					System.out.println(Thread.currentThread().getName() + " : File Added : " + file);
					ZipEntry ze = new ZipEntry(file);
					zos.putNextEntry(ze);

					in = new FileInputStream(sourceFolder + File.separator + file);

					int len;
					while ((len = in.read(buffer)) > 0) {
						zos.write(buffer, 0, len);
					}

					MiscUtils.closeQuietly(in);
				}

				CucumberLogUtils.logDebug("Zip file [" + FilenameUtils.getName(targetFile) + "] has been created.");
			} catch (IOException e) {
				throw new TestingException(e);
			} finally {
				try {
					// close stream objects again in case there was an exception
					zos.closeEntry();
					MiscUtils.closeQuietly(zos, in);
				} catch (IOException e) {
					throw new TestingException(e);
				}

				// Clear static objects
				fileList = null;
				sourceFolder = null;
				targetFile = null;
			}
		}
	}

	/**
	 * Traverse a directory and get all files, and add the file into fileList
	 *
	 * @param node - file or directory
	 */
	private static void generateFileList(File node) throws IOException {
		// add file only
		if (node.isFile()) {
			fileList.add(generateZipEntry(node.getAbsoluteFile().toString()));
		}

		if (node.isDirectory()) {
			String[] subNode = node.list();
			for (String filename : subNode) {
				generateFileList(new File(node, filename));
			}
		}
	}

	/**
	 * Format the file path for zip
	 * 
	 * @param file - file path
	 * @return Formatted file path
	 */
	private static String generateZipEntry(String file) {
		return file.substring(sourceFolder.length() + 1, file.length());
	}

	/**
	 * Unzips a zip file to the folder where it is located
	 * 
	 * @param zipFilePath
	 * @param targetFolderPath
	 */
	public static void unZip(String zipFilePath) throws TestingException {
		unZip(zipFilePath, null);
	}

	/**
	 * Unzips a zip file to the specified target folder
	 * 
	 * @param zipFilePath
	 * @param targetFolderPath
	 */
	public static void unZip(String zipFilePath, String targetFolderPath) throws TestingException {
		if (StringUtils.isBlank(zipFilePath)) {
			throw new TestingException(new IllegalArgumentException("Zip file's path was not provided"));
		} else if (!FileUtils.fileExists(zipFilePath)) {
			throw new TestingException(new IllegalArgumentException("Zip file does not exist at given path"));
		} else {
			byte[] buffer = new byte[1024];
			ZipInputStream zis = null;
			FileOutputStream fos = null;

			try {
				// If target folder was not specified, extract to same location as archive file
				// Else, use target folder
				String fullTargetPath = (StringUtils.isNotBlank(targetFolderPath) ? targetFolderPath
						: new File(zipFilePath).getParent()) + File.separator
						+ FilenameUtils.getBaseName(new File(zipFilePath).getName());

				// Create output directory if it does not exist
				File folder = new File(fullTargetPath);
				if (!folder.exists()) {
					folder.mkdir();
				}

				// Get the zip file content
				zis = new ZipInputStream(new FileInputStream(zipFilePath));
				// Get the zipped file list entry
				ZipEntry ze = zis.getNextEntry();

				while (ze != null) {
					String fileName = ze.getName();
					File newFile = new File(fullTargetPath + File.separator + fileName);

					CucumberLogUtils.logDebug("file unzip: " + newFile.getAbsoluteFile());

					// create all non exists folders
					// else you will hit FileNotFoundException for compressed folder
					new File(newFile.getParent()).mkdirs();

					fos = new FileOutputStream(newFile);

					int len;
					while ((len = zis.read(buffer)) > 0) {
						fos.write(buffer, 0, len);
					}

					MiscUtils.closeQuietly(fos);
					ze = zis.getNextEntry();
				}

				CucumberLogUtils
						.logDebug("File [" + zipFilePath + "] has been unzipped to folder [" + fullTargetPath + "]");
			} catch (IOException e) {
				throw new TestingException(e);
			} finally {
				try {
					// close stream objects again in case there was an exception
					zis.closeEntry();
					MiscUtils.closeQuietly(zis, fos);
				} catch (IOException e) {
					throw new TestingException(e);
				}
			}
		}
	}

	public static String gZipDecompressStringToString(String str) throws TestingException {
		if (StringUtils.isBlank(str)) {
			return str;
		}
		String outStr = gZipDecompressBytesToString(str.getBytes());

		return outStr;
	}

	/**
	 * Uncompresses the GZip compressed bytes to String. Returns null if input was
	 * null
	 * 
	 * @param inputBytes GZip compressed bytes
	 * @return UnCompressed Bytes
	 * @throws TestingException
	 */
	public static String gZipDecompressBytesToString(byte[] inputBytes) throws TestingException {
		String uncompressedString = null;
		try {
			if (inputBytes != null) {
//				ByteArrayInputStream byteStream = new ByteArrayInputStream(inputBytes);

				GZIPInputStream gzipIs = new GZIPInputStream(new ByteArrayInputStream(inputBytes));
				BufferedReader bf = new BufferedReader(new InputStreamReader(gzipIs));

				StringBuilder sb = new StringBuilder();
				String line;
				while ((line = bf.readLine()) != null) {
					sb.append(line);
				}
				uncompressedString = sb.toString();
			}
		} catch (Exception e) {
			throw new TestingException();
		}

		return uncompressedString;
	}

	/**
	 * Uncompresses the GZip compressed bytes to byte array. Returns null if input
	 * was null
	 * 
	 * @param inputBytes GZip compressed bytes
	 * @return UnCompressed Bytes
	 * @throws TestingException
	 */
	public static byte[] gZipDecompressBytesToBytes(byte[] inputBytes) throws TestingException {
		byte[] uncompressedBytes = null;
		if (inputBytes != null) {
			ByteArrayInputStream byteStream = new ByteArrayInputStream(inputBytes);
			try {
				GZIPInputStream gzipIs = new GZIPInputStream(byteStream);
				uncompressedBytes = IOUtils.toByteArray(gzipIs);
			} catch (IOException e) {
				throw new TestingException(TestingErrorCode.CONTENT_UNCOMPRESS_ERROR, e.getMessage());
			}

		}
		return uncompressedBytes;
	}
}
