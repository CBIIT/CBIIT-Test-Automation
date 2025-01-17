package CHARMS.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static APPS_COMMON.Pages.Selenium_Common_Locators.locateByXpath;

public class MyRASSmokingSurveyPage {

    /**
     * How many cigarettes have you smoked in your life? Provide an estimate. Dropdown
     */
    @FindBy(xpath = "(//label[contains(text(),'How many cigarettes have you smoked in your life? ')])[1]/parent::td/parent::tr/following-sibling::tr//select")
    public WebElement howManyCigarettesHaveYouSmokedInYourLifeSelectDropdown;

    /**
     * How old were you when you first smoked a cigarette? Dropdown
     */
    @FindBy(xpath = "(//label[contains(text(),'How old were you when you first smoked a cigarette')])[1]/parent::td/parent::tr/following-sibling::tr//select")
    public WebElement ageWhenYouFirstSmokedACigaretteSelectDropdown;

    /**
     * How old were you when you started smoking cigarettes on a regular basis? Dropdown
     */
    @FindBy(xpath = "(//label[contains(text(),'How old were you when you started smoking cigarettes on a regular basis?')])[1]/parent::td/parent::tr/following-sibling::tr//select")
    public WebElement ageWhenStartedSmokingCigarettesOnARegularBasisSelectDropdown;

    /**
     * On days that you [smoke/smoked], how many cigarettes [do/did] you smoke per day? Please provide the number of cigarettes, not the number of packs. Input field
     */
    @FindBy(xpath = "//input[@type='number']")
    public WebElement howManyCigarettesHaveYouSmokedPerDayInputField;

    /**
     * Submit survey button.
     */
    @FindBy(xpath = "//button[@id='submit_sign']")
    public WebElement submitButton;

    /**
     * Clicks on the radio button corresponding to the label text provided.
     *
     * @param text the label text of the radio button to be selected
     */
    public static void dynamicRadioButtonSelector(String text) {
        locateByXpath("//label[normalize-space()='" + text + "']").click();
    }

    public MyRASSmokingSurveyPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
