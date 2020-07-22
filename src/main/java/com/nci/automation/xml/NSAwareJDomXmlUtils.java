package com.nci.automation.xml;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.filter.Filter;
import org.jdom2.filter.Filters;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;

/**
 * This class contains utilities for xml content with namespaces. 
 */
public class NSAwareJDomXmlUtils {
	
	/**
	 * This method will set the given value {@code text} to elements matching
	 * the {@code xPath}.
	 * 
	 * @param namespaceList
	 *            list of namespaces defined in the xml.
	 * 
	 * @param xmlContent
	 *            the xml content
	 * 
	 * @param xPath
	 *            the xpath expression.
	 * 
	 * @param text
	 *            the value to be set.
	 * 
	 * @throws JDOMException
	 *             if there is any error while parsing the xml document.
	 * 
	 * @throws IOExeption
	 *             if there is any error while loading the xml.
	 */
	public static String setNamespaceAwareElementText(List<Namespace> namespaceList, String xmlContent, String xPath,
			String text) throws JDOMException, IOException {
		Document xmlDoc = loadDocument(xmlContent);

		List<Element> elementList = getNamespaceAwareElementListFromXmlDoc(namespaceList, xmlDoc, xPath);

		for (Element element : elementList) {
			element.setText(text);
		}

		XMLOutputter outputWriter = new XMLOutputter();
		outputWriter.setFormat(Format.getPrettyFormat());

		StringWriter stringWriter = new StringWriter();
		outputWriter.output(xmlDoc, stringWriter);

		return stringWriter.toString();
	}
	
	/**
	 * Returns the value of xml element that matches the given {@code xPath}
	 * 
	 * @param list
	 *            of xml namespaces specified in the document.
	 * 
	 * @param xmlContent
	 *            the xml content.
	 * 
	 * @param xPath
	 *            the xpath expression.
	 * 
	 * @throws JDOMException
	 *             if there is any error while parsing the xml document
	 * 
	 * @throws IOException
	 *             if there is any error loading xml into the document.
	 */
	public static String getValueFromNSAwareXMLString(
			List<Namespace> namespaceList, String xmlContent, String xPath)
			throws JDOMException, IOException {

		Document xmlDoc = loadDocument(xmlContent);

		String value = StringUtils.trimToNull(getValueFromNSAwareXMLDoc(
				namespaceList, xmlDoc, xPath));

		return value;
	}
	
	/**
	 * Returns the text value of a given xpath from a Document object
	 *
	 * @param xPath
	 * @param xmlDoc
	 * @return
	 */
	public static String getValueFromNSAwareXMLDoc(List<Namespace> namespaceList, Document xmlDoc, String xPath) {
		List<Element> elementList = getNamespaceAwareElementListFromXmlDoc(namespaceList,
				xmlDoc, xPath);

		String value = "";
		if (!elementList.isEmpty()) {
			value = elementList.get(0).getText();
		}
		return value;
	}
	
	public static List<Element> getNamespaceAwareElementList(
			List<Namespace> namespaceList, String xmlContent, String xpath)
			throws JDOMException, IOException {

		Document xmlDocument = loadDocument(xmlContent);

		List<Element> elementList = getNamespaceAwareElementListFromXmlDoc(
				namespaceList,
				xmlDocument, xpath);

		return elementList;
	}

	private static List<Element> getNamespaceAwareElementListFromXmlDoc(
			List<Namespace> namespaceList, Document xmlDocument, String xpath) {
		XPathFactory xPathFactory = XPathFactory.instance();
		Filter<Element> elementFilter = Filters.element();
		XPathExpression<Element> xPathExpression = xPathFactory.compile(xpath,
				elementFilter, null, namespaceList);
		List<Element> elements = xPathExpression.evaluate(xmlDocument);

		return elements;
	}
	
	 /**
     * Removes element/elements represented by given {@code xPath}
     * 
     * NOTE: Beaware this method will remove all element that matches the given xpaht
     * 
     * @param xmlContent the xml document.
     * 
     * @param xPath xPath of the element/elements that needs to be removed from the given {@code xmlContent}
     * 
     * @throws JDOMException if there is any error while parsing the xml for the xpath.
     * 
     */
	public static String nsAwareRemoveContent(String xmlContent,
			List<Namespace> namespaceList, String xPath) throws JDOMException,
			IOException {
		Document xmlDoc = loadDocument(xmlContent);
		List<Element> elementList = getNSAwareElementListFromXmlDoc(
				namespaceList, xmlDoc, xPath);

		removeElements(elementList);

		XMLOutputter outputWriter = new XMLOutputter();
		outputWriter.setFormat(Format.getPrettyFormat());

		StringWriter stringWriter = new StringWriter();
		outputWriter.output(xmlDoc, stringWriter);

		return stringWriter.toString();
	}
    
    private static void removeElements(List<Element> childElements) {
    	
    	Element parent = null;
    	
    	if(childElements != null && !childElements.isEmpty() ) {
    		parent = childElements.get(0).getParentElement();
    	}
    	
    	if(parent != null) {
    		
    		for(Element child : childElements) {
    			parent.removeContent(child);
    		}
    	}
    }
   
	/**
	 * Returns the list of Jdom Element that matches given {@code xpath} in the
	 * xml content {@code xmlContent}
	 * 
	 * @param nsList
	 *            the list of namespaces that is specified in the xml
	 * 
	 * @param xmlContent
	 *            the markup content.
	 * 
	 * @param xpath
	 *            the xpath expression for which matching elements are needed.
	 * 
	 * @throws JDOMException
	 *             if there is any error while parsing the xml document.
	 * 
	 * @throws IOException
	 *             if there is any error while loading the xml into document
	 *             object.
	 */
	public static List<Element> getNSAwareElementList(List<Namespace> nsList,
			String xmlContent, String xpath) throws JDOMException, IOException {
		List<Element> elementList = new ArrayList<Element>();

		Document xmlDocument = loadDocument(xmlContent);

		elementList = getNSAwareElementListFromXmlDoc(nsList, xmlDocument,
				xpath);

		return elementList;
	}
    
    private static List<Element> getNSAwareElementListFromXmlDoc(
			List<Namespace> namespaceList, Document xmlDocument, String xpath) {
		XPathFactory xPathFactory = XPathFactory.instance();
		Filter<Element> elementFilter = Filters.element();
		XPathExpression<Element> xPathExpression = xPathFactory.compile(xpath,
				elementFilter, null, namespaceList);
		List<Element> elements = xPathExpression.evaluate(xmlDocument);

		return elements;
	}
    
    /**
	 * This method loads and returns the xml document from the given
	 * {@code xmlContent}
	 * 
	 * 
	 * @param xmlContent
	 *            the xml string for which corresponding JDOM document is
	 *            needed.
	 * 
	 * @return the JDOM xml document that corresponds to the {@code xmlContent}.
	 * 
	 * @throws JDOMException
	 *             if there is any error while loading xml content
	 * 
	 * @throws IOException
	 *             if there is any error while loading xml content
	 */
	private static Document loadDocument(String xmlContent)
			throws JDOMException, IOException {
		SAXBuilder builder = new SAXBuilder();

		StringReader reader = new StringReader(xmlContent);
		return builder.build(reader);
	}
}
