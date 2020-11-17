package AnalysisTools.CEDCD.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class CEDCDBiospecimenCountsPage extends CommonUtils {

	/**======================= Biospecimen WebElements ====================*/
	
	/** This element selects the Biospecimen tab on the home page */
	@FindBy(xpath = "//span[contains(text(),'Biospecimen Counts')]")
	public WebElement biospecimenTab;

	/** This element selects the Specimen Type drop down from the Biospecimen tab */
	@FindBy(xpath = "//button[contains(text(), 'Specimen Type')]")
	public WebElement specimenType;

	/** This element selects "All Types" from the Specimen Type drop down */
	@FindBy(xpath = "//label[contains(text(), 'All Types')]")
	public WebElement specimenTypeDropDownAllTypeValue;

	/** This element clicks on the Cancer Type drop down on the Biospecimen tab */
	@FindBy(xpath = "//button[contains(text(),'Cancer Type')]")
	public WebElement cancerType;

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
	@FindBy(xpath = "//input[@name='submitBtn']")
	public WebElement biospecimenSubmitBtn;

	/** This element clears all filters on the Biospecimen Counts tab */
	@FindBy(xpath = "//a[contains(text(),'Clear All')]")
	public WebElement biospecimenClearAllBtn;
	
	

	public CEDCDBiospecimenCountsPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
