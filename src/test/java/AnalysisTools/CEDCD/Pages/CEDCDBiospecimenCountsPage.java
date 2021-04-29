package AnalysisTools.CEDCD.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class CEDCDBiospecimenCountsPage extends CommonUtils {

	/**======================= Biospecimen WebElements ====================*/
	
	/** This element selects the Biospecimen tab on the home page */
	@FindBy(xpath = "(//span[contains(text(),'Biospecimen Counts')])[2]")
	public WebElement biospecimenTab;

	/** This element selects the Specimen Type drop down from the Biospecimen tab */
	@FindBy(xpath = "//button[contains(text(), 'Specimen Type')]")
	public WebElement specimenType;

	/** This element selects "All Types" from the Specimen Type drop down */
	@FindBy(xpath = "//label[contains(text(), 'All Types')]")
	public WebElement specimenTypeDropDownAllTypeValue;
	
	/** This element selects "Buffy Coat and/or Lymphocytes" from the Specimen Type drop down */
	@FindBy(xpath = "//label[contains(text(), 'Buffy Coat and/or Lymphocytes')]")
	public WebElement specimenTypeDropDownBuffyCoatAndOrLymphocytesValue;
	
	/** This element selects "Feces" from the Specimen Type drop down */
	@FindBy(xpath = "//label[contains(text(), 'Feces')]")
	public WebElement specimenTypeDropDownFecesValue;
	
	/** This element selects "Saliva and/or Buccal" from the Specimen Type drop down */
	@FindBy(xpath = "//label[contains(text(), 'Saliva and/or Buccal')]")
	public WebElement specimenTypeDropDownSalivaAndOrBuccalValue;
	
	/** This element selects "Serum and/or Plasma" from the Specimen Type drop down */
	@FindBy(xpath = "//label[contains(text(), 'Serum and/or Plasma')]")
	public WebElement specimenTypeDropDownSerumAndOrPlasmaValue;
	
	/** This element selects "Tumor Tissue FFPE" from the Specimen Type drop down */
	@FindBy(xpath = "//label[contains(text(), 'Tumor Tissue FFPE')]")
	public WebElement specimenTypeDropDownTumorTissueFFPEValue;
	
	/** This element selects "Tumor Tissue Fresh/Frozen" from the Specimen Type drop down */
	@FindBy(xpath = "//label[contains(text(), 'Tumor Tissue Fresh/Frozen')]")
	public WebElement specimenTypeDropDownTumorTissueFreshFrozenValue;
	
	/** This element selects "Urine" from the Specimen Type drop down */
	@FindBy(xpath = "//label[contains(text(), 'Urine')]")
	public WebElement specimenTypeDropDownUrineValue;
	
	/** This element returns the list of selections from the Specimen Type (still returns all values from specimen type, cancer type, cohorts) drop down */
	@FindBy (xpath = "//div[contains(@class, 'dropdown-menu')]/ul/li/label")
	public List<WebElement> specimenTypeDropDownValues;

	/** This element clicks on the Cancer Type drop down on the Biospecimen tab */
	@FindBy(xpath = "//button[contains(text(),'Cancer Type')]")
	public WebElement cancerType;
	
	/** This element is a list of the Cancer Type drop down values on the Biospecimen tab */
	@FindBy(xpath = "//*[@id='filter-panel']/div[2]/div[1]/div[2]/div/div/div/ul/li")
	public List<WebElement> cancerTypeValues;

	/** This element clicks on the "All Types" from the cancerType drop down */
	@FindBy(xpath = "//label[contains(text(),'All Cancers')]")
	public WebElement cancerTypeDropDownAllTypeValues;

	/** This element clicks on the Cohort drop down from the Biospecimen tab */
	@FindBy(xpath = "//button[contains(text(),'Select Cohorts')]")
	public WebElement cohortType;

	/** This element clicks on the "All Cohorts" from the Cohorts drop down */
	@FindBy(xpath = "//label[contains(text(),'All Cohorts')]")
	public WebElement cohortTypeDropDownAllTypeValue;

	/** Searches the filters on the Biospecimen Counts Tab */
	@FindBy(xpath = "(//button[contains(text(),'Submit')])[2]")
	public WebElement biospecimenSubmitBtn;

	/** This element clears all filters on the Biospecimen Counts tab */
	@FindBy(xpath = "//a[contains(text(),'Clear All')]")
	public WebElement biospecimenClearAllBtn;
	
	

	public CEDCDBiospecimenCountsPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
