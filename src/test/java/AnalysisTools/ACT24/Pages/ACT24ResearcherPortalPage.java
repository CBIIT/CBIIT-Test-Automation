package AnalysisTools.ACT24.Pages;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ACT24ResearcherPortalPage extends CommonUtils {

    /** This is the email text box on the ACT24 Researcher site **/
    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    /** This is the password text box on the ACT24 Researcher site **/
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    /** This is the login button on the ACT24 Researcher site **/
    @FindBy(xpath = "//button[@id='login']")
    public WebElement loginButton;

    /** This is the Researcher text on the Researcher site **/
    @FindBy(xpath = "//p[contains(text(),'Create a Researcher account if you do not already have one by')]")
    public WebElement researcherText;

    /** This is the Create New Study link **/
    @FindBy(xpath = "//a[contains(text(),'Create New Study')]")
    public WebElement createNewStudyLink;

    /** This is the Actual Field Study radio button **/
    @FindBy(id = "studyActual")
    public WebElement actualFieldStudyRadioButton;

    /** This is the Study name text box **/
    @FindBy(id = "name")
    public WebElement studyNameTextBox;

    /** This is the Study Description text box **/
    @FindBy(id = "description")
    public WebElement studyDescriptionTextBox;

    /** This is the abbreviation text box **/
    @FindBy(id = "abbreviation")
    public WebElement abbreviationTextBox;

    /** This is the participantCount text box **/
    @FindBy(id = "participantCount")
    public WebElement participantCountTextBox;

    /** This is the recallCount text box **/
    @FindBy(id = "recallCount")
    public WebElement recallCountTextBox;

    /** This is the startDate text box **/
    @FindBy(id = "startDate")
    public WebElement startDateTextBox;

    /** This is the endDate text box **/
    @FindBy(id = "endDate")
    public WebElement endDateTextBox;

    /** This is the No selection for if the Study has funding radio button **/
    @FindBy(id = "hasFunds2")
    public WebElement noFundingRadioButton;

    /** This is the personalized hyperlinks selection for how the participants will access the study **/
    @FindBy(id = "loginAccessRequired1")
    public WebElement personalizedHyperLinks;

    /** This is the accessAcknowledgement for participants checkbox **/
    @FindBy(id = "accessAcknowledgement")
    public WebElement accessAcknowledgementCheckBox;

    /** This is the Researcher's Agreement Yes radio button **/
    @FindBy(xpath = "(//input[@id='acceptBtn'])[2]")
    public WebElement researcherAgreementAcceptRadioButton;

    /** This is the submit button for the create a study page **/
    @FindBy(xpath = "//button[contains(text(),'Submit')]")
    public WebElement submitButton;

    /** This is the successfully created Study prompt **/
    @FindBy (xpath = "//div[contains(text(),'The Study has been created successfully')]")
    public WebElement successfulStudyCreationPrompt;

    public ACT24ResearcherPortalPage(){
        PageFactory.initElements(WebDriverUtils.webDriver, this);
    }
}
