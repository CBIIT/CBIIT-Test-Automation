package ServiceNow.CHARMS.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyRASIIQFormPage {

    /* RAS SCREENER IIQ FORM EMAIL TEXT BOX*/
    @FindBy(xpath = "//*[@id='QR~Authentication-FL_3~0']")
    public WebElement screenerIiqFormEmail;

    /* RAS SCREENER IIQ FORM ONE TIME PIN TEXT BOX*/
    @FindBy(xpath = "//*[@id='QR~Authentication-FL_3~1']")
    public WebElement screenerIiqFormPin;

    /* RAS SCREENER IIQ FORM THIS IS A COPY FOR LOWER ENVIRONMENTS ONLY TEXT*/
    @FindBy(xpath = "//*[@id='QID14']/div[3]/div")
    public WebElement screenerIiqFormThisIsACopyForLowerEnvironments;

    /* RAS SCREENER IIQ FORM THIS SECTION ASKS YOU TO TELL US DETAILED MEDICAL HISTORY TEXT*/
    @FindBy(xpath = "//*[@id='QID36']/div[3]/div/div[1]")
    public WebElement screenerIiqFormThisSectionAsksDetailedMedicalHistoryText;

    /* RAS SCREENER IIQ FORM THIS SECTION WILL ASK ABOUT CANCER TEXT*/
    @FindBy(xpath = "//*[@id='QID99']/div[3]/div/div[1]")
    public WebElement screenerIiqFormThisSectionWillAskAboutCancerText;

    /* RAS SCREENER IIQ FORM FILL OUT BIRTH WEIGHT TEXT*/
    @FindBy(xpath = "//*[@id='QR~QID98#1~1~1~TEXT']")
    public WebElement screenerIiqFormFillOutBirthWeight;

    /* RAS SCREENER IIQ FORM FILL OUT CURRENT HEIGHT TEXT BOX*/
    @FindBy(xpath = "//*[@id='QR~QID101#1~2~1~TEXT']")
    public WebElement screenerIiqFormFillOutCurrentHeightTextBox;

    /* RAS SCREENER IIQ FORM FILL OUT CURRENT HEIGHT UNIT DROP DOWN*/
    @FindBy(xpath = "//*[@id='QR~QID101#2~2']")
    public WebElement screenerIiqFormFillOutCurrentHeightUnitDropDown;

    /* RAS SCREENER IIQ FORM COMPLETE CURRENT WEIGHT TEXT BOX*/
    @FindBy(xpath = "//*[@id='QR~QID173#1~1~1~TEXT']")
    public WebElement screenerIiqFormCompleteCurrentWeightTextBox;

    /* RAS SCREENER IIQ FORM AT WHAT AGE WERE YOU AT THE HIGHEST WEIGHT TEXT BOX*/
    @FindBy(xpath = "//*[@id='QR~QID78']")
    public WebElement screenerIiqFormWhatAgeHighestWeightTextBox;

    /* RAS SCREENER IIQ FORM COMPLETE CURRENT WEIGHT UNIT DROP DOWN*/
    @FindBy(xpath = "//*[@id='QR~QID173#2~1']")
    public WebElement screenerIiqFormCompleteCurrentWeightUnitDropDown;

    /* RAS SCREENER IIQ FORM COMPLETE OVER LIFETIME WEIGHT TEXT BOX*/
    @FindBy(xpath = "//*[@id='QR~QID173#1~6~1~TEXT']")
    public WebElement screenerIiqFormCompleteOverLifetimeWeightTextBox;

    /* RAS SCREENER IIQ FORM COMPLETE OVER LIFETIME WEIGHT UNIT DROP DOWN*/
    @FindBy(xpath = "//*[@id='QR~QID173#2~6']")
    public WebElement screenerIiqFormCompleteOverLifetimeWeightUnitDropDown;

    /* RAS SCREENER IIQ FORM COMPLETE AT 18 WEIGHT TEXT BOX*/
    @FindBy(xpath = "//*[@id='QR~QID173#1~3~1~TEXT']")
    public WebElement screenerIiqFormCompleteAt18WeightTextBox;

    /* RAS SCREENER IIQ FORM COMPLETE AT 18 WEIGHT UNIT DROP DOWN*/
    @FindBy(xpath = "//*[@id='QR~QID173#2~3']")
    public WebElement screenerIiqFormCompleteAt18WeightUnitDropDown;

    /* RAS SCREENER IIQ FORM FILL OUT BIRTH WEIGHT UNIT DROP DOWN*/
    @FindBy(xpath = "//*[@id='QR~QID98#3~1']")
    public WebElement screenerIiqFormFillOutBirthWeightUnitDropDown;

    /* RAS SCREENER IIQ FORM FILL OUT BIRTH LENGTH HEAD NUMERIC TEXT BOX*/
    @FindBy(xpath = "//*[@id='QR~QID171#1~2~1~TEXT']")
    public WebElement screenerIiqFormFillOutBirthLenghtHeadNumeticTextBox;

    /* RAS SCREENER IIQ FORM FILL OUT BIRTH LENGTH HEAD UNIT DROP DOWN*/
    @FindBy(xpath = "//*[@id='QR~QID171#3~2']")
    public WebElement screenerIiqFormFillOutBirthLenghtHeadUnitDropDown;

    /* RAS SCREENER IIQ FORM FILL OUT BIRTH LENGTH HEAD CIRCUMFERENCE NUMERIC TEXT BOX*/
    @FindBy(xpath = "//*[@id='QR~QID171#1~3~1~TEXT']")
    public WebElement screenerIiqFormFillOutBirthLenghtHeadCircumferenceNumeticTextBox;

    /* RAS SCREENER IIQ FORM FILL OUT BIRTH LENGTH HEAD CIRCUMFERENCE UNIT DROP DOWN*/
    @FindBy(xpath = "//*[@id='QR~QID171#3~3']")
    public WebElement screenerIiqFormFillOutBirthLenghtHeadCircumferenceUnitDropDown;

    /* RAS SCREENER IIQ FORM SOME OF THIS INFORMATION TEXT */
    @FindBy(xpath = "//*[@id='QID16']/div[3]")
    public WebElement screenerIiqFormSomeOfThisInformation;

    /* RAS SCREENER IIQ FORM THIS FIRST QUESTION OF THE QUESTIONNAIRE TEXT */
    @FindBy(xpath = "//*[@id='QID35']/div[3]")
    public WebElement screenerIiqFormThisFirstQuestionOfTheQuestionnaire;

    /* RAS SCREENER IIQ FORM YOU ARE ALMOST DONE TEXT */
    @FindBy(xpath = "//*[@id='QID100']/div[3]/div")
    public WebElement screenerIiqFormYouAreAlmostDoneText;

    /* RAS SCREENER IIQ FORM THIS FOR WICH SEX DO YOU IDENTIFY RADIO BUTTON */
    @FindBy(xpath = "//*[@id='QID92-1-label']")
    public WebElement screenerIiqFormForWhichSexYouIdentifyRadioButton;

    public MyRASIIQFormPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
