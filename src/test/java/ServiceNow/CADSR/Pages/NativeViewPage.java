package ServiceNow.CADSR.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.ITPG.Utils.CommonUtils;
import junit.framework.Assert;

public class NativeViewPage extends BasePage {

	public NativeViewPage() {
		PageFactory.initElements(WebDriverUtils.getWebDriver(), this);
	}

	@FindBy(id = "sysverb_new")
	public WebElement newRequestButton;

	@FindBy(id = "filter")
	private WebElement filterMenu;

	@FindAll({ @FindBy(css = "[aria-label='Modules for Application: caDSR II Helpdesk'] li") })
	public List<WebElement> filteredList;

	/** Left navigation filtered list */
	@FindAll({ @FindBy(css = "[aria-label='Modules for Application: caDSR Helpdesk'] li") })
	public List<WebElement> filteredcaDSRList;

	@FindAll({ @FindBy(css = "[aria-label='Submodules for Module: Business Case'] li") })
	public List<WebElement> filteredBusinessList;

	@FindBy(id = "x_g_nci_itpg_idea.idea_description")
	public WebElement ideaTextBox;

	@FindBy(id = "sp_formfield_comments")
	public WebElement commentBox;

	@FindBy(id = "label.ni.x_g_nci_itpg_idea.programmatic_support")
	public WebElement programaticSuport;

	@FindBy(css = ".icon-locked:nth-child(1)")
	public WebElement FITARAlock;

	public By FITARATextBoxInput = By.id("choice.x_g_nci_itpg_idea.fitara_categories");

	public By docDirectorInput = By.xpath("//input[@id='s2id_autogen4_search']");

	public By incidentTableHeader = By.xpath("//*[@id=\"x_g_nci_cadsr_incident_table\"]/ thead/tr[1]/th");

	@FindBy(xpath = "//li[@class='select2-results-dept-0 select2-result select2-result-selectable']")
	public WebElement docDirectorFirstResult;

	@FindBy(id = "sys_display.x_g_nci_cadsr_incident.u_requested_for")
	public WebElement requestedForTextBox;

	@FindBy(id = "sys_display.x_g_nci_cadsr_incident.organization")
	public WebElement organisation;

	@FindBy(id = "x_g_nci_cadsr_incident.state")
	public WebElement status;

	@FindBy(id = "x_g_nci_cadsr_incident.priority")
	public WebElement priority;

	@FindBy(id = "sys_display.x_g_nci_cadsr_incident.assignment_group")
	public WebElement assignmentGroup;

	@FindBy(id = "sys_display.x_g_nci_cadsr_incident.assigned_to")
	public WebElement assignedTo;

	@FindBy(xpath = "//button[text()='Save & Continue']")
	public WebElement saveContinue;

	@FindBy(xpath = "//button[text()='Submit Request']")
	public WebElement submitRequest;

	@FindBy(linkText = "Pending")
	public WebElement pending;

	@FindBy(xpath = "//td[3]/a")
	public WebElement firstIdeaCase;

	@FindBy(xpath = "//td[3]/div/div[2]/a")
	public WebElement firstBusinessCase;

	@FindBy(xpath = "//button[text()='Approve']")
	public WebElement approveRequest;

	@FindBy(id = "approve_bottom")
	public WebElement approveButton;

	@FindBy(id = "sys_readonly.x_g_nci_itpg_idea.state")
	public WebElement state;

	@FindBy(partialLinkText = "Native View")
	public WebElement nativeviewLink;

	@FindBy(id = "sys_display.x_g_nci_itpg_case.business_owner")
	public WebElement businessOwner;

	@FindBy(xpath = "(//*[contains(@id,'s2id_autogen') and contains(@id,'search')])[7]")
	public WebElement businessOwnerTextBox;

	@FindBy(id = "label.ni.x_g_nci_itpg_case.programmatic_support")
	public WebElement programmaticCHeckBox;

	@FindBy(id = "465850e91b31f0146daea681f54bcb3b")
	public WebElement submitBusinessCaseRequest;

	@FindBy(xpath = "//div[@id='tabs2_section']/span[3]/span/span[2]")
	public WebElement alternativeAndAnalysis;

	@FindBy(xpath = "//div[@id='tabs2_section']/span[4]/span/span[2]")
	public WebElement preferredSolution;

	@FindBy(xpath = "//span[@class='sr-only' and text()='User menu']/following-sibling::span[2]")
	public WebElement userMenu;

	@FindBy(xpath = "//*[@id=\"sp-nav-bar1\"]/div/div/div")
	public WebElement userMenuPortal;

	@FindBy(xpath = "//a[@sn-modal-show=\"elevateRoles\"]")
	public WebElement elevateRolesButton;

	@FindBy(xpath = "//input[@name=\"elevated_role\"]")
	public WebElement elevatedRoleCheckBox;

	@FindBy(xpath = "//button[@ng-click=\"updateElevatedRoles()\"]")
	public WebElement confirmRoleUpdate;

	/**
	 * Request form Task Dropdown Element
	 */
	@FindBy(xpath = "(//span[@class='select2-chosen'])[3]")
	public WebElement taskDropdown;

	@FindBy(xpath = "//input[@id='s2id_autogen10']")
	public WebElement curationTextBox;

	@FindBy(xpath = "//div[text()='Curation - Forms' and @role='option']")
	public WebElement roleOption;

	@FindBy(id = "sp_formfield_short_description")
	public WebElement shortDescription;

	@FindBy(id = "sp_formfield_requested_due_date")
	public WebElement requestDueDate;

	public By justSave = By.xpath("//button[@data-original-title=\"Save record and remain here\"]");
	public By saveButton = By.id("sysverb_insert_and_stay_bottom");
	public By addAttachemdnBottom = By.id("add_attachment_bottom");
	public By submitButtonOnNewRequestForm = By.id("sysverb_insert_bottom");

	String taskDropDownElements = "//div[text()='%s']";

	public void clickOnNativeView() {
		clickOnElement(userMenuPortal);
		clickOnElement(nativeviewLink);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void clickOnCADSRRequest() throws InterruptedException {
		setText(filterMenu, "CADSR");

		Thread.sleep(5000);

		// Click on Email from side menu
		CommonUtils.waitBrowser(5000);
		for (int i = 0; i < filteredList.size(); i++) {
			if (filteredList.get(i).getText().contains("All Requests")) {
				filteredList.get(i).click();
			}
		}
	}

	public void startANewRequest() {
		switchToFrame();
		clickOnElement(newRequestButton);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}
	
	public void allSelectOptions() throws Exception {
		switchToFrame();
		WebElement selectElement = driver.findElement(By.id("x_g_nci_cadsr_incident.state"));
		Select select = new Select(selectElement);
		List<WebElement> dd = select.getOptions();

	    if(dd.size()<3) {
	    	throw new Exception("Not enough options to select");
	    }
	    switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public void fillShortDescription(String textToEnter) {
		switchToFrame();
		setText(ideaTextBox, textToEnter);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public void enterComments(String textToEnter) {
		switchToFrame();
		setText(commentBox, textToEnter);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public void programaticSUpportCheckBox() {
		switchToFrame();
		clickOnElement(programaticSuport);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public void fillFITARATextBox() throws InterruptedException {
		switchToFrame();
		clickOnElement(FITARAlock);
		WebElement dropdown = driver.findElement(FITARATextBoxInput);
		dropdown.findElement(By.xpath("//option[. = 'Software']")).click();
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public void selectRequestedFor(String inputText) {
		switchToFrame();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickOnElement(requestedForTextBox);
		setText(requestedForTextBox, inputText);
		// clickOnElement(docDirectorFirstResult);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		requestedForTextBox.sendKeys(Keys.ARROW_DOWN);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		requestedForTextBox.sendKeys(Keys.RETURN);

		switchToDefaultFrame();
		driver.switchTo().parentFrame();

	}

	public void selectOrganisation(String inputText) {
		switchToFrame();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		clickOnElement(organisation);
		setText(organisation, inputText);
		// clickOnElement(docDirectorFirstResult);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		organisation.sendKeys(Keys.ARROW_DOWN);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		organisation.sendKeys(Keys.RETURN);

		switchToDefaultFrame();
		driver.switchTo().parentFrame();

	}

	public void selectTaskAndOtherDetails() {
		clickOnElement(taskDropdown);
		clickOnElement(find(By.xpath(String.format(taskDropDownElements, "Curation"))));
		setText(curationTextBox, "Curation - Forms");
		clickOnElement(roleOption);
		setText(shortDescription, "Testing");
		setText(requestDueDate, "09/22/2022");
	}

	public void selectStatus() {
		switchToFrame();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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

	}

	public void selectPriority() {
		switchToFrame();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		priority.sendKeys(Keys.ARROW_DOWN);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		priority.sendKeys(Keys.RETURN);

		switchToDefaultFrame();
		driver.switchTo().parentFrame();

	}

	public void selectAssignmentGroup(String inputText) {
		switchToFrame();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		clickOnElement(assignmentGroup);
		setText(assignmentGroup, inputText);
		// clickOnElement(docDirectorFirstResult);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assignmentGroup.sendKeys(Keys.ARROW_DOWN);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assignmentGroup.sendKeys(Keys.RETURN);

		switchToDefaultFrame();
		driver.switchTo().parentFrame();

	}

	public void selectAssignedTo(String inputText) {
		switchToFrame();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		clickOnElement(assignedTo);
		setText(assignedTo, inputText);
		// clickOnElement(docDirectorFirstResult);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		assignedTo.sendKeys(Keys.ARROW_DOWN);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assignedTo.sendKeys(Keys.RETURN);

		switchToDefaultFrame();
		driver.switchTo().parentFrame();

	}

	public void saveTicketOnNativeView() {
		clickOnElement(saveButton);
	}

	public void justSaveTicket() {
		switchToFrame();
		clickOnElement(justSave);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public String getAssignedToValue() throws InterruptedException {
		Thread.sleep(3000);
		switchToFrame();
		String assignedToValue = getElementByXpath("//input[@id='sys_display.x_g_nci_cadsr_task.assigned_to']")
				.getAttribute("value");
		System.out.println(assignedToValue);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
		return assignedToValue;
	}

	public void saveContinueButton() {
		switchToFrame();
		clickOnElement(saveContinue);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Actions action = new Actions(driver);
		action.moveToElement(submitRequest).perform();
		clickOnElement(submitRequest);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public void clickOnFirstIdeaCase() {
		switchToFrame();
		clickOnElement(firstIdeaCase);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public void clickOnFirstBusinessCase() {
		switchToFrame();
		Actions action = new Actions(driver);
		action.moveToElement(firstBusinessCase).perform();
		clickOnElement(firstBusinessCase);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public void approveRequest() {
		switchToFrame();
		clickOnElement(approveRequest);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public String getState() throws Exception {
		switchToFrame();
		String State = getText(state);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
		return (State);

	}

	public void openApp() {
			driver.get(EnvUtils.getApplicationUrl("AtoTestUrl"));
	}

	public void clickOnAllBusiness() {
		// Filter System Logs from side menu
		filterMenu.clear();
		setText(filterMenu, "Business Case");

		// Click on Email from side menu
		CommonUtils.waitBrowser(5000);
		for (int i = 0; i < filteredBusinessList.size(); i++) {
			if (filteredBusinessList.get(i).getText().contains("All")) {
				filteredBusinessList.get(i).click();
			}
		}

	}

	public void enterTextInBusinessNeedBox(String textBoxData) throws InterruptedException {
		driver.switchTo().frame(0);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setText(businessOwner, "Justin Campany");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		businessOwner.sendKeys(Keys.ARROW_DOWN);

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		businessOwner.sendKeys(Keys.RETURN);
		clickOnElement(programmaticCHeckBox);
		enterText(textBoxData);

		driver.switchTo().defaultContent();
		switchToDefaultFrame();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);

		clickOnElement(alternativeAndAnalysis);
		enterData(textBoxData);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(0);

		clickOnElement(preferredSolution);
		enterTextData(textBoxData);
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		switchToDefaultFrame();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);

		Thread.sleep(5000);

		clickOnElement(submitBusinessCaseRequest);

		Thread.sleep(5000);

		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

	public void enterText(String allData) {

		// driver.switchTo().defaultContent();
		int allFrames = driver.findElements(By.tagName("iframe")).size();

		for (int i = 0; i < 2; i++) {
			try {
				driver.switchTo().frame(i);
				WebElement e1 = driver.findElement(By.xpath("//html//body[@id='tinymce']"));
				e1.sendKeys(allData);
				/*
				 * for (WebElement e1 : allElements) { if (e1.isDisplayed()) {
				 * e1.sendKeys(allData);
				 * 
				 * }
				 * 
				 * }
				 */
				driver.switchTo().defaultContent();
				// switchToDefaultFrame();
				// driver.switchTo().parentFrame();
				driver.switchTo().frame(0);
			} catch (NoSuchFrameException e) {
				// continue;
			}
		}

	}

	public void enterData(String allData) {

		// driver.switchTo().defaultContent();
		int allFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("All frames : " + allFrames);
		for (int i = 0; i < 5; i++) {
			try {
				driver.switchTo().frame(i);
				System.out.println("frame ID : " + i);
				WebElement e1 = driver.findElement(By.xpath("//html//body[@id='tinymce']"));
				e1.sendKeys(allData);
				/*
				 * for (WebElement e1 : allElements) { if (e1.isDisplayed()) {
				 * e1.sendKeys(allData);
				 * 
				 * }
				 * 
				 * }
				 */
				driver.switchTo().defaultContent();
				// switchToDefaultFrame();
				// driver.switchTo().parentFrame();
				driver.switchTo().frame(0);
			} catch (NoSuchFrameException e) {
				// continue;
			}
		}

	}

	public void enterTextData(String allData) {

		// driver.switchTo().defaultContent();
		int allFrames = driver.findElements(By.tagName("iframe")).size();
		System.out.println("All frames : " + allFrames);
		for (int i = 0; i < 8; i++) {
			try {
				driver.switchTo().frame(i);
				System.out.println("frame ID : " + i);
				WebElement e1 = driver.findElement(By.xpath("//html//body[@id='tinymce']"));
				e1.sendKeys(allData);
				/*
				 * for (WebElement e1 : allElements) { if (e1.isDisplayed()) {
				 * e1.sendKeys(allData);
				 * 
				 * }
				 * 
				 * }
				 */
				driver.switchTo().defaultContent();
				// switchToDefaultFrame();
				// driver.switchTo().parentFrame();
				driver.switchTo().frame(0);
			} catch (NoSuchFrameException e) {
				// continue;
			}
		}

	}

	public void approveRequestForm() throws InterruptedException {
		switchToFrame();
		Thread.sleep(2000);
		clickOnElement(pending);
		// clickOnPendingRequest();

		Thread.sleep(2000);
		clickOnElement(approveButton);
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
	}

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

	public void elevateButton() throws InterruptedException {
		clickOnElement(userMenu);
		clickOnElement(elevateRolesButton);
		clickOnElement(elevatedRoleCheckBox);
		clickOnElement(confirmRoleUpdate);
		Thread.sleep(5000);
	}

	public void fillDetails() {

	}

	public void viewDefaultColumns() {
		switchToFrame();
		List<WebElement> tableHeaders = driver.findElements(incidentTableHeader);
		Assert.assertEquals(tableHeaders.get(2).getText().replaceAll("[\n\r]", ""), "NumberSort in ascending order");
		Assert.assertEquals(tableHeaders.get(3).getText().replaceAll("[\n\r]", ""),
				"Requested forSort in ascending order");
		Assert.assertEquals(tableHeaders.get(4).getText().replaceAll("[\n\r]", ""),
				"OrganizationSort in ascending order");
		Assert.assertEquals(tableHeaders.get(5).getText().replaceAll("[\n\r]", ""),
				"Short descriptionSort in ascending order");
		Assert.assertEquals(tableHeaders.get(6).getText().replaceAll("[\n\r]", ""),
				"Assigned toSort in ascending order");
		Assert.assertEquals(tableHeaders.get(7).getText().replaceAll("[\n\r]", ""),
				"Assignment groupSort in ascending order");
		Assert.assertEquals(tableHeaders.get(8).getText().replaceAll("[\n\r]", ""),
				"Requested Due DateSort in descending order");
		Assert.assertEquals(tableHeaders.get(9).getText().replaceAll("[\n\r]", ""), "StatusSort in ascending order");
		Assert.assertEquals(tableHeaders.get(10).getText().replaceAll("[\n\r]", ""), "UpdatedSort in descending order");
		Assert.assertEquals(tableHeaders.get(11).getText().replaceAll("[\n\r]", ""), "CreatedSort in descending order");
	}

	public void validateTheLabelAsStatus() {
		switchToFrame();
		String x = getElements(By.xpath("//span[@id='status.x_g_nci_cadsr_incident.state']/following-sibling::*"))
				.get(0).getText();
		Assert.assertTrue(x.equalsIgnoreCase("Status"));
	}

	public void validateParentTicketReference() {
		switchToFrame();
		String x = getElements(By.id("sys_display.x_g_nci_cadsr_task.parent")).get(0).getAttribute("value");
		Assert.assertTrue(!x.trim().equalsIgnoreCase(""));
	}

	public void validateTextOnLandingPage() {
		String textOnScreenPart1 = getText(find(By.xpath("//*[@class='col-sm-8 main-text']/p")));
		String expectedTextPart1 = "Welcome to the new caDSR II Helpdesk. Community members requesting centralized curation assistance can simply submit a helpdesk Request Form. Users can access all of their open tickets and monitor the progress from submission to completion. Additional information can also be submitted for an existing ticket through caDSR II Helpdesk.";
		Assert.assertTrue(
				"Text on landling page is not as expected-->" + textOnScreenPart1 + "-->" + expectedTextPart1 + "<--",
				textOnScreenPart1.trim().equalsIgnoreCase(expectedTextPart1.trim()));
		String textOnScreenPart2 = getText(find(By.xpath("(//*[@class='col-sm-8 main-text']/p)[2]")));
		String expectedTextPart2 = "Check out our Knowledge Base to find out more about our centralized curation services and how we can assist you with your metadata projects. Templates are available to assist you with all of your curation requests. caDSR II User Guides are provided to help you navigate the system.";
		Assert.assertTrue(
				"Text on landling page is not as expected-->" + textOnScreenPart2 + "-->" + expectedTextPart2 + "<--",
				textOnScreenPart2.trim().equalsIgnoreCase(expectedTextPart2.trim()));

	}

	public void validateTextOnRequestFormPage() {
		String textOnScreen = getText(find(By.xpath("//*[@class='ng-isolate-scope']/p")));
		String expectedText = "Submit a ticket for the centralized curation services you need. Please provide your contact information with request details. A ticket number will be assigned to your request and you will be notified about the progress towards completion. You will be contacted if additional information is needed to complete your request. You may also report an issue @ caDSR.RA@mail.nih.gov.";
		Assert.assertTrue("Text on landling page is not as expected-->" + textOnScreen + "-->" + expectedText + "<--",
				textOnScreen.trim().equalsIgnoreCase(expectedText.trim()));

	}

	public void enterEMailId() {
		setText((By.xpath("//input[@placeholder='someone@example.com']")), "Tasdasest@gmail.com,Tesasdasdt1@gmail.com");

	}

	public void checkIfPageFooterISasExpected() {
		boolean isElementThere = isElementPresent(
				By.xpath("//a[@href=\"https://www.hhs.gov/vulnerability-disclosure-policy/index.html\"]"));
		Assert.assertTrue("Footer message missing", isElementThere);

	}

	public void validateTheListOfOrganization() throws Exception {
		clickOnElement(By.xpath("//*[@id='s2id_sp_formfield_organization']" + ""));
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expectedList = "ABTC (Adult Brain Tumor Consortium)\r\n"
				+ "Alliance (Alliance for Clinical Trials in Oncology )\r\n" + "AMC (Aids Malignancy Consortium)\r\n"
				+ "CCR (NCI Center for Cancer Research)\r\n" + "CCTG (Canadian Cancer Trials Groups)\r\n"
				+ "CDISC (Clinical Data Interchange Standards Consortium)\r\n" + "CDS (Cancer Data Service)\r\n"
				+ "CIP (Cancer Imaging Program)\r\n" + "COG (Children's Oncology Group)\r\n"
				+ "CPTAC (Clinical Proteomic Tumor Analysis Consortium)\r\n" + "CRDC (Cancer Research Data Commons)\r\n"
				+ "CTDC (Clinical Trials Data Commons)\r\n" + "CTEP (Clinical Trials Evaluation Program)\r\n"
				+ "CTRP (Clinical Trials Reporting Program)\r\n" + "Curation Team\r\n"
				+ "DCI (Duke Cancer Institute)\r\n" + "DCP (Division of Cancer Prevention)\r\n"
				+ "DICOM (Data Imaging and Communications in Medicine)\r\n"
				+ "ECOG-ACRIN (ECOG-ACRIN Cancer Research Group)\r\n" + "FPL (Federal Program Lead)\r\n"
				+ "GDC (Genomic Data Commons)\r\n" + "HTAN (Human Tumor Atlas Network)\r\n"
				+ "ICDC (Integrated Canine Data Commons)\r\n" + "IDC (Imaging Data Commons)\r\n"
				+ "MATCH (Molecular Analysis for Therapy Choice)\r\n"
				+ "MCL (Consortium for Molecular and Cellular Characterization of Screen-Detected L\r\n"
				+ "NCI (National Cancer Institute)\r\n" + "NCIP (National Cancer Institute Programs)\r\n"
				+ "NHLBI (National Heart, Lung, and Blood Institute)\r\n" + "NIH (National Institute of Health)\r\n"
				+ "NRG (NRG Oncology)\r\n" + "OCG/HCMI (Office of Cancer Genomics/Human Cancer Models Initiative)\r\n"
				+ "OHSU (Knight Cancer Institute at Oregon Health & Science University Comprehensiv\r\n"
				+ "PBTC (Pediatric Brain Tumor Consortium)\r\n" + "PDC (Proteomic Data Commons)\r\n"
				+ "PhenX (Consensus measures for Phenotypes and eXposures)\r\n"
				+ "PMI (Precision Medicine Initiative)\r\n" + "Princess Margaret Cancer Centre\r\n"
				+ "Roswell Park (Roswell Park Comprehensive Cancer Center)\r\n"
				+ "SRRS (Standardized Repository of Reference Specimens)\r\n"
				+ "SWOG (SWOG Cancer Research Network)\r\n" + "Theradex (Theradex Oncology)\r\n"
				+ "UAMS (University of Arkansas for Medical Sciences Winthrop P. Rockefeller Cancer\r\n"
				+ "URMC (University of Rochester Medical Center)\r\n"
				+ "Wake Forest (Wake Forest Baptist Comprehensive Cancer Center)";
		for (WebElement e : getElements(By.xpath("//ul[@id=\"select2-results-9\"]/li//*"))) {
			if(!expectedList.contains(e.getText())) {
				throw new Exception("Organization not as expected==>"+e.getText());
			}
		}

	}

	public void takeScreenshot() {
		
		
	}

	
}
