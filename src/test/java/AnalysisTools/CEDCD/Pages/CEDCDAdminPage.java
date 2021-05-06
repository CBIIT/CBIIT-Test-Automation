package AnalysisTools.CEDCD.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.WebDriverUtils;

public class CEDCDAdminPage {

	public CEDCDAdminPage() {

		PageFactory.initElements(WebDriverUtils.webDriver, this);

	}

	/**
	 * ================================================= Public Site Login
	 * WebElements =======================================================
	 */

	/** NIH Login Button */
	@FindBy(linkText = "NIH Login")
	public WebElement nihLoginBtn;

	/** External Login Button */
	@FindBy(linkText = "External Login")
	public WebElement extLoginBtn;

	/** Logout Button */
	@FindBy(xpath = "//a[@class='login-button']")
	public WebElement logoutButton;

	/**
	 * ================================================= Internal Login Page
	 * WebElements =======================================================
	 */

	/** Username Textbox */
	@FindBy(id = "USER")
	public WebElement internalUsernameTxtBox;

	/** Password Textbox */
	@FindBy(id = "PASSWORD")
	public WebElement internalPasswordTxtBox;

	/** Submit Button */
	@FindBy(xpath = "//*[@type='submit']")
	public WebElement loginSubmitBtn;

	/**
	 * ================================================= Manage Cohort Page
	 * WebElements =======================================================
	 */

	/** Add New Cohort Hyperlink */
	@FindBy(linkText = "Add New Cohort")
	public WebElement addNewCohortlnk;

	/**
	 * ================================================= Add New Cohort Page
	 * WebElements =======================================================
	 */

	/** Cohort Name Textbox */
	@FindBy(xpath = "(//*[@class='form-control'])[1]")
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
}
