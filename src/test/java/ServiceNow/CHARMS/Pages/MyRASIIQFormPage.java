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

    /* RAS SCREENER IIQ FORM SOME OF THIS INFORMATION TEXT */
    @FindBy(xpath = "//*[@id='QID16']/div[3]")
    public WebElement screenerIiqFormSomeOfThisInformation;

    /* RAS SCREENER IIQ FORM THIS FIRST QUESTION OF THE QUESTIONNAIRE TEXT */
    @FindBy(xpath = "//*[@id='QID35']/div[3]")
    public WebElement screenerIiqFormThisFirstQuestionOfTheQuestionnaire;

    /* RAS SCREENER IIQ FORM THIS FOR WICH SEX DO YOU IDENTIFY RADIO BUTTON */
    @FindBy(xpath = "//*[@id='QID92-1-label']")
    public WebElement screenerIiqFormForWhichSexYouIdentifyRadioButton;


    public MyRASIIQFormPage() {
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
