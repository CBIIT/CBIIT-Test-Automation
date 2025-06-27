package CHARMS.utils;

import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import APPS_COMMON.Pages.NativeView_SideDoor_Dashboard_Page;
import APPS_COMMON.Utils.ServiceNow_Common_Methods;
import APPS_COMMON.Utils.ServiceNow_Login_Methods;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.TestProperties;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.ExcelReader;
import com.nci.automation.web.WebDriverUtils;
import static APPS_COMMON.PageInitializers.PageInitializer.oktaLoginPage;
import static APPS_COMMON.PageInitializers.PageInitializer.testAccountResetPage;
import static APPS_COMMON.Pages.Selenium_Common_Locators.locateByXpath;
import static CHARMS.steps.RAS_Common_Methods.softAssertDropDownValueIsSelected;
import static Hooks.Hooks.softAssert;

/* @author SONIKA JAIN */
public class CharmsUtil {
    /* Excel Data Reader */
    public static Map<String, String> testManagerData(String excelSheet, String sheet, int rowNum) {
        ExcelReader excelReader = new ExcelReader();
        Map<String, String> currentRow = null;
        try {
            List<Map<String, String>> excelDataMapList = excelReader.getDataIOStream(excelSheet, sheet);
            currentRow = excelDataMapList.get(rowNum);
        } catch (InvalidFormatException | IOException e) {
            e.printStackTrace();
        }
        return currentRow;
    }

    /** @SonikaJain @param webElement:Element to be highlighted */
    public static void labelHighlight(WebElement webElement) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) WebDriverUtils.webDriver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red')", webElement);
    }

    /** @SonikaJain @param webElement:Element to be Unhighlighted */
    public static void labelUnHighlight(WebElement webElement) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) WebDriverUtils.webDriver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:none; background:white')", webElement);
    }

    /** @SonikaJain @param webElement:Element to be clicked to avoid the exception */
    public static void clickOnElement(WebElement webElement) {
        CharmsUtil.labelHighlight(webElement);
        int count = 0;
        while (count < 5) {
            try {
                webElement.click();
                CommonUtils.sleep(800);
                break;
            } catch (WebDriverException ex) {
                CommonUtils.sleep(2000);
                count++;
            }
        }
    }

    /** @SonikaJain @param webElement:Element to be clicked to avoid the exception */
    public static void clickOnRadioButtonElement(WebElement webElement) {
        CharmsUtil.labelHighlight(webElement);
        int count = 0;
        while (count < 5) {
            try {
                webElement.click();
                CommonUtils.sleep(500);
                break;
            } catch (WebDriverException ex) {
                CommonUtils.sleep(2000);
                count++;
            }
        }
    }

    /** @SonikaJain @param webElement:USE THIS METHOD TO SEND KEYS TO STALE ELEMENTS */
    public static void sendKeysToElement(WebElement webElement, String text) {
        int count = 0;
        while (count < 5) {
            try {
                CharmsUtil.labelHighlight(webElement);
                webElement.sendKeys(text);
                CommonUtils.sleep(500);
                break;
            } catch (WebDriverException ex) {
                CommonUtils.sleep(2000);
                count++;
            }
        }
    }

    /** @SonikaJain @param webElement:Element to be Verified */
    public static void assertCheckBox(SoftAssert softAssert, WebElement webElement, boolean expectedValue,
                                      String message) {
        CharmsUtil.labelHighlight(webElement);
        boolean actualValue = webElement.isSelected();
        softAssert.assertEquals(actualValue, expectedValue, "Assertion Failed for" + message + "-->");
    }

    /** @SonikaJain @param webElement:Button Label to be Verified */
    public static void assertButtonLabel(SoftAssert softAssert, WebElement webElement, String expectedValue, String message) {
        CharmsUtil.labelHighlight(webElement);
        String actualValue = webElement.getText();
        softAssert.assertEquals(actualValue, expectedValue, "Assertion Failed for" + message + "-->");
    }

    /** @SonikaJain @param webElement:Button Label to be Verified */
    public static void assertButtonLabelWithSpace(SoftAssert softAssert, WebElement webElement, String expectedValue, String messsage) {
        CharmsUtil.labelHighlight(webElement);
        String actualValue = webElement.getText();
        String actualValueWithSpace = actualValue.trim();
        if (expectedValue == null) {
            expectedValue = "";
        }
        softAssert.assertEquals(actualValueWithSpace, expectedValue, "Assertion Failed for" + messsage + "-->");
    }

    public static boolean compareValues(WebElement webElement, String expectedValue) {
        CharmsUtil.labelHighlight(webElement);
        String actualValue = webElement.getText();
        String actualValueWithSpace = actualValue.trim();
        if (expectedValue == null) {
            expectedValue = "";
        }
        if (actualValueWithSpace.equals(expectedValue)) {
            return true;
        }
        return false;
    }

    /** @SonikaJain webElement:A text box to be Verified */
    public static void assertTextBoxData(SoftAssert softAssert, WebElement webElement, String expectedValue, String message) {
        CharmsUtil.labelHighlight(webElement);
        CommonUtils.sleep(300);
        String actualValue = null;
        if (webElement.getAttribute("value") != null) {
            actualValue = webElement.getAttribute("value");
            actualValue = actualValue.trim();
        } else {
            actualValue = webElement.getText();
            actualValue = actualValue.trim();
        }
        softAssert.assertEquals(actualValue, expectedValue, "Assertion Failed for" + message + "-->");
    }

    /** @SonikaJain webElement:A text box to be Verified */
    public static void assertTextBoxDataSelected(SoftAssert softAssert, WebElement webElement, String expectedValue, String message) {
        CharmsUtil.labelHighlight(webElement);
        CommonUtils.sleep(300);
        String actualValue = null;
        if (webElement.getAttribute("value") != null) {
            actualValue = webElement.getAttribute("value");
        } else {
            actualValue = webElement.getText();
        }
        softAssert.assertEquals(actualValue, expectedValue, "Assertion Failed for" + message + "-->");
    }

    /** @SonikaJain webElement:A DropDown value to be Verified */
    public static void assertDropDownData(SoftAssert softAssert, WebElement webElement, String expectedValue, String message) {
        CharmsUtil.labelHighlight(webElement);
        CommonUtils.sleep(200);
        Select select = new Select(webElement);
        String actualValue = select.getFirstSelectedOption().getText(); // getFirstSelectedOption() returns the selected
        // option in the dropdown.
        if (expectedValue == "Don't know") {
            expectedValue = "Unknown/Unsure";
        }
        softAssert.assertEquals(actualValue, expectedValue, "Assertion Failed for" + message + "-->");
    }

    /** @SonikaJain webElement:Compare Actual results */
    public static void compareExpectedActualValue(SoftAssert softAssert, WebElement webElement, String expectedValue, String message) {
        CharmsUtil.labelHighlight(webElement);
        Select select = new Select(webElement);
        String actualValue = select.getFirstSelectedOption().getText(); // getFirstSelectedOption() returns the selected
        softAssert.assertEquals(actualValue, expectedValue, "Assertion Failed for" + message + "-->");
    }

    /** @SonikaJain Method to select a value from the Drop down List */
    public static boolean selectDropDownValue(WebElement webElement, String selectedValue) {
        CharmsUtil.labelHighlight(webElement);
        CharmsUtil.clickOnElement(webElement);
        CommonUtils.sleep(600);
        Select dropDown = new Select(webElement);
        List<WebElement> e = dropDown.getOptions();
        int itemCount = e.size();
        for (int l = 0; l < itemCount; l++) {
            if (e.get(l).getText().equals(selectedValue)) {
                try {
                    CharmsUtil.labelHighlight(e.get(l));
                    e.get(l).click();
                    CommonUtils.sleep(800);
                } catch (Exception ex) {
                    CommonUtils.sleep(2000);
                    e.get(l).click();
                }
                return true;
            }
        }
        return false;
    }

    public static void clickAutoPopulatedReference(WebElement webElement, List<String> referenceElements, String dropDownValue) {
        CharmsUtil.labelHighlight(webElement);
        CharmsUtil.clickOnElement(webElement);
        CommonUtils.sleep(500);
        WebElement select2ElementResults = WebDriverUtils.webDriver
                .findElement(By.xpath("s2id_sp_formfield_other_biological_parent_partner"));
    }

    public static void SelectValueFromDropDown(WebElement webElement, List<String> dropdownList, String dropDownValue) {
        CharmsUtil.clickOnElement(webElement);
        WebElement select2ElementResults = WebDriverUtils.webDriver
                .findElement(By.xpath("//div[@id='select2-drop']/ul[@class='select2-results']"));
        List<WebElement> selectResultsAsListCollection = select2ElementResults.findElements(By.tagName("li"));
        int size = dropdownList.size();
        if (selectResultsAsListCollection.size() < size) {
            size = selectResultsAsListCollection.size();
        }
        CucumberLogUtils.logScreenshot();
        for (int i = 0; i < size; i++) {
            String options = selectResultsAsListCollection.get(i).getText();
            if (options.equals(dropDownValue)) {
                CommonUtils.sleep(600);
                selectResultsAsListCollection.get(i).click();
                CommonUtils.sleep(600);
                break;
            }
        }
    }

    /** @SonikaJain Method to select a value from the Radio Button List */
    public static boolean selectRadioButtonValue(List<WebElement> radioButtonList, String selectedValue) {
        int itemCount = radioButtonList.size();
        for (int l = 0; l < itemCount; l++) {
            if (radioButtonList.get(l).getText().equals(selectedValue)) {
                try {
                    CharmsUtil.labelHighlight(radioButtonList.get(l));
                    radioButtonList.get(l).click();
                    CommonUtils.sleep(200);
                } catch (Exception ex) {
                    radioButtonList.get(l).click();
                    CommonUtils.sleep(2000);
                }
                return true;
            }
        }
        return false;
    }

    /** @SonikaJain @param webElement: Method to compare the expected Value to the actual value
     * and then adding in to the Comparison Results list and then adding that list
     * to the final Component Test Result */
    public static ComponentTestResult verifyLabel(WebElement webElement, String expectedValue) {
        CharmsUtil.labelHighlight(webElement);
        CommonUtils.sleep(100);
        String result = "PASSED";
        List<ComparisionResult> comparisionResultList = new ArrayList<ComparisionResult>();
        String actualValue = webElement.getText();
        try {
            Assert.assertTrue(actualValue.equals(expectedValue));
        } catch (AssertionError ae) {
            result = "FAILED";
            ComparisionResult comparisionResult = new ComparisionResult(actualValue, expectedValue, "FAILED");
            comparisionResultList.add(comparisionResult);
        }
        CommonUtils.sleep(100);
        ComponentTestResult componentTestResult = new ComponentTestResult();
        componentTestResult.setComparisionResultList(comparisionResultList);
        componentTestResult.setComponentResult(result);
        return componentTestResult;
    }

    /** @SonikaJain @param webElement:WebElement is Actual value, List is the Expected Dropdown list.
     * @return ComponentTestResult:Comparison results list for each option (actual
     * v.s. expected) */
    public static ComponentTestResult verifyDropDowns(WebElement webElement, List<String> list) {
        CharmsUtil.labelHighlight(webElement);
        CommonUtils.sleep(100);
        String result = "PASSED";
        List<ComparisionResult> comparisionResultList = new ArrayList<ComparisionResult>();
        Select select = new Select(webElement);
        List<WebElement> dropDownOptions = select.getOptions();
        int size = list.size();
        if (dropDownOptions.size() < size) {
            size = dropDownOptions.size();
        }
        for (int i = 0; i < dropDownOptions.size(); i++) {
            String options = dropDownOptions.get(i).getText();
            try {
                Assert.assertTrue(options.equals(list.get(i)));
            } catch (AssertionError ae) {
                result = "FAILED";
                ComparisionResult comparisionResult = new ComparisionResult(options, list.get(i), "FAILED");
                comparisionResultList.add(comparisionResult);
            }
            CommonUtils.sleep(500);
        }
        CharmsUtil.labelUnHighlight(webElement);
        ComponentTestResult componentTestResult = new ComponentTestResult();
        componentTestResult.setComparisionResultList(comparisionResultList);
        componentTestResult.setComponentResult(result);
        return componentTestResult;
    }

    /** @SonikaJain @param webElement:WebElement compared to the expected Dropdown values
     * @param dropdownList: Expected Dropdown list
     * @param dropdownSelectedIndex:The Dropdown selected index @return */
    public static ComponentTestResult verifySelect2DropDowns(WebElement webElement, List<String> dropdownList,
                                                             int dropdownSelectedIndex) {
        CharmsUtil.labelHighlight(webElement);
        CommonUtils.sleep(500);
        webElement.click();
        String result = "PASSED";
        WebElement select2ElementResults = WebDriverUtils.webDriver
                .findElement(By.xpath("//div[@id='select2-drop']/ul[@class='select2-results']"));
        List<WebElement> selectResultsAsListCollection = select2ElementResults.findElements(By.tagName("li"));
        int size = dropdownList.size();
        List<ComparisionResult> comparisionResultList = new ArrayList<ComparisionResult>();
        if (selectResultsAsListCollection.size() < size) {
            size = selectResultsAsListCollection.size();
        }
        for (int i = 0; i < size; i++) {
            String options = selectResultsAsListCollection.get(i).getText();
            try {
                Assert.assertTrue(options.equals(dropdownList.get(i)));
            } catch (AssertionError ae) {
                result = "FAILED";
                ComparisionResult comparisionResult = new ComparisionResult(options, dropdownList.get(i), "FAILED");
                comparisionResultList.add(comparisionResult);
            }
        }
        selectResultsAsListCollection.get(dropdownSelectedIndex).click();
        ComponentTestResult componentTestResult = new ComponentTestResult();
        componentTestResult.setComparisionResultList(comparisionResultList);
        componentTestResult.setComponentResult(result);
        return componentTestResult;
    }

    /** @SonikaJain @param webElement:WebElement is Actual value, String is the Expected value.
     * @return ComponentTestResult:Comparison results list for each option (actual
     * v.s. expected) */
    public static ComponentTestResult assertTextBoxDataV(WebElement webElement, String expectedValue) {
        CharmsUtil.labelHighlight(webElement);
        CommonUtils.sleep(500);
        String result = "PASSED";
        List<ComparisionResult> comparisionResultList = new ArrayList<ComparisionResult>();
        String actualValue = null;
        if (webElement.getAttribute("value") != null) {
            actualValue = webElement.getAttribute("value");
        } else {
            actualValue = webElement.getText();
        }
        try {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertEquals(actualValue, expectedValue, "Value is Matching");
            System.out.println("Assertion Passed:" + actualValue + "is equal to " + expectedValue);
        } catch (AssertionError ae) {
            result = "FAILED";
            ComparisionResult comparisionResult = new ComparisionResult(actualValue, expectedValue, "FAILED");
            comparisionResultList.add(comparisionResult);
        }
        CommonUtils.sleep(500);
        ComponentTestResult componentTestResult = new ComponentTestResult();
        componentTestResult.setComparisionResultList(comparisionResultList);
        componentTestResult.setComponentResult(result);
        return componentTestResult;
    }

    /** Validates the input field element in the RAS Survey within Native View against the expected value using SoftAssert, and displays an error message if the validation fails.	 *
     * @param inputFieldElm the WebElement input field element to verify
     * @param expectedValue the expected value to compare with the input field element's value attribute
     * @param errorMessage  the error message to throw in case of assertion failure
     */
    public static void verifyInputField(WebElement inputFieldElm, String expectedValue, String errorMessage) {
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(inputFieldElm), expectedValue, errorMessage);
    }

    /** Validates the checkbox element in the RAS Survey within Native View by comparing its actual value with the value attribute of the checkbox element.	 *
     * @param expectedCheckboxValue the expected value to compare with the checkbox element's value attribute
     * @param checkBoxElm           the WebElement representing the checkbox element to verify
     * @param errorMessage          the error message to throw if the verification fails
     */
    public static void verifyCheckbox(String expectedCheckboxValue, WebElement checkBoxElm, String errorMessage) {
        softAssert.assertEquals(expectedCheckboxValue, CommonUtils.getAttributeValueOfValueAttribute(checkBoxElm), errorMessage);
    }

    /** RAS Survey Native View - Converts the text content of a WebElement to a list of strings.
     * @param webElement the WebElement containing the text to be processed
     * @return a List of strings extracted from the text content of the WebElement, separated by commas and excluding content within parentheses
     */
    public static List<String> textToList(WebElement webElement) {
        List<String> output = new ArrayList<>();
        StringBuilder currentItem = new StringBuilder();
        int openParentheses = 0;
        for (char c : webElement.getText().toCharArray()) {
            if (c == ',' && openParentheses == 0) {
                output.add(currentItem.toString().trim());
                currentItem.setLength(0);
            } else {
                if (c == '(') {
                    openParentheses++;
                } else if (c == ')') {
                    openParentheses--;
                }
                currentItem.append(c);
            }
        }
        if (currentItem.length() > 0) {
            output.add(currentItem.toString().trim());
        }
        return output;
    }

    /** RAS Survey Native View - Converts inches to centimeters.
     * @param inches a String representation of the length in inches to be converted
     * @return a String representing the length converted from inches to centimeters
     */
    public static String inchToCm(String inches) {
        return String.valueOf((int) Math.floor(Integer.parseInt(inches) * 2.54));
    }

    /** RAS Survey Native View - Sorts and compares two lists of string values in a case-insensitive manner.
     * @param actualListValues   the list of actual string values to be sorted and compared
     * @param expectedListValues the list of expected string values to be sorted and compared
     * @return true if the sorted actualListValues is equal to the sorted expectedListValues, false otherwise
     */
    public static boolean sortAndCompareLists(List<String> actualListValues, List<String> expectedListValues) {
        Collections.sort(actualListValues);
        Collections.sort(expectedListValues);
        System.out.println("Actual: " + actualListValues);
        System.out.println("Expected: " + expectedListValues);
        return actualListValues.equals(expectedListValues);
    }

    /** RAS Survey Native View - Converts the text content of a WebElement to a list of strings.
     * @param webElement the WebElement containing the text to be processed
     * @return a List of strings extracted from the text content of the WebElement, separated by commas and excluding content within parentheses
     */
    public static List<String> textToListHyphenated(WebElement webElement) {
        List<String> output = new ArrayList<>();

        String regex = "(\\b[^,]+? - .*?)(?=, [^,]+? -|, Other \\(please specify\\)|$)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(webElement.getText());
        while (matcher.find()) {
            output.add(matcher.group(1).trim());
        }
        return output;
    }

    /**RAS Survey Native View - Clicks on the tab with the specified tabName.
     * @param tabName the name of the tab that needs to be clicked
     */
    public static void clickTab(String tabName) {
        CommonUtils.sleep(500);
        CommonUtils.waitForVisibility(locateByXpath("//span[contains(text(), '" + tabName + "') and @class='tab_caption_text']"));
        JavascriptUtils.scrollIntoView(locateByXpath("//span[contains(text(), '" + tabName + "') and @class='tab_caption_text']"));
        JavascriptUtils.clickByJS(locateByXpath("//span[contains(text(), '" + tabName + "') and @class='tab_caption_text']"));
    }

    /** RAS Survey Native View - Opens a related list record by providing the record name as a parameter.
     * @param recordName the name of the record to be opened in the related list
     */
    public static void openRelatedListRecord(String recordName) {
        try {
            CommonUtils.hoverOverElement(locateByXpath("//td[@class='list_decoration_cell col-small col-center ']//a[contains(@aria-label, '" + recordName + "')]"));
            JavascriptUtils.clickByJS(locateByXpath("//td[@class='list_decoration_cell col-small col-center ']//a[contains(@aria-label, '" + recordName + "')]"));
        } catch (Exception e) {
            locateByXpath("//span[@class='vcr_controls_bottom']//button[@aria-label='Next page' and @name='vcr_next' and not(contains(@class, 'disabled'))]").click();
            CommonUtils.sleep(800);
            CommonUtils.hoverOverElement(locateByXpath("//td[@class='list_decoration_cell col-small col-center ']//a[contains(@aria-label, '" + recordName + "')]"));
            JavascriptUtils.clickByJS(locateByXpath("//td[@class='list_decoration_cell col-small col-center ']//a[contains(@aria-label, '" + recordName + "')]"));
        } finally {
            CommonUtils.sleep(800);
            CommonUtils.waitForClickability(locateByXpath("//a[normalize-space()='Open Record']"));
            JavascriptUtils.clickByJS(locateByXpath("//a[normalize-space()='Open Record']"));
            CommonUtils.sleep(800);
        }
    }

    /** RAS Survey Native View - Asserts the test type by comparing the expected test type with the value attribute of the corresponding input field element.
     * @param expectedTestType the expected test type to compare with the actual value of the input field
     */
    public static void assertTestType(String expectedTestType) {
        softAssert.assertEquals(expectedTestType, locateByXpath("//span[normalize-space()='Test type']/parent::label/parent::div/following-sibling::div/input[2]").getDomAttribute("value"), "* * * * * RAS SURVEY MISMATCH IN \"Test type\" INPUT FIELD * * * * *");
    }


    /** RAS Survey Native View - Asserts the test result in a dropdown element by using a soft assertion to verify that the expected test result is selected.
     * @param expectedTestResult The expected test result to be selected in the dropdown element.
     */
    public static void assertTestResult(String expectedTestResult) {
        softAssertDropDownValueIsSelected(locateByXpath("//span[normalize-space()='Test result']/parent::label/parent::div/following-sibling::div//select"), expectedTestResult, "* * * * * RAS SURVEY MISMATCH IN \"Test result\" DROP DOWN * * * * *");
    }

    /** RAS Survey Native View - Asserts the specified text against the "Please Specify" field in the RAS Survey dropdown.
     * @param expectedText the text to be asserted against the "Please Specify" field
     */
    public static void assertPleaseSpecifyField(String expectedText) {
        verifyInputField(locateByXpath("//span[normalize-space()='Please Specify']/parent::label/parent::div/following-sibling::div/div/input"), expectedText, "* * * * * RAS SURVEY MISMATCH IN \"Please Specify\" DROP DOWN * * * * *");
    }

    /**RAS Survey Native View - Verifies the prenatal test history by opening the related list record and asserting the expected test type and result.
     * @param expectedTestType   The expected type of the prenatal test to be verified.
     * @param expectedTestResult The expected result of the prenatal test to be verified.
     */
    public static void verifyPrenatalTestHistory(String expectedTestType, String expectedTestResult) {
        openRelatedListRecord(expectedTestType);
        assertTestType(expectedTestType);
        assertTestResult(expectedTestResult);
        CucumberLogUtils.logScreenshot();
        JavascriptUtils.clickByJS(locateByXpath("//button[@title='Back']"));
        CommonUtils.sleep(800);
    }

    /**
     * Looks up a value in a reference field within a web page.
     *
     * @param referenceField the WebElement representing the reference field to interact with
     * @param columnName     the name of the column where the value will be searched
     * @param value          the value to search for in the specified column
     */
    public static void lookUpInReferenceField(WebElement referenceField, String columnName, String value) {
        WebElement column;
        String currentWindow = WebDriverUtils.webDriver.getWindowHandle();
        Set<String> allWindows = WebDriverUtils.webDriver.getWindowHandles();
        for (String window : allWindows) {
            if (!window.equals(currentWindow)) {
                WebDriverUtils.webDriver.switchTo().window(window).close();
            }
        }
        WebDriverUtils.webDriver.switchTo().window(currentWindow);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
        JavascriptUtils.clickByJS(referenceField);
        CommonUtils.sleep(800);
        CommonUtils.switchToAnotherTabWindow();
        column = locateByXpath("//input[@aria-label='Search column: " + columnName + "']");
        column.sendKeys(value);
        column.sendKeys(Keys.ENTER);
        locateByXpath("(//a[@role='button'][normalize-space()='" + value + "'])[1]").click();
        WebDriverUtils.webDriver.switchTo().window(currentWindow);
        CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
    }

    /**
     * Converts a given date of birth from the format "Month day, year" to the "mm/dd/yyyy" format.
     *
     * @param dateOfBirth the date of birth string to be converted, formatted as "Month day, year" (e.g., "April 1, 1990").
     * @return the converted date string in the "MM/dd/yyyy" format (e.g., "04/01/1990").
     */
    public static String convertDOBToMMddyyyyFormat(String dateOfBirth) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        LocalDate date = LocalDate.parse(dateOfBirth, inputFormatter);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return date.format(outputFormatter);
    }

    /**
     * Calculates the age of a participant based on their birthday in "Month day, year" format
     *
     * @param birthday the participant's birthday in format "October 31, 2012"
     * @return the age in years as an integer
     */
    public static int calculateAge(String birthday) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
            LocalDate birthDate = LocalDate.parse(birthday.trim(), formatter);

            LocalDate currentDate = LocalDate.now();
            if (birthDate.isAfter(currentDate)) {
                throw new IllegalArgumentException("Birthday cannot be in the future");
            }
            return Period.between(birthDate, currentDate).getYears();
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid date format. Expected format: 'Month day, year' (e.g., 'October 31, 2012')", e);
        }
    }

    /** @SonikaJain Login to NativeView
     */
    public static void loginToNativeView() {
        ServiceNow_Login_Methods.nativeViewSideDoorLogin();
        CucumberLogUtils.logScreenshot();
    }

    /** @SonikaJain Login to NativeView to run the reset accounts script for the Fanconi screener accounts
     *    * @param testURL The Test URL for the expected reset script.
     *      * @param devURL The Dev URL for the expected reset script.
     */
    public static void resetTestAccountSignIn( String testURL, String devURL) {
        if (TestProperties.ENV.equals("test")) {
            WebDriverUtils.webDriver.get(testURL);
            CucumberLogUtils.logScreenshot();
            CommonUtils.sleep(1800);
        } else if (TestProperties.ENV.equals("dev2")) {
            WebDriverUtils.webDriver.get(devURL);
            CucumberLogUtils.logScreenshot();
            CommonUtils.sleep(1800);
        }
    }

    /** @SonikaJain  Login to the NativeView and run the reset accounts script for the Fanconi screener accounts
     */
    public static void resetTestAccount() {
        if (TestProperties.ENV.equals("test")) {
            CommonUtils.sleep(100);
            CommonUtils.switchToFrame(NativeView_SideDoor_Dashboard_Page.nativeViewiFrame);
            CommonUtils.waitForVisibility(testAccountResetPage.nativeViewRunFixScriptButton);
            testAccountResetPage.nativeViewRunFixScriptButton.click();
            CommonUtils.sleep(800);
            CommonUtils.waitForVisibility(testAccountResetPage.nativeViewProceedInBackgroundButton);
            testAccountResetPage.nativeViewProceedInBackgroundButton.click();
            CommonUtils.sleep(800);
            CommonUtils.waitForVisibility(testAccountResetPage.nativeViewCloseButton);
            testAccountResetPage.nativeViewCloseButton.click();
        }
    }

    /** @SonikaJain  LogOut of the account profile in NativeView
     */
    public static void nativeViewProfileLogOut() {
        ServiceNow_Common_Methods.logOutOfNativeView();
        CommonUtils.sleep(800);
    }

    /** @SonikaJain  login To Study Page Using Username And Password in NativeView
     */
    public static void loginToStudyPageUsingUsernameAndPassword(String username, String password) {
        CommonUtils.waitForVisibility(oktaLoginPage.enrollLoginButton);
        CharmsUtil.clickOnElement(oktaLoginPage.enrollLoginButton);
        CharmsUtil.sendKeysToElement(oktaLoginPage.usernameTxtBox, username);
        CharmsUtil.clickOnElement(oktaLoginPage.nextButton);
        CharmsUtil.sendKeysToElement(oktaLoginPage.passwordTxtBox, password);
        CharmsUtil.clickOnElement(oktaLoginPage.verifyBtn);
        CucumberLogUtils.logScreenshot();
        CommonUtils.waitForVisibility(oktaLoginPage.agreeBtn);
        CharmsUtil.clickOnElement(oktaLoginPage.agreeBtn);
    }

    /**
     * Use this method to verify that a text label is present in Native View records.
     *
     * @param labelText The exact visible text of the label to be located.
     */
    public static void verifyLabel(String labelText) {
        try {
            WebElement element = locateByXpath("//span[@class='label-text' and normalize-space()='" + labelText + "']");
            CharmsUtil.labelHighlight(element);
            softAssert.assertTrue(element.isDisplayed());

        } catch (NoSuchElementException e) {
            softAssert.fail("----- LABEL TEXT: '" + labelText + "' NOT FOUND ON PAGE -----");
        }
    }
}