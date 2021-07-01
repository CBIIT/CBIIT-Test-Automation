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

public class SearchPage extends CommonUtils {

	public String value;

	@FindBy(id = "orgStatClassification")
	public WebElement searchForDropdown;

	@FindBy(id = "select2-idpStatus-container")
	public WebElement currentIDPStatusDropdown;

	@FindBy(id = "select2-idpTypes-container")
	public WebElement idpType;

	@FindBy(how = How.ID, id = "trainees_without_idp_ck")
	public WebElement traineesWithoutIDPCheckbox;

	@FindBy(how = How.CSS, css = "[placeholder='Select Trainee Classification(s)']")
	public WebElement classificationTypeInput;

	@FindAll({ @FindBy(css = "#select2-trainee-classifications-results li") })
	public List<WebElement> classificationOptions;

	@FindBy(how = How.ID, id = "lastName")
	public WebElement trainneLastName;

	@FindBy(how = How.ID, id = "advanced_search_btn")
	public WebElement searchButton;

	@FindBy(how = How.LINK_TEXT, linkText = "Next")
	public WebElement nextButton;

	@FindBy(how = How.ID, id = "initiate-btn-save")
	public WebElement saveAndSendEmailButton;

	@FindBy(how = How.ID, id = "initiate-btn-close")
	public WebElement closeButton;

	@FindBy(how = How.ID, id = "initiate-group")
	public WebElement nciTrainingOrganizationDropdown;

	@FindBy(how = How.ID, id = "idpStatus")
	public WebElement nciCurrentIDPStatus;

	@FindBy(how = How.ID, id = "initiate-trainee")
	public WebElement traineeName;

	@FindBy(how = How.CLASS_NAME, className = "bootbox-body")
	public WebElement idpInitiationMessage;

	@FindBy(how = How.XPATH, xpath = "//div[@class='modal-dialog modal-sm']//button[@class='btn btn-primary']")
	public WebElement okButton;

	@FindBy(how = How.XPATH, xpath = "//button[@data-original-title='Revise existing IDP']")
	public WebElement reviseExistingIDP;

	@FindBy(how = How.CSS, css = "span[class='select2-search select2-search--dropdown'] input")
	public WebElement searchInputField;

	@FindBy(id = "initiate-trainee-another")
	public WebElement initiateTraineeAnotherName;

	@FindBy(how = How.XPATH, xpath = "//div[@style]//button[contains(text(),'Save & Send Email')]")
	public WebElement saveAndSendEmail;

	@FindBy(how = How.ID, id = "trainees_with_idp_div")
	public WebElement traineesWithIDPCheckbox;

	@FindBy(how = How.ID, id = "firstName")
	public WebElement TraineeFirstName;

	@FindBy(how = How.ID, id = "clear_btn")
	public WebElement ClearButton;

	@FindBy(how = How.XPATH, xpath = "//table[@id='advanced_search_results']/tbody/tr[1]/td[1]/a")
	public WebElement searchResultTableFirstRowFirstCell;

	@FindBy(how = How.XPATH, xpath = "//table[@id='advanced_search_results']/tbody/tr[1]/td[3]")
	public WebElement searchResultTableFirstRowThirdCell;

	@FindBy(how = How.XPATH, xpath = "//span[@id='select2-primaryMentor-container']")
	public WebElement selectPrimaryMentor;

	@FindBy(how = How.XPATH, xpath = "//input[@id='search-btn']")
	public WebElement searchButtonCallowayGloria;

	@FindBy(how = How.XPATH, xpath = "//table[@id='search-results']/tbody/tr[1]/td[1]/a")
	public WebElement searchResultTableFirstRowThirdCellCalloway;

	@FindBy(how = How.XPATH, xpath = "//select[@id='trainee-classifications']")
	public WebElement classificationTypeDropDownGloriaGalloway;

	@FindBy(how = How.XPATH, xpath = "//select[@id='primaryMentor']")
	public WebElement choosePrimaryMentor;

	@FindBy(how = How.ID, id = "select2-trainingOrg-container")
	public WebElement nciTrainingOrgDropdown;

	@FindBy(how = How.XPATH, xpath = "//select[@id='trainingOrg']")
	public WebElement chooseCBIIT;

	@FindBy(how = How.XPATH, xpath = "//span[@id='select2-trainingOrg-container']")
	public WebElement selectTrainingOrganizationDropdown;

	@FindBy(how = How.XPATH, xpath = "//table[@id='advanced_search_results']//tbody//tr[1]//td[2])[1]")
	public WebElement searchResultFirstRowSecondCell;

	@FindBy(how = How.XPATH, xpath = "(//input[@class='select2-search__field'])[2]")
	public WebElement inputBoxNIHSAC;

	@FindBy(how = How.XPATH, xpath = "//select[@id='groups']")
	public WebElement chooseDropdownNIHSACGloriaCalloway;

	@FindBy(how = How.XPATH, xpath = "//*[@id='trainees_without_idp_div']")
	public WebElement traineeWithoutIDPCHeckBox;

	public SearchPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
