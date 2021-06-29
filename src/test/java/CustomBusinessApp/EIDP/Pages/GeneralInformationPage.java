package CustomBusinessApp.EIDP.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.springframework.context.annotation.CommonAnnotationBeanPostProcessor;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

import CustomBusinessApp.EIDP.Util.CommonUtil;

public class GeneralInformationPage extends CommonUtils{

	@FindBy(how = How.ID, id = "currentYearOfTraining")
	public WebElement currentYearOfTrainingDropdown;
	
	@FindBy(how=How.ID, id = "highestdegreeSelect")
	public WebElement highestDegreeDropdown;
	
	@FindBy(how=How.ID, id = "highestDegreeObtained")
	public WebElement highestDegreeDropdownnhgri;

	@FindBy(how = How.ID, id ="select2-primaryMentors-container")
	public WebElement primaryMentorsName;
	
	@FindBy(how = How.ID, id ="select2-isCoPiSelect-container")
	public WebElement coPrimaryMentorsName;
	
	@FindBy(how = How.ID, id= "select2-labbranchChief-container")
	public WebElement labBranchNameDropdown;
	
	@FindBy(how = How.CSS, css="span[class='select2-search select2-search--dropdown'] input")
	public WebElement searchInputField;
	
	@FindBy(how = How.CSS, css = "li[role='treeitem']")
	public WebElement dropdownOptions;
	
	@FindBy(how = How.ID, id= "btnSaveAndCont")
	public WebElement saveAndContinueButton;
	
	@FindBy(how = How.ID, id = "traineeName")
	public WebElement traineeName;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, partialLinkText = "Decline IDP")
	public WebElement declineIDPButton;
	
	@FindBy(css = "a[href*='/idp/review-general']")
	public WebElement generalInformationTab;

	@FindBy(how = How.ID, id = "trainingTitle")
	public WebElement currentTitle;
	
	@FindBy( how = How.XPATH, xpath ="(//a[@title='Proceed'])[1]")
	public WebElement ProceedButton;
	
	@FindBy( how = How.XPATH, xpath ="(//a[@title='Completed'])[1]")
	public WebElement clickOnCompletedGeneralInfobutton;
	
	
	@FindBy( how = How.XPATH, xpath ="//li[@id='advancedSearchtabs']")
	public WebElement searchSection;
	
	
	public GeneralInformationPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
