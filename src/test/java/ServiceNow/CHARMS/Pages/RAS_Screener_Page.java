package ServiceNow.CHARMS.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.nci.automation.web.WebDriverUtils.webDriver;

public class RAS_Screener_Page {

    /* LOCATOR FOR ALL QUESTIONS ON RAS SCREENER */
    @FindBy(xpath = "//*[@class='QuestionText BorderColor']")
    public WebElement question;

    /* STUDY INTRODUCTION next button (THIS WORKS FOR ALL NEXT BUTTONS) */
    @FindBy(xpath = "//input[@title='→']")
    public WebElement studyNextButton;

    /* RAS Survey Save and Next button (THIS WORKS FOR ALL NEXT BUTTONS) */
    @FindBy(xpath = "//*[@id='NextButton']")
    public WebElement rasSurveySaveAndNextButton;

    /* RAS Survey Previous button (THIS WORKS FOR ALL NEXT BUTTONS) */
    @FindBy(xpath = "//*[@id='PreviousButton']")
    public WebElement rasSurveyPreviousButton;

    /* Have Any Of Your Relatives Been Diagnosed No Radio Button */
    @FindBy(xpath = "//*[@id='QID43']/div[3]/div/fieldset/div/ul/li[2]/span")
    public WebElement haveAnyOfYourRelativesBeenDiagnosedNoRadioButton ;

    /* Have You Ever Had Genetic Testing No Radio Button */
    @FindBy(xpath = "//*[@id='QID120-2-label']")
    public WebElement haveYouEverHadGeneticTestingNoRadioButton ;

    /* I am completing this form for myself option */
    @FindBy(xpath = "//span[contains(text(),'I am completing this form for myself')]")
    public WebElement iAmCompletingThisFormForMyselfOption;

    /* First Name of the participant text box */
    @FindBy(xpath = "//input[@name='QR~QID105~4~TEXT']")
    public WebElement firstNameTextBox;

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

    /* What country does participant currently live in? drop down */
    @FindBy(xpath = "//select[@data-runtime-value='runtime.Selected']")
    public WebElement whatCountryDoesParticipantCurrentlyLiveInDropDown;

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

    /* Pin Text Box Locator */
    @FindBy(xpath = "//span[contains(text(),'Email')]//parent::label//parent::span/parent::td//parent::tr//parent::tbody//child::tr[2]/child::td[2]/child::input")
    public WebElement pinTextBox;

    /**
     * Locates an element using a dynamic locator based on the provided text.
     *
     * @param text The text to search for in the element.
     * @return The WebElement representing the located element.
     */
    public static WebElement dynamicLocator(String text) {
        return webDriver.findElement(By.xpath("//*[text()='" + text + "']"));
    }

    /**
     * Locates the dynamic date of birth calendar element on the RAS Screener page.
     *
     * @param text The aria-label value of the date to locate.
     * @return The WebElement representing the dynamic date of birth calendar element.
     */
    public static WebElement dynamicDateOfBirthCalendarLocator(String text){
        return webDriver.findElement(By.xpath("//span[@aria-label='"+ text + "']"));
    }

    /**
     * USE THIS METHOD TO DYNAMICALLY LOCATE TEXT BOXES ON RAS SCREENER
     *
     * @param text
     * @return
     */
    public WebElement dynamicTextBoxLocator(String text) {
        return webDriver.findElement(By.xpath("//*[text()='" + text + "']//parent::label//parent::span//parent::td/following-sibling::td/input"));
    }

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE PHONE NUMBER TEXT BOXES ON RAS SCREENER
     * @param text
     * @return
     */
    public WebElement dynamicTextBoxLocatorForPhoneNumbers(String text) {
        return webDriver.findElement(By.xpath("//*[text()='" + text + "']//parent::label/following-sibling::input"));
    }

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE PHONE NUMBER CHECK BOXES ON RAS SCREENER
     * @param text
     * @return
     */
    public WebElement dynamicPhoneNumberCheckBox(String text) {
        return webDriver.findElement(By.xpath("//*[text()='" + text + "']//parent::label//parent::div//parent::span//parent::th/following-sibling::td/label"));
    }

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE EMAIL ADDRESS TEXT BOXES ON RAS SCREENER
     * @param text
     * @return
     */
    public WebElement dynamicEmailAddressTextBox(String text) {
        return webDriver.findElement(By.xpath("//*[text()='" + text + "']//parent::legend/following-sibling::div/div/input"));
    }

    /***
     * USE THIS METHOD TO DYNAMICALLY CLICK ON ALL CHECKBOXES ON RAS SCREENER
     * @param text
     * @return
     */
    public WebElement dynamicClickOnCheckboxesScreener(int index) {
        return webDriver.findElement(By.xpath("//*[@id='Questions']//child::div[2]//child::div[3]//child::div[1]//child::fieldset//child::legend/following-sibling::div//child::ul//child::li[" + index + "]//child::span//child::label"));
    }

    /***
     * USE THIS METHOD TO DYNAMICALLY CLICK ON ALL CHECKBOXES ON IIQ TABLE
     * @param text
     * @return
     */
    public WebElement dynamicClickOnCheckboxesIiqTable(int indexOne, int indexTwo) {
        return webDriver.findElement(By.xpath("//*[@id='SkinContent']//child::div//child::div[2]//child::div[3]//child::div[1]//child::fieldset//child::legend/following-sibling::div//child::table//child::tbody//child::tr[" + indexOne + "]//child::td[" + indexTwo + "]//child::span//child::label"));
    }

    /***
     * USE THIS METHOD TO DYNAMICALLY IMPUT TEXT IN TEXT BOX FOR CHECKED OPTIONS ON RAS SCREENER
     * @param text
     * @return
     */
    public WebElement dynamicEnterTextOnCheckboxesScreener(int index) {
        return webDriver.findElement(By.xpath("//*[@id='Questions']//child::div[2]//child::div[3]//child::div[1]//child::fieldset//child::legend/following-sibling::div//child::ul//child::li[" + index + "]//child::span//child::input"));
    }

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE TEXT BOXES ON HOW DID YOU HEAR ABOUT THIS STUDY PAGE ON RAS SCREENER
     * @param text
     * @return
     */
    public WebElement dynamicLocatorForHowDidYouHearAboutStudyTextBoxes(String text) {
        return webDriver.findElement(By.xpath("//*[text()='" + text + "']//parent::label//parent::span/input"));
    }

    /***
     * USE THIS METHOD TO DYNAMICALLY LOCATE ELEMENTS ON MAIN REASONS FOR PARTICIPATING IN STUDY PAGE
     * @param text
     * @return
     */
    public WebElement dynamicLocatorForMainReasonForParticipatingInStudy(String text) {
        return webDriver.findElement(By.xpath("//*[text()='" + text + "']//parent::span//parent::label/following-sibling::input"));
    }

    public RAS_Screener_Page() {
        PageFactory.initElements(webDriver, this);
    }
}