package ServiceNow.CHARMS.Pages;

import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyRASSurveyPage {

    /* RAS SURVEY TEXT*/
    @FindBy(xpath = "//*[@id='LogoContainer']//parent::div//child::div[3]//child::div//child::div[2]//child::div[3]")
    public WebElement rasSurveyText;

    /* RAS SCREENER TEXT*/
    @FindBy(xpath = "//*[@id='Header']//parent::div//parent::div//child::div[4]//child::div//child::div[2]//child::div[3]//child::div")
    public WebElement rasScreenerText;

    /* RAS SURVEY THANK YOU FOR STARTING TEXT*/
    @FindBy(xpath = "//*[@id='QID316']/div[3]/div/div[1]/p[1]/span")
    public WebElement rasSurveyThankYouForStartingText;

    /* RAS SURVEY THIS QUESTION MAY TAKE TEXT*/
    @FindBy(xpath = "//*[@id='QID582']/div[3]/div/div[1]/div[2]")
    public WebElement rasSurveyThisQuestionMayTakeText;

    /* RAS SURVEY AT WHAT AGE WERE YOU ABLE TO WALK WITHOUT SUPPORT TEXT*/
    @FindBy(xpath = "//*[@id='QID84']/div[3]/div/fieldset/legend/div")
    public WebElement atWhatAgeWereYouAbleToWalkWithoutSupportText;

    /* RAS SURVEY THE FIRST BLOCK TEXT*/
    @FindBy(xpath = "//*[@id='QID582']/div[3]/div/div[1]/div[2]")
    public WebElement rasSurveyTheFirstBlockText;

    /* RAS SURVEY PLEASE PROVIDE ANY ADDITIONAL INFORMATION TEXT BOX*/
    @FindBy(xpath = "//*[@id='QR~QID59']")
    public WebElement rasSurveyPleaseProvideAnyAdditionalInformationTextBox;

    /* RAS SURVEY THE NEXT SET OF QUESTIONS WILL ASK ABOUT BIRTH AND NEONATAL TEXT */
    @FindBy(xpath = "//*[@id='QID61']/div[3]/div/div[1]/span")
    public WebElement rasSurveyTheNextSetOfQuestionsWillAskAboutBirthAndNeonatalText;

    /* RAS SURVEY ATTACHING FILE */
    @FindBy(xpath = "//*[@id='QID97']/div[3]/div/fieldset/div")
    public WebElement rasSurveyAffFile;

    /* RAS SURVEY THE NEXT SET OF QUESTIONS WILL ASK ABOUT DEVELOPMENT TEXT */
    @FindBy(xpath = "//*[@id='QID323']/div[3]/div/div[1]")
    public WebElement theNextSetOfQuestionsWillAskAboutDevelopmentText;

    /* RAS SURVEY THE NEXT SET OF QUESTIONS WILL ASK ABOUT HEART TEXT */
    @FindBy(xpath = "//*[@id='QID302']/div[3]/div/div[1]")
    public WebElement theNextSetOfQuestionsWillAskAboutHeartText;

    /* RAS SURVEY THE NEXT TWO QUESTIONS WILL ASK ABOUT RASOPATHY DIAGNOSES TEXT */
    @FindBy(xpath = "//*[@id='QID301']/div[3]/div")
    public WebElement theNextTwoQuestionsWillAskAboutRASopathyDiagnosesText;

    /* RAS SURVEY THE NEXT SET OF QUESTIONS WILL ASK ABOUT GENERAL MEDICAL HISTORY TEXT */
    @FindBy(xpath = "//*[@id='QID303']/div[3]/div")
    public WebElement theNextTwoQuestionsWillAskAboutMedicalHistoryText;

    /* RAS SURVEY THE NEXT SET OF QUESTIONS WILL ASK ABOUT GI  TEXT */
    @FindBy(xpath = "//*[@id='QID304']/div[3]/div")
    public WebElement theNextTwoQuestionsWillAskAboutGiText;

    /* RAS SURVEY PLEASE COMPLETE THE TABLE BELOW REGARDING NAUSEA SYMPTOMS TEXT */
    @FindBy(xpath = "//*[@id='QID130']/div[3]/div")
    public WebElement pleaseCompleteTheTableBelowRegardingNauseaSymptomsText;

    /* RAS SURVEY CATHETER INTERVENTION CHECK BOX */
    @FindBy(xpath = "//*[@id='QID101-2-label']")
    public WebElement catheterInterventionTextBox;

    /* RAS SURVEY WHAT IS THE HEIGHT OF YOUR BIOLOGICAL MOTHER AND FATHER TEXT */
    @FindBy(xpath = "//*[@id='QID75']/div[3]/div/fieldset/legend/label")
    public WebElement whatIsTheHeightOfYourBiologicalMotherAndFatherText;

    /* RAS SURVEY WHAT IS THE LONGEST AMOUNT OF TIME THAT HAS PASSED  TEXT */
    @FindBy(xpath = "//*[@id='QID155']/div[3]/div/fieldset/legend/label")
    public WebElement whatIsTheLongestAmountOfTimeThatHasPassedText;

    /* RAS SURVEY PLEASE COMPLETE THE TABLE BELOW FOR ALL FOODS TEXT */
    @FindBy(xpath = "//*[@id='QID378']/div[3]/div/fieldset/legend/label")
    public WebElement pleaseCompleteTheTableBelowForAllFoodsText;

    /* RAS SURVEY PLEASE PROVIDE INFORMATION FOR THE MOST RECENT PROCEDURE TEXT */
    @FindBy(xpath = "//*[@id='QID161']/div[3]/div/fieldset/legend/label")
    public WebElement pleaseProvideInformationForTheMostRecentProcedureText;

    /* RAS SURVEY PLEASE COMPLETE THE TABLE BELOW REGARDING WEIGHT LOSS TEXT */
    @FindBy(xpath = "//*[@id='QID328']/div[3]/div/fieldset/legend/label")
    public WebElement pleaseCompleteTheTableBelowRegardingWeightLossText;

    /* RAS SURVEY HAVE ANY OF THE FOLLOWING SYMPTOMS OCCURRED 4 TEXT */
    @FindBy(xpath = "//*[@id='QID136']/div[3]/div/fieldset/legend/div")
    public WebElement haveAnyOfTheFollowingSymptomsOccurred4Text;

    /* RAS SURVEY PLEASE COMPLETE THE NEXT SET OF QUESTIONS REGARDING VOMITING TEXT */
    @FindBy(xpath = "//*[@id='QID134']/div[3]/div/fieldset/legend/label")
    public WebElement pleaseCompleteTheNextSetOfQuestionsRegardingVomitingText;

    /* RAS SURVEY PLEASE COMPLETE THE INFORMATION BELOW REGARDING BOWEL TEXT */
    @FindBy(xpath = "//*[@id='QID146']/div[3]/div/fieldset/legend/label")
    public WebElement pleaseCompleteTheInformationBelowRegardingBowelText;

    /* RAS SURVEY PLEASE COMPLETE THE TABLE BELOW FOR ALL OTHER TEXT */
    @FindBy(xpath = "//*[@id='QID379']/div[3]/div/fieldset/legend/label")
    public WebElement pleaseCompleteTheTableBelowForAllOtherText;

    /* RAS SURVEY HAVE YOU EVER BEEN DIAGNOSED WITH ANY FUNCTIONAL HEART ISSUE TEXT */
    @FindBy(xpath = "//*[@id='QID322']/div[3]/div/fieldset/legend/div")
    public WebElement haveYouEverBeenDiagnosedWithAnyFunctionalHeartIssueText;

    /* RAS SURVEY THE NEXT SET OF QUESTIONS WILL ASK ABOUT HORMONE RELATED GROWTH TEXT */
    @FindBy(xpath = "//*[@id='QID324']/div[3]/div/div[1]")
    public WebElement rasSurveyTheNextSetOfQuestionsWillAskAboutHormoneRelatedGrowthText;

    /* RAS SURVEY PLEASE COMPLETE THE TABLE BELOW REGARDING YOUR BIOLOGICAL PARENTS. BIOLOGICAL MOTHER CITY TEXT BOX*/
    @FindBy(xpath = "//*[@id='QR~QID318#1~1~1~TEXT']")
    public WebElement pleaseCompleteYourBiologicalParentsBiologicalMotherCityTextBox;

    /* IIQ HOW ARE THE BIOLOGICAL PARENTS BLOOD-RELATED TO EACH OTHER TEXT AREA*/
    @FindBy(xpath = "//*[@id='QR~QID42~1~TEXT']")
    public WebElement HowAreYourBiologicalTextArea;

    /* RAS SURVEY PLEASE COMPLETE THE TABLE BELOW REGARDING YOUR BIOLOGICAL PARENTS. BIOLOGICAL MOTHER UNSURE RADIO BUTTON*/
    @FindBy(xpath = "//*[@id='QID318']/div[3]/div/fieldset/fieldset/div/table/tbody/tr[1]/td[6]/label")
    public WebElement pleaseCompleteYourBiologicalParentsBiologicalMotherUnsureRadioButton;

    /* RAS SURVEY PLEASE COMPLETE THE TABLE BELOW REGARDING YOUR BIOLOGICAL PARENTS. BIOLOGICAL MOTHER YEARS DROP DOWN*/
    @FindBy(xpath = "//*[@id='QR~QID318#3~1']")
    public WebElement pleaseCompleteYourBiologicalParentsBiologicalMotherYearsDropDown;

    /* RAS SURVEY PLEASE COMPLETE THE TABLE BELOW REGARDING YOUR BIOLOGICAL PARENTS. BIOLOGICAL FATHER CITY TEXT BOX*/
    @FindBy(xpath = "//*[@id='QR~QID318#1~2~1~TEXT']")
    public WebElement pleaseCompleteYourBiologicalParentsBiologicalFatherCityTextBox;

    /* RAS SURVEY PLEASE COMPLETE THE TABLE BELOW REGARDING YOUR BIOLOGICAL PARENTS. BIOLOGICAL FATHER UNSURE RADIO BUTTON*/
    @FindBy(xpath = "//*[@id='QID318']/div[3]/div/fieldset/fieldset/div/table/tbody/tr[2]/td[6]/label")
    public WebElement pleaseCompleteYourBiologicalParentsBiologicalFatherUnsureRadioButton;

    /* RAS SURVEY PLEASE COMPLETE THE TABLE BELOW REGARDING YOUR BIOLOGICAL PARENTS. BIOLOGICAL FATHER YEARS DROP DOWN*/
    @FindBy(xpath = "//*[@id='QR~QID318#3~2']")
    public WebElement pleaseCompleteYourBiologicalParentsBiologicalFatherYearsDropDown;

    /* RAS SURVEY HOW MANY TIMES HAVE YOU RECEIVED GROWTH HORMONE TREATMENT DROP DOWN*/
    @FindBy(xpath = "//*[@id='Questions']/child::div[2]//child::div[3]//child::div//child::fieldset//child::div//child::select")
    public WebElement howManyTimesHaveYouReceivedGrowthHormoneTreatmentDropDown;

    /* RAS SURVEY PLEASE INDICATE THE RESULTS OF THE PRENATAL TESTS OTHER TEXT BOX*/
    @FindBy(xpath = "//*[@id='QR~QID41~8~TEXT']")
    public WebElement pleaseIndicateTheResultsOfThePrenatalTestsOtherTextBox;

    /* RAS SURVEY PLEASE INDICATE THE RESULTS OF THE PRENATAL TESTS OTHER TEXT BOX*/
    @FindBy(xpath = "//*[@id='QR~QID141']")
    public WebElement toWhatFoodsAreYouAverseTextBox;

    /* RAS SURVEY PULMONARY VALVE BUTTON */
    @FindBy(xpath = "//*[@id='QID98-1-label']/span")
    public WebElement pulmonaryValveButton;

    /* RAS SURVEY HAVE YOU EVER BEEN DIAGNOSED OPTION 1 CHECK BOX */
    @FindBy(xpath = "//*[@id='QID105-1-label']/span")
    public WebElement haveYouEverBeenDiagnosedOption1CheckBox;

    /* RAS SURVEY HAVE YOU EVER BEEN DIAGNOSED OPTION 2 CHECK BOX */
    @FindBy(xpath = "//*[@id='QID105-2-label']")
    public WebElement haveYouEverBeenDiagnosedOption2CheckBox;

    /* RAS SURVEY HAVE YOU EVER BEEN DIAGNOSED OPTION 3 CHECK BOX */
    @FindBy(xpath = "//*[@id='QID105-3-label']")
    public WebElement haveYouEverBeenDiagnosedOption3CheckBox;

    /* RAS SURVEY WHAT WAS YOUR HEIGHT BEFORE STARTING GROWTH HORMONE TEXT BOX*/
    @FindBy(xpath = "//*[@id='QR~QID79~1~TEXT']")
    public WebElement whatWasYourHeightBeforeStartingGrowthHormoneHeightTextBox;

    /* RAS SURVEY OTHER PLEASE SPECIFY TEXT BOX*/
    @FindBy(xpath = "//span[contains(text(),'Other (please specify)')]//parent::label//parent::span//child::input")
    public WebElement otherPleaseSpecifyTextBox;

    /* RAS SURVEY YES RADIO BUTTON*/
    @FindBy(xpath = "//*[text()='Yes']")
    public WebElement rasSurveyYesRadioButton;

    /* RAS SURVEY OTHER PLEASE SPECIFY DYNAMIC TEXT BOX*/
    @FindBy(xpath = "//span[contains(text(),'Other GI test (please specify)')]//parent::label//parent::span//child::input")
    public WebElement otherGiPleaseSpecifyTextBox;

    /* RAS SURVEY AGE PLEASE SPECIFY TEXT BOX*/
    @FindBy(xpath = "//span[contains(text(),'Age (specify if in days, weeks, months or years)')]//parent::label//parent::span//child::input")
    public WebElement agePleaseSpecifyTextBox;

    /* RAS SURVEY MEDICATION TEXT BOX*/
    @FindBy(xpath = "//*[@id='QR~QID101~1~TEXT']")
    public WebElement medicationPleaseSpecifyTextBox;

    /* RAS SURVEY ADD BUTTON*/
    @FindBy(xpath = "//*[@id='add']")
    public WebElement addButton;

    /*
    USE THIS METHOD TO DYNAMICALLY LOCATE TEXT BOX FOR PLEASE SPECIFY
   */
    public WebElement dynamicPleaseSpecifyTextBox(String otherText) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//span[contains(text(),'" + otherText + "')]//parent::label//parent::span//child::input"));
    }

    /*
    USE THIS METHOD TO DYNAMICALLY ENTER TEXT IN OPTIONS SELECTED
    */
    public WebElement dynamicOtheriPleaseSpecifyTextBox(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//span[contains(text(),'" + text + "')]//parent::label//parent::span//child::input"));
    }

    /*
    USE THIS METHOD TO DYNAMICALLY LOCATE TEXT OR QUESTION AT TOP OF PAGE
    */
    public WebElement dynamicTopText(int pageNumber) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[@id='QID" + pageNumber + "']/div[3]/div"));
    }

    /*
    USE THIS METHOD TO MOVE THE SLIDER IN A PAGE
    */
    public WebElement dynamicSlider(int page, int number) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[@id='QID" + page + "~" + number + "~handle']"));
    }

    /*
    USE THIS METHOD TO DYNAMICALLY LOCATE TEXT AT TOP OF PAGE
    */
    public WebElement dynamicTopTextBox(int pageNumber) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[@id='QID" + pageNumber + "']/div[3]/div//child::fieldset//following-sibling::div//child::div//child::input"));
    }

    /*
    USE THIS METHOD TO DYNAMICALLY LOCATE TEXT BOXES IN SCREENER CHECK BOX OPTIONS
    */
    public WebElement screenerDynamicOtherTextBox(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//span[contains(text(),'" + text + "')]//parent::span//parent::label//parent::span//child::input"));
    }

    /*
    USE THIS METHOD TO DYNAMICALLY LOCATE ONE LONG TEXT BOX PER PAGE
    */
    public WebElement dynamicOneTextBox(int pageNumber) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[@id='QR~QID" + pageNumber + "']"));
    }

    /*
        USE THIS METHOD TO DYNAMICALLY CLICK ON NORMAL RADIO BUTTONS
     */
    public WebElement dynamicLocatorRadioButtonNormal(String text) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//caption[@class='QuestionText BorderColor']//parent::table//child::tbody//child::tr[" + text + "]//child::td[3]//child::label"));
    }

    /*
       USE THIS METHOD TO DYNAMICALLY ENTER TEXT IN CHECK MARKED TEXT BOX
    */
    public WebElement dynamicallyEnterTextInCheckMarkedTextBox(int index) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//div[@class='QuestionBody']//child::ul//child::li[" + index + "]//child::span//child::input"));
    }

    /*
   USE THIS METHOD TO DYNAMICALLY ENTER TEXT IN RADIO BUTTONS TEXT BOX
*/
    public WebElement dynamicallyEnterTextInCheckWithRadioButtons(int index) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//div[@class='QuestionBody']//child::table//child::tbody//child::tr[" + index + "]//child::th//child::input"));
    }

    /*
    USE THIS METHOD TO ENTER TEXT IN PLEASE PROVIDE DETAILS IN TEXT AREA TEXT BOX
    */
    public WebElement enterTextInTextAreaTextBox(int indexOne, int indextwo) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//div[@class='QuestionBody']//child::tbody//tr[" + indexOne + "]//child::td[" + indextwo + "]//textarea"));
    }
    /*
    USE THIS METHOD TO ENTER TEXT IN PLEASE PROVIDE DETAILS ON THE NAME OF THE MEDICATION TAKEN TEXT BOX
    */
    public WebElement enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenTextBox(int indexOne, int indextwo) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//div[@class='QuestionBody']//child::tbody//tr[" + indexOne + "]//child::td[" + indextwo + "]//input"));
    }

    /*
    USE THIS METHOD TO ENTER TEXT IN PLEASE PROVIDE DETAILS ON THE NAME OF THE MEDICATION TAKEN RADIO BUTTOPN
    */
    public WebElement enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationTakenRadioButton(int indexOne, int indextwo) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//div[@class='QuestionBody']//child::tbody//tr[" + indexOne + "]//child::td[" + indextwo + "]//label"));
    }

    /*
    USE THIS METHOD TO ENTER TEXT IN PLEASE PROVIDE DETAILS ON THE NAME OF THE MEDICATION TAKEN RADIO BUTTOPN
    */
    public WebElement gaggingRadioButton(int indexOne, int indextwo) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[@id='Buttons']//parent::div[1]//child::div[3]//child::div//child::fieldset//child::div//child::table//child::tbody//child::tr[" + indexOne + "]//child::td[" + indextwo + "]//label"));
    }

    /*
    USE THIS METHOD TO ENTER TEXT IN PLEASE PROVIDE DETAILS ON THE NAME OF THE MEDICATION TAKEN DROPDOWN
    */
    public WebElement enterTextInPleaseProvideDetailsOnTheNameOfTheMedicationdropDown(int index) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//div[@class='QuestionBody']//child::tbody//tr[" + index + "]//child::td[9]//child::select"));
    }

    /*
    USE THIS METHOD TO DYNAMICLY SELECT FROM DROPDOWN
    */
    public WebElement selectFromDynamicdropDown(int index) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//div[@class='QuestionBody']//child::tbody//tr[" + index + "]//child::td[3]//child::select"));
    }

    /*
    USE THIS METHOD TO ENTER TEXT IN PLEASE PROVIDE DETAILS ON THE NAME OF THE MEDICATION TAKEN DROPDOWN
    */
    public WebElement dynamicDropDownTwo(int index, int indexTwo) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//div[@class='QuestionBody']//child::tbody//tr[" + index + "]//child::td[" + indexTwo + "]//child::select"));
    }

    /*
    USE THIS METHOD FOR MEDICATION FOR ABDOMINAL PAIN DROPDOWN
    */
    public WebElement medicationForAbdominalPainDropDownTwo() {
        return WebDriverUtils.webDriver.findElement(By.xpath("//*[@id='Buttons']//parent::div[1]//child::div[3]//child::div//child::fieldset//child::div//child::select"));
    }

    /*
    USE THIS METHOD TO ENTER DOCTOR LOCATION AND HOSPITAL IN THE TEXT BOXES
    */
    public WebElement enterTextInDoctorLocationHospitalTextBox(int index) {
        return WebDriverUtils.webDriver.findElement(By.xpath("//div[@class='QuestionBody']//child::tbody//tr[" + index + "]//child::td[2]//child::input"));
    }

    public MyRASSurveyPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
