package CHARMS.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewCHARMSParticipantDetailsPage {

    /**
     * Native View Participant Details Submit For Eligibility Review Button
     */
    @FindBy(xpath = "//*[@id='study_panel_review']")
    public WebElement nativeViewPatientDetailsSubmitForEligibilityButton;

    /**
     * Native View Subject Flag Button
     */
    @FindBy(xpath = "//*[@id='tabs2_section']//child::span[6]//child::span")
    public WebElement nativeSubjectFlagButton;

    /**
     * Native View Participant Details Mark As Eligible Button
     */
    @FindBy(xpath = "//*[@id='mark_eligible']")
    public WebElement nativeViewPatientDetailsMarkEligibleButton;

    /**
     * Native View Participant Consent added Text
     */
    @FindBy(xpath = "//*[@id='output_messages']/div/div/div")
    public WebElement nativeViewPatientDetailsConsentAddedText;

    /**
     * Native View Participant Consents Button
     */
    @FindBy(xpath = "//span[normalize-space()='Consents (1)']")
    public WebElement nativeViewPatientDetailsConsentsTab;

    /**
     * Native View Participant Consents Preview Button
     */
    @FindBy(xpath = "//*[@id='x_naci_family_coho_family_history_details.x_naci_family_coho_fcsms_consent.family_member_table']//child::tbody//child::tr//child::td[2]//child::a")
    public WebElement nativeViewPatientDetailsConsentsPreviewButton;

    /**
     * Native View Patient Details Participant Studies Button
     */
    @FindBy(xpath = "//span[normalize-space()='Participant Studies (1)']")
    public WebElement nativeViewPatientDetailsParticipantStudiesTab;

    /**
     * Native View Participant Subject ID
     */
    @FindBy(xpath = "//input[@id='sys_readonly.x_naci_family_coho_family_history_details.full_family_id']")
    public WebElement nativeViewPatientDetailsSubjectID;

    /**
     * Native View Participant Family ID
     */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_family_history_details.family']")
    public WebElement nativeViewPatientDetailsFamilyID;

    /**
     * Native View Participant Details Contact Info Tab
     */
    @FindBy(xpath = "//span[normalize-space()='Contact Info']")
    public WebElement nativeViewPatientDetailsContactInfoTab;

    /**
     * Contact Info Tab "Does the participant need legal representation?" Dropdown
     */
    @FindBy(xpath = "//select[contains(@name,'x_naci_family_coho_family_history_details.proxy_required')]")
    public WebElement doesParticipantNeedLegalRepresentationDropdown;

    /**
     * CGB Individual Information Questionnaires Tab
     */
    @FindBy(xpath = "//span[@class ='tab_caption_text' and contains(text(), 'CGB Individual Information Questionnaires')]")
    public WebElement nativeViewPatientDetailsCGBIIQTab;

    /**
     * CGB Individual Information Questionnaire Preview Button
     */
    @FindBy(xpath = "//*[@data-list_id='x_naci_family_coho_family_history_details.x_naci_family_coho_cgb_iiq.participant']//child::tbody//child::tr//child::td[2]//child::a")
    public WebElement cgbIiqPreviewButton;

    /**
     * Consent added! message text
     */
    @FindBy(xpath = "//div[@class='outputmsg_text']")
    public WebElement consentAddedMessageText;

    /**
     *
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_participant_study.assent_signed']")
    public WebElement assentSignedCheckBox;

    public NativeViewCHARMSParticipantDetailsPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
