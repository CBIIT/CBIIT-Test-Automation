package CHARMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.nci.automation.web.WebDriverUtils.webDriver;

public class ScreenerRecordTablePage {

    /* SCREENER PREVIEW PARTICIPANT INFO RECORD FIELD */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.family_member_record_label']")
    public WebElement screenerPreviewParticipantInfoRecordField;

    /* SCREENER PREVIEW CONTACT EMAIL ADDRESS FIELD */
    @FindBy(xpath = "//input[@id='sys_readonly.x_naci_family_coho_ras_referral.family_member_record.email_address']")
    public WebElement screenerPreviewContactEmailAddressField;

    /* SCREENER PREVIEW PROXY CONTACT EMAIL ADDRESS FIELD */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.family_member_record.proxy_email_address']")
    public WebElement screenerPreviewProxyContactEmailAddressField;

    /* SCREENER PREVIEW STUDY FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.study_label']")
    public WebElement screenerPreviewStudyField;

    /* DOES THE PARTICIPANT NEED LEGAL REPRESENTATION? DROPDOWN */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_ras_referral.family_member_record.proxy_required']")
    public WebElement doesTheParticipantNeedLegalRepresentationDropdown;

    /* PERSON WHO FILLED THE SCREENER FIELD*/
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.family_member_record.legal_representative_name']")
    public WebElement personWhoFilledTheScreenerField;

    /* WHAT IS YOUR RELATIONSHIP TO THE PARTICIPANT? DROPDOWN */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_ras_referral.family_member_record.relationship']")
    public WebElement whatIsYourRelationshipToTheParticipantDropdown;

    /* AGE COMPLETED FIELD */
    @FindBy(xpath = "//input[@aria-label='Age Completed']")
    public WebElement ageCompletedField;

    /* VITAL STATUS DROPDOWN */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_ras_referral.family_member_record.legal_guardian']")
    public WebElement vitalStatusDropdown;

    /* SCREENER STUDY FIELD */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_ras_referral.study']")
    public WebElement screenerStudyField;

    /* PARTICIPANT INFO RECORD FIELD */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_ras_referral.family_member_record']")
    public WebElement participantInfoRecordField;

    /*
     * CONTACT INFORMATION TAB
     */
    /* FIRST NAME FIELD */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.first_name']")
    public WebElement firstNameField;

    /* MIDDLE NAME FIELD */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.middle_name']")
    public WebElement middleNameField;

    /* LAST NAME FIELD */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.last_name']")
    public WebElement lastNameField;

    /* CONTACT EMAIL FIELD */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.email_address']")
    public WebElement contactEmailField;

    /* PREFERRED CONTACT DROPDOWN */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_ras_referral.preferred_contact']")
    public WebElement preferredContactDropDown;

    /* CONTACT HOME PHONE FIELD */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.home_phone']")
    public WebElement contactHomePhoneField;

    /* CONTACT CELL PHONE FIELD */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.cell_phone']")
    public WebElement contactCellPhoneField;

    /* CONTACT WORK PHONE FIELD */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.work_phone']")
    public WebElement contactWorkPhoneField;

    /* CONTACT COUNTRY DROP DOWN */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_ras_referral.family_member_record.country']")
    public WebElement contactCountryDropDown;

    /* CONTACT STATE FIELD */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.state']")
    public WebElement contactStateField;

    /* CONTACT STREET ADDRESS FIELD */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.street_address']")
    public WebElement contactStreetAddressField;

    /* CONTACT STREET ADDRESS 2 (OPTIONAL) FIELD */
    @FindBy(xpath = "(//input[@name='x_naci_family_coho_ras_referral.street_address2'])[1]")
    public WebElement contactStreetAddress2OptionalField;

    /* CONTACT CITY FIELD */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.city']")
    public WebElement contactCityField;

    /* CONTACT ZIP CODE FIELD */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.zip_code']")
    public WebElement contactZipCodeField;

    /* CONTACT WHAT IS YOUR RELATIONSHIP TO THIS PERSON? DROPDOWN */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_ras_referral.relationship']")
    public WebElement whatIsYourRelationshipToThisPersonDropdown;

    /* PROXY FIRST NAME FIELD */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.your_first_name']")
    public WebElement proxyFirstNameField;

    /* PROXY MIDDLE NAME FIELD */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.your_middle_name']")
    public WebElement proxyMiddleNameField;

    /* PROXY LAST NAME FIELD */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.your_last_name']")
    public WebElement proxyLastNameField;

    /* PROXY CONTACT STREET ADDRESS */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.proxy_street_address']")
    public WebElement proxyContactStreetAddress;

    /* PROXY CONTACT STREET ADDRESS 2(OPTIONAL) */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.proxy_street_address_2']")
    public WebElement proxyContactStreetAddress2Optional;

    /* PROXY CONTACT CITY */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.proxy_city']")
    public WebElement proxyContactCity;

    /* PROXY CONTACT STATE */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.proxy_state']")
    public WebElement proxyContactState;

    /* PROXY CONTACT ZIPCODE */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.proxy_zip_code']")
    public WebElement proxyContactZipcode;

    /* PROXY CONTACT EMAIL ADDRESS */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.proxy_email_address']")
    public WebElement proxyContactEmailAddress;

    /* PROXY CONTACT HOME PHONE */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.proxy_home_phone']")
    public WebElement proxyContactHomePhone;

    /* PROXY CONTACT WORK PHONE */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.proxy_work_phone']")
    public WebElement proxyContactWorkPhone;

    /* PROXY CONTACT CELLPHONE */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.proxy_cell_phone']")
    public WebElement proxyContactHomeCellphone;

    /* PROXY CONTACT PREFERRED PHONE */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.proxy_preferred_phone']")
    public WebElement proxyContactPreferredPhone;

    /* DEMOGRAPHICS PARTICIPANT RACE PREFER NOT TO ANSWER OPTION */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_ras_referral.participate_race_nonedit']")
    public WebElement demographicsParticipantRacePreferNotToAnswerOption;

    /* DEMOGRAPHICS SEX INPUT FIELD */
    @FindBy(xpath = "//input[@name='sys_display.x_naci_family_coho_ras_referral.biological_sex_ref']")
    public WebElement demographicsSexInput;

    /* DEMOGRAPHICS DATE OF BIRTH FIELD */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_ras_referral.date_of_birth']")
    public WebElement demographicsDateOfBirthField;

    /* DEMOGRAPHICS ETHNICITY DROP DOWN */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_ras_referral.race_ethnicity']")
    public WebElement demographicsEthnicityDropDown;

    /* RASOPATHY HISTORY HAVE YOU BEEN DIAGNOSED WITH A RASOPATHY? DROP DOWN */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_ras_referral.rasopathy_diagnosis']")
    public WebElement rasopathyHistoryHaveYouBeenDiagnosedWithARasopathyDropDown;

    /* RASOPATHY HISTORY NEVER DIAGNOSED WITH ANY OF THESE CONDITIONS  */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_ras_referral.ras_feature_list_nonedit']")
    public WebElement rasopathyHistoryNeverDiagnosedWithAnyOfTheseConditions;

    /* RASOPATHY HISTORY HAVE ANY OF YOUR BIOLOGICAL RELATIVES BEEN DIAGNOSED WITH A RASOPATHY? DROP DOWN */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_ras_referral.realtives_rasopathy_diagnosis']")
    public WebElement rasopathyHistoryHaveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathyDropDown;

    /* CANCER HISTORY HAS A PHYSICIAN EVER DIAGNOSED THIS PARTICIPANT WITH CANCER? DROP DOWN */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_ras_referral.ever_diagnosed_with_cancer']")
    public WebElement cancerHistoryHasAPhysicianEverDiagnosedParticipantWithCancerDropDown;

    /* GENETIC TESTING HISTORY HAS THE PARTICIPANT EVER HAD GENETIC TESTING? DROP DOWN */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_ras_referral.had_genetic_testing']")
    public WebElement geneticTestingHistoryHasTheParticipantEverHadGeneticTestingDropDown;

    /* DOES THE PARTICIPANT HAVE A COPY OF THE GENETIC TEST RESULTS? DROP DOWN */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_ras_referral.copy_of_genetic_test_results']")
    public WebElement doesTheParticipantHaveACopyOfGeneticTestResultsDropDown;

    /* PARTICIPANTS PREFERRED METHOD OF DELIVERING GENETIC TEST RESULTS DROP DOWN */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_ras_referral.participants_preferred_method_of_delivering_genetic_test_results']")
    public WebElement participantsPreferredMethodOfDeliveringGeneticTestResultsDropDown;

    /* FINAL INFORMATION HOW DID YOU HEAR ABOUT THIS STUDY? DROP DOWN */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_ras_referral.hear_about_this_study']")
    public WebElement finalInformationHowDidYouHearAboutThisStudyDropDown;

    /* FINAL INFORMATION HOW DID YOU HEAR ABOUT THIS STUDY? PLEASE SPECIFY TEXT BOX */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.other_how_did_you_hear']")
    public WebElement finalInformationHowDidYouHearAboutThisStudyPleaseSpecifyTextBox;

    /* FINAL INFORMATION HAS THE PARTICIPANT OR ANY FAMILY MEMBER PARTICIPATED IN ANY CANCER STUDY? DROP DOWN */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_ras_referral.participated_through_another_institution']")
    public WebElement finalInformationHasParticipantOrAnyFamilyMemberParticipatedInAnyCancerStudyDropDown;

    /* FINAL INFORMATION MAIN REASONS FOR PARTICIPATING IN THIS STUDY? SELECT ALL THAT APPLY. OTHER OPTION */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_ras_referral.main_reasons_for_participating_nonedit']")
    public WebElement finalInformationMainReasonsForParticipatingInThisStudyOtherOption;

    /* FINAL INFORMATION MAIN REASONS FOR PARTICIPATING IN THIS STUDY? SELECT ALL THAT APPLY. OTHER REASONS FIELD */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_ras_referral.other_reason_for_participation']")
    public WebElement finalInformationMainReasonsForParticipatingInThisStudyOtherReasonsField;

    /* FINAL INFORMATION ARE YOU A PARTICIPANT IN ANY OTHER RESEARCH STUDY OR REGISTRY GROUP? DROP DOWN */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_ras_referral.additional_ras_study_participation']")
    public WebElement finalInformationAreYouAParticipantInAnyOtherResearchStudyOrRegistryGroupDropDown;

    /* WHAT IS YOUR RELATIONSHIP TO THIS PERSON? */
    @FindBy(xpath = "//select[@name='x_naci_family_coho_ras_referral.relationship']")
    public WebElement relationshipDropDown;

    /**
     * USE THIS METHOD TO DYNAMICALLY LOCATE TABS IN SCREENER TABLE
     *
     * @param text
     * @return
     */
    public WebElement dynamicLocatorForTabs(String text) {
        return webDriver.findElement(By.xpath("//span[contains(text(),'" + text + "')]"));
    }

    /**
     * Finds a web element representing a dynamic tab in the ScreenerRecordTablePage using exact text.
     *
     * @param text The exact text of the tab to locate.
     * @return The web element representing the dynamic tab with the specified text.
     */
    public static WebElement dynamicTabLocatorUsingExactText(String text){
        return webDriver.findElement(By.xpath("//span[text()='" + text + "']"));
    }

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE STUDY BUTTONS
     * @param text
     * @return
     */
    public WebElement dynamicLocatorForStudyButtons(String text) {
        return webDriver.findElement(By.xpath("(//button[contains(text(),'" + text + "')])[1]"));
    }

    public ScreenerRecordTablePage() {
        PageFactory.initElements(webDriver, this);
    }
}