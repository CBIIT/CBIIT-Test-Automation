package ServiceNow.RCMDB.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.ITPG.Utils.CommonUtils;

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

	@FindBy(xpath = "(//a[@class='select2-choice select2-default form-control'])[1]")
	public WebElement businessOwner;

	@FindBy(xpath = "(//*[contains(@id,'s2id_autogen') and contains(@id,'search')])[7]")
	public WebElement businessOwnerTextBox;

	public By docDirectorInput = By.xpath("//input[@id='s2id_autogen4_search']");

	@FindBy(xpath = "//li[@class='select2-results-dept-0 select2-result select2-result-selectable']")
	public WebElement docDirectorFirstResult;

	@FindBy(xpath = "//div[@id='s2id_sp_formfield_fitara_categories']")
	public WebElement FITARATextBox;

	@FindBy(id = "sp_formfield_idea_description")
	public WebElement ideaTextBox;

	@FindBy(id = "sp_formfield_comments")
	public WebElement commentBox;

	@FindBy(id = "sp_formfield_feedback")
	public WebElement feedbackBox;

	@FindBy(id = "sp_formfield_programmatic_support")
	public WebElement programaticSuport;

	@FindBy(xpath = "//button[text()='Save & Continue']")
	public WebElement saveContinue;

	@FindBy(xpath = "//button[text()='Submit Request']")
	public WebElement submitRequest;

	@FindBy(xpath = "//div[@id='s2id_sp_formfield_state']/a/span")
	public WebElement state;

	@FindBy(xpath = "//h2[text()='Activity']/parent::div")
	public WebElement expandActivity;

	public By commentBoxLocator = By.xpath("//small[@class='text-muted journal-type ng-binding']");

	@FindBy(xpath = "//button[text()='Approve']")
	public WebElement approveRequest;

	@FindBy(xpath = "//button[text()='Reject']")
	public WebElement rejectRequest;

	@FindBy(id = "sp_formfield_comments")
	public WebElement rejectComment;

	@FindBy(xpath = "//button[text()='More Information Needed']")
	public WebElement needMoreInfo;

	@FindBy(xpath = "(//span[@class=\"select2-chosen\"])[3]")
	public WebElement statusOfIdea;

	public By FITARATextBoxInput = By.xpath("//div[@id='s2id_sp_formfield_fitara_categories']//input");

	@FindBy(xpath = "(//th[@role='columnheader']//div[@aria-label=\"Created\"])[2]")
	public WebElement createdDataForBusinessCases;

	@FindBy(xpath = "(//span[@ng-if=\"$first\"])[6]")
	public WebElement firstBusinessCase;
	
	@FindBy(xpath = "(//th[@role='columnheader']//div[@aria-label=\"Created\"])[1]")
	public WebElement createdDataForIdeaCases;

	@FindBy(xpath = "(//span[@ng-if=\"$first\"])[1]")
	public WebElement firstIdeaCase;

	@FindBy(id = "tinymce")
	public WebElement businessNeedTextBox;

	@FindBy(xpath = "//button[3]")
	public WebElement submitBusinessCaseRequest;

	@FindBy(xpath = "//input[@name=\"programmatic_support\"]")
	public WebElement programmaticCHeckBox;

	@FindBy(partialLinkText = "Native View")
	public WebElement nativeviewLink;
	
	@FindBy(xpath = "\"//*[@id=\\\"userMenu\\\"]/span/span[2]/div/div[2]/button[2]/div\"")
	public WebElement configureWorkspace;
	
	
	
	@FindBy(css = "macroponent-f51912f4c700201072b211d4d8c26010")
	public WebElement userName;

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
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.date_submitted_for_approval")
	private WebElement dateSubmittedForApproval;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.nci_legacy_tracking")
	private WebElement legacyTracking;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.wnrc_tracking")
	private WebElement Tracking;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.date_frc_approved")
	private WebElement approvedByStorageFacility;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.date_received_by_frc")
	private WebElement recievedByStorageFacility;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.disposition_authority")
	private WebElement dispositionAuthority;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.schedule_type")
	private WebElement recordCategory;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.location_of_records_string")
	private WebElement locationOfRecords;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.customer_name_fieldmsg")
	private WebElement errorMessage;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.schedule_sub_category")
	private WebElement recordSubCategory;
	
	@FindBy(id = "sys_display.x_g_nci_record_mgt_rm_tracking_log.customer_name")
	private WebElement customerName;
	
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_customer_name")
	private WebElement customersName;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_wnrc_tracking__")
	private WebElement WNRCTracking;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_legacy_tracking_number")
	private WebElement LegacyTracking;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_doc")
	private WebElement DOC;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_status")
	private WebElement status;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_record_custodian")
	private WebElement recordCustodianRM;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_sub_component")
	private WebElement subComponent;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_hnc_code")
	private WebElement HNCCode;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_received_by_frc")
	private WebElement receivedByHRC;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_location")
	private WebElement Location;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_submitted_to_nih")
	private WebElement submittedByNIH;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_telephone")
	private WebElement telephone;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_disposition_authority")
	private WebElement dispositionAuthorityRM;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u___boxes")
	private WebElement boxes;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_r_m____init")
	private WebElement RMINIT;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_approved__fo_ransfer_by_frc")
	private WebElement approvedForTransferByFRC;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_sched_type")
	private WebElement schedType;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_sub_category")
	private WebElement subCategory;  
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_litigation_hold")
	private WebElement litigationHoldRM;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_approved_disposition_date")
	private WebElement approvedDispositionDateRM;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_retention_type")
	private WebElement retentionTypeRM;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_years_for_retention")
	private WebElement yearsOfRetentionRM;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_revised_disposition_date")
	private WebElement revisedDispositionDateRM;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_planned_disp_ccession_date_")
	private WebElement plannedDisposition;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_record_import.u_comments")
	private WebElement comments;
	
	@FindBy(id = "x_g_nci_record_mgt_quarterly_cost.end_date")
	private WebElement endDate;
	
	
	@FindBy(id = "x_g_nci_record_mgt_quarterly_cost.quarterly_cost.display")
	private WebElement quaterlyCost;
	
	@FindBy(id = "x_g_nci_record_mgt_quarterly_cost.total_records")
	private WebElement totalRecords;
	
	@FindBy(id = "x_g_nci_record_mgt_quarterly_cost.total_boxes")
	private WebElement totalBoxes;
	
	@FindBy(id = "d4693f1d1bc65910cc42ddb6bc4bcb78_text")
	private WebElement search;
	
	@FindBy(linkText = "11/11/2022")
	private WebElement firstQuaterlyCost;
	
	@FindBy(linkText = "HNC141")
	private WebElement firstRecord;
		
	@FindBy(id = "sys_display.x_g_nci_record_mgt_rm_tracking_log.record_custodian")
	private WebElement recordCustodian;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.retention_type")
	private WebElement retentionType;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.years_of_retention")
	private WebElement yearsOfRetention;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.litigation_hold")
	private WebElement litigationHold;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.doc_sub_component")
	private WebElement DOCSubComponent; 
	
	@FindBy(id = "sysverb_new")
	private WebElement newRM;
	
	@FindBy(id = "sysverb_new")
	private WebElement newQuaterlyCost;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.disposition_date")
	private WebElement plannedDispositionDate;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.extension_date")
	private WebElement revisedDispositionDate;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.actual_disposition_date")
	private WebElement approvedDispositionDate;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.sac")
	private WebElement SAC;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.number_of_boxes")
	private WebElement numberOfBoxes;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.storage_facility")
	private WebElement storageFacility;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.rm_initials")
	private WebElement RMInitials;
	
	@FindBy(id = "x_g_nci_record_mgt_rm_tracking_log.comments")
	private WebElement additionalComments;
	
	@FindBy(id = "sysverb_insert")
	private WebElement submitButton;
		
	@FindBy(id = "sysverb_insert_bottom")
	private WebElement submitRecordButton;
	
	@FindBy(id = "sysverb_insert_bottom")
	private WebElement submitQuaterlyCostButton;
	
	
	/** Left navigation filtered list */
	@FindAll({ @FindBy(css = "[aria-label='Modules for Favorited Application: Records Management Database'] li") })
	public List<WebElement> filteredIdeasList;

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
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//clickOnElement(userName);
		clickOnElement(nativeviewLink);
		
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

	public void enterTextInBusinessNeedBox(String textBoxData) throws InterruptedException {
		clickOnElement(businessOwner);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		setText(businessOwnerTextBox, "Justin Cam");
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
			Thread.sleep(5000);
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
		return (getText(state));
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
	}

	public void needMoreInfoOnRequest() {
		clickOnElement(needMoreInfo);
	}

	public void fillIDeaBox(String textToEnter) {
		setText(ideaTextBox, textToEnter);
	}

	public void enterComments(String textToEnter) {
		setText(commentBox, textToEnter);
	}

	public void programaticSUpportCheckBox() {
		clickOnElement(programaticSuport);
	}

	public void fillFITARATextBox() throws InterruptedException {
		clickOnElement(FITARATextBox);
		setText(FITARATextBoxInput, "Software");
		Thread.sleep(2000);
		driver.findElement(FITARATextBoxInput).sendKeys(Keys.TAB);
	}

	public void selectDocDirector(String inputText) {
		clickOnElement(docDirectorTextBox);
		setText(docDirectorInput, inputText);
		clickOnElement(docDirectorFirstResult);
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
			clickOnElementByXpath(quickLinkOptionXpath);

			// Link was changed again, adding a reliable way to navigate to the page
			// String currentURL = driver.getCurrentUrl();
			// driver.navigate().to(currentURL + "?id=itpg_home_page");
		} catch (Exception e) {
			throw e;
		}
	}

	public void openApp() {
			driver.get(EnvUtils.getApplicationUrl("RCMDB"));
			CucumberLogUtils.logScreenShot();
	}

	public boolean verifyEmail(String subject) throws InterruptedException {
		//Filter System Logs from side menu
		setText(filterMenu, "System Logs");
		
		//Click on Email from side menu
		CommonUtils.waitBrowser(5000);
		for (int i = 0; i < filteredList.size(); i++) {
			if (filteredList.get(i).getText().contains("Emails")) {
				filteredList.get(i).click();
			}
		}
		
		//Click on First Email
		switchToFrame();
		clickOnElement(firstEmail);
		
		Thread.sleep(5000);
	
		//Compare subject of the email to validate correct email is sent
		System.out.println("Email Subject :" +Subject.getAttribute("value"));

		if (Subject.getAttribute("value").contains(subject)) {
			switchToDefaultFrame();	
			driver.switchTo().parentFrame();
			return true;
		} 
		
		switchToDefaultFrame();
		driver.switchTo().parentFrame();
		return false;

	}

	public void validateLabels() {
		// TODO Auto-generated method stub
		// Filter System Logs from side menu
				setText(filterMenu, "Records Management");

				// Click on Email from side menu
				CommonUtils.waitBrowser(5000);
				
					Assert.assertEquals(driver.findElement(By.xpath("//div[text()='RM Tracking Record Imports']")).getText(), "RM Tracking Record Imports");
					Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Create New Record']")).getText(), "Create New Record");
					Assert.assertEquals(driver.findElement(By.xpath("//div[text()='All Tracking Records']")).getText(), "All Tracking Records");
					Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Update Cost per Box']")).getText(), "Update Cost per Box");
					Assert.assertEquals(driver.findElement(By.xpath("//div[text()='Quarterly Costs']")).getText(), "Quarterly Costs");
					CucumberLogUtils.logScreenShot();
					
		
	}

	public void clickOnCreateNewRecord() {
		// TODO Auto-generated method stub
		setText(filterMenu, "Records Management");

		// Click on Email from side menu
		CommonUtils.waitBrowser(5000);
		clickOnElement(filteredIdeasList.get(1));
		CucumberLogUtils.logScreenShot();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickOnCreateNewRMTrackingRecord() {
		// TODO Auto-generated method stub
		setText(filterMenu, "Records Management");

		// Click on Email from side menu
		CommonUtils.waitBrowser(5000);
		clickOnElement(filteredIdeasList.get(0));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickOnQuaterlyCosts() {
		// TODO Auto-generated method stub
		setText(filterMenu, "Records Management");

		// Click on Email from side menu
		CommonUtils.waitBrowser(5000);
		clickOnElement(filteredIdeasList.get(4));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void clickOnAllTrackingRecord() {
		// TODO Auto-generated method stub
		setText(filterMenu, "Records Management");

		// Click on Email from side menu
		CommonUtils.waitBrowser(5000);
		clickOnElement(filteredIdeasList.get(2));
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void fillTrackingRecordForm() throws InterruptedException {
		// TODO Auto-generated method stub
		switchToFrame();
		setText(dateSubmittedForApproval,"09/08/2022");
		setText(legacyTracking,"443-09-0109");
		setText(Tracking,"W443-09-0109");
		setText(approvedByStorageFacility,"09/08/2022");
		setText(recievedByStorageFacility,"09/08/2022");
		setText(dispositionAuthority,"meric	DAA-0443-2012-0007-0003");
		setText(recordCategory,"TEST");
		setText(locationOfRecords,"TEST");
		setText(recordSubCategory,"TEST");
		setText(customerName,"satya gugulothu");
		Thread.sleep(3000);
		customerName.sendKeys(Keys.ARROW_DOWN);
		customerName.sendKeys(Keys.ENTER);
		setText(recordCustodian,"Darren Henderson");
		Thread.sleep(3000);
		recordCustodian.sendKeys(Keys.ARROW_DOWN);
		recordCustodian.sendKeys(Keys.ENTER);
		CucumberLogUtils.logScreenShot();
		setText(retentionType,"T");
		setText(yearsOfRetention,"7");
		setText(litigationHold,"TIL");
		setText(DOCSubComponent,"TEST");
		setText(plannedDispositionDate,"09/08/2022");
		setText(revisedDispositionDate,"09/08/2022");
		setText(approvedDispositionDate,"09/08/2022");
		setText(SAC,"HNC141");
		setText(numberOfBoxes,"10");
		setText(storageFacility,"TEST");
		setText(RMInitials,"FR");
		setText(additionalComments,"Test Automation");
		switchToDefaultFrame();
		CucumberLogUtils.logScreenShot();
	}

	public void ClickOnSubmit() {
		// TODO Auto-generated method stub
		switchToFrame();
		clickOnElement(submitButton);
		switchToDefaultFrame();
	}
	
	public void ClickOnSubmitRecord() {
		// TODO Auto-generated method stub
		switchToFrame();
		clickOnElement(submitRecordButton);
		switchToDefaultFrame();
	}
	
	public void ClickOnSubmitButton() {
		// TODO Auto-generated method stub
		switchToFrame();
		clickOnElement(submitQuaterlyCostButton);
		switchToDefaultFrame();
	}

	public void validateTrackingLog() {
		// TODO Auto-generated method stub
		switchToFrame();
		//driver.findElement(By.xpath("//tr[@id='hdr_x_g_nci_record_mgt_rm_tracking_log']/th[4]/span/a")).click();
		List<WebElement> allColumn = driver.findElements(By.xpath("//tr[@id='hdr_x_g_nci_record_mgt_rm_tracking_log']/th/span/a"));
		System.out.println("Column Size:" +allColumn.size());
		for(int i=0;i<allColumn.size();i++) {
			System.out.println("Column header :"+allColumn.get(i).getText());
		}
		Assert.assertEquals(allColumn.get(0).getText(), "SAC\nSort in ascending order");
		Assert.assertEquals(allColumn.get(1).getText(), "Tracking #\nSort in ascending order");
		Assert.assertEquals(allColumn.get(2).getText(), "Status\nSort in ascending order");
		Assert.assertEquals(allColumn.get(3).getText(), "Customer Name\nSort in ascending order");
		Assert.assertEquals(allColumn.get(4).getText(), "Record Custodian\nSort in ascending order");
		Assert.assertEquals(allColumn.get(5).getText(), "DOC\nSort in ascending order");
		Assert.assertEquals(allColumn.get(6).getText(), "DOC Sub-Component\nSort in ascending order");
		Assert.assertEquals(allColumn.get(7).getText(), "Updated\nSort in descending order");
		Assert.assertEquals(allColumn.get(8).getText(), "Created\nSort in ascending order");
		switchToDefaultFrame();
	}

	public void enterCustomerNameManually() {
		// TODO Auto-generated method stub
		switchToFrame();
		setText(customerName,"Satya");
		locationOfRecords.click();
				
	}

	public void validateErrorMessage() {
		// TODO Auto-generated method stub
		Assert.assertEquals(true, errorMessage.isDisplayed());
	}

	public void enterInvalidDispositionAuthority() {
		// TODO Auto-generated method stub
		switchToFrame();
		String input = "asfsfgdffgdgdffgfgtreyeturtudgbvndjdjdjdfjdjdtrururiurytrhtrururururhdghdjeywetwrgrgjytituititutyeyweyowyoskdfsk";
		int inputSize = input.length();
		System.out.println("input size:" +inputSize);
		setText(dispositionAuthority, input);
		setText(DOCSubComponent, input);
		int actualSize = getText(dispositionAuthority).length();
		Assert.assertNotEquals(actualSize, inputSize);
		int actualSize1 = getText(DOCSubComponent).length();
		Assert.assertNotEquals(actualSize1, inputSize);
		switchToDefaultFrame();
		CucumberLogUtils.logScreenShot();
		
	}

	public void clickOnNewRMTrackingRecordButton() {
		// TODO Auto-generated method stub
		switchToFrame();
		clickOnElement(newRM);
		switchToDefaultFrame();
	}
	
	public void clickOnNewQuaterlyCost() {
		// TODO Auto-generated method stub
		switchToFrame();
		clickOnElement(newQuaterlyCost);
		switchToDefaultFrame();
	}

	public void fillRMTrackingForm() {
		// TODO Auto-generated method stub
		switchToFrame();
		setText(customersName,"Satya");
		setText(WNRCTracking,"443-09-0109");
		setText(LegacyTracking,"W443-09-0109");
		setText(DOC,"09/08/2022");
		setText(status,"09/08/2022");
		setText(recordCustodianRM,"meric	DAA-0443-2012-0007-0003");
		setText(subComponent,"TEST");
		setText(HNCCode,"TEST");
		setText(receivedByHRC,"TEST");
		setText(Location,"Satya");
		setText(submittedByNIH,"443-09-0109");
		setText(telephone,"W443-09-0109");
		setText(dispositionAuthorityRM,"09/08/2022");
		CucumberLogUtils.logScreenShot();
		setText(boxes,"09/08/2022");
		setText(RMINIT,"meric	DAA-0443-2012-0007-0003");
		setText(approvedForTransferByFRC,"TEST");
		setText(schedType,"TEST");
		setText(subCategory,"TEST");
		setText(litigationHoldRM,"Satya");
		setText(approvedDispositionDateRM,"09/08/2022");
		setText(retentionTypeRM,"09/08/2022");
		setText(plannedDisposition,"meric	DAA-0443-2012-0007-0003");
		setText(yearsOfRetentionRM,"TEST");
		setText(revisedDispositionDateRM,"TEST");
		setText(comments,"TEST");
		switchToDefaultFrame();
		CucumberLogUtils.logScreenShot();
		

	}
	
	public void fillQuaterlyCostForm() throws InterruptedException {
		// TODO Auto-generated method stub
		switchToFrame();
		setText(endDate,"11/11/2022");
		quaterlyCost.clear();
		setText(quaterlyCost,"0.00");
		setText(totalRecords,"10");
		setText(totalBoxes,"110");
		switchToDefaultFrame();
		

	}

	public void validateAddedRecorded() throws InterruptedException {
		// TODO Auto-generated method stub
		//setText(search, "110");
		switchToFrame();
		clickOnElement(firstQuaterlyCost);
		
		CucumberLogUtils.logScreenShot();
		switchToDefaultFrame();
		Thread.sleep(2000);
		switchToFrame();
		Assert.assertEquals(endDate.getAttribute("value"), "11/11/2022");
		Assert.assertEquals(quaterlyCost.getAttribute("value"), "0.00");
		Assert.assertEquals(totalRecords.getAttribute("value"), "10");
		Assert.assertEquals(totalBoxes.getAttribute("value"), "110");
		CucumberLogUtils.logScreenShot();
		switchToDefaultFrame();
	}
	
	public void validateAddedNewRecord() throws InterruptedException {
		// TODO Auto-generated method stub
		//setText(search, "110");
		switchToFrame();
		clickOnElement(firstRecord);
		
		CucumberLogUtils.logScreenShot();
		switchToDefaultFrame();
		Thread.sleep(2000);
		switchToFrame();
		Assert.assertEquals(dateSubmittedForApproval.getAttribute("value"), "09/08/2022");
		Assert.assertEquals(legacyTracking.getAttribute("value"), "443-09-0109");
		Assert.assertEquals(Tracking.getAttribute("value"), "W443-09-0109");
		Assert.assertEquals(approvedByStorageFacility.getAttribute("value"), "09/08/2022");
		Assert.assertEquals(recievedByStorageFacility.getAttribute("value"), "09/08/2022");
		Assert.assertEquals(dispositionAuthority.getAttribute("value"), "meric");
		Assert.assertEquals(recordCategory.getAttribute("value"), "DAA-0443-2012-0007-0003TEST");
		//Assert.assertEquals(locationOfRecords.getAttribute("value"), "5601 Fishers Lane (5601FL)");
		Assert.assertEquals(recordSubCategory.getAttribute("value"), "TEST");
		Assert.assertEquals(customerName.getAttribute("value"), "satya gugulothu");
		Assert.assertEquals(recordCustodian.getAttribute("value"), "Darren Henderson");
		Assert.assertEquals(retentionType.getAttribute("value"), "T");
		Assert.assertEquals(yearsOfRetention.getAttribute("value"), "7");
		Assert.assertEquals(litigationHold.getAttribute("value"), "TIL");
		Assert.assertEquals(DOCSubComponent.getAttribute("value"), "TEST");
		Assert.assertEquals(plannedDispositionDate.getAttribute("value"), "09/08/2022");
		Assert.assertEquals(revisedDispositionDate.getAttribute("value"), "09/08/2022");
		Assert.assertEquals(approvedDispositionDate.getAttribute("value"), "09/08/2022");
		Assert.assertEquals(SAC.getAttribute("value"), "HNC141");
		Assert.assertEquals(numberOfBoxes.getAttribute("value"), "10");
		Assert.assertEquals(storageFacility.getAttribute("value"), "TEST");
		Assert.assertEquals(RMInitials.getAttribute("value"), "FR");
		//Assert.assertEquals(additionalComments.getAttribute("value"), "Test Automation");
		
		
		
		CucumberLogUtils.logScreenShot();
		switchToDefaultFrame();
	}

}
