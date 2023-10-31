package ServiceNow.CHARMS.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScreenerRecordTablePage {

    /* REFERRAL PREVIEW BUTTON */
    @FindBy(xpath = "//button[@id='viewr.x_naci_family_coho_family_history_details.proband_screener']")
    public WebElement referralPreviewButton;

    /* CONTACT INFORMATION BUTTON */
    @FindBy(xpath = "//span[contains(text(),'Contact Information')]")
    public WebElement contactInformationButton;

    /* SCREENER PREVIEW FAMILY MEMBER RECORD FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.family_member_record_label']")
    public WebElement screenerPreviewFamilyMemberRecordField;

    /* SCREENER PREVIEW CONTACT EMAIL ADDRESS FIELD */
    @FindBy(xpath = "//input[@id='sys_readonly.x_naci_family_coho_ras_referral.family_member_record.email_address']")
    public WebElement screenerPreviewContactEmailAddressField;

    /* SCREENER PREVIEW STUDY FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.study_label']")
    public WebElement screenerPreviewStudyField;

    /* SCREENER STUDY FIELD */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_ras_referral.study']")
    public WebElement screenerStudyField;

    /* FAMILY MEMBER RECORD FIELD */
    @FindBy(xpath = "//input[@id='sys_display.x_naci_family_coho_ras_referral.family_member_record']")
    public WebElement familyMemberRecordField;

    /* CONTACT EMAIL FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.family_member_record.email_address']")
    public WebElement contactEmailField;

    /* CONTACT HOME PHONE FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.family_member_record.phone']")
    public WebElement contactHomePhoneField;

    /* CONTACT CELL PHONE FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.family_member_record.cell_phone']")
    public WebElement contactCellPhoneField;

    /* CONTACT WORK PHONE FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.family_member_record.work_phone']")
    public WebElement contactWorkPhoneField;

    /* CONTACT COUNTRY DROP DOWN */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_ras_referral.family_member_record.country']")
    public WebElement contactCountryDropDown;

    /* CONTACT STATE FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.family_member_record.state']")
    public WebElement contactStateField;

    /* CONTACT STREET ADDRESS FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.family_member_record.street_address']")
    public WebElement contactStreetAddressField;

    /* CONTACT CITY FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.family_member_record.city']")
    public WebElement contactCityField;

    /* CONTACT ZIP CODE FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.family_member_record.zipcode']")
    public WebElement contactZipCodeField;

    /* DEMOGRAPHICS PARTICIPANT RACE PREFER NOT TO ANSWER OPTION */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_ras_referral.family_member_record.race_nonedit']")
    public WebElement demographicsParticipantRacePreferNotToAnswerOption;

    /* DEMOGRAPHICS BIOLOGICAL GENDER DROP DOWN */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_ras_referral.family_member_record.biological_gender']")
    public WebElement demographicsBiologicalGenderDropDown;

    /* DEMOGRAPHICS DATE OF BIRTH FIELD */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_ras_referral.family_member_record.date_of_birth_month_day_year']")
    public WebElement demographicsDateOfBirthField;

    /* DEMOGRAPHICS ETHNICITY DROP DOWN */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_ras_referral.family_member_record.ethnicity']")
    public WebElement demographicsEthnicityDropDown;

    /* RASOPATHY HISTORY HAVE YOU BEEN DIAGNOSED WITH A RASOPATHY? DROP DOWN */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_ras_referral.rasopathy_diagnosis']")
    public WebElement rasopathyHistoryHaveYouBeenDiagnosedWithARasopathyDropDown;

    /* RASOPATHY HISTORY NEVER DIAGNOSED WITH ANY OF THESE CONDITIONS  */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_ras_referral.ras_feature_list_nonedit']")
    public WebElement rasopathyHistoryNeverDiagnosedWithAnyOfTheseConditions;

    /* RASOPATHY HISTORY HAVE ANY OF YOUR BIOLOGICAL RELATIVES BEEN DIAGNOSED WITH A RASOPATHY? DROP DOWN */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_ras_referral.realtives_rasopathy_diagnosis']")
    public WebElement rasopathyHistoryHaveAnyOfYourBiologicalRelativesBeenDiagnosedWithARasopathyDropDown;

    /* CANCER HISTORY HAS A PHYSICIAN EVER DIAGNOSED THIS PARTICIPANT WITH CANCER? DROP DOWN */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_ras_referral.family_member_record.has_cancer']")
    public WebElement cancerHistoryHasAPhysicianEverDiagnosedParticipantWithCancerDropDown;

    /* GENETIC TESTING HISTORY HAS THE PARTICIPANT EVER HAD GENETIC TESTING? DROP DOWN */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_ras_referral.family_member_record.genetic_testing']")
    public WebElement geneticTestingHistoryHasTheParticipantEverHadGeneticTestingDropDown;

    /* DOES THE PARTICIPANT HAVE A COPY OF THE GENETIC TEST RESULTS? DROP DOWN */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_ras_referral.family_member_record.genetic_testing']")
    public WebElement doesTheParticipantHaveACopyOfGeneticTestResultsDropDown;

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

    /**
     * USE THIS METHOD TO DYNAMICALLY LOCATE TABS IN SCREENER TABLE
     *
     * @param text
     * @return
     */
    public WebElement dynamicLocatorForTabs(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//span[contains(text(),'" + text + "')]"));
    }

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE STUDY BUTTONS
     * @param text
     * @return
     */
    public WebElement dynamicLocatorForStudyButtons(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//button[contains(text(),'" + text + "')])[1]"));
    }

    public ScreenerRecordTablePage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
