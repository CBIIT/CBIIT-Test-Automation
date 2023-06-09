package CustomBusiness.EIDP.Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import CustomBusiness.EIDP.Util.CommonUtil;
import CustomBusiness.EIDP.Util.SharedData;

public class SearchPage extends CommonUtils {

	public String value;

	@FindBy(id = "orgStatClassification")
	public WebElement searchForDropdown;

	@FindBy(id = "select2-idpStatus-container")
	public WebElement currentIDPStatusDropdown;

	@FindBy(id = "select2-idpTypes-container")
	public WebElement idpType;

	@FindBy(id = "trainees_without_idp_ck")
	public WebElement traineesWithoutIDPCheckbox;

	@FindBy(css = "[placeholder='Select Trainee Classification(s)']")
	public WebElement classificationTypeInput;

	@FindAll({ @FindBy(css = "#select2-trainee-classifications-results li") })
	public List<WebElement> classificationOptions;

	@FindBy(id = "lastName")
	public WebElement trainneLastName;

	@FindBy(id = "advanced_search_btn")
	public WebElement searchButton;

	@FindBy(linkText = "Next")
	public WebElement nextButton;

	@FindBy(id = "initiate-btn-save")
	public WebElement saveAndSendEmailButton;

	@FindBy(id = "initiate-btn-close")
	public WebElement closeButton;

	@FindBy(id = "initiate-group")
	public WebElement nciTrainingOrganizationDropdown;

	@FindBy(id="select2-fellowCurrentTrainingTitle-container")
	public WebElement fellowTrainingTitleDropdownClick;
	
	@FindBy(xpath="//span[@class=\"select2-search select2-search--dropdown\"]/input")
	public WebElement fellowTrainingTitleDropdown;
	
	@FindBy(xpath="//span[@class=\"select2-search select2-search--dropdown\"]/following-sibling::span/ul/li")
	public WebElement fellowTrainingTitleSelections;
	
    @FindBy(id ="nedOrg")
	public WebElement nedOrgDropdowns;

	@FindBy(id = "idpStatus")
	public WebElement nciCurrentIDPStatus;

	@FindBy(id = "initiate-trainee")

	public WebElement traineeName;

	@FindBy(className = "bootbox-body")
	public WebElement idpInitiationMessage;

	@FindBy( xpath = "//div[@class='modal-dialog modal-sm']//button[@class='btn btn-primary']")
	public WebElement okButton;

	@FindBy( xpath = "//button[@data-original-title='Revise existing IDP']")
	public WebElement reviseExistingIDP;

	@FindBy(css = "span[class='select2-search select2-search--dropdown'] input")
	public WebElement searchInputField;

	@FindBy(id = "initiate-trainee-another")
	public WebElement initiateTraineeAnotherName;

	@FindBy( xpath = "//div[@style]//button[contains(text(),'Save & Send Email')]")
	public WebElement saveAndSendEmail;

	@FindBy(id = "trainees_with_idp_div")
	public WebElement traineesWithIDPCheckbox;

	@FindBy(id = "firstName")
	public WebElement TraineeFirstName;

	@FindBy(id = "clear_btn")
	public WebElement ClearButton;

	@FindBy(xpath = "//table[@id='advanced_search_results']/tbody/tr[1]/td[1]/a")
	public WebElement searchResultTableFirstRowFirstCell;

	@FindBy(xpath = "//table[@id='advanced_search_results']/tbody/tr[1]/td[3]")
	public WebElement searchResultTableFirstRowThirdCell;

	@FindBy(xpath = "//span[@id='select2-primaryMentor-container']")
	public WebElement selectPrimaryMentor;

	@FindBy(xpath = "//input[@id='search-btn']")
	public WebElement searchButtonCallowayGloria;

	@FindBy(xpath = "//table[@id='search-results']/tbody/tr[1]/td[1]/a")
	public WebElement searchResultTableFirstRowThirdCellCalloway;

	@FindBy(xpath = "//select[@id='trainee-classifications']")
	public WebElement classificationTypeDropDownGloriaGalloway;

	@FindBy(xpath = "//select[@id='primaryMentor']")
	public WebElement choosePrimaryMentor;

	@FindBy(id = "select2-trainingOrg-container")
	public WebElement nciTrainingOrgDropdown;

	@FindBy(xpath = "//select[@id='trainingOrg']")
	public WebElement chooseCBIIT;

	@FindBy(xpath = "//span[@id='select2-trainingOrg-container']")
	public WebElement selectTrainingOrganizationDropdown;

	@FindBy(xpath = "//table[@id='advanced_search_results']//tbody//tr[1]//td[2])[1]")
	public WebElement searchResultFirstRowSecondCell;

	@FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
	public WebElement inputBoxNIHSAC;

	@FindBy(xpath = "//select[@id='groups']")
	public WebElement chooseDropdownNIHSACGloriaCalloway;

	@FindBy(xpath = "//*[@id='trainees_without_idp_div']")
	public WebElement traineeWithoutIDPCHeckBox;

	/***
	 * USE THIS METHOD TO DYNAMICALLY SELECT CLASSIFICATION TYPE
	 * @param type
	 * @return
	 */
	public WebElement classificationType(String type){
		return WebDriverUtils.webDriver.findElement(
				By.xpath("//*[@id='select2-trainee-classifications-results']//li[text()='" + type + "']"));
	}

	public SearchPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
