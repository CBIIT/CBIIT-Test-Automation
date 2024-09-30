package CustomBusiness.EIDP.Pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import CustomBusiness.EIDP.Util.CommonUtil;
import CustomBusiness.EIDP.Util.SharedData;

public class CoPrimaryMentorPage extends CommonUtils {

	/* ------ Checkbox for Mark as Reviewed ------ */
	@FindBy(xpath = "//*[contains(@class,'checkbox btn btn-primary')]")
	public WebElement markAsReviewedCheckbox;

	/* ------ Checkbox for NHGRI Mark as Reviewed ------ */
	@FindBy(css = "[class='checkbox btn btn-primary validate-error']")
	public WebElement markAsReviewedCheckboxNhgri;

	/* ------ General information tab ------ */
	@FindBy(css = "[href*='/idp/review-general']")
	public WebElement generalInformationTab;

	/* ------ Save and Continue Button ------ */
	@FindBy(id = "saveAndNextButton")
	public WebElement saveAndContinueButton;

	/* ------ Save button ------ */
	@FindBy(id = "saveButton")
	public WebElement saveButton;

	/* ------ IDP reviewed button ------ */
	@FindBy(id = "approveSubmit")
	public WebElement reviewedButton;

	/* ------ Final Mark as Reviewed checkbox ------ */
	@FindBy(id = "markasReviewedAllPagesCheck")
	public WebElement markAsReviewed;

	/* ------ TD approves IDP button ------ */
	@FindBy(id = "tdAprroveIDP")
	public WebElement approvedAndSubmitButton;

	/* ------ NCI TD approves and submit button ------ */
	@FindBy(id = "aprroveByTDModal")
	public WebElement approvedAndSubmitButtonNCI;

	/* ------ Yes button after TD approves IDP ------ */
	@FindBy(css = "button[onclick='form_submit_approveByTD(this)']")
	public WebElement yesButton;

	/* ------ Yes button after LBO approves IDP ------ */
	@FindBy(xpath = "//*[@onclick=\"form_submit_approveByLBO()\"]")
	public WebElement finalYesButton;

	/* ------ LBO approves IDP button ------ */
	@FindBy(id = "lboAprroveIDP")
	public WebElement approveIDP;

	/* ------ Button for returning to PM comments section ------ */
	@FindBy(id = "returnToPMComments")
	public WebElement primaryMentorComments;

	/* ------ Button for returning IDP to PM ------ */
	@FindBy(xpath =  "//div[4]/form/ul/li[2]/a")
	public WebElement returnToPM;

	/* ------ Return to PM on popup window ------ */
	@FindBy(xpath =  "//button[@onclick = 'form_submit_returnToPM()']")
	public WebElement returnToPMonPopUpWindow;

	public CoPrimaryMentorPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	public void markAsReviewedInAllTabsForDir() {
		CommonUtils.clickOnElement(markAsReviewedCheckbox);
		CommonUtils.clickOnElement(approvedAndSubmitButton);
		CommonUtils.clickOnElement(yesButton);
	}

	public void approveIdp() {
		CommonUtils.clickOnElement(markAsReviewedCheckbox);
		CommonUtils.clickOnElement(approveIDP);
		CommonUtils.clickOnElement(finalYesButton);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
	}

	public void markAsReviewedInAllTabs() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			if (isElementDisplayed(generalInformationTab)) {
				CommonUtils.clickOnElement(generalInformationTab);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (isElementDisplayed(markAsReviewedCheckbox)) {
				CommonUtils.clickOnElement(markAsReviewedCheckbox);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (isElementDisplayed(saveAndContinueButton)) {
				CommonUtils.clickOnElement(saveAndContinueButton);
			}
		} catch (Exception e) {

		}
		// Project related deliverables / training
		try {
			if (isElementDisplayed(markAsReviewedCheckbox)) {
				CommonUtils.clickOnElement(markAsReviewedCheckbox);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {

			if (isElementDisplayed(saveAndContinueButton)) {
				CommonUtils.clickOnElement(saveAndContinueButton);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (isElementDisplayed(markAsReviewedCheckbox)) {
				CommonUtils.clickOnElement(markAsReviewedCheckbox);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (isElementDisplayed(saveAndContinueButton)) {
				CommonUtils.clickOnElement(saveAndContinueButton);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (isElementDisplayed(markAsReviewedCheckbox)) {
				CommonUtils.clickOnElement(markAsReviewedCheckbox);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (isElementDisplayed(saveAndContinueButton)) {
				CommonUtils.clickOnElement(saveAndContinueButton);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (isElementDisplayed(markAsReviewedCheckbox)) {
				CommonUtils.clickOnElement(markAsReviewedCheckbox);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			CucumberLogUtils.logScreenshot();
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (isElementDisplayed(saveButton)) {
				CommonUtils.clickOnElement(saveButton);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void markNHGRIasReviewed() {
		CommonUtils.clickOnElement(markAsReviewedCheckbox);
		CucumberLogUtils.logScreenshot();

	}

	public void clickOnReviewedButton() {
		CommonUtils.waitForClickability(reviewedButton);
		CommonUtils.clickOnElement(reviewedButton);
	}

	public void markAsReviewed() {
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(markAsReviewed);
	}

	public void clickOnApproveAndSubmitButton() {
		CucumberLogUtils.logScreenshot();
		CommonUtils.sleep(2000);
		String locator = "//*[@id='tdAprroveIDP']";
		if (WebDriverUtils.webDriver.findElements(By.xpath(locator)).size() > 0) {
			CommonUtils.clickOnElement(approvedAndSubmitButton);
		} else {
			CommonUtils.clickOnElement(reviewedButton);
		}
		CommonUtils.sleep(1000);
	}

	public void clickOnApproveAndSubmitButtonFORNCI() {

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CucumberLogUtils.logScreenshot();
		try {
			try {
				String locator = "//*[@id='aprroveByTDModal']";
				if (WebDriverUtils.webDriver.findElements(By.xpath(locator)).size() > 0) {
					CommonUtils.clickOnElement(approvedAndSubmitButtonNCI);
				} else {
					CommonUtils.clickOnElement(reviewedButton);
				}
			} catch (Exception ee) {

			}

			try {
				String locator = "//*[@id='errorAlertTD']";
				if (WebDriverUtils.webDriver.findElements(By.xpath(locator)).size() > 0) {
					CommonUtils.clickOnElement(markAsReviewedCheckbox);
					CommonUtils.clickOnElement(approvedAndSubmitButtonNCI);
				}
			} catch (Exception eef) {
			}
			try {
				CommonUtils.clickOnElement(approvedAndSubmitButton);
			} catch (Exception e) {

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnApproveAndSubmitButtonNHGRI() {
		if (markAsReviewedCheckbox.isDisplayed())
			CommonUtils.clickOnElement(markAsReviewedCheckbox);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(approvedAndSubmitButton);
	}

	public void clickOnYesButton() {
		CommonUtils.clickOnElement(yesButton);
	}

	public void clickOnApproveIDPButton() {
		CommonUtils.clickOnElement(approveIDP);
	}

	public void clickOnReturnToPrimaryMentorButton() {
		try {
			if (markAsReviewedCheckbox.isDisplayed())
				CommonUtils.clickOnElement(markAsReviewedCheckbox);
			CommonUtils.clickOnElement(returnToPM);
			CommonUtils.waitForVisibility(primaryMentorComments);
			CommonUtils.sendKeys(primaryMentorComments, "Return to primary mentor flow");
			CommonUtils.clickOnElement(returnToPMonPopUpWindow);
		} catch (Exception e) {

		}
	}

	public void clickOnReturnToTrainnee() {
		if (markAsReviewedCheckbox.isDisplayed())
			CommonUtils.clickOnElement(markAsReviewedCheckbox);
		List<WebElement> buttonEles = WebDriverUtils.webDriver
				.findElements(By.cssSelector(".pager.wizard #tdReturnToTrainee"));
		CommonUtils.clickOnElement(buttonEles.get(buttonEles.size() - 1));
		CommonUtils.sendKeys(primaryMentorComments, "Return to primary mentor flow");
		CommonUtils.clickOnElement(
				WebDriverUtils.webDriver.findElement(By.cssSelector("[onclick='form_submit_toTrainee()']")));
	}

	public Boolean isTrainneeNameDisplayed() {
		CommonUtil.waitBrowser(5000);
		return WebDriverUtils.webDriver.findElement(By.linkText(SharedData.traineeName)).isDisplayed();
	}
}
