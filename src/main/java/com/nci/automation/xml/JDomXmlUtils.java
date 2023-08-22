package com.nci.automation.xml;

import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.filter.ElementFilter;
import org.jdom2.filter.Filter;
import org.jdom2.input.SAXBuilder;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;
import com.nci.automation.xceptions.TestingException;

/**
 * This class contains JDOM api based xml utils.
 */
public class JDomXmlUtils {

    /**
     * This method retrieves the values based on given {@code xpath} from
     * {@code xmlConfigFilePath}.
     * 
     * @param xmlResourcePath
     *                        , the resource path of xml file, the resource path
     *                        means that we can get the InputStream of the xml
     *                        resource by using the method call some thing like this
     *                        Test.class.getResourceAsStream(resourcePath)
     * @param xpath
     *                        the xpath of the element/attribute whose values is
     *                        required.
     * 
     * @return the value of the element represented by the given {@code xPath
     * }
     * @throws TestingException
     *                          if there is any error while finding or reading the
     *                          xml represented by given {@code xmlResourcePath}
     *                          OR parsing the {@code xpath}
     * @throws IOException
     * @throws JDOMException
     */
    public static String getValueByXpathFromResourcePath(String xmlResourcePath, String xpath) throws TestingException,
            IOException {
        String xmlContent = getXMLContentFromResourcePath(xmlResourcePath);
        String value = getValueFromXMLString(xmlContent, xpath);
        return value;
    }

    public static String getXMLContentFromResourcePath(String xmlResourcePath) throws TestingException, IOException {
        Class<JDomXmlUtils> clazz = JDomXmlUtils.class;
        InputStream xmlInputStream = clazz.getResourceAsStream(xmlResourcePath);
        @SuppressWarnings("deprecation")
        String xmlContent = IOUtils.toString(xmlInputStream);
        return xmlContent;
    }

    /**
     * Return value for given {@code xPath}
     * 
     * NOTE: This method assumes that given {@code xPath} evaluates to a single
     * value in document {@code xmlContent}. If
     * xPath evaluation returns multiple values then this mehtod will return the
     * first one among them
     * 
     * @param xmlContent
     *                   the xml document.
     * 
     * @param xPath
     *                   the xpath expression is expected.
     * 
     * @return Returns the value corresponding to given {@code xPath} in xml
     *         document {@code xmlContent}
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
     * 
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
     * Returns the list of xml element corresponding to the given {@code xpath} in
     * the JDOM {@code xmlDocument}
     * 
     * @param xmlDocument
     *                    the JDOM document in which the element list to be
     *                    searched.
     * 
     * @param xpath
     *                    the xpath expression to be searched for.
     * 
     * @return Returns list of JDOM xml elements that matches given {@code xpath}
     *         expression in {@code xmlDocument}
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
     * This method loads and returns the xml document from the given
     * {@code xmlContent}
     * 
     * 
     * @param xmlContent
     *                   the xml string for which corresponding JDOM document is
     *                   needed.
     * 
     * @return the JDOM xml document that corresponds to the {@code xmlContent}.
     * 
     * @throws JDOMException
     *                       if there is any error while loading xml content
     * 
     * @throws IOException
     *                       if there is any error while loading xml content
     */
    private static Document loadDocument(String xmlContent) throws JDOMException, IOException {
        SAXBuilder builder = new SAXBuilder();

        StringReader reader = new StringReader(xmlContent);

        return builder.build(reader);
    }

}
