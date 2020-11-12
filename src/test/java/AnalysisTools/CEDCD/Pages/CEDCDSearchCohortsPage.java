package AnalysisTools.CEDCD.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class CEDCDSearchCohortsPage extends CommonUtils {

	/** This element is the search cohorts tab */
	@FindBy(xpath = "//a[@id='searchCohortsTab']")
	public WebElement searchCohortTab;

	/** This element is the gender dropdown from the search cohorts tab */
	@FindBy(xpath = "//button[contains(text(),'Gender')]")
	public WebElement searchCohortsGenderBtn;

	/**
	 * This element selects "Female" from the gender dropdown from the search
	 * cohorts tab
	 */
	@FindBy(xpath = "//label[contains(text(),'Female')]")
	public WebElement searchCohortsFemaleOption;

	/**
	 * This element selects "Male" from the gender dropdown from the search cohorts
	 * tab
	 */
	@FindBy(xpath = "//label[contains(text(),'Male')]")
	public WebElement searchCohortsMaleOption;

	/** This element clicks on the search cohort button */
	@FindBy(xpath = "//input[@id='filterEngage']")
	public WebElement searchCohortResultBtn;

	/** This element lets you see the inputs when you filtered */
	@FindBy(xpath = "//span[@class='pull-right d-inline-block toggle-down']")
	public WebElement showVariablesCollectedInCohortStudy;

	/** This element displays the number of returned results in text form */
	@FindBy(xpath = "(//span[@id='summaryCount'])[1]")
	public WebElement numberOfSearchResultReturned;

	public CEDCDSearchCohortsPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
}
