package ServiceNow.CHARMS.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;

public class RASopathyQuestionnairePage {

    /* ----- BEGINNING OF RASopathy Eligibility Questionnaire PAGE ---- */

    /* STUDY INTRODUCTION next button (THIS WORKS FOR ALL NEXT BUTTONS) */
    @FindBy(xpath = "//input[@title='→']")
    public WebElement studyNextButton;

    /* RAS Survey Save and Next button (THIS WORKS FOR ALL NEXT BUTTONS) */
    @FindBy(xpath = "//*[@id='NextButton']")
    public WebElement rasSurveySaveAndNextButton;

    /* RAS Survey Previous button (THIS WORKS FOR ALL NEXT BUTTONS) */
    @FindBy(xpath = "//*[@id='PreviousButton']")
    public WebElement rasSurveyPreviousButton;

    /* This Form Canot Be Saved Text */
    @FindBy(xpath = "//p[contains(text(),'If you are unable to complete the online questionn')]")
    public WebElement thisFormCannotBeSavedText;

    /* If You Are Unable To Complete Text */
    @FindBy(xpath = "//p[contains(text(),'If you are unable to complete the online questionn')]")
    public WebElement ifYouAreUnableToCompleteText;

    /* Have Any Of Your Relatives Been Diagnosed No Radio Button */
    @FindBy(xpath = "//*[@id='QID43']/div[3]/div/fieldset/div/ul/li[2]/span")
    public WebElement haveAnyOfYourRelativesBeenDiagnosedNoRadioButton ;

    /* Have You Ever Had Genetic Testing No Radio Button */
    @FindBy(xpath = "//*[@id='QID120-2-label']")
    public WebElement haveYouEverHadGeneticTestingNoRadioButton ;

    /* ************************************************************************ */
    /*
     * BEGINNING OF Are you completing this form for someone else or for yourself?
     * PAGE
     *
     *
     * /* I am completing this form for someone else option
     */

    /* I am completing this form for myself option */
    @FindBy(xpath = "//span[contains(text(),'I am completing this form for myself')]")
    public WebElement iAmCompletingThisFormForMyselfOption;

    /* END OF Are you completing this form for someone else or for yourself?PAGE */
    /* ************************************************************************ */
    /*
     * BEGINNING OF What is the name of the person who may be eligible for this
     * study? PAGE
     */

    /* First Name of the participant text box */
    @FindBy(xpath = "//input[@name='QR~QID105~4~TEXT']")
    public WebElement firstNameTextBox;

    /*
     * END OF What is the name of the person who may be eligible for this study?
     * PAGE
     */
    /* ************************************************************************ */
    /* --------BEGINNING OF What is your name? Proxy Name details PAGE---------- */

    /* -------- END OF What is your name? Proxy Name details PAGE ---------- */
    /* ************************************************************************ */
    /* -------- BEGINNING OF What is your relationship to name? PAGE ------ */

    /* ---- END OF What is your relationship to name? PAGE ----- */
    /* ************************************************************************ */
    /* ---- BEGINNING OF Are you the legal guardian of -- name? PAGE ----- */

    /* END OF Are you the legal guardian of automated name? PAGE */
    /* ************************************************************************ */
    /* -------- BEGINNING OF Date of birth of "name" PAGE ------- */

    /* IIQ Were you race No option */
    @FindBy(xpath = "//*[@id='QID21-2-label']")
    public WebElement iiqWereYouRaisedNoOption;

    /* Calendar month drop down */
    @FindBy(xpath = "//select[@aria-label='Month']")
    public WebElement calendarMonthDropDown;

    /* Calendar year text box */
    @FindBy(xpath = "//input[@aria-label='Year']")
    public WebElement calendarYearTextBox;

    /* Calendar day option */
    @FindBy(xpath = "//span[@aria-label='April 1, 1990']")
    public WebElement calendarDayOption;

    /* IIQ Calendar day option */
    @FindBy(xpath = "//span[@aria-label='November 10, 2004']")
    public WebElement iIQcalendarDayOption;

    /* IIQ Address Don't Know Text Box*/
    @FindBy(xpath = "//*[@id='QR~QID24~4']")
    public WebElement iIQAddressDontKnowTextBox;

    /* -------- END OF Date of birth of "name" PAGE --------------- */
    /* ************************************************************************ */
    /* --- BEGINNING OF Sex of "name" assigned at birth PAGE----- */

    /* ---- END OF Sex of "name" assigned at birth PAGE ------- */
    /* ************************************************************************ */
    /* -------- BEGINNING OF Is "name" adopted? PAGE ----------- */

    /* -------- END OF Is "name" adopted? PAGE --------------- */
    /* ************************************************************************ */
    /* -------- BEGINNING OF Is "name" still alive? PAGE --------------- */

    /* -------- END OF Is "name" still alive? PAGE --------------- */
    /* ************************************************************************ */
    /* -------- BEGINNING OF Date of death of Participant PAGE ------ */

    /* -------- End OF Date of death of Participant PAGE --------------- */
    /* ************************************************************************ */
    /* BEGINNING OF Does "name" currently live in the United States? PAGE */

    /* What country does participant currently live in? drop down */
    @FindBy(xpath = "//select[@data-runtime-value='runtime.Selected']")
    public WebElement whatCountryDoesParticipantCurrentlyLiveInDropDown;

    /* End OF Does "name" currently live in the United States? PAGE */
    /* ************************************************************************ */
    /* BEGINNING OF Does "participant" currently live in the United States?PAGE */

    /* END OF Does participant currently live in the United States?PAGE */
    /* ************************************************************************ */
    /* -------- BEGINNING OF What is your email address? PAGE --------------- */

    /* -------- END OF What is your email address? PAGE --------------- */
    /* ************************************************************************ */
    /* -------- BEGINNING OF Please confirm your email address PAGE-------- */

    /* -------- END OF Please confirm your email address PAGE--------------- */
    /* ************************************************************************ */
    /*
     * BEGINNING Please list your phone numbers below. Please also select your
     * preferred contact number. PAGE
     */

    /* Home phone number text box */
    @FindBy(xpath = "//tbody/tr[1]/th[1]/span[1]/div[1]/input[1]")
    public WebElement pleaseListHomePhoneNumberTextBox;

    /* Cell phone number text box */
    @FindBy(xpath = "//tbody/tr[2]/th[1]/span[1]/div[1]/input[1]")
    public WebElement pleaseListCellPhoneNumberTextBox;

    /* Work phone number text box */
    @FindBy(xpath = "//tbody/tr[3]/th[1]/span[1]/div[1]/input[1]")
    public WebElement pleaseListWorkPhoneNumberTextBox;

    /* Preferred Contact Cell phone number check box */
    @FindBy(xpath = "//tbody/tr[@class='ChoiceRow ReadableAlt ']/td[1]/label[1]")
    public WebElement pleaseSelectCellPhonePreferredContactCheckBox;

    /*
     * END OF Please list your phone numbers below. Please also select your
     * preferred contact number. PAGE
     */
    /* ************************************************************************ */
    /* -------- BEGINNING OF Ethnicity of "Name" PAGE --------------- */

    /* hispanic/latino option */
    @FindBy(xpath = "//span[contains(@class,'LabelWrapper')]//label[1]//span[text()='Hispanic/Latino']")
    public WebElement authenticityOfParticipantHispanicLatinoOption;

    /* Not hispanic/latino option */
    // @FindBy(xpath =
    // "//span[contains(@class,'LabelWrapper')]//label[contains(@for,'QR~QID113~2')]")
    @FindBy(xpath = "//span[contains(@class,'LabelWrapper')]//label[1]//span[text()='Not Hispanic/Latino']")
    public WebElement authenticityOfParticipantNotHispanicLatinoOption;

    /* -------- END OF Ethnicity of "Name" PAGE --------------- */
    /* ************************************************************************ */
    /* BEGINNING OF Race of "Name". Please select all that apply.PAGE */

    /* All Race options except Prefer not to answer */
    @FindBy(xpath = "//span[contains(text(),'White')]")
    public WebElement raceOfParticipantWhite;

    @FindBy(xpath = "//span[contains(text(),'Black/African American')]")
    public WebElement raceOfParticipantBlackAfricanAmerican;

    @FindBy(xpath = "//span[contains(text(),'Native Hawaiian/Pacific Islander')]")
    public WebElement raceOfParticipantnativeHawaiianPacificIslander;

    @FindBy(xpath = "//span[contains(text(),'American Indian/Alaskan Native')]")
    public WebElement raceOfParticipantAmericanIndianAlaskanNative;

    @FindBy(xpath = "//span[contains(text(),'Asian')]")
    public WebElement raceOfParticipantAsian;

    @FindBy(xpath = "//span[contains(text(),'Other')]")
    public WebElement raceOfParticipantOther;

    @FindBy(xpath = "//input[@title='Other']")
    public WebElement raceOfParticipantOtherTextBox;

    /* -------- END OF Race of "Name". Please select all that apply.PAGE ------ */
    /* ************************************************************************ */
    /*
     * BEGINNING OF Is Automated Test a participant in any other research study or
     * registry group? Please specify.PAGE
     */

    /*
     * END OF Is Automated Test a participant in any other research study or
     * registry group? Please specify.PAGE
     */
    /* ************************************************************************ */
    /*
     * --- BEGINNING OF Has Automated Test ever been diagnosed with the following
     * conditions?Select all that apply. If you do not see the exact condition
     * diagnosed, please select the closest answer. PAGE-----
     */

    @FindBy(xpath = "//span[contains(text(),', failure to thrive, or other stomach/digestive pr')]")
    public WebElement hasParticipantBeenDiagnosedWithConditionsFeedingProblemsOption;

    @FindBy(xpath = "//span[contains(text(),'such as: soft loose skin, fine/thin/thick/dry/brit')]")
    public WebElement hasParticipantBeenDiagnosedWithConditionsSkinHairAbnormalitiesOption;

    /*
     * ---- END OF Has Automated Test ever been diagnosed with the following
     * conditions? Select all that apply. If you do not see the exact condition
     * diagnosed, please select the closest answer. PAGE --
     */
    /* ************************************************************************ */
    /* -------- BEGINNING OF Has "Name" ever been diagnosed with cancer? PAGE --- */

    /* -------- END OF Has "Name" ever been diagnosed with cancer? PAGE--- */
    /* ************************************************************************ */
    /*
     * ---- BEGINNING OF Please complete the box below by selecting which primary
     * cancers were diagnosed and at what age and year they occurred. If cancer
     * spread from one place to another, please only indicate the original cancers
     * and not the number of sites where cancer spread. PAGE -------
     */

    /*
     * -- END OF Please complete the box below by selecting which primary cancers
     * were diagnosed and at what age and year they occurred. If cancer spread from
     * one place to another, please only indicate the original cancers and not the
     * number of sites where cancer spread. PAGE -------
     */
    /* ************************************************************************ */
    /*
     * ---- For Proxy: BEGINNING OF Has "Name" been diagnosed with a RASopathy such
     * as Noonan syndrome, Noonan syndrome with multiple lentigines, Costello
     * syndrome, cardiofaciocutaneous syndrome, Legius syndrome, capillary
     * arteriovenous malformation syndrome, hereditary gingival fibromatosis or
     * SYNGAP1 syndrome? PAGE
     *
     */

    /* No option */
    @FindBy(xpath = "//span[contains(@class,'LabelWrapper')]//label[contains(@for,'QR~QID118~2')]")
    public WebElement hasProxyBeenDiagnosedWithaRasopathyNoOption;

    /*
     * For Proxy: END OF Has "Name" been diagnosed with a RASopathy such as Noonan
     * syndrome, Noonan syndrome with multiple lentigines, Costello syndrome,
     * cardiofaciocutaneous syndrome, Legius syndrome, capillary arteriovenous
     * malformation syndrome, hereditary gingival fibromatosis or SYNGAP1 syndrome?
     * PAGE
     */
    /* ************************************************************************ */
    /*
     * For Proband: Have you been diagnosed with a RASopathy such as Noonan
     * syndrome, Noonan syndrome with multiple lentigines, Costello syndrome,
     * cardiofaciocutaneous syndrome, Legius syndrome, capillary arteriovenous
     * malformation syndrome, hereditary gingival fibromatosis or SYNGAP1 syndrome?
     * PAGE
     */

    /*
     * For Proband: END OF Have you been diagnosed with a RASopathy such as Noonan
     * syndrome, Noonan syndrome with multiple lentigines, Costello syndrome,
     * cardiofaciocutaneous syndrome, Legius syndrome, capillary arteriovenous
     * malformation syndrome, hereditary gingival fibromatosis or SYNGAP1 syndrome?
     * PAGE
     */
    /* ************************************************************************ */
    /*
     * BEGINNING OF For which specific RASopathy has Automated Test been diagnosed?
     * PAGE
     *
     *
     * /* Other option
     */

    /*
     * END OF For which specific RASopathy has Automated Test been diagnosed? PAGE
     */
    /* ************************************************************************ */
    /* BEGINNING OF Age (in years) at diagnosis PAGE */

    /* END OF Age (in years) at diagnosis PAGE */
    /* ************************************************************************ */
    /* BEGINNING OF Year of diagnosis (yyyy) PAGE */

    /* END OF Year of diagnosis (YYYY) PAGE */
    /* ************************************************************************ */
    /*
     * For Proxy:BEGINNING Have any of "Participant Name" biological relatives been
     * diagnosed with a RASopathy? PAGE
     */

    /*
     * For Proxy: END Have any of "Participant Name" biological relatives been
     * diagnosed with a RASopathy? PAGE
     */
    /* ************************************************************************ */
    /*
     * For Proband: BEGINNING OF Have any of your biological relatives been
     * diagnosed with a RASopathy? PAGE
     */

    /*
     * For Proband: END OF Have any of your biological relatives been diagnosed with
     * a RASopathy? PAGE
     */
    /* ************************************************************************ */
    /* BEGINNING OF Has participant ever had genetic testing? PAGE */

    /* END OF Has participant ever had genetic testing? PAGE */
    /* ************************************************************************ */
    /* BEGINNING OF Do you have a copy of the genetic test results? PAGE */

    /* END OF Do you have a copy of the genetic test results? PAGE */
    /* ************************************************************************ */
    /*
     * BEGINNING OF How would you like to provide the genetic test results to
     * us?Please select one. On the next page, you will be provided with where to
     * send the information. PAGE
     */

    /*
     * END OF How would you like to provide the genetic test results to us?Please
     * select one. On the next page, you will be provided with where to send the
     * information. PAGE
     */
    /* ************************************************************************ */
    /*
     * BEGINNING OF If you would like to upload the genetic test results, please do
     * so here. Note: Only PDF files are accepted. PAGE
     */

    /*
     * END OF If you would like to upload the genetic test results, please do so
     * here. Note: Only PDF files are accepted. PAGE
     */
    /* ************************************************************************ */
    /*
     * BEGINNING OF Were any genetic changes detected for the following syndromes?
     * (Mark all that apply). PAGE
     *
     */

    /*
     * END OF Were any genetic changes detected for the following syndromes? (Mark
     * all that apply). PAGE
     */
    /* ************************************************************************ */
    /*
     * BEGINNING OF How did you hear about this study? If a specific health care
     * provider referred participant to this study, please include their name in the
     * corresponding text box. PAGE
     */

    /*
     * END OF How did you hear about this study? If a specific health care provider
     * referred participant to this study, please include their name in the
     * corresponding text box. PAGE
     */
    /* ************************************************************************ */
    /*
     * BEGINNING OF Has participant or other family members ever participated in
     * another study on RASopathies at another medical institution, university,
     * government agency or other site? PAGE
     */

    /*
     * END OF Has participant or other family members ever participated in another
     * study on RASopathies at another medical institution, university, government
     * agency or other site? PAGE
     */
    /* ************************************************************************ */
    /*
     * BEGINNING OF Please provide the information regarding previous participation
     * in other RASopathy studies in the box below. PAGE
     */

    /*
     * END OF Please provide the information regarding previous participation in
     * other RASopathy studies in the box below. PAGE
     */
    /* ************************************************************************ */
    /*
     * BEGINNING OF What are the main reasons for participating in this study?
     * Select all that apply. PAGE
     */

    /*
        USE THIS METHOD TO DYNAMICALLY LOCATE ELEMENTS WITH RAS SCREENER
     */
    public WebElement dynamicLocator(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[text()='" + text + "']"));
    }

    /**
     * USE THIS METHOD TO DYNAMICALLY LOCATE TEXT BOXES ON RAS SCREENER
     *
     * @param text
     * @return
     */
    public WebElement dynamicTextBoxLocator(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[text()='" + text + "']//parent::label//parent::span//parent::td/following-sibling::td/input"));
    }

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE PHONE NUMBER TEXT BOXES ON RAS SCREENER
     * @param text
     * @return
     */
    public WebElement dynamicTextBoxLocatorForPhoneNumbers(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[text()='" + text + "']//parent::label/following-sibling::input"));
    }

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE PHONE NUMBER CHECK BOXES ON RAS SCREENER
     * @param text
     * @return
     */
    public WebElement dynamicPhoneNumberCheckBox(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[text()='" + text + "']//parent::label//parent::div//parent::span//parent::th/following-sibling::td/label"));
    }

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE EMAIL ADDRESS TEXT BOXES ON RAS SCREENER
     * @param text
     * @return
     */
    public WebElement dynamicEmailAddressTextBox(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[text()='" + text + "']//parent::legend/following-sibling::div/div/input"));
    }

    /***
     * USE THIS METHOD TO DYNAMICALLY CLICK ON ALL CHECKBOXES ON RAS SCREENER
     * @param text
     * @return
     */
    public WebElement dynamicClickOnCheckboxesScreener(int index) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[@id='Questions']//child::div[2]//child::div[3]//child::div[1]//child::fieldset//child::legend/following-sibling::div//child::ul//child::li[" + index + "]//child::span//child::label"));
    }

    /***
     * USE THIS METHOD TO DYNAMICALLY IMPUT TEXT IN TEXT BOX FOR CHECKED OPTIONS ON RAS SCREENER
     * @param text
     * @return
     */
    public WebElement dynamicEnterTextOnCheckboxesScreener(int index) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[@id='Questions']//child::div[2]//child::div[3]//child::div[1]//child::fieldset//child::legend/following-sibling::div//child::ul//child::li[" + index + "]//child::span//child::input"));
    }

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE TEXT BOXES ON HOW DID YOU HEAR ABOUT THIS STUDY PAGE ON RAS SCREENER
     * @param text
     * @return
     */
    public WebElement dynamicLocatorForHowDidYouHearAboutStudyTextBoxes(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[text()='" + text + "']//parent::label//parent::span/input"));
    }

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE ELEMENTS ON MAIN REASONS FOR PARTICIPATING IN STUDY PAGE
     * @param text
     * @return
     */
    public WebElement dynamicLocatorForMainReasonForParticipatingInStudy(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[text()='" + text + "']//parent::span//parent::label/following-sibling::input"));
    }

    public RASopathyQuestionnairePage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
