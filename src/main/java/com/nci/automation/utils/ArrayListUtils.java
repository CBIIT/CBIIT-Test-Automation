package com.nci.automation.utils;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang.StringUtils;

import com.nci.automation.xceptions.TestingException;

public class ArrayListUtils {

	public static List<String> trimStringList(List<String> stringList) {
		List<String> trimmedList = new ArrayList<String>();

		if (stringList != null && !stringList.isEmpty()) {

			for (String string : stringList) {

				if (StringUtils.isNotBlank(string)) {
					trimmedList.add(string.trim());
				}
			}
		}

		return trimmedList;
	}

	public static ArrayList<String> removeEmptyElements(ArrayList<String> arl) {
		ArrayList<String> ret = new ArrayList<String>();

		for (String str : arl) {
			if (StringUtils.isNotBlank(str))
				ret.add(str);
		}

		return ret;
	}

	public static void print(ArrayList<String> arl) {
		for (String s : arl) {
			CucumberLogUtils.logInfo(s);
		}
	}

	public static void print(List<String> list) {
		for (String s : list) {
			CucumberLogUtils.logInfo(s);
		}
	}

	/**
	 * Returns a [line-return] separated String representation of the contents of an
	 * Object List Note: Assumes that toString() is adequately overridden in
	 * internal class type
	 *
	 * Author: q2urak
	 * 
	 * @param list
	 * @return
	 */
	public static String objectListToString(List<? extends Object> list) {
		StringBuilder sb = new StringBuilder();

		for (Object o : list) {
			sb.append(o.toString() + "\n");
		}

		return sb.toString();
	}

	/**
	 * Returns a [line-return] separated String representation of the contents of a
	 * String List
	 *
	 * Author: ?
	 * 
	 * @param list
	 * @return
	 */
	public static String stringListToString(List<String> list) {
		StringBuilder sb = new StringBuilder();

		for (String s : list) {
			sb.append(s + "\n");
		}

		return sb.toString();
	}

	/**
	 * Returns a [user-specified-separator] separated String representation of the
	 * contents of a String List
	 *
	 * Author: q2urak
	 * 
	 * @param list
	 * @param separator
	 * @return
	 */
	public static String stringListToString(List<String> list, String separator) {
		StringBuilder sb = new StringBuilder();

		for (String s : list) {
			sb.append(s + separator);
		}

		return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : sb.toString();
	}

	/**
	 * Returns a [user-specified-separator] separated String representation of the
	 * contents of a String List decorated.
	 *
	 * @param list
	 * @param separator
	 * @param decorator
	 * @return
	 */
	public static String stringListToString(List<String> list, String separator, String decorator) {
		StringBuilder sb = new StringBuilder();

		for (String s : list) {
			sb.append(decorator + s + decorator + separator);
		}

		return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : sb.toString();
	}

	public static boolean compareLists(List<String> actualList, List<String> expectedList, boolean isCaseSensitive) {

		if ((actualList == null) || (expectedList == null)) {
			CucumberLogUtils.logError("Actual and/or Expected list is null!");
			return false;
		}

		if (actualList.isEmpty() || expectedList.isEmpty()) {
			CucumberLogUtils.logError("Actual and/or Expected list is empty!");
			return false;
		}
		if (actualList.size() != expectedList.size()) {
			CucumberLogUtils.logError("Actual and Expected lists are not of the same size");
			return false;
		}

		int i;

		StringBuilder mismatches = new StringBuilder();
		boolean fail = false;

		if (isCaseSensitive) {
			for (i = 0; i < actualList.size(); i++) {
				String actualValue = StringUtils.trimToEmpty(actualList.get(i));
				String expectedValue = StringUtils.trimToEmpty(expectedList.get(i));

				if (!actualValue.equals(expectedValue)) {
					mismatches.append("\tMismatch at index: " + i + 1);
					mismatches.append(", Actual Value: " + actualValue + ", Expected Value: " + expectedValue + "\n");
					fail = true;
				}
			}
		} else {
			for (i = 0; i < actualList.size(); i++) {
				String actualValue = StringUtils.trimToEmpty(actualList.get(i));
				String expectedValue = StringUtils.trimToEmpty(expectedList.get(i));

				if (!actualValue.equalsIgnoreCase(expectedValue)) {
					mismatches.append("\tMismatch at index: " + i + 1);
					mismatches.append(", Actual Value: " + actualValue + ", Expected Value: " + expectedValue + "\n");
					fail = true;
				}
			}
		}

		if (fail) {
			CucumberLogUtils.logInfo("The following mismatches were found:\n" + mismatches.toString());
			return false;
		} else {
			return true;
		}

	}

	public static String containsElements(List<String> actualList, List<String> expectedList) throws TestingException {
		if ((actualList == null) || (expectedList == null)) {
			throw new TestingException("Actual and/or Expected list is null!");
		}

		StringBuilder mismatches = new StringBuilder();

		for (String expectedValue : expectedList) {
			if (!actualList.contains(expectedValue)) {
				mismatches.append(expectedValue + "\n");
			}
		}

		return mismatches.toString();
	}

	public static String doesNotContainElements(List<String> actualList, List<String> notExpectedValuesList) {
		if ((actualList == null) || (notExpectedValuesList == null)) {
			CucumberLogUtils.logError("Actual and/or Expected list is null!");
		}

		StringBuilder matches = new StringBuilder();

		for (String notExpectedValue : notExpectedValuesList) {
			if (actualList.contains(notExpectedValue)) {
				matches.append(notExpectedValue + "\n");
			}
		}

		return matches.toString();
	}
}
