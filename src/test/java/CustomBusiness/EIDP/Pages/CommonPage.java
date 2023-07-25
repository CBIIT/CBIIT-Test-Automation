package CustomBusiness.EIDP.Pages;

import CustomBusiness.EIDP.Steps.HooksSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

public class CommonPage extends CommonUtils {

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	public WebElement okButton;
	
	@FindBy(xpath = "//*[text()='Go back to your Queue']")
	public WebElement goBackToHomeQueue;
	
	@FindBy(xpath = "//*[text()='Go back to your Home page']")
	public WebElement goBackToHomePage;
	
	@FindBy(xpath = "//*[text()='Go back to your Queue']")
	public WebElement goBackToYourQueue;
	
	@FindBy(css = "[value='Submit']")
	public WebElement submitButton;
	
	@FindBy(css = "[value='Save']")
	public WebElement saveButton;
	
	@FindBy(xpath = "//*[text()='Yes']")
	public WebElement yesButton;
	
	@FindBy(css = "[value='Verify Meeting And Accept IDP']")
	public WebElement verifyMeetingAndAcceptIDPButton;
	
	@FindBy(id= "meetingdate")
	public WebElement meetingDate;
	
	@FindBy(css = "[class*='checkbox btn btn-primary']")
	public WebElement markAsReviewed;

	@FindBy(xpath = "//a[@onclick='sendBackToTrainee()']")
	public WebElement sendToTraineeButton;

	
	public CommonPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
	public void clickOnOkButton() {
		CommonUtils.click(this.okButton);
	}
	
	public void clickOnYesButton() {
		CommonUtils.click(this.yesButton);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}
	
	public void clickOnModalFooterYesButton() {
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
		CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.cssSelector(".modal-footer [data-bb-handler='confirm']")));
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}
	
	public void clickOnbutton(String buttonText) {
		CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.xpath("//*[text()='" + buttonText + "']")));
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}
	
	public void clickOnSendBackToTrinee() {
		CommonUtils.click(sendToTraineeButton);
	}
	
	public void clickOnYesButtonOnTrainee() {
		CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.cssSelector("button[onclick='form_submit_approveByLBO()']")));
	}
	
	public void clickOnSubmitButton() {
		CommonUtils.click(submitButton);
	}
	
	public void clickOnSaveButton() {
		CommonUtils.click(saveButton);
	}
	
	public void clickOnVerifyMeetingAndAcceptIDPButton() {
		CommonUtils.click(verifyMeetingAndAcceptIDPButton);
	}
	
	public void enterToday() {
		CommonUtils.click(meetingDate);
		CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.cssSelector(".today.day")));
	}
	
	public void waitForGoBackToHomeQueueButtonVisible() {
		CommonUtils.waitForVisibility(goBackToHomeQueue);
	}
	
	public void waitForGoBackToHomePageButtonVisible() {
		CommonUtils.waitForVisibility(goBackToHomePage);
	}
	
	public void waitForGoBackToYourQueueButtonVisible() {
		CommonUtils.waitForVisibility(goBackToYourQueue);
	}
	
	public void clickOnMarkAsReviewed() {
		CommonUtils.click(markAsReviewed);
	}
	
}
