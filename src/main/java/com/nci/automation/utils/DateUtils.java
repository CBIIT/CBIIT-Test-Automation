package com.nci.automation.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import com.nci.automation.xceptions.TestingException;

public class DateUtils {

	public static String getFormatedDate(String dateFormat) {
		Date currentTime = new Date();
		DateFormat df = new SimpleDateFormat(dateFormat);
		String formatedDate = df.format(currentTime);
		return formatedDate;
	}

	public static String getLogTime() {
		return getTimeStampByFormat("yyyy-MM-dd HH:mm:ss");
	}

	public static String getTimeStampByFormat(String format) {

		DateFormat dateFormat;
		Calendar cal;

		dateFormat = new SimpleDateFormat(format);
		cal = Calendar.getInstance();

		return dateFormat.format(cal.getTime());

	}

	public static String formatDateTime(String datetime, String format) throws TestingException {

		DateFormat dateFormat;
		Calendar cal = Calendar.getInstance();
		Date date = null;

		List<String> knownFormats = getKnownDateFormats();

		for (String knownFormat : knownFormats) {

			try {
				date = new SimpleDateFormat(knownFormat).parse(datetime);
				break;
			} catch (ParseException e) {
				// do nothing, try next format
			}
		}

		try {
			cal.setTime(date);
			dateFormat = new SimpleDateFormat(format);

			return dateFormat.format(cal.getTime());
		} catch (Exception e) {
			throw new TestingException("Unknown date format '" + format + "': " + e.getMessage());
		}
	}

	public static Date getDateInFormat(String datetime, String format) throws TestingException {

		String string = datetime;
		DateFormat dateformat = new SimpleDateFormat(format, Locale.ENGLISH);
		Date date = null;
		try {
			date = dateformat.parse(string);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;

	}

	// Diffs dates presented as strings in one of the "known" formats (see
	// getKnownDateFormats())
	// and returns the difference in the form of seconds
	public static long dateDiff(String dateString1, String dateString2) throws TestingException, ParseException {

		dateString1 = dateString1.replaceAll("T", " ");
		dateString2 = dateString2.replaceAll("T", " ");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		dateString1 = formatDateTime(dateString1, "yyyy-MM-dd HH:mm:ss");
		dateString2 = formatDateTime(dateString2, "yyyy-MM-dd HH:mm:ss");

		Date date1 = format.parse(dateString1);
		Date date2 = format.parse(dateString2);

		long ret = date2.getTime() - date1.getTime();
		return ret / 1000;
	}

	private static List<String> getKnownDateFormats() {
		List<String> ret = new ArrayList<String>();
		ret.add("MM/dd/yyyy");
		ret.add("MM-dd-yyyy hh:mm:ss a");
		ret.add("yyyy-MM-dd HH:mm:ss");
		ret.add("MM-dd-yyyy hh:mm a");
		ret.add("yyyy-MM-dd");
		return ret;
	}

	public static Date stringToDate(String date, String format) throws TestingException {

		DateFormat dateFormat = new SimpleDateFormat(format, Locale.ENGLISH);
		Date ret = null;
		try {
			ret = dateFormat.parse(date);
		} catch (ParseException e) {
			throw new TestingException(
					"Unable to parse '" + date + "' date into '" + format + "' format" + e.getMessage());
		}
		return ret;
	}

	public static String dateToString(Date date, String format) {

		DateFormat dateFormat;
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		dateFormat = new SimpleDateFormat(format);
		return dateFormat.format(cal.getTime());
	}

	public static int getDateDiffInDays(Date date1, Date date2) {
		long diff = date2.getTime() - date1.getTime();
		return (int) (diff / (1000 * 60 * 60 * 24));
	}

	public static int getDateDiffInMonths(Date date1, Date date2) {
		Calendar startCalendar = new GregorianCalendar();
		startCalendar.setTime(date1);
		Calendar endCalendar = new GregorianCalendar();
		endCalendar.setTime(date2);
		int diffYear = endCalendar.get(Calendar.YEAR) - startCalendar.get(Calendar.YEAR);
		int diffMonth = diffYear * 12 + endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);
		return diffMonth;
	}

}
