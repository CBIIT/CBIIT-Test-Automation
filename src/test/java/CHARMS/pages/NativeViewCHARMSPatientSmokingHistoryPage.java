package CHARMS.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static APPS_COMMON.Pages.Selenium_Common_Locators.locateByXpath;

public class NativeViewCHARMSPatientSmokingHistoryPage {

    /**
     * How many cigarettes have you smoked in your life? Provide an estimate. Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_question_bank.how_many_cigarettes']")
    public WebElement howManyCigarettesHaveYouSmokedInYourLifeDropdown;

    /**
     * How old were you when you first smoked a cigarette? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_question_bank.age_at_first_cigarette']")
    public WebElement ageAtFirstCigarette;

    /**
     * How old were you when you started smoking cigarettes on a regular basis? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_question_bank.age_at_regular_cigarette_use']")
    public WebElement ageAtRegularCigaretteUse;

    /**
     * On days that you [smoke/smoked] how many cigarettes [do/did] you smoke per day? Input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_question_bank.cigarettes_per_day']")
    public WebElement cigarettesPerDay;

    /**
     * Checks if the checkbox with the specified text is checked on the web page.
     *
     * @param checkboxText the text of the checkbox to be checked
     * @return true if the checkbox is checked, false otherwise
     */
    public boolean checkboxIsChecked(String checkboxText) {

        System.out.println("* * * * * check attribute = " + locateByXpath("//span[normalize-space()='" + checkboxText + "']/parent::label/parent::div/following-sibling::div//input[@type='checkbox']").getAttribute("checked"));
        return locateByXpath("//span[normalize-space()='" + checkboxText + "']/parent::label/parent::div/following-sibling::div//input[@type='checkbox']").getAttribute("checked").equals("true");
    }

    public NativeViewCHARMSPatientSmokingHistoryPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
