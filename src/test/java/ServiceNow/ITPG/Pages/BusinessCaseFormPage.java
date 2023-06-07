package ServiceNow.ITPG.Pages;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.ITPG.Utils.CommonUtils;
import ServiceNow.ITPG.Utils.DriverObjectFactory;

public class BusinessCaseFormPage extends BasePage {

	public BusinessCaseFormPage() {
		PageFactory.initElements(WebDriverUtils.getWebDriver(), this);
	}

	public static String startDate = "//input[@aria-label='Start date']";

	@FindBy(css = ".list2_body tr .composite_field_link")
	public WebElement firstPackageLink;

	@FindBy(xpath = "//a[normalize-space(text())='Quick Links']")
	public WebElement quickLinkDropdown;

	@FindBy(xpath = "(//button[@name='new'])[1]")
	public WebElement newIdeaButton;

	@FindBy(xpath = "//a[@class='select2-choice select2-default form-control']")
	public WebElement docDirectorTextBox;

	@FindBy(xpath = "//div[@id='select2-drop-mask']")
	public WebElement businessOwner;

	@FindBy(xpath = "//div[@id='s2id_sp_formfield_business_owner']/a")
	public WebElement businessOwner1;

	@FindBy(xpath = "(//*[contains(@id,'s2id_autogen') and contains(@id,'search')])[7]")
	public WebElement businessOwnerTextBox;

	public By docDirectorInput = By.xpath("//input[@id='s2id_autogen5_search']");

	@FindBy(xpath = "//li[@class='select2-results-dept-0 select2-result select2-result-selectable']")
	public WebElement docDirectorFirstResult;

	@FindBy(xpath = "//div[@id='s2id_sp_formfield_fitara_categories']")
	public WebElement FITARATextBox;

	@FindBy(xpath = "//div[@class=\"breadcrumbs\"]//a[text()='All']")
	public WebElement allCasesFilter;

	@FindBy(xpath = "//*[text()='Acquisition and Funding']")
	public WebElement acquisitionAndFundingLink;

	@FindBy(xpath = "//*[@id='sp_formfield_business_need']//textarea")
	public WebElement ideaTextBox;

	String projectNameId = "sp_formfield_project_name";

	@FindBy(xpath = "//*[@id='sand']//textarea")
	public WebElement commentBox;

	@FindBy(xpath = "//input[@ng-disabled='data.isPosting']/parent::span")
	public WebElement postComment;

	@FindBy(id = "sp_formfield_feedback")
	public WebElement feedbackBox;

	@FindBy(id = "sp_formfield_programmatic_support")
	public WebElement programaticSuport;

	public By programmaticApprover = By.id("sp_formfield_select_programmatic_approver");

	@FindBy(xpath = "//a[text()='Alternatives and Analysis']")
	public WebElement alternativesAndAnalysis;

	@FindBy(xpath = "//a[text()='Comments']")
	public WebElement commentsSectionsLink;

	// @FindBy(id="sp_formfield_select_programmatic_approver")
	// public WebElement programmaticApprover;

	@FindBy(xpath = "//button[text()='Save & Continue']")
	public WebElement saveContinue;

	@FindBy(xpath = "//button[text()='Submit Request']")
	public WebElement submitRequest;

	@FindBy(xpath = "//div[@id='s2id_sp_formfield_state']//a/span[1]")
	public WebElement state;

	@FindBy(xpath = "//h2[text()='Activity']/parent::div")
	public WebElement expandActivity;

	public By commentBoxLocator = By.xpath("//small[@class='text-muted journal-type ng-binding']");

	@FindBy(id = "sp_formfield_award_date")
	public WebElement awardDate;

	@FindBy(css = "#sp_formfield_approval_requested_by_date")
	public WebElement approvalRequestedDate;

	@FindBy(xpath = "//button[text()='Approve']")
	public WebElement approveRequest;

	@FindBy(id = "reject-button")
	public WebElement rejectRequest;

	@FindBy(xpath = "//*[@id='rejection-modal']//textarea")
	public WebElement rejectComment;

	@FindBy(xpath = "//button[@ng-click=\"rejectStudy();\"]")
	public WebElement rejectBusinessCaseButton;

	@FindBy(id = "moreinfo-button")
	public WebElement needMoreInfo;

	@FindBy(xpath = "//div[@id='information-modal']//textarea")
	public WebElement needMoreInfoComment;

	@FindBy(xpath = "//button[@ng-click=\"onClickInfoStudy()\"]")
	public WebElement needMoreInfoBusinessCaseButton;

	@FindBy(xpath = "(//span[@class=\"select2-chosen\"])[3]")
	public WebElement statusOfIdea;

	public By FITARATextBoxInput = By.xpath("//div[@id='s2id_sp_formfield_fitara_categories']//input");

	@FindBy(xpath = "(//th[@role='columnheader']//div[@aria-label=\"Created\"])[2]")
	public WebElement createdDataForBusinessCases;

	@FindBy(xpath = "(//table//span)[1]")
	public WebElement firstBusinessCase;

	@FindBy(xpath = "(//th[@role='columnheader']//div[@aria-label=\"Created\"])[1]")
	public WebElement createdDataForIdeaCases;

	@FindBy(xpath = "(//span[@ng-if=\"$first\"])[1]")
	public WebElement firstIdeaCase;

	@FindBy(xpath = "//input[@id=\"sp_formfield_project_name\" and @readonly=\"readonly\"]")
	public WebElement projectNameReadOnlyField;

	@FindBy(id = "tinymce")
	public WebElement businessNeedTextBox;

	@FindBy(xpath = "//button[3]")
	public WebElement submitBusinessCaseRequest;

	@FindBy(xpath = "//button[@id='approve-button']")
	WebElement approveButton;

	@FindBy(xpath = "//input[@name=\"programmatic_support\"]")
	public WebElement programmaticCHeckBox;

	@FindBy(partialLinkText = "Native View")
	public WebElement nativeviewLink;

	@FindBy(xpath = "//span[@class='sr-only' and text()='User menu']/following-sibling::span[2]")
	public WebElement userMenu;

	@FindBy(xpath = "//a[@sn-modal-show=\"elevateRoles\"]")
	public WebElement elevateRolesButton;

	@FindBy(xpath = "//input[@name=\"elevated_role\"]")
	public WebElement elevatedRoleCheckBox;

	@FindBy(xpath = "//button[@ng-click=\"updateElevatedRoles()\"]")
	public WebElement confirmRoleUpdate;

	@FindBy(xpath = "//div[@id='x_g_nci_itpg_approval']/div/div/div/div[2]/table/tbody/tr/td/span")
	private WebElement requestBuutton;

	@FindBy(xpath = "//div[@id='x_g_nci_itpg_approval']/div/div/div/div[2]/table/tbody/tr[2]/td/span")
	private WebElement pendingApproval;

	@FindBy(id = "filter")
	private WebElement filterMenu;

	@FindBy(id = "sys_email.subject")
	private WebElement Subject;

	@FindBy(xpath = "//a/div")
	private WebElement firstEmail;

	/** Left navigation filtered list */
	@FindAll({ @FindBy(css = "[aria-label='Modules for Application: System Logs'] li") })
	public List<WebElement> filteredList;

	public void approveRequestForm() {
		clickOnPendingRequest();
		// clickOnElement(requestBuutton);
		clickOnElement(approveRequest);
	}

	public void approvePendingRequest() {
		clickOnElement(pendingApproval);
		clickOnElement(approveRequest);
	}

	public void rejectRequestForm() {
		clickOnPendingRequest();
		// clickOnElement(requestBuutton);
		clickOnElement(rejectRequest);
		try {
			Thread.sleep(1000);
		} catch (Exception ee) {

		}
		setText(rejectComment, "Rejection comment for the idea");
		clickOnElement(rejectRequest);
		try {
			Thread.sleep(15000);
		} catch (Exception ee) {

		}
		System.out.println("=============>" + getText(statusOfIdea));
	}

	public void askForMoreInfoOnRequestForm() {
		clickOnPendingRequest();
		// clickOnElement(requestBuutton);
		clickOnElement(needMoreInfo);
		try {
			Thread.sleep(15000);
		} catch (Exception ee) {

		}
		setText(rejectComment, "Need more info comment for the idea");
		clickOnElement(needMoreInfo);
		try {
			Thread.sleep(15000);
		} catch (Exception ee) {

		}
		System.out.println("=============>" + getText(statusOfIdea));
	}

	public void elevateButton() {
		clickOnElement(userMenu);
		clickOnElement(elevateRolesButton);
		clickOnElement(elevatedRoleCheckBox);
		clickOnElement(confirmRoleUpdate);
	}

	public void clickOnNativeView() {
		clickOnElement(nativeviewLink);
	}

	/** Impersonate View DropDown **/
	@FindBy(xpath = "//ul[@class='dropdown-menu']//a[@id='glide_ui_impersonator']")
	public WebElement impersonateViewDropDown;

	/** Impersonate option from DropDown View **/
	@FindBy(xpath = "//ul[@class='dropdown-menu']//a[@id='glide_ui_impersonator']")
	public WebElement impersonateOption;

	public void impersonateUser(String userName) {
		clickOnElement(nativeViewButtonNew);
		CucumberLogUtils.logScreenShot();
		JavascriptUtils.scrollIntoView(impersonateOption);
		JavascriptUtils.clickByJS(impersonateOption);
		clickOnElement(find(By.xpath("//a[text()='" + userName + "']")));
	}

	/** Native View Button New **/
	@FindBy(xpath = "//button[@id='user_info_dropdown']")
	public WebElement nativeViewButtonNew;

	public void clickOnPendingRequest() {
		List<WebElement> rows = driver
				.findElements(By.xpath("//div[@id='x_g_nci_itpg_approval']/div/div/div/div[2]/table/tbody/tr"));
		System.out.println("Total rows are :" + rows.size());

		for (int i = 0; i < rows.size(); i++) {
			String state = driver.findElement(By.xpath(
					"//div[@id='x_g_nci_itpg_approval']/div/div/div/div[2]/table/tbody/tr[" + (i + 1) + "]/td/span"))
					.getText();
			System.out.println(state);
			if (state.equals("Pending")) {
				driver.findElement(By.xpath("//div[@id='x_g_nci_itpg_approval']/div/div/div/div[2]/table/tbody/tr["
						+ (i + 1) + "]/td/span")).click();
				break;
			}

		}
	}

	public void enterTextInBusinessNeedBox(String textBoxData) throws InterruptedException {
		Thread.sleep(3000);
		// clickOnElement(businessOwner);
		businessOwner1.click();
		// businessOwner.click();

		businessOwner1.sendKeys(Keys.DOWN);
		businessOwner1.sendKeys(Keys.DOWN);
		businessOwner1.sendKeys(Keys.ENTER);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// setText(businessOwnerTextBox, "Justin Cam");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		clickOnElement(docDirectorFirstResult);
		clickOnElement(programmaticCHeckBox);
		enterText(textBoxData);

		driver.switchTo().parentFrame();

		Thread.sleep(5000);
		clickOnElement(submitBusinessCaseRequest);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void sortCreatedDateForBusinessCasesInDecendingOrder() {
		clickOnElement(createdDataForBusinessCases);
		clickOnElement(createdDataForBusinessCases);
	}

	public void clickOnFirstBusinessCase() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickOnElement(firstBusinessCase);
	}

	public void sortCreatedDateForIdeaCasesInDecendingOrder() {
		clickOnElement(createdDataForIdeaCases);
		clickOnElement(createdDataForIdeaCases);
	}

	public void filterALlCases() {
		clickOnElement(allCasesFilter);
	}

	public void validateFieldIsReadOnly() {
		Assert.assertTrue(isElementVisible(projectNameReadOnlyField));
	}

	public void clickOnFirstIdeaCase() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickOnElement(firstIdeaCase);
	}

	public void enterText(String allData) {
		driver.switchTo().defaultContent();
		int allFrames = driver.findElements(By.tagName("iframe")).size();
		for (int i = 0; i < allFrames; i++) {
			try {
				driver.switchTo().frame(i);
				List<WebElement> allElements = driver.findElements(By.xpath("//html//body[@id='tinymce']"));
				for (WebElement e1 : allElements) {
					if (e1.isDisplayed()) {
						e1.sendKeys(allData);
					}
					driver.switchTo().defaultContent();
				}
			} catch (NoSuchFrameException e) {
				// continue;
			}
		}
	}

	public void saveContinueButton() {
		clickOnElement(saveContinue);
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		clickOnElement(submitRequest);
	}

	public void verifyIfCommentIsThere() throws Exception {
		try {
			if (!isElementPresent(commentBoxLocator)) {
				throw new Exception("Comment Box is not available");
			}
		} catch (Exception e) {
			throw new Exception("Comment Box is not available");
		}
	}

	public String getState() throws Exception {
		return (getText(state)).trim();
	}

	public void enterFeedback(String feedback) {
		setText(feedbackBox, feedback);
	}

	public void expandActivity() {
		clickOnElement(expandActivity);
	}

	public void approveRequest() {
		clickOnElement(approveRequest);
	}

	public void rejectRequest() {
		clickOnElement(rejectRequest);
		setText(rejectComment, "Reject Reason");
		clickOnElement(rejectBusinessCaseButton);
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void needMoreInfoOnRequest() {
		clickOnElement(needMoreInfo);
		setText(needMoreInfoComment, "Need more info");
		clickOnElement(needMoreInfoBusinessCaseButton);
	}

	public void fillIDeaBox(String textToEnter) {
		driver.findElement(By.id(projectNameId)).sendKeys(Keys.TAB);
		Actions builder = new Actions(driver);
		Action sendKeysToElemen = builder.sendKeys(textToEnter).build();
		sendKeysToElemen.perform();
	}

	public void FillGoalScopeTextBox(String textToEnter) {
		driver.findElement(By.id(projectNameId)).sendKeys(Keys.TAB);
		Actions builder = new Actions(driver);
		Action sendKeysToElemen = builder.sendKeys(Keys.TAB).sendKeys(textToEnter).build();
		sendKeysToElemen.perform();
	}

	public void fillRiskBox(String textTOEnter) {
		driver.findElement(By.id(projectNameId)).sendKeys(Keys.TAB);
		Actions builder = new Actions(driver);
		Action sendKeysToElemen = builder.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(textTOEnter).build();
		sendKeysToElemen.perform();
	}

	public void clickOnAlternativesAndAnalysisLink() {
		clickOnElement(alternativesAndAnalysis);
	}

	public void clickOnCommentsLink() {
		clickOnElement(commentsSectionsLink);
	}

	public void SetApprovalRequestedDate() {
		setText(approvalRequestedDate, "01/12/2028 00:00:00");
	}

	public void SetApprovalRequestedDate(String date) {
		setText(approvalRequestedDate, date);
		Actions builder = new Actions(driver);
		Action sendKeysToElemen = builder.sendKeys(Keys.TAB).sendKeys(Keys.TAB).build();
		sendKeysToElemen.perform();
	}

	public void enterComments(String textToEnter) {
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setText(commentBox, textToEnter);
		clickOnElement(postComment);
	}

	public void programaticSUpportCheckBox() {
		clickOnElement(programaticSuport);
	}

	public void clickOnProgramaticApprover() {

		javascriptClickElementById("sp_formfield_select_programmatic_approver");
	}

	public void fillFITARATextBox() throws InterruptedException {
		clickOnElement(FITARATextBox);
		setText(FITARATextBoxInput, "Software");
		Thread.sleep(2000);
		driver.findElement(FITARATextBoxInput).sendKeys(Keys.TAB);
	}

	public void validateHeaderText() {
		boolean isHeaderPresent = isElementPresent(
				By.xpath("//h1[text()='Biomedical Computing and IT Investment Business Cases']"));
		Assert.assertTrue(isHeaderPresent);
	}

	public void selectDocDirector(String inputText) {
		for (WebElement e : driver
				.findElements(By.xpath("//a[@class='select2-choice select2-default form-control']"))) {
			if (e.isDisplayed()) {
				e.click();
				break;
			}
		}
		for (WebElement e : driver.findElements(docDirectorInput)) {
			if (e.isDisplayed()) {
				setText(e, inputText);
				break;
			}
		}

		for (WebElement e : driver.findElements(
				By.xpath("//li[@class='select2-results-dept-0 select2-result select2-result-selectable']"))) {
			if (e.isDisplayed()) {
				clickOnElement(e);
				break;
			}
		}
	}

	public void setProjectName(String name) {
		setText(driver.findElement(By.id(projectNameId)), name);
	}

	public void selectProgramaticApprover(String inputText) {
		for (WebElement e : driver.findElements(By.xpath("//div[@id='s2id_sp_formfield_assigned_approver']/a"))) {
			if (e.isDisplayed()) {
				e.click();
				break;
			}
		}
		for (WebElement e : driver.findElements(By.id("s2id_autogen4_search"))) {
			if (e.isDisplayed()) {
				setText(e, inputText);
			}
		}

		for (WebElement e : driver.findElements(By.xpath("//ul[@aria-label=\"Programmatic Approver\"]/li[2]"))) {
			if (e.isDisplayed()) {
				clickOnElement(e);
				break;
			}
		}
	}

	public void startANewIdea() {
		clickOnElement(newIdeaButton);
	}

	public String quickLinkOptionXpath = "//a[@href=\"/ncisp?id=itpg_home_page\"]";

	public void selectOptionFromQuickLink(String optionText) {
		try {
			try {
				Thread.sleep(3000);
			} catch (Exception ee) {

			}
			clickOnElement(quickLinkDropdown);
			try {
				Thread.sleep(1000);
			} catch (Exception ee) {
				System.out.println("Test");
			}
			clickOnElementByXpath(quickLinkOptionXpath);

			// Link was changed again, adding a reliable way to navigate to the page
			// String currentURL = driver.getCurrentUrl();
			// driver.navigate().to(currentURL + "?id=itpg_home_page");
		} catch (Exception e) {
			throw e;
		}
	}

	public void openApp() {
			driver.get(EnvUtils.getApplicationUrl("ITPGURl"));
	}

	public boolean verifyEmail(String subject) throws InterruptedException {
		// Filter System Logs from side menu
		setText(filterMenu, "System Logs");

		Thread.sleep(5000);

		// Click on Email from side menu
		CommonUtils.waitBrowser(5000);
		for (int i = 0; i < filteredList.size(); i++) {
			if (filteredList.get(i).getText().contains("Emails")) {
				filteredList.get(i).click();
			}
		}

		// Click on First Email
		switchToFrame();

		clickOnElement(firstEmail);

		Thread.sleep(5000);

		// Compare subject of the email to validate correct email is sent
		System.out.println("Email Subject :" + Subject.getAttribute("value"));

		if (Subject.getAttribute("value").contains(subject)) {
			switchToDefaultFrame();
			driver.switchTo().parentFrame();
			return true;
		}

		switchToDefaultFrame();
		driver.switchTo().parentFrame();
		return false;

	}

	public void setAlternativesText(String textToEnter) {
		approvalRequestedDate.sendKeys(Keys.TAB);
		Actions builder = new Actions(driver);
		Action sendKeysToElemen = builder.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
				.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(textToEnter).build();
		sendKeysToElemen.perform();
	}

	public void clickOnAcquisitionandFunding() {
		clickOnElement(acquisitionAndFundingLink);
	}

	public void setFinancialFundingSource(String textToEnter) {
		approvalRequestedDate.sendKeys(Keys.TAB);
		Actions builder = new Actions(driver);
		Action sendKeysToElemen = builder.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
				.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(textToEnter).build();
		sendKeysToElemen.perform();
	}

	public void setFinancialConsiderations(String textToEnter) {
		approvalRequestedDate.sendKeys(Keys.TAB);
		Actions builder = new Actions(driver);
		Action sendKeysToElemen = builder.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
				.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(textToEnter).build();
		sendKeysToElemen.perform();
	}

	public void expectedAwardDate() {
		setText(awardDate, "01/12/2028");
	}

	public void anticipatedAcquisitionApproach(String textToEnter) {
		awardDate.sendKeys(Keys.TAB);
		Actions builder = new Actions(driver);
		Action sendKeysToElemen = builder.sendKeys(Keys.TAB).sendKeys(textToEnter).build();
		sendKeysToElemen.perform();
	}

	@FindBy(xpath = "//button[@ng-click=\"approveStudy();\"]")
	WebElement approveConfirmation;

	public void approveBusinessCase() {
		clickOnElement(approveButton);
		clickOnElement(approveConfirmation);
		try {
			Thread.sleep(25000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean errorPopupAvailable() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			driver.switchTo().alert().accept();
			return true;
		} catch (NoAlertPresentException Ex) {
			return false;
		}
	}

	public void validateMissingButton() {
		Boolean elementPresent = isElementPresent(By.xpath("//*[text()='Assitance Requested']"));
		Assert.assertFalse(elementPresent);
	}

	public void clickOnActionButton() {
		clickOnElement(find(By.xpath("//span[text()='Actions']")));

	}

	public void clickOnLatestBusinessCaseFormFromActionTab() {
		clickOnElement(find(By.xpath("//a[contains(@href,'approval')]/parent::li")));

	}

	public void approveButtonWithNewFlow() {
		clickOnElement(find(By.name("approve")));

	}

	public void viewAllApprovalsAndTakeAction() {
		clickOnElement(find(By.xpath("//a[@title=\"View all approvals\"]/parent::li")));
		clickOnElement(find(By.xpath(
				"(//a[@ng-if=\"approval.state == 'requested'  && approval.source_table =='x_g_nci_itpg_case'\"])[1]")));
	}

	public void saveAndCLose() {
		clickOnElement(find(By.xpath("//button[text()='Save & Close']")));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// clickOnElement(find(By.xpath("//button[text()='Save & Close']")));
	}

	public void NewButtonAvailable() {
		try {
			Assert.assertTrue("Business Case form not closed with save and close button", newIdeaButton.isDisplayed());
		} catch (NoSuchElementException e) {
			Assert.assertTrue("Business Case form not closed with save and close button", false);
		}
	}

	public void validateProjectNamePresense() {
		Assert.assertTrue(isElementPresent(By.xpath(
				"//span[@class=\"block color-primary text-muted mi-sub-span ng-binding\"]/preceding-sibling::h5")));
	}

	public void validateTextOnPage() {
		String textOnScreen=getText(find(By.xpath("(//strong)[1]")));
		String expectedText="This process applies to all IT and biomedical computing spending at NCI over the Simplified Acquisitions Threshold of $250,000, whether or not the primary purpose of the acquisition is IT and/or biomedical computing.  This includes new acquisitions, acquisition re-competitions, new task orders on existing Blanket Purchase Agreements (BPAs) or IDIQs, and contract modifications involving addition of funds over $250,000 for IT and/or biomedical computing requirements.  This also includes any research or administration contract that has an IT or biomedical computing component that is over $250,000.  For more information please see the process overview and FAQ."
				+ "";
		Assert.assertTrue(expectedText.trim().equals(textOnScreen.trim()));
	}

	public void verifyRequestAssitanceButton() {
		Assert.assertTrue(isElementPresent(By.xpath("//button[text()='Request Assistance']")));
		
	}

	public void cloneAndVerify() {
		System.out.println();
	}

	public void validatePopUp() {
		System.out.println();
	}

	public void verifyStateAfterAssistanceRequested() {
		find(By.xpath("//button[text()='Request Assistance']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actualState = null;
		try {
			actualState = getState();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (actualState != null) {
			actualState = actualState.trim();
			Assert.assertEquals("Request Assistance", actualState);
		}
	}
		
	

	public void verifyStateAfterAssistanceProvided() {
		find(By.xpath("//button[text()='Assistance Provided']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String actualState = null;
		try {
			actualState = getState();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (actualState != null) {
			actualState = actualState.trim();
			Assert.assertEquals("Open", actualState);
		}
		
	}
}
