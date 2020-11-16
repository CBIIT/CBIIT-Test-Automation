package AnalysisTools.CEDCD.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class CEDCDSearchCohortsPage extends CommonUtils {

	/** This element is the search Cohorts tab */
	@FindBy(xpath = "//a[@id='searchCohortsTab']")
	public WebElement searchCohortTab;

	/** This element is the gender drop down from the search Cohorts tab */
	@FindBy(xpath = "//button[contains(text(),'Gender')]")
	public WebElement searchCohortsGenderBtn;

	/**
	 * This element selects "Female" from the gender drop down from the search
	 * cohorts tab
	 */
	@FindBy(xpath = "//label[contains(text(),'Female')]")
	public WebElement searchCohortsFemaleOption;

	/**
	 * This element selects "Male" from the gender drop down from the search Cohorts
	 * tab
	 */
	@FindBy(xpath = "//label[contains(text(),'Male')]")
	public WebElement searchCohortsMaleOption;

	/** This element clicks on the search Cohort button */
	@FindBy(xpath = "//input[@id='filterEngage']")
	public WebElement searchCohortResultBtn;

	/** This element lets you see the inputs when you filtered */
	@FindBy(xpath = "//span[@class='pull-right d-inline-block toggle-down']")
	public WebElement showVariablesCollectedInCohortStudy;

	/** This element displays the number of returned results in text form */
	@FindBy(xpath = "(//span[@id='summaryCount'])[1]")
	public WebElement numberOfSearchResultReturned;

	/** This element is the select all check box on the Search Cohorts Page */
	@FindBy(xpath = "//input[@id='select_all']")
	public WebElement selectAllCheckBox;
	
	/** This element selects the Biospecimen tab on the home page */
	@FindBy (xpath = "//span[contains(text(),'Biospecimen Counts')]")
	public WebElement biospecimenTab;
	
	/** This element selects the Specimen Type drop down from the Biospecimen tab */
	@FindBy (xpath = "//button[contains(text(), 'Specimen Type')]")
	public WebElement specimenType;
	
	/** This element selects "All Types" from the Specimen Type drop down */
	@FindBy (xpath = "//label[contains(text(), 'All Types')]")
	public WebElement specimenTypeDropDownAllTypeValue;
	
	/** This element clicks on the Cancer Type drop down on the Biospecimen tab*/
	@FindBy (xpath = "//button[contains(text(),'Cancer Type')]")
	public WebElement cancerType;
	
	/** This element clicks on the "All Types" from the cancerType drop down */
	@FindBy (xpath = "//label[contains(text(),'All Cancers')]")
	public WebElement cancerTypeDropDownAllTypeValues;
	
	/** This element clicks on the Cohort drop down from the Biospecimen tab */
	@FindBy (xpath = "//button[contains(text(),'Select Cohorts')]")
	public WebElement cohortType;
	
	/** This element clicks on the "All Cohorts" from the Cohorts drop down */
	@FindBy (xpath = "//label[contains(text(),'All Cohorts')]")
	public WebElement cohortTypeDropDownAllTypeValue;
	
	@FindBy (xpath = "//input[@name='submitBtn']")
	public WebElement biospecimenSubmitBtn;
	
	@FindBy (xpath = "//a[contains(text(),'Clear All')]")
	public WebElement biospecimenClearAllBtn;

	public CEDCDSearchCohortsPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
