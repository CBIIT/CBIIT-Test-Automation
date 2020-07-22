package com.nci.automation.xml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.filter.ElementFilter;
import org.jdom2.filter.Filter;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;

import com.nci.automation.xceptions.TestingException;

/**
 * This class contains JDOM api based xml utils.
 */
public class JDomXmlUtils {

    private static final Logger logger = Logger.getLogger(JDomXmlUtils.class);

    /**
     * This method retrieves the values based on given {@code xpath} from {@code xmlConfigFilePath}.
     * 
     * @param xmlResourcePath
     *            , the resource path of xml file, the resource path means that we can get the InputStream of the xml
     *            resource by using the method call some thing like this Test.class.getResourceAsStream(resourcePath)
     * @param xpath
     *            the xpath of the element/attribute whose values is required.
     * 
     * @return the value of the element represented by the given {@code xPath
	 * }
     * @throws TestingException
     *             if there is any error while finding or reading the xml represented by given {@code xmlResourcePath}
     *             OR parsing the {@code xpath}
     * @throws IOException
     * @throws JDOMException
     */
    public static String getValueByXpathFromResourcePath(String xmlResourcePath, String xpath) throws TestingException,
            IOException {
        String xmlContent = getXMLContentFromResourcePath(xmlResourcePath);
        String value = getValueFromXMLString(xmlContent, xpath);
        return value;
    }

    public static Document getDocumentByResourcePath(String xmlResourcePath) throws TestingException {
        try {
            return loadDocument(getXMLContentFromResourcePath(xmlResourcePath));
        } catch (Exception e) {
            throw new TestingException(e);
        }
    }

    public static List<String> getAllValuesByXpathFromResourcePath(String xmlResourcePath, String xpath)
            throws TestingException, IOException {
        String xmlContent = getXMLContentFromResourcePath(xmlResourcePath);
        List<String> values = getAllValuesFromXMLString(xmlContent, xpath);
        return values;
    }
    
    public static String getXMLContentFromResourcePath(String xmlResourcePath) throws TestingException, IOException {
        Class<JDomXmlUtils> clazz = JDomXmlUtils.class;
        InputStream xmlInputStream = clazz.getResourceAsStream(xmlResourcePath);
		@SuppressWarnings("deprecation")
		String xmlContent = IOUtils.toString(xmlInputStream);
        return xmlContent;
    }

    /**
     * Removes element/elements represented by given {@code xPath}
     * 
     * @NOTE: Beaware this method will remove all the elements that matches the given xpath in the xmlcontent.
     * 
     * @param xmlContent
     *            the xml document.
     * 
     * @param xPath
     *            xPath of the element/elements that needs to be removed from the given {@code xmlContent}
     * 
     * @throws JDOMException
     *             if there is any error while parsing the xml for the xpath.
     * 
     */
    public static String removeContent(String xmlContent, String xPath) throws JDOMException, IOException {
        Document xmlDoc = loadDocument(xmlContent);
        List<Element> elementList = getElementListFromXmlDoc(xmlDoc, xPath);
        removeElements(elementList);
        XMLOutputter outputWriter = new XMLOutputter();
        outputWriter.setFormat(Format.getPrettyFormat());
        StringWriter stringWriter = new StringWriter();
        outputWriter.output(xmlDoc, stringWriter);
        return stringWriter.toString();
    }

    private static void removeElements(List<Element> childElements) {
        Element parent = null;
        if (childElements != null && !childElements.isEmpty()) {
            parent = childElements.get(0).getParentElement();
        }
        if (parent != null) {
            for (Element child : childElements) {
                parent.removeContent(child);
            }
        }
    }

    /**
     * This method will set the given {@code text} to the xml elements that matches the given xpath expression with in
     * the given {@code xmlContent}.
     * 
     * @param xmlContent
     *            The xml string to whose matching elements the will have to be set with the text.
     * 
     * @parma xPath the xpath expression to find the elements to set the text.
     * 
     * @param text
     *            the text
     * 
     */
    public static String setElementText(String xmlContent, String xPath, String text) throws JDOMException, IOException {
        Document xmlDoc = loadDocument(xmlContent);

        List<Element> elementList = getElementListFromXmlDoc(xmlDoc, xPath);

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
     * Returns the list of elements that matches the given {@code xPath expression} with in the parent {@code context}
     * 
     * @param context
     *            the xml element with in which xPath expression will be evaluated.
     * 
     * @param xPath
     *            the xPath expression
     * 
     * @return Returns the list of xml elements that matches the given {@code xPath} expression in the given element
     */
    public static String getValueFromXmlElement(Element context, String xPath) {
        XPathFactory xPathFactory = XPathFactory.instance();
        Filter<Element> elementFilter = new ElementFilter();

        XPathExpression<Element> xPathExpression = xPathFactory.compile(xPath, elementFilter);
        List<Element> elements = xPathExpression.evaluate(context);

        String elementValue = "";

        if (!elements.isEmpty()) {
            Element element = elements.get(0);

            if (element != null) {
                elementValue = element.getText();
            }
        }

        return elementValue;
    }

    /**
     * Return value for given {@code xPath}
     * 
     * NOTE: This method assumes that given {@code xPath} evaluates to a single value in document {@code xmlContent}. If
     * xPath evaluation returns multiple values then this mehtod will return the first one among them
     * 
     * @param xmlContent
     *            the xml document.
     * 
     * @param xPath
     *            the xpath expression is expected.
     * 
     * @return Returns the value corresponding to given {@code xPath} in xml document {@code xmlContent}
     * @throws TestingException
     */
    public static String getValueFromXMLString(String xmlContent, String xPath) throws TestingException {
        String valueAtXpath = "";

        try {
            Document xmlDoc = loadDocument(xmlContent);

            valueAtXpath = StringUtils.trimToNull(getValueFromXMLDoc(xmlDoc, xPath));
        } catch (JDOMException jdomException) {
            String errMsg = "JDOM Error parsing value for xpath: " + xPath + " in the xml: \n"
                    + StringUtils.substring(xmlContent, 0, 1000) + "...";
            throw new TestingException(errMsg, jdomException);
        } catch (IOException ioException) {
            String errMsg = "IO Error loading the xml : \n" + StringUtils.substring(xmlContent, 0, 1000) + "...";
            throw new TestingException(errMsg, ioException);
        }

        return valueAtXpath;
    }
    /**
     * Returns the text value of a given xpath from a Document object
     * @param xPath
     * @param xmlDoc
     * @return
     */
    public static String getValueFromXMLDoc(Document xmlDoc, String xPath) {
        List<Element> elementList = getElementListFromXmlDoc(xmlDoc, xPath);

        String value = "";
        if (!elementList.isEmpty()) {
            value = elementList.get(0).getText();
        }
        return value;
    }

    /**
     * Returns all text values of a given xpath from a Document object
     * @param xPath
     * @param xmlDoc
     * @return
     * @throws TestingException
     */
    public static List<String> getAllValuesFromXMLFile(File xmlFile, String xPath) throws TestingException {
        Document xmlDoc = loadDocument(xmlFile);

        List<Element> elementList = getElementListFromXmlDoc(xmlDoc, xPath);

        List<String> values = new ArrayList<String>();

        for (Element element : elementList) {
            values.add(element.getText());
        }
        return values;
    }

    public static List<String> getAllValuesFromXMLString(String xmlContent, String xPath) throws TestingException {
        try {
            return getAllValuesFromXMLDocument(loadDocument(xmlContent), xPath);
        } catch (Exception e) {
            throw new TestingException(e);
        }

    }

    /**
     * Returns all text values of a given xpath from an XML String
     * @param xPath
     * @param xmlDoc
     * @return
     * @throws TestingException
     */
    public static List<String> getAllValuesFromXMLDocument(Document xmlDoc, String xPath) throws TestingException {
        List<Element> elementList = getElementListFromXmlDoc(xmlDoc, xPath);
        List<String> values = new ArrayList<String>();
        for (Element element : elementList) {
            values.add(element.getText());
        }
        return values;
    }

    /**
     * Returns the root element of the xml document represented by given {@code xmlContent}
     * 
     * @param xmlContent
     *            the xmlContent whose root element is required.
     * 
     * @returns Returns the root element as described above. It will return null if some reason there if the content is
     *          not loaded into the document.
     * 
     * @throws JDOMException
     *             If there is any error while parsing the xml
     * 
     * @throws IOException
     *             If there is any error while accessing the content.
     */
    public static Element getRootElement(String xmlContent) throws JDOMException, IOException {
        Element rootElement = null;
        Document xmlDoc = loadDocument(xmlContent);

        if (xmlDoc != null) {
            xmlDoc.getRootElement();
        }

        return rootElement;
    }

    /**
     * Returns the list of xml elements that matches the given {@code xPath} expression.
     * 
     * @param xmlContent
     *            the xml String against which the {@code xPath} will be evaluated
     * 
     * @param xPath
     *            the xpath expression.
     * 
     * @returns Returns matching elements as described above.
     */
    public static List<Element> getXmlElementList(String xmlContent, String xPath) throws JDOMException, IOException {
        Document xmlDoc = loadDocument(xmlContent);

        return getElementListFromXmlDoc(xmlDoc, xPath);
    }

    /**
     * Returns the list of matching xml elements from given {@code xmlFile}.
     * 
     * @param xmlFile
     *            the xml file in against which the {@code xPath} will be evaluated.
     * 
     * @param xPath
     *            the xpath expression.
     * 
     * @return Returs the list of elements that matches the given {@code xPath} expression
     * @throws TestingException
     */
    public static List<Element> getXmlElementList(File xmlFile, String xPath) throws TestingException {
        Document xmlDoc = loadDocument(xmlFile);

        return getElementListFromXmlDoc(xmlDoc, xPath);
    }

    /**
     * Returns the list of elements that matches the given {@code xPath expression} with in the parent {@code context}
     * 
     * @param context
     *            the xml element with in which xPath expression will be evaluated.
     * 
     * @param xPath
     *            the xPath expression
     * 
     * @return Returns the list of xml elements that matches the given {@code xPath} expression in the given element
     */
    public static List<Element> getXmlElementList(Element context, String xPath) {
        XPathFactory xPathFactory = XPathFactory.instance();
        Filter<Element> elementFilter = new ElementFilter();

        XPathExpression<Element> xPathExpression = xPathFactory.compile(xPath, elementFilter);
        List<Element> elements = xPathExpression.evaluate(context);

        return elements;
    }

    /**
     * Returns the list of element values that matches the given {@code xPath expression} with in the parent
     * {@code context}.
     * 
     * NOTE:This method assumes this result elements are leaf elements and contains text value.
     * 
     * @param context
     *            the xml element with in which xPath expression will be evaluated.
     * 
     * @param xPath
     *            the xPath expression
     * 
     * @return Returns the list of xml elements that matches the given {@code xPath} expression in the given element
     */
    public static List<String> getXmlElementValueList(Element context, String xPath) {
        XPathFactory xPathFactory = XPathFactory.instance();
        Filter<Element> elementFilter = new ElementFilter();

        XPathExpression<Element> xPathExpression = xPathFactory.compile(xPath, elementFilter);
        List<Element> elements = xPathExpression.evaluate(context);

        List<String> elementValueList = new ArrayList<String>();

        for (Element element : elements) {
            elementValueList.add(element.getText());
        }

        return elementValueList;
    }

    /**
     * Returns the list of xml element corresponding to the given {@code xpath} in the JDOM {@code xmlDocument}
     * 
     * @param xmlDocument
     *            the JDOM document in which the element list to be searched.
     * 
     * @param xpath
     *            the xpath expression to be searched for.
     * 
     * @return Returns list of JDOM xml elements that matches given {@code xpath} expression in {@code xmlDocument}
     * 
     */
    public static List<Element> getElementListFromXmlDoc(Document xmlDocument, String xpath) {
        XPathFactory xPathFactory = XPathFactory.instance();
        Filter<Element> elementFilter = new ElementFilter();
        XPathExpression<Element> xPathExpression = xPathFactory.compile(xpath, elementFilter);
        List<Element> elements = xPathExpression.evaluate(xmlDocument);

        return elements;
    }

    /**
     * Loads the content from given {@code xmlFile} into the JDOM document
     * 
     * @param xmlFile
     *            the xml file for which corresponding JDOM document is needed.
     * 
     * @return the JDOM xml document that corresponds to the {@code xmlFile}.
     * @throws TestingException
     * 
     * @throws JDOMException
     *             if there is any error while loading xml content
     * 
     * @throws IOException
     *             if there is any error while loading xml content
     */
    private static Document loadDocument(File xmlFile) throws TestingException {
        SAXBuilder builder = new SAXBuilder();
        try {
            return builder.build(xmlFile);
        } catch (JDOMException e) {
            throw new TestingException("Exception when loading a document from a File");
        } catch (IOException e) {
            throw new TestingException("Exception when loading a document from a File");
        }
    }

    /**
     * This method loads and returns the xml document from the given {@code xmlContent}
     * 
     * 
     * @param xmlContent
     *            the xml string for which corresponding JDOM document is needed.
     * 
     * @return the JDOM xml document that corresponds to the {@code xmlContent}.
     * 
     * @throws JDOMException
     *             if there is any error while loading xml content
     * 
     * @throws IOException
     *             if there is any error while loading xml content
     */
    private static Document loadDocument(String xmlContent) throws JDOMException, IOException {
        SAXBuilder builder = new SAXBuilder();

        StringReader reader = new StringReader(xmlContent);

        return builder.build(reader);
    }

}
