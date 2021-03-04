package ServiceNow.COVIDCode.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class COVIDCodeLoginPage extends CommonUtils {
	
	/** --------------- BEGINNING OF COVIDcode HOME PAGE   ---------------  */

	/** Log In button */
	@FindBy(xpath = "//*[contains(text(), 'Log In')]")
	public WebElement LogInButton;

	/** Volunteer For The Study button */
	@FindBy(xpath = "//a[contains(text(),'Volunteer For The Study ')]")
	public WebElement volunteerForTheStudyButton;

	/** Why are we doing this study? header */
	@FindBy(xpath = "//*[contains(text(),'WHY ARE WE DOING THIS STUDY?')]")
	public WebElement whyAreWeDoingThisStudyHeader;

	/** Coronavirus 2019 paragraph... Paragraph */
	@FindBy(xpath = "//*[contains(text(),'Coronavirus 2019')]")
	public WebElement coronavirus2019Paragraph;

	/** Who can join? header */
	@FindBy(xpath = "//*[contains(text(),'WHO CAN JOIN?')]")
	public WebElement whoCanJoinHeader;

	/** Anyone who has tested positive... Paragraph */
	@FindBy(xpath = "//*[contains(text(),'Anyone located in the United States')]")
	public WebElement anyoneWhoHasTestedPositiveParagraph;

	/** Interested in volunteering for the COVID-19 Study? header */
	@FindBy(xpath = "//*[contains(text(),'Interested in volunteering?')]")
	public WebElement interestedInVolunteeringHeader;

	/** Fill out a COVID-19 Volunteer Survey to get started. paragraph */
	@FindBy(xpath = "//*[contains(text(),'Fill out a COVID-19 Volunteer Survey')]")
	public WebElement fillOutACOVIDVolunteerSurveyParagraph;

	/** What is involved in the study? header */
	@FindBy(xpath = "//*[contains(text(),'WHAT IS INVOLVED IN THE STUDY?')]")
	public WebElement whatIsInvolvedInTheStudyHeader;

	/** Provide a blood sample paragraph */
	@FindBy(xpath = "//p[@class='info-text-not-logged'][3]")
	public WebElement provideAbloodSampleParagraph;

	/** Privacy Statement */
	@FindBy(xpath = "//*[contains(text(),'Privacy and confidentiality')]")
	public WebElement privacyStatement;
	
	/** --------------- THE END OF COVIDcode HOME PAGE   ---------------  */

	public COVIDCodeLoginPage() {

		PageFactory.initElements(WebDriverUtils.webDriver, this);

	}

}
