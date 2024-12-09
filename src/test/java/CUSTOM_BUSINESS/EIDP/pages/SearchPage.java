package CUSTOM_BUSINESS.EIDP.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class SearchPage extends CommonUtils {

	/* ------ Org Classification dropdown ------ */
	@FindBy(id = "orgStatClassification")
	public WebElement searchForDropdown;

	/* ------ Current IDP status dropwdown ------ */
	@FindBy(id = "select2-idpStatus-container")
	public WebElement currentIDPStatusDropdown;

	/* ------ IDP type dropdown ------ */
	@FindBy(id = "select2-idpTypes-container")
	public WebElement idpType;

	/* ------ Trainees without IDP Radio button ------ */
	@FindBy(id = "trainees_without_idp_ck")
	public WebElement traineesWithoutIDPCheckbox;

	/* ------ Classification type text box ------ */
	@FindBy(css = "[placeholder='Select Trainee Classification(s)']")
	public WebElement classificationTypeInput;

	/* ------ List of classification ------ */
	@FindAll({ @FindBy(css = "#select2-trainee-classifications-results li") })
	public List<WebElement> classificationOptions;

	/* ------ Trainee last name input ------ */
	@FindBy(id = "lastName")
	public WebElement trainneLastName;

	/* ------ Search button ------ */
	@FindBy(id = "advanced_search_btn")
	public WebElement searchButton;

	/* ------ Next button for search result table ------ */
	@FindBy(linkText = "Next")
	public WebElement nextButton;

	/* ------ IDP save and send email button ------ */
	@FindBy(id = "initiate-btn-save")
	public WebElement saveAndSendEmailButton;

	/* ------ Close button ------ */
	@FindBy(id = "initiate-btn-close")
	public WebElement closeButton;

	/* ------ NCI training org dropdown ------ */
	@FindBy(id = "initiate-group")
	public WebElement nciTrainingOrganizationDropdown;

	/* ------ Fellow training title ------ */
	@FindBy(id="select2-fellowCurrentTrainingTitle-container")
	public WebElement fellowTrainingTitleDropdownClick;
	
	/* ------ Fellow training title dropdown ------ */
	@FindBy(xpath="//span[@class=\"select2-search select2-search--dropdown\"]/input")
	public WebElement fellowTrainingTitleDropdown;
	
	/* ------ Fellow training title selection ------ */
	@FindBy(xpath="//span[@class=\"select2-search select2-search--dropdown\"]/following-sibling::span/ul/li")
	public WebElement fellowTrainingTitleSelections;
	
	/* ------ NED org dropdown ------ */
    @FindBy(id ="nedOrg")
	public WebElement nedOrgDropdowns;

	/* ------ NCI current IDP status ------ */
	@FindBy(id = "idpStatus")
	public WebElement nciCurrentIDPStatus;

	/* ------ Trainee name ------ */
	@FindBy(id = "initiate-trainee")
	public WebElement traineeName;

	/* ------ IDP initiation message ------ */
	@FindBy(className = "bootbox-body")
	public WebElement idpInitiationMessage;

	/* ------ OK button ------ */
	@FindBy( xpath = "//div[@class='modal-dialog modal-sm']//button[@class='btn btn-primary']")
	public WebElement okButton;

	/* ------ Revise existing IDP button ------ */
	@FindBy( xpath = "//button[@data-original-title='Revise existing IDP']")
	public WebElement reviseExistingIDP;

	/* ------ Search input field ------ */
	@FindBy(css = "span[class='select2-search select2-search--dropdown'] input")
	public WebElement searchInputField;

	/* ------ Initiate trainee name ------ */
	@FindBy(id = "initiate-trainee-another")
	public WebElement initiateTraineeAnotherName;

	/* ------ Save and send email button ------ */
	@FindBy( xpath = "//div[@style]//button[contains(text(),'Save & Send Email')]")
	public WebElement saveAndSendEmail;

	/* ------ Trainee with IDP checkbox ------ */
	@FindBy(id = "trainees_with_idp_div")
	public WebElement traineesWithIDPCheckbox;

	/* ------ Trainee First name box ------ */
	@FindBy(id = "firstName")
	public WebElement TraineeFirstName;

	/* ------ Clear search button ------ */
	@FindBy(id = "clear_btn")
	public WebElement ClearButton;

	/* ------ Search result table first row first cell ------ */
	@FindBy(xpath = "//table[@id='advanced_search_results']/tbody/tr[1]/td[1]/a")
	public WebElement searchResultTableFirstRowFirstCell;

	/* ------ Search result table first row third cell ------ */
	@FindBy(xpath = "//table[@id='advanced_search_results']/tbody/tr[1]/td[3]")
	public WebElement searchResultTableFirstRowThirdCell;

	/* ------ Select PM ------ */
	@FindBy(xpath = "//span[@id='select2-primaryMentor-container']")
	public WebElement selectPrimaryMentor;

	/* ------ search button for AO ------ */
	@FindBy(xpath = "//input[@id='search-btn']")
	public WebElement searchButtonCallowayGloria;

	/* ------ search result third cell for AO ------ */
	@FindBy(xpath = "//table[@id='search-results']/tbody/tr[1]/td[1]/a")
	public WebElement searchResultTableFirstRowThirdCellCalloway;

	/* ------ Classification type for AO ------ */
	@FindBy(xpath = "//select[@id='trainee-classifications']")
	public WebElement classificationTypeDropDownGloriaGalloway;

	/* ------ Select PM dropdown ------ */
	@FindBy(xpath = "//select[@id='primaryMentor']")
	public WebElement choosePrimaryMentor;

	/* ------ Dropdown value as CBIIT ------ */
	@FindBy(xpath = "//select[@id='trainingOrg']")
	public WebElement chooseCBIIT;

	/* ------ Select training org dropdown ------ */
	@FindBy(xpath = "//span[@id='select2-trainingOrg-container']")
	public WebElement selectTrainingOrganizationDropdown;

	/* ------ Search result first row second cell ------ */
	@FindBy(xpath = "//table[@id='advanced_search_results']//tbody//tr[1]//td[2])[1]")
	public WebElement searchResultFirstRowSecondCell;

	/* ------ NIHSAC input box ------ */
	@FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
	public WebElement inputBoxNIHSAC;

	/* ------ AO NIHSAC groups selection dropdown ------ */
	@FindBy(xpath = "//select[@id='groups']")
	public WebElement chooseDropdownNIHSACGloriaCalloway;

	/* ------ Trainee without IDP checkbox ------ */
	@FindBy(xpath = "//*[@id='trainees_without_idp_div']")
	public WebElement traineeWithoutIDPCHeckBox;

	/* ------ Search input box ------ */
	@FindBy(xpath = "//span/input[@class='select2-search__field']")
	public WebElement searchBoxInput;

	/* ------ advanced search length selection dropdown ------ */
	@FindBy(xpath = "//SELECT[@name='advanced_search_results_length']")
	public WebElement advancedSearchResultLength;

	/* ------ Search results text ------ */
	@FindBy(id = "advanced_search_results")
	public WebElement advancedSearchResults;

	/* ------ YES button for renewal ------ */
	@FindBy(xpath = "//button[@data-bb-handler='confirm' and contains(text(),'Yes')]")
	public WebElement yesButtonforRenewal;

	/* ------ Trainee name text------ */
	@FindBy(xpath = "//span[@class='dtr-title' and text()='Primary Mentor']/following-sibling::span/a")
	public WebElement traineeNameText;

	/* ------ Classification Type Text------ */
	@FindBy(xpath = "//span[@class='dtr-data' and text()='EMPLOYEE']")
	public WebElement classificationTypeText;
	
	/* ------ Initiate IDP active buttons ------ */
	@FindBy(xpath = "//button[@class='btn btn-primary initiateAnother'][not(@disabled)]")
	public List<WebElement> activeButtons;

	/* ------ On Hold IDP active buttons ------ */
	@FindBy(xpath = "//button[@class='btn btn-primary holdIDP'][not(@disabled)]")
	public List<WebElement> holdIDPActiveButtons;

	/* ------ Cancel IDP active buttons ------ */
	@FindBy(xpath = "//button[@class='btn btn-primary'][not(@disabled)]")
	public List<WebElement> cancelIDPActiveButtons;

	/* ------ Undo IDP active buttons ------ */
	@FindBy(xpath = "//button[@class='btn btn-primary'][not(@disabled)]")
	public List<WebElement> undoIDPActiveButtons;
	
	/* ------ Exit survey IDP active buttons ------ */
	@FindBy(xpath = "//button[@class='btn btn-primary exitSurvey'][not(@disabled)]")
	public List<WebElement> exitSurveyIDPActiveButtons;

	/* ------ Rows in PM table ------ */
	@FindBy(css = "td.sorting_2")
	public List<WebElement> rowsPM;

	/* ------ Rows in Verification Type table ------ */
	@FindBy(css = "td.sorting_1.dtr-control::before")
	public List<WebElement> rowsVerificationType;

	/***
	 * USE THIS METHOD TO DYNAMICALLY SELECT CLASSIFICATION TYPE
	 * @param type
	 * @return
	 */
	public WebElement classificationType(String type){
		return WebDriverUtils.webDriver.findElement(
				By.xpath("//*[@id='select2-trainee-classifications-results']//li[text()='" + type + "']"));
	}

	/***
	 * USE THIS METHOD TO DYNAMICALLY SELECT STATUS OPTION TYPE
	 * @param optionType
	 * @return
	 */
	public WebElement statusOption(String optionType){
		return WebDriverUtils.webDriver.findElement(
				By.xpath("//li[@role='treeitem'][text()=\"" + optionType + "\"]"));
	}

	public SearchPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
