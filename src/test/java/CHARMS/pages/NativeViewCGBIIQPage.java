package CHARMS.pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NativeViewCGBIIQPage {

    /**
     * Demographics tab
     */
    @FindBy(xpath = "//span[normalize-space()='Demographics']")
    public WebElement demographicsTab;

    /**
     * Participants city of birth text field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.born_city']")
    public WebElement participantsCityOfBirthTextField;

    /**
     * Participants state/province of birth text field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.born_state_province']")
    public WebElement participantsStateProvidenceOfTextField;

    /**
     * Participants country of birth text field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.born_country']")
    public WebElement participantsCountryOfBirthTextField;

    /**
     * Birth location unknown checkbox
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_cgb_iiq.birth_location_unknown']")
    public WebElement participantsBirthLocationUnknownCheckbox;

    /**
     * Biological mothers ancestral background text
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_cgb_iiq.bio_mom_ancestry_nonedit']")
    public WebElement participantsBioMomAncestryNonEdit;

    /**
     * Biological dad's ancestral background text
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_cgb_iiq.bio_dad_ancestry_nonedit']")
    public WebElement participantsBioDadAncestryNonEdit;

    /**
     * Family's religious background text
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_cgb_iiq.family_religous_background_nonedit']")
    public WebElement familysReligiousBackgroundNonEdit;

    /**
     * Is the participant of Ashkenazi jewish descent? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.ashkenazi_jewish']")
    public WebElement isTheParticipantOfAshkenaziJewishDescentDropdown;

    /**
     * Was the participant raised by someone other than their own bio parent? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.rasied_by_non_bio_parent']")
    public WebElement raisedByNonBioParentDropdown;

    /**
     * Participant's marital status dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.marital_status']")
    public WebElement maritalStatusDropdown;

    /**
     * Total household income in the last 12 months dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.household_income']")
    public WebElement householdIncomeDropdown;

    /**
     * Participants highest level of schooling dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.highest_level_of_schooling']")
    public WebElement participantsHighestLevelOfSchoolingDropdown;

    /**
     * Participants usual job or main occupation during their lifetime text area
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_cgb_iiq.lifetime_job_occupation']")
    public WebElement participantsUsualJobOrMainOccupationTextArea;

    /**
     * Does the participant have health insurance? Dropdown
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_cgb_iiq.health_insurance']")
    public WebElement doesTheParticipantHaveHealthInsuranceDropdown;

    public NativeViewCGBIIQPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
