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
     * Selects an option from a dropdown in the section "During the past 12 months, about how often did you do each of these household or shopping activities outside of work?" based on the provided label and option text.
     *
     * @param dropdownLabelText  the label text of the dropdown element
     * @param dropdownOptionText the text of the option to be selected from the dropdown
     */
    public static WebElement dropdownSelectorDuringPast12MonthsHowOften(String dropdownLabelText, String dropdownOptionText) {
        locateByXpath("//span[normalize-space()='" + dropdownLabelText + "']/parent::label/parent::div/following-sibling::span").click();
        CommonUtils.sleep(500);
        CommonUtils.waitForClickability(locateByXpath("//div/ul[@aria-label='" + dropdownLabelText + "']//li/div[contains(text(), '" + dropdownOptionText + "')]"));
        return locateByXpath("//div/ul[@aria-label='" + dropdownLabelText + "']//li/div[contains(text(), '" + dropdownOptionText + "')]");
    }

    /**
     * Returns an option from a physical activities dropdown menu within a specific section of the survey
     * based on the provided section name, dropdown label, and option text.
     *
     * @param sectionName        the name of the section containing the dropdown element
     * @param dropdownLabelText  the label text of the dropdown element
     * @param dropdownOptionText the text of the option to be returned from the dropdown
     * @return a WebElement representing the dropdown option located using the dynamic XPath
     */
    public static WebElement physicalActivitiesDropdownOptionSelector(String sectionName, String dropdownLabelText, String dropdownOptionText) {
        CommonUtils.clickOnElement(locateByXpath("//span[contains(@role,'heading')][normalize-space()='" + sectionName + "']/parent::span/parent::span/parent::div//span[@class='sp-field-label-padding ng-binding' and contains(text(), '" + dropdownLabelText + "')]/parent::label/parent::div/following-sibling::span"));
        CommonUtils.sleep(800);
        return locateByXpath("//div/ul[@aria-label='" + dropdownLabelText + "']//li/div[text()='" + dropdownOptionText + "']");
    }

    /**
     * Locates a section on the web page based on the provided section text.
     *
     * @param sectionText the visible text of the section heading to locate
     * @return a WebElement representing the section heading found using the dynamic XPath
     */
    public static WebElement dynamicSectionLocator(String sectionText) {
        return locateByXpath("//span[@role='heading'][normalize-space()='" + sectionText + "']");
    }

    public MyRASPhysicalActivitiesSurvey() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}