package CUSTOM_BUSINESS.EIDP.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class CommonPage extends CommonUtils {

	/* ------ Click on OK button ------ */
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement okButton;
	
	/* ------ Button to go back to home queue ------ */
	@FindBy(xpath = "//*[text()='Go back to your Queue']")
	public WebElement goBackToHomeQueue;
	
	/* ------ Button to go back to home page ------ */
	@FindBy(xpath = "//*[text()='Go back to your Home page']")
	public WebElement goBackToHomePage;
	
	/* ------ Submit button ------ */
	@FindBy(css = "[value='Submit']")
	public WebElement submitButton;
	
	/* ------ Save button ------ */
	@FindBy(css = "[value='Save']")
	public WebElement saveButton;
	
	/* ------ Yes button ------ */
	@FindBy(xpath = "//*[text()='Yes']")
	public WebElement yesButton;
	
	/* ------ Verify meeting and accept IDP button ------ */
	@FindBy(css = "[value='Verify Meeting And Accept IDP']")
	public WebElement verifyMeetingAndAcceptIDPButton;
	
	/* ------ Meeting date ------ */
	@FindBy(id= "meetingdate")
	public WebElement meetingDate;
	
	/* ------ Mark as reviewed checkbox ------ */
	@FindBy(css = "[class*='checkbox btn btn-primary']")
	public WebElement markAsReviewed;

	/* ------ Send IDP to Trainee button ------ */
	@FindBy(xpath = "//a[@onclick='sendBackToTrainee()']")
	public WebElement sendToTraineeButton;

	
	public CommonPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
	public void clickOnOkButton() {
		CommonUtils.clickOnElement(this.okButton);
	}
	
	public void clickOnYesButton() {
		CommonUtils.clickOnElement(this.yesButton);
		CucumberLogUtils.logScreenshot();
	}
	
	public void clickOnModalFooterYesButton() {
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(WebDriverUtils.webDriver.findElement(By.cssSelector(".modal-footer [data-bb-handler='confirm']")));
		CucumberLogUtils.logScreenshot();
	}
	
	public void clickOnbutton(String buttonText) {
		CommonUtils.clickOnElement(WebDriverUtils.webDriver.findElement(By.xpath("//*[text()='" + buttonText + "']")));
		CucumberLogUtils.logScreenshot();
	}
	
	public void clickOnSendBackToTrinee() {
		CommonUtils.clickOnElement(sendToTraineeButton);
	}
	
	public void clickOnYesButtonOnTrainee() {
		CommonUtils.clickOnElement(WebDriverUtils.webDriver.findElement(By.cssSelector("button[onclick='form_submit_approveByLBO()']")));
	}
	
	public void clickOnSubmitButton() {
		CommonUtils.clickOnElement(submitButton);
	}
	
	public void clickOnSaveButton() {
		CommonUtils.clickOnElement(saveButton);
	}
	
	public void clickOnVerifyMeetingAndAcceptIDPButton() {
		CommonUtils.clickOnElement(verifyMeetingAndAcceptIDPButton);
	}
	
	public void enterToday() {
		CommonUtils.clickOnElement(meetingDate);
		CommonUtils.clickOnElement(WebDriverUtils.webDriver.findElement(By.cssSelector(".today.day")));
	}
	
	public void waitForGoBackToHomeQueueButtonVisible() {
		CommonUtils.waitForVisibility(goBackToHomeQueue);
	}
	
	public void waitForGoBackToHomePageButtonVisible() {
		CommonUtils.waitForVisibility(goBackToHomePage);
	}
	
	public void waitForGoBackToYourQueueButtonVisible() {
		CommonUtils.waitForVisibility(goBackToHomeQueue);
	}
	
	public void clickOnMarkAsReviewed() {
		CommonUtils.clickOnElement(markAsReviewed);
	}
	
}
