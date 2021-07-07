package CustomBusinessApp.EIDP.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.WebDriverUtils;

import CustomBusinessApp.EIDP.Util.CommonUtil;
import CustomBusinessApp.EIDP.Util.SharedData;

public class CoPrimaryMentorPage extends CommonUtils {

	@FindBy(css = "[class='checkbox btn btn-primary']")
	public WebElement markAsReviewedCheckbox;

	@FindBy(css = "[class='checkbox btn btn-primary validate-error']")
	public WebElement markAsReviewedCheckboxNhgri;
	
	@FindBy(css = "[href*='/idp/review-general']")
	private WebElement generalInformationTab;

	@FindBy(id = "saveAndNextButton")
	private WebElement saveAndContinueButton;

	@FindBy(id = "saveButton")
	private WebElement saveButton;

	@FindBy(id = "approveSubmit")
	private WebElement reviewedButton;

	@FindBy(id = "markasReviewedAllPagesCheck")
	private WebElement markAsReviewed;

	@FindBy(id = "tdAprroveIDP")
	private WebElement approvedAndSubmitButton;

	@FindBy(css = "button[onclick='form_submit_approveByTD(this)']")
	private WebElement yesButton;

	@FindBy(xpath = "//*[@onclick=\"form_submit_approveByLBO()\"]")
	private WebElement finalYesButton;

	@FindBy(id = "lboAprroveIDP")
	private WebElement approveIDP;

	@FindBy(id = "returnToPMComments")
	private WebElement primaryMentorComments;

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
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CucumberLogUtils.logScreenShot("Last Screenshot");
	}

	public void markAsReviewedInAllTabs() {
		MiscUtils.sleep(3000);
		try {
			CommonUtils.click(generalInformationTab);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			CommonUtils.click(markAsReviewedCheckbox);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			CommonUtils.click(saveAndContinueButton);
		} catch (Exception e) {

		}

		// Project related deliverables / training
		try {
			CommonUtils.click(markAsReviewedCheckbox);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			CommonUtils.click(saveAndContinueButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			CommonUtils.click(markAsReviewedCheckbox);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			CommonUtils.click(saveAndContinueButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			CommonUtils.click(markAsReviewedCheckbox);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			CommonUtils.click(saveAndContinueButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			CommonUtils.click(markAsReviewedCheckbox);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
		CucumberLogUtils.logScreenShot("Mark review");
		} catch (Exception e) {
			e.printStackTrace();
		}
		try{CommonUtils.click(saveButton);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void markNHGRIasReviewed() {
		CommonUtils.click(markAsReviewedCheckbox);
		CucumberLogUtils.logScreenShot("Mark review");
			
	}
	
	public void clickOnReviewedButton() {
		CommonUtils.click(reviewedButton);
	}

	public void markAsReviewed() {
		CommonUtils.click(markAsReviewed);
	}

	public void clickOnApproveAndSubmitButton() {

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String locator = "//label[@class=\"checkbox btn btn-primary validate-error\"]";
		if (WebDriverUtils.getWebDriver().findElements(By.xpath(locator)).size() > 0) {
			CommonUtils.click(markAsReviewedCheckbox);
		}
		CucumberLogUtils.logScreenShot("Approve and submit");

		locator = "//*[@id='tdAprroveIDP']";
		if (WebDriverUtils.getWebDriver().findElements(By.xpath(locator)).size() > 0) {
			CommonUtils.click(approvedAndSubmitButton);
		} else {
			CommonUtils.click(reviewedButton);
		}
	}
	
	public void clickOnApproveAndSubmitButtonNHGRI() {
		if(markAsReviewedCheckbox.isDisplayed())
			CommonUtils.click(markAsReviewedCheckbox);
		CucumberLogUtils.logScreenShot("Approve and submit");
		CommonUtils.click(approvedAndSubmitButton);
	}
	

	public void clickOnYesButton() {
		CommonUtils.click(yesButton);
	}

	public void clickOnApproveIDPButton() {
		CommonUtils.click(approveIDP);
	}

	public void clickOnReturnToPrimaryMentorButton() {
		if (markAsReviewedCheckbox.isDisplayed())
			CommonUtils.click(markAsReviewedCheckbox);
		List<WebElement> buttonEles = WebDriverUtils.getWebDriver()
				.findElements(By.cssSelector(".pager.wizard #tdReturnToPM"));
		CommonUtils.click(buttonEles.get(buttonEles.size() - 1));
		CommonUtils.sendKeys(primaryMentorComments, "Return to primary mentor flow");
		CommonUtils.click(
				WebDriverUtils.getWebDriver().findElement(By.cssSelector("[onclick='form_submit_returnToPM()']")));
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
