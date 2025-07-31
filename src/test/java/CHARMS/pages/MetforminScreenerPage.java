package CHARMS.pages;

import com.nci.automation.web.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;

public class MetforminScreenerPage extends CommonUtils {
    public MetforminScreenerPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }

    /*** Method to dynamically locate elements  e.g (//label[contains(text(),'Please provide the mailing address')])[1] */
    public WebElement dynamicLocatorUsingLabelContainText(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//label[contains(text(),'" + text + "')])[1]"));
    }

    /*** Method to dynamically locate elements */
    public WebElement dynamicLocatorUsingNormalizeSpace(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//*[normalize-space()='" + text + "'])[1]"));
    }

    /*** Method to dynamically locate elements */
    public WebElement dynamicLocatorForButtonUsingNormalizeSpace(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//button[normalize-space()='" + text + "'])[1]"));
    }

    /*** Method to dynamically locate Text Boxes */
    public WebElement dynamicLocatorTextBoxUsingP(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//p[normalize-space()='" + text + "']"));
    }

    /*** Method to dynamically locate elements e.g (//p[contains(text(),'Please feel free to call at any time if you have a')])[1] */
    public WebElement dynamicLocatorUsingPContainText(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//p[contains(text(),'" + text + "')])[1]"));
    }

    /*** Method to dynamically locate elements in Native View */
    public WebElement dynamicLocatorContainsText(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[contains(text(),'" + text + "')]"));
    }

    /*** Method to dynamically locate Text Boxes */
    public WebElement dynamicLocatorTextBoxUsingH2(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//h2[normalize-space()='" + text + "']"));
    }

    /*** Method to dynamically locate Text Boxes */
    public WebElement dynamicLocatorTextBoxUsingH(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//h3[normalize-space()='" + text + "']"));
    }

    /*** Method to dynamically locate elements */
    public WebElement dynamicLocatorWithAUsingNormalizeSpace(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//a[normalize-space()='" + text + "'])[1]"));
    }

    /*** Method to dynamically locate elements e.g (//th[normalize-space()='Actions'])[1] */
    public WebElement dynamicLocatorUsingTableNormalizeSpace(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//th[normalize-space()='" + text + "'])[1]"));
    }

    /*** Method to dynamically locate TextBoxes  e.g  (//td[normalize-space()='No data to display'])[1] */
    public WebElement dynamicLocatorUsingTDTag(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//td[normalize-space()= '" + text + "'])[1]"));
    }

    /*** Method to dynamically locate elements e.g //span[normalize-space()="Do we have your/the participant's?"] */
    public WebElement dynamicLocatorUsingNormalizeSpaceSpan(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//span[normalize-space()=\"" + text + "\"]"));
    }

    /*** Method to dynamically locate elements e.g (//span[contains(text(),"Please list your/the participant's phone numbers b")])[1] */
    public WebElement dynamicLocatorUsingSpanContainText(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//span[contains(text(),\"" + text + "\")])[1]"));
    }

    /*** Method to dynamically locate elements e.g (//span[@aria-label="Are you/the participant adopted?"])[1] */
    public WebElement dynamicLocatorUsingSpanAriaLabel(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath(String.format("(//span[@aria-label=\"%s\"])[1]", text)));
    }

    /*** Method to dynamically locate elements e.g (//span[@id='select2-chosen-44'])[1] */
    public WebElement dynamicLocatorUsingSpanId(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath(String.format("(//span[@id='select2-chosen-%s'])[1]", text)));
    }

    /*** Method to dynamically locate elements e.g (//span[@class='select2-chosen'])[2] */
    public WebElement dynamicLocatorUsingSpanId1(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath(String.format("(//span[@class='select2-chosen'])[%s]", text)));
    }

    /*** Method to dynamically locate elements  e.g (//span[contains(@class,'select2-chosen')][normalize-space()='-- None --'])[3] */
    public WebElement dynamicLocatorUsingSpanContains(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath(String.format("(//span[contains(@class,'select2-chosen')][normalize-space()='-- None --'])[%s]", text)));
    }

    /*** Method to dynamically locate elements  e.g (//span[contains(text(),"Phone Number")])[5] */
    public WebElement dynamicLocatorUsingSpanContainTextAndIndex(String text, int index) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//span[contains(text(),'" + text + "')])[" + index + "]"));
    }

    /*** Method to dynamically locate elements  e.g (//span[contains(@title,'e.g. at another medical institution')])[1]
     */
    public WebElement dynamicLocatorUsingSpanContainTitleAndIndex(String text, int index) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//span[contains(@title,'" + text + "')])[" + index + "]"));
    }

    /*** Method to dynamically locate elements e.g (//span[@title='Type Unknown/Unsure if you are not sure.'])[1] */
    public WebElement dynamicLocatorUsingSpanTitle(String text, int i) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//span[@title='" + text + "'])[" + i + "]"));
    }

    /*** Method to dynamically locate elements e.g (//span[@title='[Participant Info Name]'])[1]*/
    public WebElement dynamicLocatorUsingSpanTitle1(String text, int i) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//span[@title='[" + text + "]'])[" + i + "]"));
    }

    /*** Method to dynamically locate elements in Native View */
    public WebElement dynamicLocatorUsingSpanNormalizeSpace(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//span[normalize-space()='" + text + "'])[1]"));
    }

    /*** Method to dynamically locate elements in Native View */
    public WebElement dynamicLocatorUsingNormalizeSpaceInSpan(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//span[@class='label-text'][normalize-space()='" + text + "']"));
    }

    /*** Method to dynamically locate elements in Native View  E.g  (//span[@class='label-text'][contains(text(),'Are you/the participant currently undergoing treat')])[1]*/
    public WebElement dynamicLocatorUsingContainsText(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//span[@class='label-text'][contains(text(),'" + text + "')])[1]"));
    }

    /*** Method to dynamically locate Input Values e.g (//input[@aria-label='Work Phone Number'])[1] */
    public WebElement dynamicLocatorForInputElementInMetforminScreener(String text, int index) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@aria-label='" + text + "'])[" + index + "]"));
    }

    /*** Method to dynamically locate Input Values e.g (//input[@name='email_address'])[1] */
    public WebElement dynamicLocatorForInputElementUsingNameInMetforminScreener(String text, int index) {
        return WebDriverUtils.webDriver.findElement(By.xpath(" (//input[@name='" + text + "'])[" + index + "]"));
    }

    /*** Method to dynamically locate Input Value elements in Native View */
    public WebElement dynamicLocatorForInputElements(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='sys_display.x_naci_family_coho_participant_study." + text + "'])[1]"));
    }

    /*** Method to dynamically locate Input Display Read Value elements in metformin Study Screener in Native View  For eg (//input[@id='sys_display.x_naci_family_coho_metformin_study_screener.biological_sex_ref'])[1]*/
    public WebElement dynamicLocatorForDisplayReadOnlyInputElements(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='sys_display.x_naci_family_coho_metformin_study_screener." + text + "'])[1]"));
    }

    /*** Method to dynamically locate Input Read Value elements in metformin Study Screener in Native View */
    public WebElement dynamicLocatorForReadOnlyInputElements(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='sys_readonly.x_naci_family_coho_metformin_study_screener." + text + "'])[1]"));
    }

    /*** Method to dynamically locate Input Value elements in metformin Study Screener in Native View  for eg (//input[@id='x_naci_family_coho_metformin_study_screener.number'])[1] */
    public WebElement dynamicLocatorForInputElement(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='x_naci_family_coho_metformin_study_screener." + text + "'])[1]"));
    }

    /*** Method to dynamically locate Input Value elements of family member in metformin Study Screener in Native View */
    public WebElement dynamicLocatorForInputElementsOfFamily(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@name='x_naci_family_coho_metformin_study_screener." + text + "'])[1]"));
    }

    /*** Method to dynamically locate Input Value elements  E.g (//input[@id='x_naci_family_coho_mock_up_intake_patient_cancer.age_in_years_at_diagnosis'])[1] */
    public WebElement dynamicLocatorForCancerInputElements(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//input[@id='x_naci_family_coho_mock_up_intake_patient_cancer." + text + "'])[1]"));
    }

    /*** Method to dynamically locate Input Value elements  E.g   (//select[@id='x_naci_family_coho_mock_up_intake_patient_cancer.month_of_diagnosis'])[1] */
    public WebElement dynamicLocatorForCancerSelectElements(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//select[@id='x_naci_family_coho_mock_up_intake_patient_cancer." + text + "'])[1]"));
    }

    /*** Method to dynamically locate Select Value elements in metformin Screener page in Native View */
    public WebElement dynamicLocatorForSelectElements(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//select[@name='x_naci_family_coho_metformin_study_screener.family_member_record." + text + "'])[1]"));
    }

    /*** Method to dynamically locate Select Value elements in metformin Screener page in Native View  eg (//select[@id='x_naci_family_coho_metformin_study_screener.participated_li_fraumeni'])[1]*/
    public WebElement dynamicLocatorForSelectElement(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//select[@id='x_naci_family_coho_metformin_study_screener." + text + "'])[1]"));
    }

    /*** Method to dynamically locate Select Value elements in metformin Screener page in Native View  eg (//textarea[@id='x_naci_family_coho_metformin_study_screener.health_care_prov_address'])[1] */
    public WebElement dynamicLocatorForTextArea(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("(//textarea[@id='x_naci_family_coho_metformin_study_screener." + text + "'])[1]"));
    }

    @FindBy(css = "span[ng-if=\"$last\"]")
    public WebElement metforminScreenerTitle;

    @FindBy(xpath = "(//label[@for='sp_formfield_date_of_birth'])[1]")
    public WebElement metforminParticipantDOBLabel;

    @FindBy(xpath = "//label[contains(@for,\"sp_formfield_adopted\")]//span[2]")
    public WebElement metforminParticipantAdoptedLabel;

    @FindBy(xpath = "(//a[contains(@class,'select2-choice select2-default form-control')])[1]")
    public WebElement metforminParticipantSexInput;

    @FindBy(xpath = "(//div[@id='s2id_sp_formfield_country'])[1]")
    public WebElement metforminParticipantCountryInput;

    @FindBy(xpath = "(//input[@id='s2id_autogen26_search'])[1]")
    public WebElement metforminParticipantCountryInput1;

    @FindBy(xpath = "(//td[normalize-space()='No data to display'])[1]")
    public WebElement metforminCancerNoDataToDisplay;

    @FindBy(xpath = "(//label[@for='sp_formfield_email_address'])[1]")
    public WebElement metforminParticipantEmailAddressLabel;

    @FindBy(xpath = "(//label[@for='sp_formfield_results_tp53'])[1]")
    public WebElement metforminParticipantTP53Label;

    @FindBy(xpath = "//label[@for=\"s2id_autogen27\"]//span[@class=\"sp-field-label-padding ng-binding\"]")
    public WebElement metforminParticipantRaceLabel;

    @FindBy(xpath = "(//input[@class=\"select2-input select2-default\"])[1]")
    public WebElement metforminParticipantRaceInput;

    @FindBy(xpath = "(//textarea[@name='current_meds'])[1]")
    public WebElement metforminParticipantCurrentMedInput;

    @FindBy(xpath = "//input[@class=\"select2-input select2-default\"]")
    public WebElement metforminParticipantStudySiteInput;

    @FindBy(xpath = "(//span[@aria-label='Read only - Delivery Instructions'])[1]")
    public WebElement metforminParticipantDeliveryInstructions;

    @FindBy(xpath = "(//textarea[@id='sp_formfield_delivery_instructions_mail'])[1]")
    public WebElement metforminParticipantMailDeliveryInstructions;

    @FindBy(xpath = "(//label[contains(text(),'Please complete the table below by selecting which')])[1]")
    public WebElement metforminParticipantCancerHelpText;

    @FindBy(xpath = "(//span[contains(@title,'Please include at what age or year the cancer(s) occured.')])[1]")
    public WebElement metforminParticipantCancerInformationText;

    @FindBy(xpath = "(//p[contains(text(),'What current medication(s) are you/the participant')])[1]")
    public WebElement metforminParticipantCurrentMedLabel;

    @FindBy(xpath = "(//p[contains(text(),'For example, if you took Metformin for two months ')])[1]")
    public WebElement metforminParticipantMetforminInfoLabel;

    @FindBy(xpath = "(//p[contains(text(),'If a specific health care provider referred you to')])[1]")
    public WebElement metforminParticipantHealthCareInfoLabel;

    @FindBy(xpath = "(//span[contains(text(),'In case we require additional medical information ')])[1]")
    public WebElement metforminParticipantMedicalInfoLabel;

    @FindBy(xpath = "(//textarea[@id='sp_formfield_receive_genetic_testing'])[1]")
    public WebElement metforminParticipantGeneticTestInput;

    @FindBy(xpath = "(//span[contains(text(),'You are almost done! To submit your responses, you')])[1]")
    public WebElement metforminParticipantSubmitInfoLabel;

    @FindBy(xpath = "(//a[@class='select2-choice select2-default form-control'])[1]")
    public WebElement metforminParticipantTumorTypeInput;

    @FindBy(xpath = "(//input[@role='combobox'])[66]")
    public WebElement metforminParticipantTumorDetailsInput1;

    @FindBy(xpath = "(//td[@class='ng-binding ng-scope'])[4]")
    public WebElement metforminParticipantTumorTypeMonthOfDiagnosisInput;

    @FindBy(xpath = "(//td[@class='ng-binding ng-scope'])[5]")
    public WebElement metforminParticipantTumorTypeYearfDiagnosisInput;

    @FindBy(xpath = "(//span[@title=\"Select Unknown/Unsure if you don't know the date or age of cancer diagnosis\"])[1]")
    public WebElement metforminParticipantTumorDateOrAgeLabel;

    @FindBy(xpath = "(//input[@id='sp_formfield_institute_diagnosed'])[1]")
    public WebElement metforminParticipantInstitutionDiagnosedInput;

    @FindBy(xpath = "(//input[@id='sp_formfield_institute_treated'])[1]")
    public WebElement metforminParticipantInstitutionTreatedInput;

    @FindBy(xpath = "(//input[@id='sp_formfield_treating_physician'])[1]")
    public WebElement metforminParticipantTreatingPhysicianInput;

    @FindBy(xpath = " (//textarea[@name='additional_details_cancer_mrvs'])[1]")
    public WebElement metforminParticipantCancerAdditionalDetailsInput;

    @FindBy(xpath = "(//input[@name='sys_display.x_naci_family_coho_metformin_study_screener.family_member_record.contact_country'])[1]")
    public WebElement nVParticipantContactCountryInput;

    @FindBy(xpath = "(//input[@name='sys_display.x_naci_family_coho_metformin_study_screener.study'])[1]")
    public WebElement nVFScreenerStudy;

    @FindBy(xpath = "(//select[@id='x_naci_family_coho_metformin_study_screener.family_member_record.person_alive'])[1]")
    public WebElement nVMetforminScreenerVitalStatus;

    @FindBy(xpath = "(//select[@name='x_naci_family_coho_metformin_study_screener.participant_study.eligibility_status'])[1]")
    public WebElement nVFScreenerEligibilityStatus;

    @FindBy(xpath = "(//span[normalize-space()='Contact Information'])[1]")
    public WebElement nVFScreenerContactInfoTab;

    @FindBy(xpath = "(//select[@name='x_naci_family_coho_metformin_study_screener.participant_study.enrollment_status'])[1]")
    public WebElement nVFScreenerEnrollmentStatus;

    @FindBy(xpath = "(//p[@id='x_naci_family_coho_metformin_study_screener.main_reasons_for_participating_nonedit'])[1]")
    public WebElement nVMetforminScreenerMainReasonsForParticipating;

    @FindBy(xpath = "(//a[@aria-label='Preview record: null'])[1]")
    public WebElement nVMetforminScreenerCancerPreviewRecord;

    @FindBy(xpath = "(//input[@id='sys_display.x_naci_family_coho_mock_up_intake_patient_cancer.tumor_type'])[1]")
    public WebElement nVMetforminScreenerTumorTypeInput;

    @FindBy(xpath = " (//textarea[@id='x_naci_family_coho_mock_up_intake_patient_cancer.additional_details'])[1]")
    public WebElement nVMetforminScreenerAdditionalDetailsInput;

    @FindBy(xpath = "(//p[@id='x_naci_family_coho_metformin_study_screener.participate_race_nonedit'])[1]")
    public WebElement nVScreenerRace;
}