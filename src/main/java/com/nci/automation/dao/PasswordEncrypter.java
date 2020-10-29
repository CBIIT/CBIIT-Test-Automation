package com.nci.automation.dao;

import com.nci.automation.utils.EncryptionUtils;

/**
 * 
 * @author sohilz2
 *
 */
public class PasswordEncrypter {

	public static void main(String[] args) {
		String pwd = "P@ssw0rd!@#-nci";
		System.out.println(EncryptionUtils.encrypt(pwd));

	}

}
