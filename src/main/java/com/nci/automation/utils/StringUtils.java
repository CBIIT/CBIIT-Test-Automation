package com.nci.automation.utils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.jsoup.Jsoup;

import com.nci.automation.common.Constants;

/**
 * This class contains utility methods for String manipulation
 * 
 */
public class StringUtils 
{
	/**
	 * Convert a delimited String into an Arraylist of tokens
	 * 
	 * @param str
	 * @param delimeter
	 * @return
	 */
	public static ArrayList<String> strToArrayList(String str, String delimeter)
	{
		ArrayList<String> ret = new ArrayList<String>();
		String[] strArray = str.split(delimeter);
		
		for (String token : strArray)
		{
			ret.add(token);
		}
		
		return ret;		
	}

	/**
	 * Convert a delimited String into an Arraylist of trimmed tokens
	 * 
	 * @param str
	 * @param delimeter
	 * @return
	 */
	public static ArrayList<String> strToArrayListAndTrim(String str, String delimeter)
	{
		ArrayList<String> ret = new ArrayList<String>();
		String[] strArray = str.split(delimeter);
		
		for (String token : strArray)
		{
			ret.add(token.trim());
		}
		
		return ret;
	}
	
	/**
	 * Convert an ArrayList of Strings to a single delimited String object
	 * 
	 * @param arl
	 * @param delimeter
	 * @return
	 */
	public static String arrayListToStr(List<String> arl, String delimeter) 
	{
		StringBuilder ret = new StringBuilder();
		
		if (!arl.isEmpty())
		{
			if (delimeter.isEmpty())
				delimeter = System.getProperty("line.separator");
			
			for (int i = 0; i < arl.size()-1; i++) 
			{
				ret.append(arl.get(i) + delimeter); 
			}
			
			ret.append(arl.get(arl.size()-1));
		}
		
		return ret.toString();
	}
	
	/**
	 * Replaces delimiter in a delimited String after trimming token values
	 * 
	 * @param input
	 * @param origDelim
	 * @param newDelim
	 * @return
	 */
	public static String trimAndReplaceDelim(String input, String origDelim, String newDelim)
	{
		ArrayList<String> splitList = strToArrayListAndTrim(input, origDelim);
		String strWithNewDelim = arrayListToStr(splitList, newDelim);
		
		return strWithNewDelim;		
	}

	/**
	 * @param featureTags
	 * @return
	 */
	public static String cleanUpHtmlTags(String featureTags) {
		return Jsoup.parse(featureTags).text();
	}

	/**
	 * @param committmentIDList
	 * @return
	 */
	public static boolean checkIfAllMembersAreIdentical(List<String> strList)
	{
		if(strList.size() > 1)
		{
			Set<String> strSet = new HashSet<String>(); 
			
			for(String str : strList)
			{
				if(org.apache.commons.lang.StringUtils.isNotBlank(str))
				{
					strSet.add(str);
				}
			}
			
			if(strSet.size() > 1)
				return false;
		}
		
		return true;
	}

	public static String[] splitLineIgnoringCommasInQuotes(String line) {
		
		//logic is to split on the comma only if the comma has zero or
		//an even number of quotes ahead of it
		String otherThanQuote = " [^\"] ";
		String quotedString = String.format(" \" %s* \" ", otherThanQuote);
		String regex = String.format("(?x) "+ // enable comments, ignore white spaces
			",                         "+ // match a comma
			"(?=                       "+ // start positive look ahead
			"  (                       "+ //   start group 1
			"    %s*                   "+ //     match 'otherThanQuote' zero or more times
			"    %s                    "+ //     match 'quotedString'
			"  )*                      "+ //   end group 1 and repeat it zero or more times
			"  %s*                     "+ //   match 'otherThanQuote'
			"  $                       "+ // match the end of the string
			")                         ", // stop positive look ahead
			otherThanQuote, quotedString, otherThanQuote);
		
		String[] ret = line.split(regex, -1);
		return ret;
	        
	}
	
	/**
	 * Replaces all instances of 2 or more contiguous spaces with single spaces
	 * @param str
	 * @return
	 */
	public static String removeExtraSpaces(String str)
	{
		String result = org.apache.commons.lang.StringUtils.trimToEmpty(str);
		
		result = result.replaceAll(Constants.REG_EX_EXTRA_SPACE, Constants.WHITE_SPACE);
		
		return result;
	}
	
	public static String removeNonAsciiCharacters(String str) {
		return str.replaceAll("[^\\x00-\\x7F]", "");
	}

	public static String removeAsciiControlCharacters(String str) {
		return str.replaceAll("\\p{Cntrl}", "");
	}
	
	public static String replaceSpecialRegexCharsWithLiterals(String str) {
		
		String ret = str;
		
		//\.[]{}()*+-?^$|
				
		ret = ret.replace("\\", "\\\\\\");
		ret = ret.replace(".", "\\.");
		ret = ret.replace("[", "\\[");
		ret = ret.replace("]", "\\]");
		ret = ret.replace("{", "\\{");
		ret = ret.replace("}", "\\}");
		ret = ret.replace("(", "\\(");
		ret = ret.replace(")", "\\)");
		ret = ret.replace("*", "\\*");
		ret = ret.replace("+", "\\+");
		ret = ret.replace("-", "\\-");
		ret = ret.replace("?", "\\?");
		ret = ret.replace("^", "\\^");
		ret = ret.replace("$", "\\$");
		ret = ret.replace("|", "\\|");
		
		return ret;
		
	}
	
}
