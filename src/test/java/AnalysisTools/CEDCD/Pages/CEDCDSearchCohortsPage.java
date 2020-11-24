package AnalysisTools.CEDCD.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class CEDCDSearchCohortsPage extends CommonUtils {

	/**
	 * ================= Search Cohorts WebElements ================
	 */
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

	/** This element clicks on the Categories of Data Collected Drop down */
	@FindBy(xpath = "//button[contains(text(),'Categories of Data Collected')]")
	public WebElement categoriesOfDataCollectedDropDown;
	
	/** This element clicks on the "Depression" value from the Categories of Data Collected drop down */
	@FindBy (xpath = "//label[contains(text(),'Depression')]")
	public WebElement categoriesOfDataCollectedDepressionValue;
	
	
	/**
	 * This element selects "Alcohol Consumption" from the categories of data
	 * collected drop down
	 */
	@FindBy(xpath = "//label[contains(text(),'Alcohol Consumption')]")
	public WebElement categoriesOfDataCollectedAlcoholConsumptionValue;
	
	/** This element selects the whole section of the Eligibility Requirement */
	@FindBy (xpath = "(//div[@class='col-sm-3 filterCol'])[1]")
	public WebElement cohortEligibilityRequirementsSection;
	
	/** This element selects the whole section of the Enrollment */
	@FindBy (xpath = "(//div[@class='col-sm-3 filterCol'])[2]")
	public WebElement cohortEnrollmentSection;
	
	/** This list of WebElements returns all the values from the Categories of Data Collected */
	@FindBy (xpath = "//*[@id='filter-panel']/div[2]/div/div[1]/div[3]/div/div/div[1]/div/div/div/ul/li")
	public List<WebElement> categoriesOfDataCollectedValues;
	
	/** This element selects the whole section of the Data and Specimens Collected */
	@FindBy (xpath = "//div[@class='filterCol col-sm-6 last']")
	public WebElement cohortDataAndSpecimenCollectedSection;
	
	
	
	public CEDCDSearchCohortsPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
