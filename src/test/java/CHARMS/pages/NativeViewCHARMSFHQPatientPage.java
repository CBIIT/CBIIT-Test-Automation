package CHARMS.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static APPS_COMMON.Pages.Selenium_Common_Locators.locateByXpath;

public class NativeViewCHARMSFHQPatientPage {

    /**
     * To confirm your identity, please indicate your relationship to the participant. Dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_fhq_patient.to_confirm_your_identity']")
    public WebElement confirmIdentityRelationshipToParticipantDropdown;

    /**
     * First Name of the participant input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_fhq_patient.first_name']")
    public WebElement firstNameOfParticipantInputField;

    /**
     * First Initial of LAST Name of the participant input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_fhq_patient.last_initial']")
    public WebElement firstInitialOfLastNameOfParticipantInputField;

    /**
     * Sex assigned at birth dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_fhq_patient.sex_assigned_at_birth']")
    public WebElement sexAssignedAtBirthDropdown;

    /**
     * Gender Identity dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_fhq_patient.gender_identity']")
    public WebElement genderIdentityDropdown;

    /**
     * Has participant had any miscarriage, stillbirth? dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_fhq_patient.have_you_had_any_miscarriages_stillbirths_induced_abortions_or_ectopic_pregnanci']")
    public WebElement hasParticipantHadAnyMiscarriageStillbirthDropdown;

    /**
     * How many total children (alive and deceased) has the participant had? Input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_fhq_patient.no_of_childrens']")
    public WebElement howManyTotalChildrenHasTheParticipantHadInputField;

    /**
     * How many total different partners has participant had biological children with? Input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_fhq_patient.if_we_set_parameters_to_enroll_both_parents_partners_and_children_could_it_a']")
    public WebElement howManyTotalDifferentPartnersHasParticipantHadBiologicalChildrenWithInputField;

    /**
     * How many siblings does the participant have? Input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_fhq_patient.how_manu_siblings_does_siblings_have']")
    public WebElement howManySiblingsDoesTheParticipantHaveInputField;

    /**
     * FHQ Study dropdown
     */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_fhq_patient.fhq_study']")
    public WebElement fhqStudyDropdown;

    /**
     * Participant input field
     */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_fhq_patient.participant']")
    public WebElement participantInputField;

    /**
     * Complete button
     */
    @FindBy(xpath = "//span[@class='navbar_ui_actions']//button[@name='not_important'][normalize-space()='Complete']")
    public WebElement completeButton;

    /**
     * Locates a WebElement in the FHQ Patient page that corresponds to a specific related lists tab with the given tab text.
     *
     * @param tabText the text content of the tab to be located
     * @return the WebElement corresponding to the tab with the provided text
     */
    public WebElement dynamicRelatedListsTabLocator(String tabText) {
        return locateByXpath("//span[@class='tab_caption_text' and contains(text(), '" + tabText + "')]");
    }

    public NativeViewCHARMSFHQPatientPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}