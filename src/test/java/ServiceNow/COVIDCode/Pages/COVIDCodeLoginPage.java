package ServiceNow.COVIDCode.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class COVIDCodeLoginPage extends CommonUtils {

	/** Accept and Complete Enrollment Questionnaire button */
	@FindBy(linkText  = "Access and complete enrollment questionnaire →")
	public WebElement AcceptandCompleteQuestionnaireButton;
	
	/** Log In button */
	@FindBy(linkText  = "Log In")
	public WebElement LogInButton;
	
	/** Access and complete follow up questionnaire */
	@FindBy (linkText = "Access and complete follow up questionnaire →")
	public WebElement accessAndCompleteFollowUpQuestionnaireButton;
	
	/** Volunteer Here button */
	@FindBy (partialLinkText = "Volunteer")
	public WebElement volunteerHereButton;
	
	/** Why are we doing this study? header */
	@FindBy (xpath = "/html/body/div/section/main/div/div/sp-page-row[2]/div/div/span/div/div/div/div/div/div[1]/h2")
	public WebElement whyAreWeDoingThisStudyTxt;
	
	/** Coronavirus 2019 paragraph */
	@FindBy (xpath = "/html/body/div/section/main/div/div/sp-page-row[2]/div/div/span/div/div/div/div/div/div[1]/p[1]")
	public WebElement coronavirus2019Paragraph;
	
	/** Who can join? header */
	@FindBy (xpath = "/html/body/div/section/main/div/div/sp-page-row[2]/div/div/span/div/div/div/div/div/div[2]/h2[1]")
	public WebElement whoCanJoinHeader;
	
	/** Anyone who has tested positive paragraph */
	@FindBy (xpath = "/html/body/div/section/main/div/div/sp-page-row[2]/div/div/span/div/div/div/div/div/div[2]/p[1]")
	public WebElement anyoneWhoHasTestedPositiveParagraph;
	
	/** Interested in volunteering for the COVID-19 Study? header */
	@FindBy (xpath = "/html/body/div/section/main/div/div/sp-page-row[2]/div/div/span/div/div/div/div/div/div[1]/div/h2")
	public WebElement interestedInVolunteeringHeader;
	
	/** Selecting the button below paragraph */
	@FindBy (xpath = "/html/body/div/section/main/div/div/sp-page-row[2]/div/div/span/div/div/div/div/div/div[1]/div/p")
	public WebElement selectingTheButtonBelowParagraph;
	
	/** What is involved in the study? header */
	@FindBy (xpath = "/html/body/div/section/main/div/div/sp-page-row[2]/div/div/span/div/div/div/div/div/div[2]/h2[2]")
	public WebElement whatIsInvolvedInTheStudyHeader;
	
	/** Provide a blood sample paragraph */
	@FindBy (xpath = "/html/body/div/section/main/div/div/sp-page-row[2]/div/div/span/div/div/div/div/div/div[2]/p[2]")
	public WebElement provideAbloodSampleParagraph;
	
	/** Privacy Statement */
	@FindBy (xpath = "/html/body/div/section/main/div/div/sp-page-row[2]/div/div/span/div/div/div/div/div/div[1]/p[2]")
	public WebElement privacyStatement;
	
	
	
	
	public COVIDCodeLoginPage() {
		
		PageFactory.initElements(WebDriverUtils.webDriver, this);
		
	}
	
	
}
