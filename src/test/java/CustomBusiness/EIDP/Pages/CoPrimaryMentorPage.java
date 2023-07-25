package CustomBusiness.EIDP.Pages;

import java.util.List;
import CustomBusiness.EIDP.Steps.HooksSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;
import CustomBusiness.EIDP.Util.CommonUtil;
import CustomBusiness.EIDP.Util.SharedData;

public class CoPrimaryMentorPage extends CommonUtils {

	@FindBy(xpath = "//*[contains(@class,'checkbox btn btn-primary')]")
	public WebElement markAsReviewedCheckbox;

	@FindBy(css = "[class='checkbox btn btn-primary validate-error']")
	public WebElement markAsReviewedCheckboxNhgri;

	@FindBy(css = "[href*='/idp/review-general']")
	public WebElement generalInformationTab;

	@FindBy(id = "saveAndNextButton")
	public WebElement saveAndContinueButton;

	@FindBy(id = "saveButton")
	public WebElement saveButton;

	@FindBy(id = "approveSubmit")
	public WebElement reviewedButton;

	@FindBy(id = "markasReviewedAllPagesCheck")
	public WebElement markAsReviewed;

	@FindBy(id = "tdAprroveIDP")
	public WebElement approvedAndSubmitButton;

	@FindBy(id = "aprroveByTDModal")
	public WebElement approvedAndSubmitButtonNCI;

	@FindBy(css = "button[onclick='form_submit_approveByTD(this)']")
	public WebElement yesButton;

	@FindBy(xpath = "//*[@onclick=\"form_submit_approveByLBO()\"]")
	public WebElement finalYesButton;

	@FindBy(id = "lboAprroveIDP")
	public WebElement approveIDP;

	@FindBy(id = "returnToPMComments")
	public WebElement primaryMentorComments;

	@FindBy(xpath =  "//div[4]/form/ul/li[2]/a")
	public WebElement returnToPM;

	@FindBy(xpath =  "//button[@onclick = 'form_submit_returnToPM()']")
	public WebElement returnToPMonPopUpWindow;

	public CoPrimaryMentorPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	public void markAsReviewedInAllTabsForDir() {
		CommonUtils.click(markAsReviewedCheckbox);
		CommonUtils.click(approvedAndSubmitButton);
		CommonUtils.click(yesButton);
	}

	public void approveIdp() {
		CommonUtils.click(markAsReviewedCheckbox);
		CommonUtils.click(approveIDP);
		CommonUtils.click(finalYesButton);
		MiscUtils.sleep(2000);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
	}

	public void markAsReviewedInAllTabs() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			if (isElementDisplayed(generalInformationTab)) {
				CommonUtils.click(generalInformationTab);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (isElementDisplayed(markAsReviewedCheckbox)) {
				CommonUtils.click(markAsReviewedCheckbox);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (isElementDisplayed(saveAndContinueButton)) {
				CommonUtils.click(saveAndContinueButton);
			}
		} catch (Exception e) {

		}
		// Project related deliverables / training
		try {
			if (isElementDisplayed(markAsReviewedCheckbox)) {
				CommonUtils.click(markAsReviewedCheckbox);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {

			if (isElementDisplayed(saveAndContinueButton)) {
				CommonUtils.click(saveAndContinueButton);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (isElementDisplayed(markAsReviewedCheckbox)) {
				CommonUtils.click(markAsReviewedCheckbox);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (isElementDisplayed(saveAndContinueButton)) {
				CommonUtils.click(saveAndContinueButton);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (isElementDisplayed(markAsReviewedCheckbox)) {
				CommonUtils.click(markAsReviewedCheckbox);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (isElementDisplayed(saveAndContinueButton)) {
				CommonUtils.click(saveAndContinueButton);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (isElementDisplayed(markAsReviewedCheckbox)) {
				CommonUtils.click(markAsReviewedCheckbox);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (isElementDisplayed(saveButton)) {
				CommonUtils.click(saveButton);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void markNHGRIasReviewed() {
		CommonUtils.click(markAsReviewedCheckbox);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);

	}

	public void clickOnReviewedButton() {
		CommonUtils.waitForClickability(reviewedButton);
		CommonUtils.click(reviewedButton);
	}

	public void markAsReviewed() {
		MiscUtils.sleep(2000);
		CommonUtils.click(markAsReviewed);
	}

	public void clickOnApproveAndSubmitButton() {
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
		MiscUtils.sleep(2000);
		String locator = "//*[@id='tdAprroveIDP']";
		if (WebDriverUtils.getWebDriver().findElements(By.xpath(locator)).size() > 0) {
			CommonUtils.click(approvedAndSubmitButton);
		} else {
			CommonUtils.click(reviewedButton);
		}
		MiscUtils.sleep(1000);
	}

	public void clickOnApproveAndSubmitButtonFORNCI() {

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
		try {
			try {
				String locator = "//*[@id='aprroveByTDModal']";
				if (WebDriverUtils.getWebDriver().findElements(By.xpath(locator)).size() > 0) {
					CommonUtils.click(approvedAndSubmitButtonNCI);
				} else {
					CommonUtils.click(reviewedButton);
				}
			} catch (Exception ee) {

			}

			try {
				String locator = "//*[@id='errorAlertTD']";
				if (WebDriverUtils.getWebDriver().findElements(By.xpath(locator)).size() > 0) {
					CommonUtils.click(markAsReviewedCheckbox);
					CommonUtils.click(approvedAndSubmitButtonNCI);
				}
			} catch (Exception eef) {
			}
			try {
				CommonUtils.click(approvedAndSubmitButton);
			} catch (Exception e) {

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnApproveAndSubmitButtonNHGRI() {
		if (markAsReviewedCheckbox.isDisplayed())
			CommonUtils.click(markAsReviewedCheckbox);
		CucumberLogUtils.takeScreenShot(HooksSteps.scenario);
		CommonUtils.click(approvedAndSubmitButton);
	}

	public void clickOnYesButton() {
		CommonUtils.click(yesButton);
	}

	public void clickOnApproveIDPButton() {
		CommonUtils.click(approveIDP);
	}

	public void clickOnReturnToPrimaryMentorButton() {
		try {
			if (markAsReviewedCheckbox.isDisplayed())
				CommonUtils.click(markAsReviewedCheckbox);
			CommonUtils.click(returnToPM);
			CommonUtils.waitForVisibility(primaryMentorComments);
			CommonUtils.sendKeys(primaryMentorComments, "Return to primary mentor flow");
			CommonUtils.click(returnToPMonPopUpWindow);
		} catch (Exception e) {

		}
	}

	public void clickOnReturnToTrainnee() {
		if (markAsReviewedCheckbox.isDisplayed())
			CommonUtils.click(markAsReviewedCheckbox);
		List<WebElement> buttonEles = WebDriverUtils.getWebDriver()
				.findElements(By.cssSelector(".pager.wizard #tdReturnToTrainee"));
		CommonUtils.click(buttonEles.get(buttonEles.size() - 1));
		CommonUtils.sendKeys(primaryMentorComments, "Return to primary mentor flow");
		CommonUtils.click(
				WebDriverUtils.getWebDriver().findElement(By.cssSelector("[onclick='form_submit_toTrainee()']")));
	}

	public Boolean isTrainneeNameDisplayed() {
		CommonUtil.waitBrowser(5000);
		return WebDriverUtils.getWebDriver().findElement(By.linkText(SharedData.traineeName)).isDisplayed();
	}
}
