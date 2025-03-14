package CHARMS.pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.*;
import static Hooks.Hooks.softAssert;

public class RAS_Survey_Native_View_Page {

    /*** STORE RAS SURVEY NATIVE VIEW ELEMENTS HERE*/

    /** ------------------BEGINNING OF DEMOGRAPHIC INFORMATION SECTION--------------------- */
    /**
     * Included in published case report or in a different public manner drop down
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.published_case']")
    public WebElement includedInPublishedCaseReportDropDown;

    /**
     * Included in published case report or in a different public manner drop down values
     */
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.published_case']//option")
    public List<WebElement> includedInPublishedCaseReportDropDownValues;

    /**
     * Additional information about authors, publication year or PubMedID input field
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_rasopathy_iiq.published_info']")
    public WebElement publishedCaseReportAdditionalInformationInputField;

    /**
     * Biological Mother Birth Location text field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.bio_mom_birth_location']")
    public WebElement biologicalMotherBirthLocation;

    /**
     * Biological Mother Birth Location Unknown checkbox
     */
    @FindBy(xpath = "//input[@name='ni.x_naci_family_coho_rasopathy_iiq.bio_mom_birth_location_unknown']")
    public WebElement biologicalMotherBirthLocationUnknown;

    /**
     * Biological Mothers Age At Birth text field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.bio_mom_age']")
    public WebElement biologicalMothersAgeAtBirth;

    /**
     * Biological Mothers Heigth (cm) number/digit field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.mom_height']")
    public WebElement biologicalMothersHeight;

    /**
     * Biological Mothers Heigth Unknown checkbox
     */
    @FindBy(xpath = "//input[@name='ni.x_naci_family_coho_rasopathy_iiq.bio_mom_height_unknown']")
    public WebElement biologicalMothersHeightUnknown;

    /**
     * Biological Father Birth Location text field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.bio_dad_birth_location']")
    public WebElement biologicalFatherBirthLocation;

    /**
     * Biological Father Birth Location Unknown checkbox
     */
    @FindBy(xpath = "//input[@name='ni.x_naci_family_coho_rasopathy_iiq.bio_dad_birth_location_unknown']")
    public WebElement biologicalFatherBirthLocationUnknown;

    /**
     * Biological Fathers Age At Birth text field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.bio_dad_age']")
    public WebElement biologicalFathersAgeAtBirth;

    /**
     * Biological Fathers Heigth (cm) number/digit field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.dad_height']")
    public WebElement biologicalFathersHeight;

    /**
     * Biological Father Heigth Unknown checkbox
     */
    @FindBy(xpath = "//input[@name='ni.x_naci_family_coho_rasopathy_iiq.bio_dad_height_unknown']")
    public WebElement biologicalFatherHeightUnknown;

    /**
     * Update Button on Demographics tab
     */
    @FindBy(xpath = "//button[@id='sysverb_update_bottom']")
    public WebElement updateButton;

    /**
     * Add Attachment Button on Demographics tab
     */
    @FindBy(xpath = "//button[@id='add_attachment_bottom']")
    public WebElement addAttachmentButton;

    /**
     * Insert Button on Demographics tab
     */
    @FindBy(xpath = "//button[@id='sysverb_insert_bottom']")
    public WebElement insertButton;

    /**
     * Insert And Stay Button on Demographics tab
     */
    @FindBy(xpath = "//button[@id='sysverb_insert_and_stay_bottom']")
    public WebElement insertAndStayButton;

    /**
     * Save Button on Demographics tab
     */
    @FindBy(xpath = "//button[@id='sysverb_update_and_stay_bottom']")
    public WebElement saveButtonDemographicsTab;

    /**
     * Insert And Stay Button on Demographics tab
     */
    @FindBy(xpath = "//button[@id='sysverb_delete_bottom']")
    public WebElement deleteButtonDemographicsTab;

    /** ------------------END OF DEMOGRAPHIC INFORMATION SECTION--------------------- */

    /** ---------------------BEGINNING OF RASOPATHY HISTORY SECTION--------------------- */

    /**
     * Diagnosed with a RASopathy by a physician through testing dropdown
     **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.diagnosed_rasopathy']")
    public WebElement dropdownDiagnosedWithRasopathyByPhysician;

    /**
     * Diagnosed RASopathies list
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.diagnosed_rasopathies_list_nonedit']")
    public WebElement diagnosedRasopathiesTextList;

    /**
     * Please specify other RASopathy input field
     */
    @FindBy(xpath = "//input[@name='x_naci_family_coho_rasopathy_iiq.please_specify_other_rasopathy']")
    public WebElement specifyOtherRasopathyInputField;

    /** ---------------------END OF RASOPATHY HISTORY SECTION--------------------- */

    /** ---------------------BEGINNING OF Birth & Gestation SECTION--------------------- */

    /**
     * Diagnosed with hypoglycemia during the newborn period dropdown
     **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.hypoglycemia']")
    public WebElement dropdownDiagnosedWithHypoglycemiaDuringNewbornPeriod;

    /**
     * Issues identified in the participant prior to birth
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.issues_prior_to_birth_nonedit']")
    public WebElement issuesPriorToBirthTextList;

    /**
     * Were medications taken while biological mother was pregnant with the participant dropdown
     **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.medications_while_pregnant']")
    public WebElement dropdownWereMedicationsTakenWhileMotherWasPregnant;

    /**
     * Were vaping products use by participants bio mom during pregnancy dropdown
     **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.were_vaping_products_used']")
    public WebElement dropdownWereVapingProductsUsedDuringPregnancy;

    /**
     * Vape products used
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.vape_products_used_nonedit']")
    public WebElement vapingProductsTextList;

    /**
     * Please specify. Vape products
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.please_specify_vape_products']")
    public WebElement specifyVapeProductsInputField;

    /**
     * Did participants bio mother use recreational drugs during pregnancy dropdown
     **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.drugs_used_during_pregnancy']")
    public WebElement dropdownDidBioMotherUsedRecreationalDrugsDuringPregnancy;

    /**
     * Drugs used by biological mother during pregnancy
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.drugs_used_nonedit']")
    public WebElement recreationalDrugsUsedWhilePregnantTextList;

    /**
     *
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.please_specify_drugs']")
    public WebElement specifyRecreationalDrugsUsedByMotherDuringPregnancyInputField;

    /**
     * Biological mothers occupation while pregnant with the participant field
     **/
    @FindBy(xpath = "//div//textarea[@id='x_naci_family_coho_rasopathy_iiq.occuption_while_pregnant']")
    public WebElement fieldBiologicalMothersOccupationWhilePregnant;

    /**
     * Biological mothers occupation while pregnant with the participant
     */
    @FindBy(xpath = "//textarea[@id='x_naci_family_coho_rasopathy_iiq.occuption_while_pregnant']")
    public WebElement biologicalMothersOccupationWhilePregnantTextArea;

    /**
     * Biological mothers occupation unknown checkbox
     **/
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.bio_mom_occupation_unknown']")
    public WebElement checkboxBiologicalMothersOccupationUnknown;

    /**
     * Biological father occupation unknown checkbox
     **/
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.bio_dad_occupation_unknown']")
    public WebElement checkboxBiologicalFathersOccupationUnknown;

    /**
     * Did biological mother receive prenatal tests for birth defects/medical problems dropdown
     **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.prenatal_testing']")
    public WebElement dropdownDidBioMotherReceivePrenatalTests;

    /**
     * Participant mother's birth complications
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.birth_complications_nonedit']")
    public WebElement participantMotherBirthComplicationsTextList;

    /**
     * Infection (please specify) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.infection_pregnancy_condition']")
    public WebElement infectionPregnancyConditionInputField;

    /**
     * Rash (please specify) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.rash_pregnancy_condition']")
    public WebElement rashPregnancyConditionInputField;

    /**
     * Other complication input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.other_complication']")
    public WebElement otherComplicationInputField;

    /**
     * Did participants biological mother use tobacco products while pregnant dropdown
     **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.tobacco_used_while_pregnant_mom']")
    public WebElement dropdownDidBioMotherUseTobacco;

    /**
     * Tobacco products used by mother during pregnancy text
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.tobacco_products_used_by_mom_nonedit']")
    public WebElement tobaccoProductsUsedByMotherWhilePregnantTextList;

    /**
     * Please specify (Tobacco products used by mother during pregnancy) input field
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.please_specify_tobacco']")
    public WebElement specifyTobaccoUsedByMotherDuringPregnancyInputField;

    /**
     * Did participants biological mother drink alcohol while pregnant with participant dropdown
     **/
    @FindBy(xpath = "//select[@id='x_naci_family_coho_rasopathy_iiq.alcohol_while_pregnant']")
    public WebElement dropdownDidBioMotherUseAlcohol;

    /**
     * Alcohol used by mom during pregnancy
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.alcohol_used_by_mom_during_pregnancy_nonedit']")
    public WebElement alcoholUsedByMotherWhilePregnantTextList;

    /**
     * Please specify (Alcohol used by mom during pregnancy)
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.please_specify_alcohol']")
    public WebElement specifyAlcoholUsedByMotherDuringPregnancyInputField;

    /**
     * Did the participants mother ever live/work in a place where others use tobacco dropdown
     **/
    @FindBy(xpath = "//select[@name='x_naci_family_coho_rasopathy_iiq.live_work_near_tobacco_usage']")
    public WebElement dropdownDidBioMotherEverLiveWorkWhereOtherUseTobacco;

    /**
     * Tobacco products used around mother during pregnancy text
     */
    @FindBy(xpath = "//p[@id='x_naci_family_coho_rasopathy_iiq.environmental_tobacco_types_nonedit']")
    public WebElement tobaccoProductsUsedAroundMotherWhilePregnantTextList;

    /**
     * Please specify (Tobacco products used around mother during pregnancy)
     */
    @FindBy(xpath = "//input[@id='x_naci_family_coho_rasopathy_iiq.please_specify_tobacco_around']")
    public WebElement specifyTobaccoUsedAroundMotherDuringPregnancyInputField;

    /**
     * Biological fathers occupation while mother was pregnant with the participant field
     **/
    @FindBy(xpath = "//div//textarea[@id='x_naci_family_coho_rasopathy_iiq.fathers_occupation_while_pregnant']")
    public WebElement fieldBioFatherOccupationWhileMotherWasPregnant;

    /**
     * Biological father occupation unknown checkbox
     */
    @FindBy(xpath = "//input[@id='sys_original.x_naci_family_coho_rasopathy_iiq.bio_dad_occupation_unknown']")
    public WebElement biologicalFatherOccupationUnknownCheckbox;

    /** ---------------------END OF Birth & Gestation SECTION--------------------- */


    /**
     * USE THIS METHOD TO DYNAMICALLY LOCATE TABS BY SPECIFYING EXACT TEXT
     *
     * @param text
     * @return
     */
    public WebElement dynamicTabLocator(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//span[text()='" + text + "']"));
    }

    /**
     * Verifies the input field element with the expected value using SoftAssert and throws an error message if the assertion fails.
     *
     * @param inputFieldElm the WebElement input field element to verify
     * @param expectedValue the expected value to compare with the input field element's value attribute
     * @param errorMessage  the error message to throw in case of assertion failure
     */
    public static void verifyInputField(WebElement inputFieldElm, String expectedValue, String errorMessage) {
        softAssert.assertEquals(CommonUtils.getAttributeValueOfValueAttribute(inputFieldElm), expectedValue, errorMessage);
    }

    /**
     * Verifies the checkbox element with the actual value against the value attribute of the checkbox element.
     *
     * @param actualCheckboxValue the actual value to compare with the checkbox element's value attribute
     * @param checkBoxElm         the WebElement representing the checkbox element to verify
     * @param errorMessage        the error message to throw if the verification fails
     */
    public static void verifyCheckbox(String actualCheckboxValue, WebElement checkBoxElm, String errorMessage) {
        softAssert.assertEquals(actualCheckboxValue, CommonUtils.getAttributeValueOfValueAttribute(checkBoxElm), errorMessage);

    }

    /**
     * Converts the text content of a WebElement to a list of strings.
     *
     * @param webElement the WebElement containing the text to be processed
     * @return a List of strings extracted from the text content of the WebElement, separated by commas and excluding content within parentheses
     */
    public List<String> textToList(WebElement webElement) {
        List<String> output = new ArrayList<>();
        StringBuilder currentItem = new StringBuilder();
        int openParentheses = 0;
        for (char c : webElement.getText().toCharArray()) {
            if (c == ',' && openParentheses == 0) {
                output.add(currentItem.toString().trim());
                currentItem.setLength(0);
            } else {
                if (c == '(') {
                    openParentheses++;
                } else if (c == ')') {
                    openParentheses--;
                }
                currentItem.append(c);
            }
        }
        if (currentItem.length() > 0) {
            output.add(currentItem.toString().trim());
        }
        return output;
    }

    /**
     * Converts inches to centimeters.
     *
     * @param inches a String representation of the length in inches to be converted
     * @return a String representing the length converted from inches to centimeters
     */
    public String inchToCm(String inches) {
        return String.valueOf((int) Math.floor(Integer.parseInt(inches) * 2.54));
    }

    /**
     * Sorts and compares two lists of string values in a case-insensitive manner.
     *
     * @param actualListValues   the list of actual string values to be sorted and compared
     * @param expectedListValues the list of expected string values to be sorted and compared
     * @return true if the sorted actualListValues is equal to the sorted expectedListValues, false otherwise
     */
    public static boolean sortAndCompareLists(List<String> actualListValues, List<String> expectedListValues) {
        Collections.sort(actualListValues);
        Collections.sort(expectedListValues);
        System.out.println("Actual: " + actualListValues);
        System.out.println("Expected: " + expectedListValues);
        return actualListValues.equals(expectedListValues);
    }

    public RAS_Survey_Native_View_Page() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}