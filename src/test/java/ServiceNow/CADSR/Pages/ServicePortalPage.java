package ServiceNow.CADSR.Pages;

import static org.junit.Assert.assertTrue;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.ITPG.Utils.CommonUtils;

public class ServicePortalPage extends BasePage {

	public ServicePortalPage() {
		PageFactory.initElements(WebDriverUtils.getWebDriver(), this);
	}

	/** submit a ticket button **/
	@FindBy(xpath = "(//*[@class=\"login-box\"]/a)[1]")
	public WebElement submitATicket;

	@FindBy(xpath = "//*[@id=\"x38e5cd061bad41506daea681f54bcbfb\"]/div/div/div[2]/input")
	public WebElement submitTicket;

	@FindBy(xpath = "//*[@id=\"x6ba4625f1bf041d06daea681f54bcbf9\"]/div/div[2]/div[3]/div[1]/a")
	public WebElement loginOkta;

	@FindBy(id = "sp_formfield_watch_list")
	public WebElement additionalEmail;

	@FindBy(xpath = "//*[@id=\"sp_formfield_watch_list_fieldmsgs_container\"]/div")
	public WebElement error;

	@FindBy(partialLinkText = "Create New Account")
	public WebElement createNewAccount;

	@FindBy(partialLinkText = "Request Form")
	public WebElement requestFormLink;

	@FindBy(partialLinkText = "Log In")
	public WebElement loginNIH;

	/** submit a ticket button **/
	@FindBy(xpath = "//a[text()=' View My Tickets ']")
	public WebElement viewMyTickets;

	/**
	 * My Historical Tickets button
	 */
	@FindBy(xpath = "//a[normalize-space()='My Historical Tickets']")
	public WebElement myHistoricalTIckets;

	/**
	 * Button to clear all filters on ticket page
	 */
	@FindBy(xpath = "//a[normalize-space()='All']")
	public WebElement ClearAllFilters;

	/**
	 * Open first ticket
	 */
	@FindBy(xpath = "//div[@sn-atf-area='Historical Tickets']//tr[2]/td")
	public WebElement openFirstTicket;

	/**
	 * workflow progress Bar element
	 * 
	 */
	public By workFlowProgressBar = By.xpath("//div[@sn-atf-area='caDSR Ticket Workflow Bar']");

	/**
	 * Breadcrum trail available
	 * 
	 */
	public By breadCrumTrailElement = By.xpath("//span[text()='My caDSR II Tickets']");

	public By requestedDateWebElement = By
			.xpath("(//a[@data-list_id=\"x_g_nci_cadsr_incident\" and text()='Requested Due Date'])[1]");
	public By requestedDateTextBox = By.xpath(
			"(//*[@class='form-control text-align-right-ltr element_reference_input' and @aria-label=\"Requested Due Date\"])");
	public By ticketStatus = By.id("x_g_nci_cadsr_incident.state");

	@FindBy(xpath = "//*[@id=\"x3dfc2b261be909506daea681f54bcb9a\"]/div/div/ul/li[2]/a")
	public WebElement viewMyHistoricalTickets;

	@FindBy(xpath = "//button[text()='Submit and Continue']")
	public WebElement submitandcontinue;

	@FindBy(xpath = "//input[@value=\"Complete\"]")
	public WebElement complete;

	@FindBy(linkText = "Home")
	public WebElement home;

	/** Reqest For dropdown **/
	public static By requestFordropdown = By.xpath("//div[@id='s2id_sp_formfield_requested_for']");

	public static By requestFor = By.id("select2-chosen-8");

	/** Organization dropdown **/
	public static By organizationDropDown = By.xpath("//div[@id='s2id_sp_formfield_organization']");
	/** Phone Number input **/
	public static By phoneNumberInput = By.xpath("//input[@id='sp_formfield_phone']");
	/** Email id input **/
	public static By emailIdInput = By.xpath("//input[@id='sp_formfield_email']");
	/** Phone Number input **/
	public static By phoneNumberView = By
			.xpath("//*[@id=\"x6f80c2321bf94d506daea681f54bcb5e\"]/div/div[2]/div[1]/input");
	/** Email id input **/
	public static By emailIdView = By.xpath("//*[@id=\"x6f80c2321bf94d506daea681f54bcb5e\"]/div/div[2]/div[2]/input");
	/** Task Dropdown88 **/
	public static By taskDropdown = By.id("s2id_sp_formfield_task");
	/** Task Select box **/
	public static By taskSelectBox = By.id("sp_formfield_task");
	/** cURATION oPTIONS **/
	public static By curationOption = By.xpath("//input[@aria-owns=\"s2id_autogen10_results\"]");
	/** Curation DropdownValue **/
	public static By curationDropDownValue = By.xpath("//div[text()='Curation - Biomarkers']");
	/** Curation Option Text **/
	public static By curationOptionText = By
			.xpath("//span[text()='You may select multiple curation operations within the same request']");

	/** Short Description **/
	@FindBy(id = "sp_formfield_short_description")
	public WebElement shortDescription;

	@FindBy(id = "select2-chosen-1")
	public WebElement taskTextBox;

	@FindBy(id = "s2id_sp_formfield_priority")
	public WebElement priority;

	@FindBy(id = "x_g_nci_cadsr_incident.state")
	public WebElement status;

	@FindBy(id = "x_g_nci_cadsr_task.state")
	public WebElement taskStatus;

	@FindBy(id = "sys_readonly.x_g_nci_cadsr_incident.state")
	public WebElement viewStatus;

	@FindBy(xpath = "//*[@id=\"curation_operations\"]/div/span/span/sp-help-tag/div/div/div[1]/span[1]")
	public WebElement operationHelpText;

	@FindBy(xpath = "//button[text()='Save']")
	public WebElement save;

	@FindBy(xpath = "//button[text()='Update']")
	public WebElement update;

	/** POC **/
	public static By poc = By.id("s2id_sp_formfield_poc");

	/** curationText **/
	public static By curationText = By.id("s2id_autogen10");

	public By incidentTableHeader = By
			.xpath("//*[@id=\"xd71340ab1b958dd06daea681f54bcb1e\"]/div/div/div/div[2]/table/thead/tr/th");

	@FindBy(id = "s2id_autogen1_search")
	public WebElement internalTaskTextBox;

	@FindBy(id = "s2id_autogen10")
	public WebElement curationTextBox;

	@FindBy(id = "select2-chosen-2")
	public WebElement policiesTextBox;

	@FindBy(id = "s2id_autogen2_search")
	public WebElement policiesInternalTextBox;

	@FindBy(id = "s2id_sp_formfield_requested_for")
	public WebElement requestedTextBox;

	@FindBy(id = "s2id_autogen8_search")
	public WebElement requestedInternalTextBox;

	@FindBy(id = "sp_formfield_requested_due_date")
	public WebElement requestDueDate;

	@FindBy(partialLinkText = "Native View")
	public WebElement nativeviewLink;

	@FindBy(xpath = "//*[@id=\"sp-nav-bar1\"]/div/div/div")
	public WebElement userMenu;

	@FindBy(id = "filter")
	private WebElement filterMenu;

	@FindAll({
			@FindBy(xpath = "/html/body/div[5]/div/div/nav/div/div[3]/div/div/concourse-application-tree/ul/li/a/span") })
	public List<WebElement> filteredMenu;

	@FindBy(xpath = "//span[@class='user-name hidden-xs hidden-sm hidden-md']")
	public WebElement userName;

	@FindBy(id = "glide_ui_impersonator")
	public WebElement impersonateUserLink;

	@FindBy(xpath = "(//a[@ng-click=\"impersonate(rec.user_sys_id)\"])[1]")
	public WebElement firstUserInImpersonateList;

	By usersInImpersonateList = By.xpath("(//a[@ng-click='impersonate(rec.user_sys_id)'])");

	/** Left navigation filtered list */
	@FindAll({ @FindBy(css = "[aria-label='Modules for Application: caDSR II Helpdesk'] li") })
	public List<WebElement> filteredList;

	/** Left navigation filtered list */
	@FindAll({ @FindBy(css = "[aria-label='Modules for Application: System Logs'] li") })
	public List<WebElement> filteredListEmail;

	@FindBy(xpath = "//a/div")
	private WebElement firstEmail;

	@FindBy(id = "sys_email.subject")
	private WebElement Subject;

	@FindBy(xpath = "//td[3]/a")
	private WebElement firstRequest;

	@FindBy(id = "sys_display.x_g_nci_cadsr_incident.sow_number")
	private WebElement SOWNumber;

	@FindBy(xpath = "//div[@id='tabs2_section']/span[2]/span/span[2]")
	private WebElement curationTask;

	@FindBy(partialLinkText = "Curation - Forms")
	private WebElement firstCurationTask;

	@FindBy(id = "ec7a6ad21bfb8950af3bed7bbc4bcb8d_description_of_skip_to")
	private WebElement row;

	@FindBy(xpath = "//span[@class='tab_caption_text' and text()='Curation Tasks']")
	private WebElement curationTabOnNativeView;

	@FindBy(xpath = "(//a[@class='linked formlink'])[1]")
	private WebElement firstCurationChildTicket;

	@FindBy(xpath = "//span[@class='tab_caption_text' and text()='Curation Counts']")
	private WebElement curationCountTab;

	@FindBy(xpath = "//input[@id='x_g_nci_cadsr_task.cdes_requested']")
	private WebElement firstCurationTextBox;

	@FindBy(xpath = "//select[@aria-labelledby='label.x_g_nci_cadsr_task.state']")
	private WebElement statusLabel;

	@FindBy(id = "sysverb_update_and_stay")
	private WebElement saveButton;

	@FindBy(xpath = "//button[text()='New']")
	private WebElement newButton;

	@FindBy(xpath = "//button[@data-original-title=\"Back\"]")
	private WebElement backButton;

	@FindBy(id = "sys_readonly.x_g_nci_cadsr_incident.cdes_requested")
	private WebElement requestedCurationCount;

	By uploadOption = By.xpath("//em[text()='Drop files here']");

	public void openCurationTabAndTicket() {
		switchToFrame();
		clickOnElement(curationTabOnNativeView);
		clickOnElement(firstCurationChildTicket);
		switchToDefaultFrame();
	}

	public void updateCurationCount() {
		switchToFrame();
		clickOnElement(curationCountTab);
		setText(firstCurationTextBox, "10");
		switchToDefaultFrame();
	}

	public void updateStatusOfTicket() {
		switchToFrame();
		selectOptionByIndex(statusLabel, 3);
		clickOnElement(saveButton);
		clickOnElement(backButton);
		switchToDefaultFrame();
	}

	public void updateTicketStatusToClose() {
		switchToFrame();
		selectOptionByIndex(statusLabel, 3);
		clickOnElement(saveButton);
		clickOnElement(backButton);
		switchToDefaultFrame();
	}

	public void getTheCurrentoFTicket() {
		switchToFrame();
		Select select = new Select(
				driver.findElement(By.xpath("//select[@aria-labelledby='label.x_g_nci_cadsr_incident.state']")));
		WebElement option = select.getFirstSelectedOption();
		String defaultItem = option.getText();
		System.out.println(defaultItem);
		assertTrue(defaultItem.equalsIgnoreCase("Resolved"));
		switchToDefaultFrame();
	}

	public void reopenTicket() {
		switchToFrame();
		clickOnElement(firstCurationTask);
		clickOnElement(find(By.xpath("//button[text()='Reopen Task']")));
		switchToDefaultFrame();
	}

	public void saveTicketOnNativeView() {
		clickOnElement(saveButton);
	}

	public void verifyCurationCOunt() {
		switchToFrame();
		clickOnElement(curationCountTab);
		String value = requestedCurationCount.getAttribute("value");
		Assert.assertTrue(value.equalsIgnoreCase("10"), "Expected curation count was 10 but found-->" + value);
	}

	public void openApp() {
			driver.get(EnvUtils.getApplicationUrl("cadsrTestUrl"));
	}

	public void openHomePage() {
			driver.get(EnvUtils.getApplicationUrl("cadsrUrl"));
	}

	public void startANewRequest() {
		clickOnElement(submitATicket);
	}

	public boolean user_should_See_requested_for_field() {
		return isElementPresent(By.xpath("//span[text()='Requested For']"));
	}

	public void viewMyTickets() {
		clickOnElement(viewMyTickets);
	}

	public void clickOnMyHistoricalTickets() {
		clickOnElement(myHistoricalTIckets);
	}

	public void clickOnAllFilter() {
		clickOnElement(ClearAllFilters);
	}

	public void openFirstTicket() {
		clickOnElement(openFirstTicket);
	}

	public boolean isBreadCrumTrailAvailable() {
		return isElementPresent(breadCrumTrailElement);
	}

	public boolean isWorkFlowProgressBarAvailable() {
		return isElementPresent(workFlowProgressBar);
	}

	public void verifyAllAttributesOnPage() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.presenceOfElementLocated(requestFordropdown));
		Assert.assertTrue(isElementVisible(requestFordropdown), "RequestDropdown Not present");
		Assert.assertTrue(isElementVisible(organizationDropDown), "OrganizationDropdown Not present");
		Assert.assertTrue(isElementVisible(phoneNumberInput), "Phone number input box Not present");
		Assert.assertTrue(isElementVisible(emailIdInput), "email id input box Not present");

	}

	public String getDataFromRequestForField() {
		return getText(find(requestFordropdown));
	}

	public String getDataFromOrganizationField() {
		return getText(find(organizationDropDown));
	}

	public String getDataFromphoneNoField() {
		return (find(phoneNumberInput)).getAttribute("value");
	}

	public String getDataFromEmailField() {
		return (find(emailIdInput)).getAttribute("value");
	}

	public void verifyTaskVsOperationMapping() {
		clickOnElement(find(taskDropdown));
		String expectedTasks = "-- None --,Curation,Policies,Reports,Deliverables,Ad-Hoc Assignments,Tool Support";
		List<WebElement> allOptions = getAllOptions(find(taskSelectBox));
		String actualTasks = "";
		List<String> listOfOptions = new LinkedList<String>();
		for (WebElement ele : allOptions) {
			listOfOptions.add(ele.getText());
			if (actualTasks.equals("")) {
				actualTasks = ele.getText();
			} else {
				actualTasks = actualTasks + "," + ele.getText();
			}
		}
		Assert.assertEquals(actualTasks, expectedTasks);
		clickOnElement(find(By.xpath("//div[text()='" + listOfOptions.get(1) + "']")));
		clickOnElement(curationOption);
		Assert.assertTrue(isElementPresent(curationOptionText), "Curation option text is not present");

	}

	public void fillShortDescription(String textToEnter) {
		// TODO Auto-generated method stub
		setText(shortDescription, textToEnter);
	}

	public void selectTask(String inputText) {

		clickOnElement(taskTextBox);
		// setText(taskTextBox, inputText);
		// clickOnElement(docDirectorFirstResult);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		internalTaskTextBox.sendKeys(Keys.ARROW_DOWN);
		// internalTaskTextBox.sendKeys(Keys.ARROW_DOWN);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		internalTaskTextBox.sendKeys(Keys.RETURN);

	}

	public void selectRandomTask(String inputText) {

		clickOnElement(taskTextBox);
		// setText(taskTextBox, inputText);
		// clickOnElement(docDirectorFirstResult);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		internalTaskTextBox.sendKeys(Keys.ARROW_DOWN);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		internalTaskTextBox.sendKeys(Keys.RETURN);

	}

	public void selectCurationTask(String inputText) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		clickOnElement(curationTextBox);
		// setText(taskTextBox, inputText);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		curationTextBox.sendKeys(Keys.ARROW_DOWN);
		// curationTextBox.sendKeys(Keys.ARROW_DOWN);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		curationTextBox.sendKeys(Keys.RETURN);
	}

	public void selectCuration(String inputText) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		clickOnElement(policiesTextBox);
		// setText(taskTextBox, inputText);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		policiesInternalTextBox.sendKeys(Keys.ARROW_DOWN);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		policiesInternalTextBox.sendKeys(Keys.RETURN);
	}

	public void updateRequestedFor() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		clickOnElement(requestedTextBox);
		// setText(taskTextBox, inputText);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		requestedInternalTextBox.sendKeys("David Coates");
		Thread.sleep(2000);
		requestedInternalTextBox.sendKeys(Keys.ARROW_DOWN);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		requestedInternalTextBox.sendKeys(Keys.RETURN);

		Thread.sleep(2000);

		String phone = driver.findElement(phoneNumberInput).getAttribute("value");
		Assert.assertEquals(phone, "+1 240 276 6573");

		String email = driver.findElement(emailIdInput).getAttribute("value");
		Assert.assertEquals(email, "david.coates@nih.gov");
	}

	public void selectDate(String textToEnter) {
		// TODO Auto-generated method stub
		setText(requestDueDate, textToEnter);

	}

	public void submitandContinue() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		clickOnElement(submitandcontinue);
		Thread.sleep(10000);
		// clickOnElement(home);
	}

	public boolean isUploadOptionAvailable() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isElementPresent(uploadOption);
	}

	public void complete() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		clickOnElement(complete);
		Thread.sleep(5000);
	}

	public Boolean isCompleteButtonPresent() {
		return isElementPresent((By.xpath("//input[@value=\"Complete\"]")));
	}

	public void viewMyTicket() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		clickOnElement(viewMyTickets);
		Thread.sleep(5000);
	}

	public void clickOnViewMyHistoricalTicketButton() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		clickOnElement(viewMyHistoricalTickets);
		Thread.sleep(5000);
	}

	public void viewMyTicketButton() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		clickOnElement(viewMyTickets);
		Thread.sleep(5000);

		boolean expected = submitTicket.isDisplayed();
		Assert.assertTrue(expected, "New Request button is not visible");

	}

	public void validatePriority() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		String priorityText = getText(priority);
		String expected = priorityText.replaceAll("[\n\r]", "");
		Assert.assertEquals(expected, "3 - ModeratePriority");
	}

	public void verifyPOCField() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		Boolean expected = isElementVisible(poc);
		Assert.assertFalse(expected, "Comparison Failed");
	}

	public void verifyOperation() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		Boolean expected = isElementVisible(curationText);
		Assert.assertFalse(expected, "Comparison Failed");
	}

	public void clickOnNativeView() {
		try {
			clickOnElement(userMenu);
		} catch (Exception e) {

		}
		clickOnElement(nativeviewLink);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void impersonateUser() {
		// switchToFrame();
		waitForElementToBeClickAble(userName);
		clickOnElement(userName);
		clickOnElement(impersonateUserLink);
		clickOnElement(firstUserInImpersonateList);
		// switchToDefaultFrame();
	}

	public void impersonateUser(String userNameFOrNewUser) {
		// switchToFrame();
		waitForElementToBeClickAble(userName);
		clickOnElement(userName);
		Actions action = new Actions(driver);
		action.moveToElement(impersonateUserLink);
		action.click().build().perform();
		List<WebElement> allNames = getElements(usersInImpersonateList);
		for (WebElement e : allNames) {
			if (e.getAttribute("text").equalsIgnoreCase(userNameFOrNewUser)) {
				e.click();
				break;
			}
		}
		// switchToDefaultFrame();
	}

	public void validateChildTickets() throws InterruptedException {
		setText(filterMenu, "CADSR");

		Thread.sleep(5000);

		// Click on Email from side menu
		CommonUtils.waitBrowser(5000);
		for (int i = 0; i < filteredList.size(); i++) {
			if (filteredList.get(i).getText().contains("All Requests")) {
				filteredList.get(i).click();
			}
		}

		// Click on First Email

		switchToFrame();
		clickOnElement(firstRequest);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();

		switchToFrame();
		clickOnElement(curationTask);

		List<WebElement> rows = driver.findElements(By.xpath(
				"/html/body/div[2]/form/span[3]/span/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/div/div/span/div[2]/div[3]/table/tbody/tr/td/div/table/tbody/tr"));

		// System.out.println("Rows :" +rows.size());

		Assert.assertEquals(rows.size(), "3");

		Thread.sleep(5000);

	}

	public void openChildTicket() throws InterruptedException {
		Thread.sleep(3000);
		switchToFrame();
		clickOnElement(curationTask);

		Thread.sleep(3000);
		clickOnElement(firstCurationTask);
		Thread.sleep(5000);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	

	public boolean verifyEmail(String subject) throws InterruptedException {
		// Filter System Logs from side menu
		setText(filterMenu, "System Logs");

		Thread.sleep(5000);

		// Click on Email from side menu
		CommonUtils.waitBrowser(5000);
		for (int i = 0; i < filteredListEmail.size(); i++) {
			if (filteredListEmail.get(i).getText().contains("Emails")) {
				filteredListEmail.get(i).click();
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

	public void viewDefaultColumns() {

		List<WebElement> tableHeaders = driver.findElements(incidentTableHeader);
		for (WebElement tableHeader : tableHeaders) {
			System.out.println(tableHeader.getText());
		}

		Assert.assertEquals(tableHeaders.get(0).getText().replaceAll("[\n\r]", ""), "Number");
		Assert.assertEquals(tableHeaders.get(1).getText().replaceAll("[\n\r]", ""), "Short description");
		Assert.assertEquals(tableHeaders.get(2).getText().replaceAll("[\n\r]", ""), "Operation");
		Assert.assertEquals(tableHeaders.get(3).getText().replaceAll("[\n\r]", ""), "Requested Due Date");
		Assert.assertEquals(tableHeaders.get(4).getText().replaceAll("[\n\r]", ""), "Status");
		Assert.assertEquals(tableHeaders.get(5).getText().replaceAll("[\n\r]", ""), "Updated");

	}

	public void verifyContent() {
		// TODO Auto-generated method stub
		// List<WebElement> t =
		// driver.findElements(By.xpath("//*[contains(text(),'Welcome to the new caDSR
		// II Helpdesk. Community members requesting centralized curation assistance can
		// create a help desk user account or simply submit a helpdesk Request Form.
		// Users with accounts can access all of their open tickets and monitor the
		// progress from submission to completion.')]"));
		// System.out.println(t.size());
		WebElement link = driver.findElement(By.linkText("Request Form"));
		Boolean expected = link.isDisplayed();
		Assert.assertTrue(expected, "Link is not present");

		WebElement link2 = driver.findElement(By.linkText("Knowledge Base"));
		Boolean expected2 = link2.isDisplayed();
		Assert.assertTrue(expected2, "Link is not present");

	}

	public void verifyLink() {
		// TODO Auto-generated method stub
		Boolean expected = isElementPresent(By.linkText("caDSR User Guides"));
		Assert.assertFalse(expected, "Link is present");

		Boolean expected2 = isElementPresent(By.linkText("Quick Reference Documents"));
		Assert.assertFalse(expected2, "Link is present");

	}

	public void verifyMenu() {
		// TODO Auto-generated method stub
		Boolean expected = isElementPresent(By.linkText("Tickets"));
		Assert.assertFalse(expected, "Link is present");

		Boolean expected2 = isElementPresent(By.linkText("Native View"));
		Assert.assertFalse(expected2, "Link is present");

	}

	public void validateTicketInNativeView() throws InterruptedException {
		// Get ticket ID
		String ticketID = driver.findElement(By.xpath(
				"//*[@id=\"xd71340ab1b958dd06daea681f54bcb1e\"]/div/div/div/div[2]/table/tbody/tr[1]/td[1]/span"))
				.getText();
		System.out.println("ticket ID :" + ticketID);
		clickOnNativeView();

		setText(filterMenu, "CADSR");

		Thread.sleep(5000);

		// Click on Email from side menu
		CommonUtils.waitBrowser(5000);
		for (int i = 0; i < filteredList.size(); i++) {
			if (filteredList.get(i).getText().contains("All Requests")) {
				filteredList.get(i).click();
			}
		}

		// Click on First Email

		switchToFrame();
		String expectedTicketID = firstRequest.getText();
		System.out.println("expectedTicketID: " + expectedTicketID);
		Assert.assertEquals(expectedTicketID, ticketID);

	}

	public void validateReadOnlyAccess() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath(
				"//*[@id=\"xd71340ab1b958dd06daea681f54bcb1e\"]/div/div/div/div[2]/table/tbody/tr[1]/td[1]/span"))
				.click();
		WebElement viewpriority = driver
				.findElement(By.xpath("//*[@id=\"x741b60a31b5e01506daea681f54bcb9c\"]/div/div[2]/div[2]/div[2]/p"));
		Boolean expected = viewpriority.isEnabled();
		Assert.assertTrue(expected, "Request is editable");

	}

	public void openMyLatestTicket() {
		// TODO Auto-generated method stub
		driver.findElement(By.xpath(
				"//*[@id=\"xd71340ab1b958dd06daea681f54bcb1e\"]/div/div/div/div[2]/table/tbody/tr[1]/td[1]/span"))
				.click();

	}

	public void validateAddWatcherButton() {
		// TODO Auto-generated method stub
		Boolean expected = isElementPresent(By.xpath("//a[text()=' Add Watchers ']"));
		Assert.assertFalse(expected, "Add Watchers button available");
	}

	public void validateAutoFillOfUserInformation() {
		// TODO Auto-generated method stub

		String phone = driver.findElement(phoneNumberInput).getAttribute("value");
		Assert.assertEquals(phone, "+1 240 276 6125");

		String email = driver.findElement(emailIdInput).getAttribute("value");
		Assert.assertEquals(email, "satya.gugulothu@nih.gov");
	}

	public void validateAddAttachmentPage() {
		// TODO Auto-generated method stub

		String phone = driver.findElement(phoneNumberView).getAttribute("value");
		Assert.assertEquals(phone, "+1 240 276 6125");

		String email = driver.findElement(emailIdView).getAttribute("value");
		Assert.assertEquals(email, "satya.gugulothu@nih.gov");

	}

	public void validateStaticText() {
		// TODO Auto-generated method stub
		String text = driver.findElement(By.xpath("//*[@id=\"catItemTop\"]/div/div[2]/div/div[1]/div/p")).getText();
		System.out.println("text =" + text);
		String expectedText = "Submit a ticket for the centralized curation services you need. Please provide your contact information with request details. A ticket number will be assigned to your request and you will be notified about the progress towards completion. You will be contacted if additional information is needed to complete your request. You may also report an issue @ caDSR.RA@mail.nih.gov.";
		Assert.assertEquals(text, expectedText);

	}

	public void viewNewRequestButton() {
		// TODO Auto-generated method stub
		boolean expected = submitTicket.isDisplayed();
		Assert.assertTrue(expected, "New Request button is not visible");
	}

	public void sortTicketsByRequestedDate() {
		switchToFrame();
		clickOnElement(requestedDateWebElement);
		switchToDefaultFrame();
	}

	public void updateRequestedDateTextBox() {
		switchToFrame();
		setText(requestedDateTextBox, "08/02/2024");
		switchToDefaultFrame();
	}

	public void updateTicketTo(String status) {
		switchToFrame();
		selectOption(find(ticketStatus), status);
		clickOnElement(saveButton);
		switchToDefaultFrame();
	}

	public void startNew() {
		switchToFrame();
		clickOnElement(newButton);
		switchToDefaultFrame();
	}

	public void openLatestTicket() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		setText(filterMenu, "CADSR");

		Thread.sleep(5000);

		// Click on Email from side menu
		CommonUtils.waitBrowser(5000);
		for (int i = 0; i < filteredList.size(); i++) {
			if (filteredList.get(i).getText().contains("All Requests")) {
				filteredList.get(i).click();
			}
		}

		// Click on First Request

		switchToFrame();
		clickOnElement(firstRequest);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public void validatecaDSRFilteredMenuName() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);

		setText(filterMenu, "CADSR");

		Thread.sleep(5000);

		boolean expected = filteredList.isEmpty();

		Assert.assertFalse(expected, "CaDSR II is not present");

		// Click on First Request

	}

	public void validateSOWNumber() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		switchToFrame();
		String defaultSOW = (SOWNumber).getAttribute("value");
		Assert.assertEquals(defaultSOW, "227885.TM.01.0001.1300.000");

	}

	public void validateWidget() {
		// TODO Auto-generated method stub
		boolean expected = loginOkta.isDisplayed();
		Assert.assertTrue(expected, "loginOkta button is not visible");

		boolean expected1 = createNewAccount.isDisplayed();
		Assert.assertTrue(expected1, "createNewAccount is not visible");

		boolean expected2 = loginNIH.isDisplayed();
		Assert.assertTrue(expected2, "loginNIH is not visible");
	}

	public void closeTicket() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		switchToFrame();
		clickOnElement(status);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		status.sendKeys(Keys.ARROW_DOWN);
		status.sendKeys(Keys.ARROW_DOWN);
		status.sendKeys(Keys.ARROW_DOWN);
		status.sendKeys(Keys.ARROW_DOWN);
		status.sendKeys(Keys.ARROW_DOWN);
		status.sendKeys(Keys.ARROW_DOWN);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		status.sendKeys(Keys.RETURN);

		switchToDefaultFrame();
		driver.switchTo().parentFrame();
		switchToFrame();
		clickOnElement(save);
		Thread.sleep(5000);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();

		switchToFrame();

		Boolean statusText = viewStatus.isDisplayed();

		Assert.assertTrue(statusText, "Failed to Save");
	}

	public void completeChildTicket() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		switchToFrame();
		clickOnElement(taskStatus);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		taskStatus.sendKeys(Keys.ARROW_DOWN);
		taskStatus.sendKeys(Keys.ARROW_DOWN);
		taskStatus.sendKeys(Keys.ARROW_DOWN);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		taskStatus.sendKeys(Keys.RETURN);

		switchToDefaultFrame();
		driver.switchTo().parentFrame();
		switchToFrame();
		clickOnElement(update);
		Thread.sleep(5000);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();

	}

	public void completeTicket() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		switchToFrame();
		clickOnElement(status);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		status.sendKeys(Keys.ARROW_DOWN);
		/*
		 * status.sendKeys(Keys.ARROW_DOWN); status.sendKeys(Keys.ARROW_DOWN);
		 * status.sendKeys(Keys.ARROW_DOWN); status.sendKeys(Keys.ARROW_DOWN);
		 * status.sendKeys(Keys.ARROW_DOWN);
		 */

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		status.sendKeys(Keys.RETURN);

		switchToDefaultFrame();
		driver.switchTo().parentFrame();
		switchToFrame();
		clickOnElement(update);
		Thread.sleep(5000);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();

	}

	public void resolveTicket() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		/*
		 * switchToFrame(); clickOnElement(status);
		 * 
		 * try { Thread.sleep(3000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * status.sendKeys(Keys.ARROW_DOWN);
		 * 
		 * status.sendKeys(Keys.ARROW_DOWN); status.sendKeys(Keys.ARROW_DOWN);
		 * status.sendKeys(Keys.ARROW_DOWN); status.sendKeys(Keys.ARROW_DOWN);
		 * status.sendKeys(Keys.ARROW_DOWN);
		 * 
		 * 
		 * try { Thread.sleep(2000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * status.sendKeys(Keys.RETURN);
		 * 
		 * switchToDefaultFrame(); driver.switchTo().parentFrame();
		 */
		switchToFrame();
		clickOnElement(update);
		Thread.sleep(5000);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();

	}

	public void verifyCurationHelpText() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(3000);
		String text = operationHelpText.getText();
		Assert.assertEquals(text, "You may select multiple curation operations within the same request");
	}

	public void validateAdditionalEmail() {
		// TODO Auto-generated method stub
		boolean expected = additionalEmail.isDisplayed();
		Assert.assertTrue(expected, "additionalEmail field is not visible");

	}

	public void enterAdditionalEmail() throws InterruptedException {
		// TODO Auto-generated method stub
		additionalEmail.sendKeys("kdfhskj");
		clickOnElement(submitandcontinue);
		Thread.sleep(8000);
		boolean expected = error.isDisplayed();
		Assert.assertTrue(expected, "error is not visible");

	}

	public void validateRequestFormHyperlink() {
		// TODO Auto-generated method stub
		boolean expected = false;
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for (WebElement specificLink : allLinks) {
			if (specificLink.getText().equals("Request Form")) {
				expected = true;
			}
		}
		Assert.assertFalse(expected, "Hyperlink Request Form is present");
	}

	public void validateGetHelpFooter() {
		// TODO Auto-generated method stub
		boolean expected = false;
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for (WebElement specificLink : allLinks) {
			if (specificLink.getText().equals("Get Help Via Form")) {
				expected = true;
			}
		}
		Assert.assertFalse(expected, "Footer is present");
	}

	public void validatePortalURL() {
		// TODO Auto-generated method stub
		String actualURL = driver.getCurrentUrl();
		String[] urls = actualURL.split(".gov");
		String url = urls[1];
		Assert.assertEquals(url, "/cadsr-curation?id=cadsr_helpdesk");

	}

	public void clearPhoneNumber() {
		// TODO Auto-generated method stub
		driver.findElement(phoneNumberInput).clear();
	}

	public void validateCloseAndResolvedTicket() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		String state;
		Boolean expected = true;
		List<WebElement> rows = driver.findElements(By
				.xpath("//*[@id=\"xd71340ab1b958dd06daea681f54bcb1e\"]/div/div/div/div[2]/table/tbody/tr/td[1]/span"));
		for (int i = 1; i < rows.size(); i++) {
			state = driver.findElement(
					By.xpath("//*[@id=\"xd71340ab1b958dd06daea681f54bcb1e\"]/div/div/div/div[2]/table/tbody/tr["
							+ (i + 1) + "]/td[6]/span"))
					.getText();
			System.out.println("State" + state);
			if (state.equals("Close Incomplete") || state.equals("Resolved")) {
				expected = false;
			}

		}
		Assert.assertTrue(expected, "Invalid state found");
	}

	public void validateResolvedAndClosedTicket() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		String state;
		Boolean expected = true;
		List<WebElement> rows = driver.findElements(By
				.xpath("//*[@id=\"xd71340ab1b958dd06daea681f54bcb1e\"]/div/div/div/div[2]/table/tbody/tr/td[1]/span"));
		for (int i = 1; i < rows.size(); i++) {
			state = driver.findElement(
					By.xpath("//*[@id=\"xd71340ab1b958dd06daea681f54bcb1e\"]/div/div/div/div[2]/table/tbody/tr["
							+ (i + 1) + "]/td[5]/span"))
					.getText();
			System.out.println("State" + state);
			if (state.equals("Close Incomplete") || state.equals("Resolved")) {
				expected = false;
			}

		}
		Assert.assertTrue(expected, "Invalid state found");
	}

	public void validateResolvedTicket() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(5000);
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		boolean expected = false;
		for (WebElement specificLink : allLinks) {
//			System.out.println(specificLink.getText());
			if (specificLink.getText().equals("CONFIRM")) {
				expected = true;
			}
		}
		Assert.assertTrue(expected, "Confirm button is not present");
	}

	public void checkReference() throws Exception {
		switchToFrame();
		String textId = (find(By.id("sys_display.x_g_nci_cadsr_incident.parent"))).getAttribute("Value");
		switchToDefaultFrame();
		if (textId.trim().equals("")) {
			throw new Exception("Parent reference number not available");
		}

	}

	public void selectOrganization(String string) {
		clickOnElement(By.xpath("//*[@id='s2id_sp_formfield_organization']"));
		clickOnElement(By.xpath("//div[text()='" + string + "']"));
	}

	public String getTheAssignmentGroup() {
		switchToFrame();
		return driver
				.findElement((By.xpath("//input[@id='sys_display.original.x_g_nci_cadsr_incident.assignment_group']")))
				.getAttribute("value");

	}

	public void verifyDisabledFields() throws Exception {
		switchToFrame();
		List<WebElement> allDisabledFields = getElements(By.xpath("//*[@readonly=\"readonly\"]"));
		
		if(allDisabledFields.size()<35) {
			throw new Exception ("Expected 35 disabled fields but found only "+allDisabledFields.size());
		}
		
	}
}
