package ServiceNow.CHARMS.FanconiSurvey.playwright.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewCHARMSParticipantDetailsPage {

    /** Native View Participant Details Submit For Eligibility Review Button */
    @FindBy(xpath = "//*[@id='study_panel_review']")
    public WebElement nativeViewPatientDetailsSubmitForEligibilityButton;

    /** Native View Subject Flag Button */
    @FindBy(xpath = "//*[@id='tabs2_section']//child::span[6]//child::span")
    public WebElement nativeSubjectFlagButton;

    /** Native View Participant Details Mark As Eligible Button */
    @FindBy(xpath = "//*[@id='mark_eligible']")
    public WebElement nativeViewPatientDetailsMarkEligibleButton;

    /** Native View Participant Consent added Text */
    @FindBy(xpath = "//*[@id='output_messages']/div/div/div")
    public WebElement nativeViewPatientDetailsConsentAddedText;

    /** Native View Participant Consents Button */
    @FindBy(xpath = "//span[normalize-space()='Consents (1)']")
    public WebElement nativeViewPatientDetailsConsentsTab;

    /** Native View Participant Consents Preview Button */
    @FindBy(xpath = "//*[@id='x_naci_family_coho_family_history_details.x_naci_family_coho_fcsms_consent.family_member_table']//child::tbody//child::tr//child::td[2]//child::a")
    public WebElement nativeViewPatientDetailsConsentsPreviewButton;

    public NativeViewCHARMSParticipantDetailsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
