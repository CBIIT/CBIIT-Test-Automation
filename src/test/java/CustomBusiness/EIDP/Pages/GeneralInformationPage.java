package CustomBusiness.EIDP.Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import CustomBusiness.EIDP.Util.CommonUtil;

public class GeneralInformationPage extends CommonUtils{

	@FindBy(id = "currentYearOfTraining")
	public WebElement currentYearOfTrainingDropdown;
	
	@FindBy(id = "highestDegreeObtained")
	public WebElement highestDegreeDropdown2;
	
	@FindBy(id = "highestdegreeSelect")
	public WebElement highestDegreeDropdown;

	@FindBy(id ="select2-primaryMentors-container")
	public WebElement primaryMentorsName;
	
	@FindBy(xpath="(//i[@class=\"fa fa-pencil\"])[1]" )
	public WebElement generalInformationEdit;
	
	@FindBy(id ="select2-isCoPiSelect-container")
	public WebElement coPrimaryMentorsName;
	
	@FindBy(id= "select2-labbranchChief-container")
	public WebElement labBranchNameDropdown;
	
	@FindBy(css="span[class='select2-search select2-search--dropdown'] input")
	public WebElement searchInputField;
	
	@FindBy(css = "li[role='treeitem']")
	public WebElement dropdownOptions;
	
	@FindBy(id= "btnSaveAndCont")
	public WebElement saveAndContinueButton;
	
	@FindBy(id = "traineeName")
	public WebElement traineeName;
	
	@FindBy(partialLinkText = "Decline IDP")
	public WebElement declineIDPButton;
	
	@FindBy(css = "a[href*='/idp/review-general']")
	public WebElement generalInformationTab;
	
	@FindBy(xpath = "//span[text()='REVIEW & TAKE ACTION']")
	public WebElement reviewAndTakeAction;
	
	@FindBy(xpath="//input[@value=\"Send IDP to the Primary Mentor\"]")
	public WebElement sendIdpToPrimaryMentor;
	
	@FindBy(xpath="//button[@onclick=\"form_submit_onHold()\"]")
	public WebElement yesButton;

	@FindBy(id = "trainingTitle")
	public WebElement currentTitle;
	
	@FindBy(xpath ="(//a[@title='Proceed'])[1]")
	public WebElement ProceedButton;
	
	@FindBy(xpath ="(//a[@title='Completed'])[1]")
	public WebElement clickOnCompletedGeneralInfobutton;
	
	@FindBy(xpath ="//li[@id='advancedSearchtabs']")
	public WebElement searchSection;
	
	public GeneralInformationPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
