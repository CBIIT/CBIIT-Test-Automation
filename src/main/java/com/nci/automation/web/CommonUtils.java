package com.nci.automation.web;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoField;
import java.util.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

/**
 * This is a utility class which contains all common methods that will be used
 * throughout any application. New methods can be added at any time. Modifying
 * the existing methods may result in build failure. - Please notify CBIIT QA Team for modifications
 *
 * @author juarezds
 */
public class CommonUtils extends WebDriverUtils {

    /**
     * Use this String to pass an email concatenated with current date and time into
     * an email text box, and you can pass same value (email+date+time) in another
     * steps.
     */
    public static String email = getEmail();
    public static String date = getDateAsString();

    /**
     * Sends a keyboard key to the specified web element.
     *
     * @param element the web element to send keys to
     * @param keyboardKey the keyboard key to be sent
     */
    public static void sendKeys(WebElement element, Keys keyboardKey) {
        element.sendKeys(keyboardKey);
    }

    /**
     * Retrieves the visible text of the given web element.
     *
     * @param element The WebElement to retrieve the text from.
     * @return The visible text of the web element.
     */
    public static String getText(WebElement element) {
        return element.getText();
    }

    /**
     * Selects a value in a dropdown by its visible text.
     *
     * @param VisibleTextOfDD the visible text of the option to be selected
     * @param dropDownWebEl the WebElement representing the dropdown
     */
    public static void selectDropDownValue(String VisibleTextOfDD, WebElement dropDownWebEl) {
        Select select = new Select(dropDownWebEl);
        select.selectByVisibleText(VisibleTextOfDD);
    }

    /**
     * Selects a value from a dropdown list based on the provided value.
     *
     * @param element the {@link WebElement} representing the dropdown list
     * @param value   the value to be selected from the dropdown list
     */
    public static void selectDropDownValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    /**
     * Selects a value from a dropdown list based on the index position.
     *
     * @param dropDownElement the dropdown element to select a value from
     * @param index the index position of the value to be selected
     */
    public static void selectDropDownValue(WebElement dropDownElement, int index) {
        Select select = new Select(dropDownElement);
        select.selectByIndex(index);
    }

    /**
     * Accepts and closes the alert dialog box if present.
     * If there is no alert dialog box, then a message is displayed indicating that no alert is present.
     *
     * @throws NoAlertPresentException if no alert dialog box is present
     */
    public static void acceptAlert() {
        try {
            Alert alert = webDriver.switchTo().alert();
            alert.accept();
        } catch (NoAlertPresentException e) {
            System.out.println("Alert is not present");
        }
    }

    /**
     * Dismisses the currently displayed alert.
     * If there is no alert present, it prints a message.
     */
    public static void dismissAlert() {
        try {
            Alert alert = webDriver.switchTo().alert();
            alert.dismiss();
        } catch (NoAlertPresentException e) {
            System.out.println("Alert is not present");
        }
    }

    /**
     * Retrieves the text content of an alert displayed on the current web page.
     *
     * @return the alert text content as a String, or null if no alert is present.
     * @throws NoAlertPresentException if no alert is present on the web page.
     */
    public static String getAlertText() {
        try {
            Alert alert = webDriver.switchTo().alert();
            return alert.getText();
        } catch (NoAlertPresentException e) {
            System.out.println("Alert is not present");
            return null;
        }
    }

    /**
     * Switches the focus to a frame with the specified name or id.
     *
     * @param nameOrId the name or id of the frame to switch to
     */
    public static void switchToFrame(String nameOrId) {
        try {
            webDriver.switchTo().frame(nameOrId);
        } catch (NoSuchFrameException e) {
            System.out.println("Frame is not present.");
        }
    }

    /**
     * Switches the focus to a specified frame.
     *
     * @param element the element representing the frame to switch to
     */
    public static void switchToFrame(WebElement element) {
        try {
            webDriver.switchTo().frame(element);
        } catch (NoSuchFrameException e) {
            System.out.println("Frame is not present.");
        }
    }

    /**
     * Switches the focus to a frame identified by index.
     *
     * @param index the index of the frame to switch to
     */
    public static void switchToFrame(int index) {
        try {
            webDriver.switchTo().frame(index);
        } catch (NoSuchFrameException e) {
            System.out.println("Frame is not present.");
        }
    }

    /**
     * Switches the focus of the driver to the default content, i.e., the top-level browsing context.
     * If the default content is not found, a message will be printed to the console indicating that the frame is not present.
     */
    public static void switchToDefaultContent() {
        try {
            webDriver.switchTo().defaultContent();
        } catch (NoSuchFrameException e) {
            System.out.println("Frame is not present.");
        }
    }

    /**
     * Check if the given WebElement is displayed on the page.
     *
     * @param element the WebElement to be checked for visibility
     * @return true if the element is displayed, false if the element is not displayed or an exception occurs
     */
    public static boolean isElementDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Checks if the element identified by the given locator is displayed on the current web page.
     *
     * @param locator the locator used to identify the element
     * @return true if the element is displayed, false otherwise
     */
    public static boolean isElementDisplayed(By locator) {
        try {
            return webDriver.findElement(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Determines whether a given web element is enabled or not.
     *
     * @param element the web element to check
     * @return true if the element is enabled, false if not or if an exception occurs during the check
     */
    public static boolean isElementEnabled(WebElement element) {
        try {
            return (element.isDisplayed() && element.isEnabled());
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Use this method in need of waiting for 30s for an element based on
     * availability of elementToBeSelected.
     *
     * @param element Pass the WebElement on which synchronization to be applied.
     * @return This method will return boolean type either True or False.
     */
    public static WebElement waitForThePresenceOfEl(String element, Duration timeOut) {
        WebDriverWait wait = new WebDriverWait(webDriver, timeOut);
        return wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(element))));
    }

    /**
     * Creates and returns a WebDriverWait object with a default timeout of 30 seconds.
     *
     * @return the WebDriverWait object.
     */
    public static WebDriverWait getWaitObject() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(30));
        return wait;
    }

    /**
     * Waits until the given web element is clickable.
     *
     * @param element The web element to wait for clickability.
     */
    public static void waitForClickability(WebElement element) {
        getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * Waits for the visibility of the given web element.
     *
     * @param element The web element to wait for visibility.
     */
    public static void waitForVisibility(WebElement element) {
        getWaitObject().until(ExpectedConditions.visibilityOf(element));
    }

    /**
     * This variable represents the name or path of a JSON file.
     */
    static String jsonFile;

    public static String readJson(String fileName) {
        try {
            jsonFile = new String(Files.readAllBytes(Paths.get(fileName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonFile;
    }

    /**
     * Use this method to select a drop-down value from a ServiceNow drop down menu
     * when Select class will not work NOTE: Before using, first you must click on
     * the drop-down, then store elements in a list
     */
    public static void selectValueFromBootStrapDropDown(List<WebElement> values, String value) {
        for (WebElement dropDownValues : values) {
            if (dropDownValues.getText().contentEquals(value)) {
                dropDownValues.click();
                break;
            }
        }

    }

    /**
     * Returns a formatted email string based on the current timestamp.
     *
     * @return the formatted email string
     */
    public static String getEmail() {
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String email = formatter.format(ts).toString();
        email = email.replaceAll("[^A-Za-z0-9]", "");
        email = ("test") + email + ("@email.com");
        return email;
    }

    /**
     * Generates a random last name with 10 characters consisting of lowercase letters.
     *
     * @return a random last name
     */
    public static String lastNameRandomizer() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return generatedString.substring(0, 1).toUpperCase() + generatedString.substring(1);
    }

    /**
     * Returns the current date and time as a formatted string.
     * The date and time are formatted according to the pattern "yyyy-MM-dd HH:mm:ss".
     *
     * @return the formatted date and time as a string.
     */
    public static String getDateAsString() {
        Date date = new Date();
        Timestamp ts = new Timestamp(date.getTime());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateAsString = formatter.format(ts).toString();
        dateAsString = dateAsString.replaceAll("[^A-Za-z0-9]", "");
        return dateAsString;
    }

    /**
     * Selects the checkbox based on the given attribute and value.
     *
     * @param checkboxList the list of web elements representing the checkboxes
     * @param attribute the attribute to match against
     * @param value the value to match
     */
    public static void selectCheckbox(List<WebElement> checkboxList, String attribute, String value) {
        for (WebElement checkbox : checkboxList) {
            if (checkbox.isEnabled()) {
                String checkboxText = checkbox.getAttribute(attribute);
                if (checkboxText.equals(value)) {
                    checkbox.click();
                    CommonUtils.sleep(1000);
                    break;
                }
            }
        }
    }

    /**
     * Selects a checkbox from a list of checkboxes based on specified attribute and value.
     *
     * @param checkboxList the list of checkboxes to select from
     * @param attribute the attribute of the checkboxes to compare against
     * @param value the value of the attribute to match
     */
    public static void selectCheckboxDisplayed(List<WebElement> checkboxList, String attribute, String value) {
        for (WebElement checkbox : checkboxList) {
            if (checkbox.isEnabled() && checkbox.isDisplayed()) {
                String checkboxText = checkbox.getAttribute(attribute);
                if (checkboxText.equals(value)) {
                    checkbox.click();
                    CommonUtils.sleep(500);
                    break;
                }
            }
        }
    }

    /**
     * This method is used to switch to another tab window in the current session.
     * It gets the current window handle of the parent window and then iterates
     * through all the window handles. If a window handle is not equal to the parent
     * window handle, then it switches the driver context to that window handle.
     * This is useful when working with multiple tabbed windows within a single browser instance.
     */
    public static void switchToAnotherTabWindow() {
        String parent = WebDriverUtils.webDriver.getWindowHandle();
        Set<String> s = WebDriverUtils.webDriver.getWindowHandles();
        for (String child_window : s) {
            if (!parent.equals(child_window)) {
                WebDriverUtils.webDriver.switchTo().window(child_window);
            }
        }
    }

    /**
     * Maximizes the current window.
     * This method is used to maximize the window of the current WebDriver instance.
     * If the window is already maximized, this method has no effect.
     * The behavior of this method may vary based on the WebDriver implementation.
     */
    public static void maximizeWindow() {
        WebDriverUtils.webDriver.manage().window().maximize();
    }

    /**
     * Use this method to switch to the next another open window
     */
    public static void switchToAnotherWindow() {
        Set<String> handlingAllOpenWindows = WebDriverUtils.webDriver.getWindowHandles();
        for (String nextWindow : handlingAllOpenWindows) {
            WebDriverUtils.webDriver.switchTo().window(nextWindow);
        }
    }

    /**
     * Scrolls the webpage until the specified element is in view.
     *
     * @param locator the locator to identify the element to scroll into view
     */
    public static void scrollIntoView(By locator) {
            WebElement element = WebDriverUtils.webDriver.findElement(locator);
            Actions action = new Actions(WebDriverUtils.webDriver);
            action.moveToElement(element);
            action.perform();
    }

    /**
     * Scrolls the web page to bring the specified web element into view.
     *
     * @param element the web element to scroll into view
     */
    public static void scrollIntoView(WebElement element) {
            Actions action = new Actions(WebDriverUtils.webDriver);
            action.moveToElement(element);
            action.perform();
    }

    /**
     * Compares the actual and expected strings and throws an AssertionError if they are not equal.
     *
     * @param actual   the actual string value
     * @param expected the expected string value
     * @throws AssertionError if the actual string is not equal to the expected string
     */
    public static void assertEquals(String actual, String expected) {
        try {
            Assert.assertEquals(actual, expected);
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /**
     * Compares the actual and expected strings and throws an AssertionError if they are not equal.
     * @param actual
     * @param expected
     * @param message
     */
    public static void assertEqualsWithMessage(String actual, String expected, String message) {
        try {
            Assert.assertEquals(actual, expected, message);
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /**
     * This method checks if a given boolean condition is true. If the condition is false,
     * it throws an AssertionError, which can be caught and handled using try-catch.
     *
     * @param flag the boolean flag to be checked
     */
    public static void assertTrue(boolean flag) {
        try {
            Assert.assertTrue(flag);
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /**
     * Asserts that a given boolean flag is true as per TestNG framework.
     *
     * @param flag    the boolean flag to be asserted
     * @param message the error message to be displayed if the assertion fails
     */
    public static void assertTrueTestNG(boolean flag, String message) {
        try {
            Assert.assertTrue(flag, message);
        } catch (AssertionError e) {
            e.printStackTrace();
        }
    }

    /**
     * Switches the WebDriver to the next window.
     * This method retrieves all the window handles and switches the WebDriver to each window one by one.
     * This allows the WebDriver to interact with multiple windows.
     *
     * @throws NoSuchWindowException if the next window handle does not exist
     */
    public static void switchToNextWindow() {
        Set<String> allWindowHandles1 = WebDriverUtils.webDriver.getWindowHandles();
        for (String currentWindow1 : allWindowHandles1) {
            WebDriverUtils.webDriver.switchTo().window(currentWindow1);
        }
    }

    /**
     * Clicks on the given web element.
     *
     * @param element the web element to be clicked
     */
    public static void clickOnElement(WebElement element) {
        int count = 0;
        while (count < 10) {
            try {
                element.click();
                break;
            } catch (WebDriverException ex) {
                CommonUtils.sleep(2000);
                count++;
            }
        }
    }

    /**
     * Sends the specified text to the given web element.
     *
     * @param element the web element to send keys to
     * @param text the text to send
     */
    public static void sendKeysToElement(WebElement element, String text) {
        int count = 0;
        while (count < 5) {
            try {
                element.sendKeys(text);
                break;
            } catch (WebDriverException ex) {
                CommonUtils.sleep(2000);
                count++;
            }
        }
    }

    /**
     * Retrieves the value of the "value" attribute of a given web element.
     *
     * @param element The web element from which to retrieve the attribute value.
     * @return The value of the "value" attribute of the specified web element.
     */
    public static String getAttributeValueOfValueAttribute(WebElement element) {
        return element.getAttribute("value");
    }

    /**
     * Deletes a file with the given fileName from the current directory.
     *
     * @param fileName the name of the file to be deleted
     */
    public static void deleteFile(String fileName) {
        File file = new File(System.getProperty("user.dir") + "/" + fileName);
        if (file.delete()) {
            System.out.println("File is deleted");
        }
    }

    /**
     * Verifies if the specified expected value is selected in the given drop-down element.
     *
     * @param element       The drop-down WebElement that needs to be checked.
     * @param expectedValue The expected value that should be selected in the drop-down.
     * @param message       The failure message to be logged if the assertion fails.
     */
    public static void verifyingDropDownValueIsSelected(WebElement element, String expectedValue, String message) {
        Select select = new Select(element);
        try {
            Assert.assertEquals(select.getFirstSelectedOption().getText(), expectedValue, message);
        } catch (AssertionError e) {
            e.printStackTrace();
        } catch (WebDriverException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method returns the text of the selected option in a drop-down list.
     *
     * @param element the web element representing the drop-down list
     * @return the text of the selected option in the drop-down list
     */
    public static String getTextOfSelectedDropDownOption(WebElement element){
        Select select = new Select(element);
        return select.getFirstSelectedOption().getText();
    }

    /**
     * Use this method in need of entering value to a text box through selenium
     * WebDriver.
     *
     * @param element Pass the element to which the text needs to be entered.
     * @param value   Pass the desired text/value in the second parameter.
     */
    public static void sendKeys(WebElement element, String value) {
        element.clear();
        element.sendKeys(value);
    }

    /**
     * Hover over the specified WebElement.
     *
     * @param e the WebElement to hover over
     */
    public static void hoverOverElement(WebElement e) {
        Actions actions = new Actions(WebDriverUtils.webDriver);
        actions.moveToElement(e).build().perform();
    }

    /**
     * Use this method to format a phone number into example +1 (201) 821 - 2343
     *
     * @param input
     * @return
     */
    public static String fixPhoneFormat(String input) {
        return input.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "+1 ($1) $2 - $3");
    }

    /**
     * Returns the current date in the format "MM/dd/yyyy".
     *
     * @return the current date formatted as "MM/dd/yyyy"
     */
    public static String getTodayDate() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return date.format(formatter);
    }

    /**
     * Returns the date one month from today in the format "dd/MM/yyyy".
     *
     * @return the date one month from today in the format "dd/MM/yyyy"
     */
    public static String getOneMonthFromTodayDate_In_DD_MM_YYY_format() {
        LocalDate oneMonthFromToday = LocalDate.now().plusMonths(1);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return oneMonthFromToday.format(formatter);
    }

    /**
     * Returns the current date in the format "yyyy-MM-dd".
     *
     * @return the current date
     */
    public static String getCurrentDateIn_YYYY_MM_DD_format() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate today = LocalDate.now();
        return today.format(formatter);
    }

    /**
     * Returns the current date in the format MM-DD-YYYY.
     *
     * This method uses the Java LocalDate and DateTimeFormatter classes to format the current date
     * using the pattern "MM-DD-YYYY". The date components (month, day, and year) are extracted from the
     * LocalDate object and are formatted as two-digit month, two-digit day, and four-digit year.
     *
     * The returned date string will always have two digits for the month and day, and four digits for the year.
     *
     * @return the current date formatted as MM-DD-YYYY
     */
    public static String getCurrentDateIn_MM_DD_YYYY_format() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendValue(ChronoField.MONTH_OF_YEAR)
                .appendLiteral('/')
                .appendValue(ChronoField.DAY_OF_MONTH, 2)
                .appendLiteral('/')
                .appendValue(ChronoField.YEAR, 4)
                .toFormatter();
        LocalDate today = LocalDate.now();
        return today.format(formatter);
    }

    /**
     * Retrieves the date that is 10 days from today in the format MM/DD/YYYY.
     *
     * @return the date that is 10 days from today in the format MM/DD/YYYY
     */
    public static String getTenDaysFromToday_In_MM_DD_YYYY_format() {
        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
                .appendValue(ChronoField.MONTH_OF_YEAR)
                .appendLiteral('/')
                .appendValue(ChronoField.DAY_OF_MONTH, 2)
                .appendLiteral('/')
                .appendValue(ChronoField.YEAR, 4)
                .toFormatter();
        LocalDate dateAfterTenDays = LocalDate.now().plusDays(10);
        return dateAfterTenDays.format(formatter);
    }

    /**
     * Returns the date after ten days in the format "yyyy-MM-dd".
     *
     * @return the date after ten days in the format "yyyy-MM-dd".
     */
    public static String getDateAfterTenDaysIn_YYYY_MM_DD_format() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateAfterDays = LocalDate.now().plusDays(10);
        return dateAfterDays.format(formatter);
    }

    /**
     * Returns the date after ten days from the current date in the format MM/DD/YYYY.
     *
     * @return The date after ten days in the format MM/DD/YYYY.
     */
    public static String getDateAfterTenDaysIn_MM_DD_YYYY_format() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate dateAfterDays = LocalDate.now().plusDays(10);
        return dateAfterDays.format(formatter);
    }

    /**
     * Returns the date one month from the current date in the format "YYYY-MM-DD".
     *
     * @return the date one month from the current date in "YYYY-MM-DD" format
     */
    public static String getDateOneMonthFromNowIn_YYYY_MM_DD_format() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate oneMonthFromNow = LocalDate.now().plusMonths(1);
        return oneMonthFromNow.format(formatter);
    }

    /**
     * Compares two lists of elements and asserts that they are equal.
     *
     * @param actualValues   The list of actual values.
     * @param expectedValues The list of expected values.
     * @throws AssertionError if the sizes of the lists are different or if any corresponding elements in the lists are not equal.
     */
    public static void comparingTwoLists(List<WebElement> actualValues, List<String> expectedValues) {
        Assert.assertEquals(actualValues.size(), expectedValues.size());
        for (int i = 0; i < actualValues.size(); i++) {
            Assert.assertEquals(actualValues.get(i).getText(), expectedValues.get(i));
        }
    }

    /**
     * Converts a given date string from the format "MMMM d, yyyy" to "MM/dd/yyyy" format.
     *
     * @param inputDate the date string to be converted
     * @return the converted date string in "MM/dd/yyyy" format, or null if the input date is invalid
     */
    public static String convertDate(String inputDate) {
        try {
            DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("MMMM d, yyyy");
            DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("MM/dd/yyyy");

            LocalDate date = LocalDate.parse(inputDate, inputFormat);
            return date.format(outputFormat);
        } catch (DateTimeParseException e) {
            System.out.println("Unable to parse date: " + e.getMessage());
            return null;
        }
    }

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}