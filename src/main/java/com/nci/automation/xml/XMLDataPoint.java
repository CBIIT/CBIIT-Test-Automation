package com.nci.automation.xml;

/**
 * Represents one database column (name/value pair)
 */
public class XMLDataPoint
{
	private String xpath;
	private String value;
	
	public XMLDataPoint ()
	{
		super();
	}
	
	public XMLDataPoint (String xpath, String value)
	{
		this.xpath = xpath;
		this.value = value;
	}
	
	public String getXPath()
	{
		return xpath;
	}
	
	public String getValue()
	{
		return value;
	}
	
	public String toString()
	{
		return "XPath: " + xpath + "; value: " + value;
	}
}
