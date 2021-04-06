package CustomBusinessApp.EIDP.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

import CustomBusinessApp.EIDP.Util.CommonUtil;
import CustomBusinessApp.EIDP.Util.SharedData;


public class SearchPage extends CommonUtils{
	
	public String value;
	
	@FindBy(id = "orgStatClassification")
	public WebElement searchForDropdown;
	
	@FindBy(id = "select2-idpStatus-container")
	public WebElement currentIDPStatusDropdown;

	@FindBy(how =  How.ID, id = "trainees_without_idp_ck")
	public WebElement traineesWithoutIDPCheckbox;
	
	@FindBy(how = How.CSS, css = "[placeholder='Select Trainee Classification(s)']")
	public WebElement classificationTypeInput;
	
	@FindAll({@FindBy(css = "#select2-trainee-classifications-results li")})
	public List<WebElement> classificationOptions;
	
	@FindBy(how = How.ID, id = "lastName")
	public WebElement trainneLastName;
	
	@FindBy(how = How.ID, id = "advanced_search_btn")
	public WebElement searchButton;
	
	@FindBy(how = How.LINK_TEXT, linkText = "Next")
	public WebElement nextButton;
	
	@FindBy(how = How.ID, id= "initiate-btn-save")
	public WebElement saveAndSendEmailButton;
	
	@FindBy(how = How.ID, id="initiate-btn-close")
	public WebElement closeButton;
	
	@FindBy(how = How.ID, id = "initiate-group")
	public WebElement nciTrainingOrganizationDropdown;
	
	@FindBy(how= How.ID, id= "initiate-trainee")
	public WebElement traineeName;
	
	@FindBy(how = How.CLASS_NAME, className = "bootbox-body")
	public WebElement idpInitiationMessage;
	
	@FindBy(how = How.XPATH, xpath = "//div[@class='modal-dialog modal-sm']//button[@class='btn btn-primary']")
	public WebElement okButton;
	
	
	@FindBy(how = How.XPATH, xpath = "//button[@data-original-title='Revise existing IDP']")
	public WebElement reviseExistingIDP;
	
	@FindBy(how = How.CSS, css="span[class='select2-search select2-search--dropdown'] input")
	public WebElement searchInputField;
	
	@FindBy(id = "initiate-trainee-another")
	public WebElement initiateTraineeAnotherName;
	
	@FindBy(how = How.XPATH, xpath = "//div[@style]//button[contains(text(),'Save & Send Email')]")
	public WebElement saveAndSendEmail;
	
	public SearchPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	}
