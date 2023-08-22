package CustomBusiness.EIDP.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class GeneralInformationPage extends CommonUtils{

	/* ------ Current year of training dropdown ------ */
	@FindBy(id = "currentYearOfTraining")
	public WebElement currentYearOfTrainingDropdown;
	
	/* ------ Highest degree obtained dropdown ------ */
	@FindBy(id = "highestDegreeObtained")
	public WebElement highestDegreeDropdown2;
	
	/* ------ Highest degree selection dropdown ------ */
	@FindBy(id = "highestdegreeSelect")
	public WebElement highestDegreeDropdown;

	/* ------ Primary Mentors name ------ */
	@FindBy(id ="select2-primaryMentors-container")
	public WebElement primaryMentorsName;
	
	/* ------ General info edit button ------ */
	@FindBy(xpath="(//i[@class=\"fa fa-pencil\"])[1]" )
	public WebElement generalInformationEdit;
	
	/* ------ Co-PM name ------ */
	@FindBy(id ="select2-isCoPiSelect-container")
	public WebElement coPrimaryMentorsName;
	
	/* ------ LBO name dropdown ------ */
	@FindBy(id= "select2-labbranchChief-container")
	public WebElement labBranchNameDropdown;
	
	/* ------ Search input field ------ */
	@FindBy(css="span[class='select2-search select2-search--dropdown'] input")
	public WebElement searchInputField;
	
	/* ------ Role dropdown options ------ */
	@FindBy(css = "li[role='treeitem']")
	public WebElement dropdownOptions;
	
	/* ------ save and continue button ------ */
	@FindBy(id= "btnSaveAndCont")
	public WebElement saveAndContinueButton;
	
	/* ------ Trainee name ------ */
	@FindBy(id = "traineeName")
	public WebElement traineeName;
	
	/* ------ Decline IDP button ------ */
	@FindBy(partialLinkText = "Decline IDP")
	public WebElement declineIDPButton;
	
	/* ------ General information tab ------ */
	@FindBy(css = "a[href*='/idp/review-general']")
	public WebElement generalInformationTab;
	
	/* ------ Review and take action button ------ */
	@FindBy(xpath = "//span[text()='REVIEW & TAKE ACTION']")
	public WebElement reviewAndTakeAction;
	
	/* ------ Send IDP to PM button ------ */
	@FindBy(xpath="//input[@value=\"Send IDP to the Primary Mentor\"]")
	public WebElement sendIdpToPrimaryMentor;
	
	/* ------ Yes button after submission ------ */
	@FindBy(xpath="//button[@onclick=\"form_submit_onHold()\"]")
	public WebElement yesButton;

	/* ------ Current Title ------ */
	@FindBy(id = "trainingTitle")
	public WebElement currentTitle;
	
	/* ------ Proceed button ------ */
	@FindBy(xpath ="(//a[@title='Proceed'])[1]")
	public WebElement ProceedButton;
	
	/* ------ General info completed button ------ */
	@FindBy(xpath ="(//a[@title='Completed'])[1]")
	public WebElement clickOnCompletedGeneralInfobutton;
	
	/* ------ Advance search tab ------ */
	@FindBy(xpath ="//li[@id='advancedSearchtabs']")
	public WebElement searchSection;

	/* ------ Co PM YES button ------ */
	@FindBy(id = "coprimMentorYes")
	public WebElement coPMYES;

	/* ------ Co PM NO button ------ */
	@FindBy(id = "coprimMentorNo")
	public WebElement coPMNO;
	
	public GeneralInformationPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
