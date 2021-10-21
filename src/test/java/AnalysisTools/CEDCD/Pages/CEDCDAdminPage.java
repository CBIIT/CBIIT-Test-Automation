package AnalysisTools.CEDCD.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;

public class CEDCDAdminPage {
	
	public CEDCDAdminPage(){
		
		PageFactory.initElements(WebDriverUtils.webDriver, this);
		
	}
	
	/**================================================= Public Site Login WebElements =======================================================*/
	
	/** NIH Login Button */
	@FindBy(linkText = "NIH Login")
	public WebElement nihLoginBtn; 
	
	/** External Login Button */
	@FindBy(linkText = "External Login")
	public WebElement extLoginBtn;
	
	/** Logout Button */
	@FindBy(xpath = "//a[@class='login-button']")
	public WebElement logoutButton;
	
	/**================================================= Internal Login Page WebElements =======================================================*/
	
	
	/** Username Textbox */
	@FindBy(id="USER")
	public WebElement internalUsernameTxtBox; 
	
	/** Password Textbox */
	@FindBy(id="PASSWORD")
	public WebElement internalPasswordTxtBox; 
	
	/** Submit Button */
	@FindBy(xpath = "//*[@type='submit']")
	public WebElement loginSubmitBtn; 
	
	/**================================================= Manage Cohort Page WebElements =======================================================*/
	
	/** Add New Cohort Hyperlink */
	@FindBy(linkText = "Add New Cohort")
	public WebElement addNewCohortlnk; 
	
	/** Cohort Status Drop down */
	@FindBy (xpath = "//button[contains(text(),'Status')]")
	public WebElement cohortStatusDropDown;
	
	/** Cohort Status Drop down Submitted Value */
	@FindBy (xpath = "//label[contains(text(),'Submitted')]")
	public WebElement cohortSubmittedStatus;
	
	/** This element is the first cohort study with the submitted status */
	@FindBy (xpath = "(//a[contains(text(),'Review')])[1]")
	public WebElement firstSubmittedCohort;
	
	
	
	
	/**================================================= Add New Cohort Page WebElements =======================================================*/
	
	/** Cohort Name Textbox */
	@FindBy(xpath= "(//*[@class='form-control'])[1]")
	public WebElement cohortNameTxtBox; 
	
	/** Cohort Acroynm Textbox */
	@FindBy(xpath = "(//*[@class='form-control'])[2]")
	public WebElement cohortAcroynmTxtBox; 
	
	/** Cohort Owner Textbox */
	@FindBy(xpath = "//*[@id='react-select-2-input']")
	public WebElement cohortOwnerTxtBox; 
	 
	/** Cohort Owner Down Arrow */
	@FindBy(xpath = "//*[@class=' css-tlfecz-indicatorContainer']")
	public WebElement cohortOwnerDownArrow; 
	
	/** Notes Textbox */
	@FindBy(xpath = "(//*[@class='form-control'])[3]")
	public WebElement notesTxtBox; 
	
	/** Submit Button */
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	public WebElement cohortSubmitBtn; 
	
	/**================================================= Cohort Questionnaire Page WebElements =======================================================*/
	
	/** Approve Button */
	@FindBy (xpath = "//button[contains(text(),'Approve')]")
	public WebElement approveButton;
	
	/** Reject Button */
	@FindBy (xpath = "//button[contains(text(),'Reject')]")
	public WebElement rejectButton;
	
	/** The Publish Cohort confirmation pop up */
	@FindBy (xpath = "//span[contains(text(),'Publish Cohort')]")
	public WebElement publishCohortPopUp;
	
	/** Publish Button on the confirmation tab */
	@FindBy (xpath = "//button[contains(text(),'Publish')]")
	public WebElement publishButton;
	
	/** Cancel Button on the confirmation tab */
	@FindBy (xpath = "//button[contains(text(),'Cancel')]")
	public WebElement cancelButton; 
	
	/** =========================== General Web Elements on Admin Page ========================= */
	
	@FindBy (xpath = "//div[contains(text(),'Warning: Session Timeout')]")
	public WebElement sessionTimeout;
	
}
