package CHARMS.pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static APPS_COMMON.Pages.Selenium_Common_Locators.locateByXpath;

public class MyRASPhysicalActivitiesSurvey {

    /**
     * Submit button for completing the survey
     */
    @FindBy(xpath = "//button[@name='submit']")
    public WebElement submitButton;

    /**
     * Locates a checkbox element on the web page with dynamic text content matching the given text.
     *
     * @param checkboxText the text content that the checkbox element should contain
     * @
     */
    public static WebElement dynamicCheckboxLocator(String checkboxText) {
        return locateByXpath("//span[contains(text(),'" + checkboxText + "')]");
    }

    /**
     * Selects an option from a dropdown in the section "During the past 12 months, about how often did you do each of these household or shopping activities outside of work?" based on the provided label and option text.
     *
     * @param dropdownLabelText  the label text of the dropdown element
     * @param dropdownOptionText the text of the option to be selected from the dropdown
     */
    public static void dropdownSelectorDuringPast12MonthsHowOften(String dropdownLabelText, String dropdownOptionText) {
        locateByXpath("//span[normalize-space()='" + dropdownLabelText + "']/parent::label/parent::div/following-sibling::span").click();
        CommonUtils.sleep(500);
        CommonUtils.waitForClickability(locateByXpath("//div/ul[@aria-label='" + dropdownLabelText + "']//li/div[contains(text(), '" + dropdownOptionText + "')]"));
        locateByXpath("//div/ul[@aria-label='" + dropdownLabelText + "']//li/div[contains(text(), '" + dropdownOptionText + "')]").click();
    }

    /**
     * Selects an option from a dropdown in the section "When you did household tasks or shopping, how much time per day did you spend doing each activity?" based on the provided label and option text.
     *
     * @param dropdownLabelText  the label text of the dropdown element
     * @param dropdownOptionText the text of the option to be selected from the dropdown
     */
    public static void dropdownSelectorHowMuchTimePerDay(String dropdownLabelText, String dropdownOptionText) {
        CommonUtils.clickOnElement(locateByXpath("//span[normalize-space()='" + dropdownLabelText + "']/parent::label[@class='field-label field-label-question' and contains(@for, 'time_spent')]/parent::div/following-sibling::span"));
        CommonUtils.waitForClickability(locateByXpath("//div/ul[@aria-label='" + dropdownLabelText + "']//li/div[contains(text(), '" + dropdownOptionText + "')]"));
        CommonUtils.sleep(500);
        CommonUtils.clickOnElement(locateByXpath("//div/ul[@aria-label='" + dropdownLabelText + "']//li/div[contains(text(), '" + dropdownOptionText + "')]"));
    }

    /**
     * Selects an option from a dropdown in the section "During the past 12 months, did you do any of these activities outside of work?" based on the provided label and option text.
     *
     * @param dropdownLabelText  the label text of the dropdown element
     * @param dropdownOptionText the text of the option to be selected from the dropdown
     */
    public static void dropdownSelectorDidYouDoAnyOfTheseOutsideOfWork(String dropdownLabelText, String dropdownOptionText) {
        locateByXpath("//span[normalize-space()='" + dropdownLabelText + "']/parent::label[@class='field-label field-label-question']/parent::div/following-sibling::span").click();
        CommonUtils.waitForClickability(locateByXpath("//div/ul[@aria-label='" + dropdownLabelText + "']//li/div[text()='" + dropdownOptionText + "']"));
        CommonUtils.sleep(500);
        CommonUtils.clickOnElement(locateByXpath("//div/ul[@aria-label='" + dropdownLabelText + "']//li/div[text()='" + dropdownOptionText + "']"));
    }

    public MyRASPhysicalActivitiesSurvey() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}