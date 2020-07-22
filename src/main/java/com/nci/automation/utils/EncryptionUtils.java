package com.nci.automation.utils;

import org.apache.commons.codec.binary.Base64;

public class EncryptionUtils {

	/**
	 * Encrypt a string using Apache Commons Base64 api
	 * 
	 * @param property
	 * @return
	 */
	public static String encrypt(String property) {
		String encodedStr = null;
		encodedStr = Base64.encodeBase64String(property.getBytes());
		return encodedStr;
	}

	/**
	 * Decrypt a string using Apache Commons Base64 api
	 * @param property
	 * @return
	 */
	public static String decrypt(String property) {
		String decodedStr = null;
		if (org.apache.commons.lang.StringUtils.isNotBlank(property) && Base64.isBase64(property))
			decodedStr = new String(Base64.decodeBase64(property));

		return decodedStr;
	}
}