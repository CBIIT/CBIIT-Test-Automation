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
<<<<<<< Updated upstream
	@FindBy(xpath = "(//a[@id='searchCohortsTab'])[2]")
	public WebElement searchCohortTab;

	/** This element is the gender drop down from the search Cohorts tab */
	@FindBy(xpath = "//button[@class='btn btn-default dropdown-toggle gender-list-for-testing']")
=======
<<<<<<< HEAD
	@FindBy(xpath = "//a[@id='searchCohortsTab']")
	public WebElement searchCohortTab;

	/** This element is the gender drop down from the search Cohorts tab */
	@FindBy(xpath = "//button[contains(text(),'Gender')]")
=======
	@FindBy(xpath = "(//a[@id='searchCohortsTab'])[2]")
	public WebElement searchCohortTab;

	/** This element is the gender drop down from the search Cohorts tab */
	@FindBy(xpath = "//button[@class='btn btn-default dropdown-toggle gender-list-for-testing']")
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
	public WebElement searchCohortsGenderBtn;

	/**
	 * This element selects "Female" from the gender drop down from the search
	 * cohorts tab
	 */
<<<<<<< Updated upstream
	@FindBy(xpath = "//input[@id='gender_checkbox_1']")
=======
<<<<<<< HEAD
	@FindBy(xpath = "//label[contains(text(),'Female')]")
=======
	@FindBy(xpath = "//input[@id='gender_checkbox_1']")
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
	public WebElement searchCohortsFemaleOption;

	/**
	 * This element selects "Male" from the gender drop down from the search Cohorts
	 * tab
	 */
<<<<<<< Updated upstream
	@FindBy(xpath = "//input[@id='gender_checkbox_2']")
=======
<<<<<<< HEAD
	@FindBy(xpath = "//label[contains(text(),'Male')]")
>>>>>>> Stashed changes
	public WebElement searchCohortsMaleOption;

	/** This element clicks on the search Cohort button */
	@FindBy(xpath = "//button[contains(text(),'Search Cohorts')]")
	public WebElement searchCohortResultBtn;

	/** This element lets you see the inputs when you filtered */
<<<<<<< Updated upstream
=======
	@FindBy(xpath = "//span[@class='pull-right d-inline-block toggle-down']")
	public WebElement showVariablesCollectedInCohortStudy;
=======
	@FindBy(xpath = "//input[@id='gender_checkbox_2']")
	public WebElement searchCohortsMaleOption;

	/** This element clicks on the search Cohort button */
	@FindBy(xpath = "//button[contains(text(),'Search Cohorts')]")
	public WebElement searchCohortResultBtn;

	/** This element lets you see the inputs when you filtered */
>>>>>>> Stashed changes
	@FindBy(xpath = "(//button[@id='compareButton'])[1]")
	public WebElement viewSelectedCohortDataButton;
	
	/** This element clicks on the select all Checkbox */
	@FindBy (xpath = "//input[@id='select_all']")
	public WebElement searchCohortSelectAllCheckbox;
	
	/** This list of webelements will return the number of cohorts selected plus the Data Collected section */
	@FindBy (xpath = "//*[@id='sticker']/th")
	public List<WebElement> numberofCohortsReturned;
	
	/** This element is the back to filter button */
	@FindBy (xpath = "//span[contains(text(),'Back to filter')]")
	public WebElement backToFilterButton;
	
	/** This is the Breast Cancer Family Registry Cohort link element */
	@FindBy (xpath = "//a[contains(text(),'Breast Cancer Family Registry Cohort')]")
	public WebElement bCFRCohort;
	
	/** This returns all the results from Female or All Cohorts */
	@FindBy (xpath = "/html/body/div[2]/div[2]/div[1]/div/div[3]/div[2]/div[3]/div[2]/div/div/div[4]/div[1]/table/tbody/tr[2]/td")
	public List<WebElement> returnedResultsFilter; 
<<<<<<< Updated upstream
=======
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes

	/** This element displays the number of returned results in text form */
	@FindBy(xpath = "(//span[@id='summaryCount'])[1]")
	public WebElement numberOfSearchResultReturned;

<<<<<<< Updated upstream
=======
<<<<<<< HEAD
	/** This element is the select all check box on the Search Cohorts Page */
	@FindBy(xpath = "//input[@id='select_all']")
	public WebElement selectAllCheckBox;

=======
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
	@FindBy (xpath = "/html/body/div[2]/div[2]/div[1]/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[3]/div/div/div[1]/div/div/div/ul/li")
=======
<<<<<<< HEAD
	@FindBy (xpath = "//*[@id='filter-panel']/div[2]/div/div[1]/div[3]/div/div/div[1]/div/div/div/ul/li")
=======
	@FindBy (xpath = "/html/body/div[2]/div[2]/div[1]/div/div[3]/div[2]/div[1]/div/div[2]/div[1]/div[3]/div/div/div[1]/div/div/div/ul/li")
>>>>>>> 8f4e2d8f13237294dd99ecbb9a77e6b945dae2eb
>>>>>>> Stashed changes
	public List<WebElement> categoriesOfDataCollectedValues;
	
	/** This element selects the whole section of the Data and Specimens Collected */
	@FindBy (xpath = "//div[@class='filterCol col-sm-6 last']")
	public WebElement cohortDataAndSpecimenCollectedSection;
	
	/** This element selects the URL for the Agricultural Health Study */
	@FindBy (xpath = "//a[@href='http://aghealth.nih.gov/']")
	public WebElement AHSURL;
	
	/** This element selects the AHS logo at the top to verify web page */
	@FindBy (xpath = "//span[contains(text(),'Agricultural Health Study')]")
	public WebElement AHSLogo;
	
	/** This element selects the text from the AHS for assertions */
	
	@FindBy (xpath = "//a[contains(text(), 'Agricultural Health Study')]")
	public WebElement AHSTextBox;
	
	
	
	public CEDCDSearchCohortsPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
