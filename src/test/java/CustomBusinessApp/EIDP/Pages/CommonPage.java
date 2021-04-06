package CustomBusinessApp.EIDP.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;


public class CommonPage extends CommonUtils{

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	private WebElement okButton;
	
	@FindBy(xpath = "//*[text()='Go back to your Queue']")
	private WebElement goBackToHomeQueue;
	
	@FindBy(xpath = "//*[text()='Go back to your Home page']")
	private WebElement goBackToHomePage;
	
	@FindBy(xpath = "//*[text()='Go back to your Queue']")
	private WebElement goBackToYourQueue;
	
	@FindBy(css = "[value='Submit']")
	private WebElement submitButton;
	
	@FindBy(css = "[value='Save']")
	private WebElement saveButton;
	
	@FindBy(xpath = "//*[text()='Yes']")
	private WebElement yesButton;
	
	@FindBy(css = "[value='Verify Meeting And Accept IDP']")
	private WebElement verifyMeetingAndAcceptIDPButton;
	
	@FindBy(id= "meetingdate")
	private WebElement meetingDate;
	
	public CommonPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}
	
	public void clickOnOkButton() {
		CommonUtils.click(this.okButton);
	}
	
	public void clickOnYesButton() {
		CommonUtils.click(this.yesButton);
		CucumberLogUtils.logScreenShot("After Clicking Yes Button");
	}
	
	public void clickOnModalFooterYesButton() {
		CucumberLogUtils.logScreenShot("Before Clicking Button");
		CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.cssSelector(".modal-footer [data-bb-handler='confirm']")));
		CucumberLogUtils.logScreenShot("After Clicking Button");
	}
	
	public void clickOnbutton(String buttonText) {
		WebElement buttonEle = WebDriverUtils.getWebDriver().findElement(By.xpath("//*[text()='" + buttonText + "']"));
		CucumberLogUtils.logScreenShot("Before Clicking "+buttonText+" Button");
		CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.xpath("//*[text()='" + buttonText + "']")));
		CucumberLogUtils.logScreenShot("After Clicking "+buttonText+" Button");
	}
	
	public void clickOnSendBackToTrinee() {
		CommonUtils.click(WebDriverUtils.getWebDriver().findElement(By.cssSelector("[data-target='#myModal']")));
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
	
	
}
