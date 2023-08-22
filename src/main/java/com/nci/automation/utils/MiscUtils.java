package com.nci.automation.utils;
public class MiscUtils {

	public static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
