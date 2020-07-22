package ServiceNow.COVIDDash.Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;

public class SubmissionsPage extends CommonUtils {

	/** Pending approval studies table text */
	@FindBy(xpath = "//div[@class='content']/div[1]/div[@data-toggle='collapse']/div[3]")
	private List<WebElement> pendingApprovalStudiesTable;

	/** Reject button stored in a list */
	@FindBy(xpath = "//button[@id='reject-button']")
	private List<WebElement> rejectButtonsList;

	/** Pending approval next button */
	@FindBy(xpath = "//button[@ng-click='selectPendingStudiesPage(c.pendingStudiesCurrentPage + 1);']")
	private WebElement pendingAprovalNextButton;

	/** Reject submission text box */
	@FindBy(xpath = "//textarea[@name='justification']")
	private WebElement rejectSubmisnTextArea;

	/** Reject confirmation button */
	@FindBy(xpath = "//button[text()='Reject Submission']")
	private WebElement rejectConfirmButton;

	/** Studies pending approval text */
	@FindBy(xpath = "//h1[text()=' Studies Pending Approval ']")
	private WebElement studiesPendingApprovalText;

	/** Approved reject studies text */
	@FindBy(xpath = "//h1[text()=' Approved / Rejected Studies ']")
	private WebElement approvedRejectedStudiesText;

	/** Approve buttons stored in a list */
	@FindBy(xpath = "//*[@id='approve-button']")
	private List<WebElement> approveButtons;

	// initialize all variables
	public SubmissionsPage() {
		PageFactory.initElements(WebDriverUtils.webDriver, this);
	}

	public List<WebElement> getPendingApprovalIBRNumbersList() {
		return pendingApprovalStudiesTable;
	}

	public List<WebElement> getRejectButtonsList() {
		return rejectButtonsList;
	}

	public void clickPendingApprovalNextButton() {
		pendingAprovalNextButton.click();
	}

	public void enterRejectionReasonClickConfirm() {
		rejectSubmisnTextArea.sendKeys("It was a test study");
		JavascriptUtils.clickByJS(rejectConfirmButton);
	}

	public String getPendingApprovalTableText() {
		return studiesPendingApprovalText.getText();
	}

	public String getRejectedStudiesTableText() {
		return approvedRejectedStudiesText.getText();
	}

	public List<WebElement> approveButtons() {
		return approveButtons;
	}

	public void verifyApproveRejectButton() {
		Assert.assertTrue(approveButtons.get(1).isDisplayed());
		Assert.assertTrue(rejectButtonsList.get(1).isDisplayed());
	}

}
