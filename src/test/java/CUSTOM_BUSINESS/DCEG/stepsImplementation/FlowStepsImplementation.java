package CUSTOM_BUSINESS.DCEG.stepsImplementation;

import APPS_COMMON.PageInitializers.PageInitializer;
//import cucumber.api.java.en.When;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;

public class FlowStepsImplementation extends PageInitializer {

	public void dcegLoginMadigan() {
		WebDriverUtils.webDriver.get("");
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
		iTrustloginPage.enterPassword("nekrashevicha2Password");
		CommonUtils.sleep(3000);
		iTrustloginPage.clickSignInButton();
		CommonUtils.sleep(3000);
		CommonUtils.sleep(5000);
	}

	public void dcegLoginDemetrius() {
		WebDriverUtils.webDriver.get("");
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
		iTrustloginPage.enterPassword("nekrashevicha2Password");
		CommonUtils.sleep(3000);
		iTrustloginPage.clickSignInButton();
		CommonUtils.sleep(3000);
		CommonUtils.sleep(5000);
	}
	public void dcegLoginChanock() {
		WebDriverUtils.webDriver.get("");
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
		iTrustloginPage.enterPassword("nekrashevicha2Password");
		CommonUtils.sleep(3000);
		iTrustloginPage.clickSignInButton();
		CommonUtils.sleep(3000);
		CommonUtils.sleep(5000);
	}

	public void dcegLoginTobias() {
		WebDriverUtils.webDriver.get("");
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
		iTrustloginPage.enterPassword("nekrashevicha2Password");
		CommonUtils.sleep(3000);
		iTrustloginPage.clickSignInButton();
		CommonUtils.sleep(3000);
		CommonUtils.sleep(5000);
	}
	
	public void dcegLogin(String UserName)  {
		WebDriverUtils.webDriver.get("");
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "Username");
		iTrustloginPage.enterPassword("Password");
		CommonUtils.sleep(3000);
		iTrustloginPage.clickSignInButton();
		CommonUtils.sleep(3000);
		CommonUtils.sleep(5000);
	}
	
	public void dcegLoginHolmes()  {
		WebDriverUtils.webDriver.get("");
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
		iTrustloginPage.enterPassword("nekrashevicha2Password");
		CommonUtils.sleep(3000);
		iTrustloginPage.clickSignInButton();
		CommonUtils.sleep(3000);
		CommonUtils.sleep(5000);
	}
	
	public void dcegLoginBerrington()  {
		WebDriverUtils.webDriver.get("");
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
		iTrustloginPage.enterPassword("nekrashevicha2Password");
		CommonUtils.sleep(3000);
		iTrustloginPage.clickSignInButton();
		CommonUtils.sleep(3000);
		CommonUtils.sleep(5000);
	}
	public void dcegLoginGarcia()  {
		WebDriverUtils.webDriver.get("");
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
		iTrustloginPage.enterPassword("nekrashevicha2Password");
		CommonUtils.sleep(3000);
		iTrustloginPage.clickSignInButton();
		CommonUtils.sleep(3000);
		CommonUtils.sleep(5000);
	}
	
	public void dcegLoginAbnet()  {
		WebDriverUtils.webDriver.get("");
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
		iTrustloginPage.enterPassword("nekrashevicha2Password");
		CommonUtils.sleep(3000);
		iTrustloginPage.clickSignInButton();
		CommonUtils.sleep(3000);
		CommonUtils.sleep(5000);
	}
	public void checkButton() {
		String str = WebDriverUtils.webDriver.findElement(By.className("clearanceRequestTypeRadio"))
				.getAttribute("checked");
		if (str.equalsIgnoreCase("true")) {
			System.out.println("Checkbox selected");
		}
	}

	public void uploadManuscript() {
		CommonUtils.sleep(3000);
		WebElement uploadFile = WebDriverUtils.webDriver.findElement(By.xpath("//input[@name='upload']"));
		CommonUtils.sleep(3000);
		uploadFile.sendKeys("C:\\Users\\zamant2\\Desktop\\TEST-DATA\\Manuscript.docx");
		CucumberLogUtils.logScreenshot();
		CommonUtils.sleep(3000);
	}

	public void uploadDataSharing() {
		CommonUtils.sleep(3000);
		WebElement uploadFile = WebDriverUtils.webDriver.findElement(By.xpath("//input[@name='upload']"));
		CommonUtils.sleep(3000);
		uploadFile.sendKeys("C:\\Users\\zamant2\\Desktop\\TEST-DATA\\DataSharingPLan.pdf");
		CucumberLogUtils.logScreenshot();
		CommonUtils.sleep(3000);
	}

	public void uploadAbstract() {
		CommonUtils.sleep(3000);
		WebElement uploadFile = WebDriverUtils.webDriver.findElement(By.xpath("//input[@name='upload']"));
		CommonUtils.sleep(3000);
		uploadFile.sendKeys("C:\\Users\\zamant2\\Desktop\\TEST-DATA\\Abstract.docx");
		CucumberLogUtils.logScreenshot();
		CommonUtils.sleep(3000);
	}

	public void selectRole(String role) {
		switch (role) {
		case "Reviewer":
			CommonUtils.clickOnElement(adminFlowPage.dropdownRole);
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.selectAllCheckmark);
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.reviewerCheckmark);
			CommonUtils.sleep(2000);
			break;
		case "Requestor":
			CommonUtils.clickOnElement(adminFlowPage.dropdownRole);
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.selectAllCheckmark);
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.requestorCheckmark);
			CommonUtils.sleep(2000);
			break;
		case "Submitter":
			CommonUtils.clickOnElement(adminFlowPage.anyDrop);
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.checkedRequesterMark);
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.submitterCheckmark);
			CommonUtils.sleep(2000);
			break;
		}
	}

	public void selectDropDown(String role) {
		switch (role) {
		case "DOGBE, NADIA":
			String clearanceID = adminFlowPage.cR.getText();
			System.out.println(clearanceID);
			CommonUtils.clickOnElement(adminFlowPage.firstCRcheckbox);
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.reassign);
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.reassigName);
			CommonUtils.sleep(2000);
			CommonUtils.sendKeys(adminFlowPage.reassigName, "DOGBE, NADIA");
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.dogbeNadiaDropdown);
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.reassignDialogButton);
			CommonUtils.sleep(2000);
			CucumberLogUtils.logScreenshot();
			break;
		case "HOLMES-LILLIE, SADIE":
			String clearanceID1 = adminFlowPage.cR.getText();
			System.out.println(clearanceID1);
			CommonUtils.clickOnElement(adminFlowPage.firstCRcheckbox);
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.reassign);
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.reassigName);
			CommonUtils.sleep(2000);
			CommonUtils.sendKeys(adminFlowPage.reassigName, "HOLMES-LILLIE, SADIE");
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.HOLMESSADIEDropdown);
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.reassignDialogButton);
			CommonUtils.sleep(2000);
			CucumberLogUtils.logScreenshot();
			break;
		case "CHANG, VICKY":
			String clearanceID2 = adminFlowPage.cR.getText();
			System.out.println(clearanceID2);
			CommonUtils.clickOnElement(adminFlowPage.firstCRcheckbox);
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.reassign);
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.reassigName);
			CommonUtils.sleep(2000);
			CommonUtils.sendKeys(adminFlowPage.reassigName, "CHANG, VICKY");
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.CHANGVICKYDropdown);
			CommonUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.reassignDialogButton);
			CommonUtils.sleep(2000);
			CucumberLogUtils.logScreenshot();
			break;
		}
	}

	public void closeOutlookWindow() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_F4);
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_F4);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);

	}

	public void verifyPendingResults() {
		JavascriptUtils.scrollIntoView(adminFlowPage.clearanceRequestID);
		List<WebElement> pending = WebDriverUtils.webDriver.findElements(By.xpath("//td[8]"));
		for (WebElement each : pending) {
			if (each.getText().contains("Submitted for Verification")) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
	}

	public void verifyInflightResults() {
		JavascriptUtils.scrollIntoView(adminFlowPage.clearanceRequestID);
		List<WebElement> inflight = WebDriverUtils.webDriver.findElements(By.xpath("//td[8]"));
		for (byte i = 17; i < inflight.size(); i++) {
			if (inflight.get(i).getText().contains("Under Review")) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
	}

	public void verifyCompletedResults() {
		JavascriptUtils.scrollIntoView(adminFlowPage.clearanceRequestID);
		List<WebElement> pending = WebDriverUtils.webDriver.findElements(By.xpath("//td[8]"));
		for (WebElement each : pending) {
			if (each.getText().contains("Submitted for Verification")) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}
	}

	public boolean verifyElementAbsent(String locator) throws Exception {
		WebElement element = WebDriverUtils.webDriver.findElement(By.xpath(locator));
		if (element.isEnabled()) {
			System.out.println("Element is enabled");
		} else {
			System.out.println("Element is disabled");
		}
		return false;
	}
	
	public void loginasUser(String user)  {
	if (user.equals("Admin")) {
		dcegLogin("GEOFFREY_TOBIAS");
		CucumberLogUtils.logScreenshot();

	} else if (user.equals("Branch chief")) {
		dcegLogin("CHRISTIAN_ABNET");
		CucumberLogUtils.logScreenshot();

	} else if (user.equals("Division director")) {
		dcegLogin("STEPHEN_CHANOCK");
		CucumberLogUtils.logScreenshot();

	} else if (user.equals("Program director")) {
		dcegLogin("MONTSERRAT_GARCIA-CLOSAS");
		CucumberLogUtils.logScreenshot();
	}
}
	public void submitCLrequest() {
		CommonUtils.clickOnElement(createCRPage.createClearanceRequestButton);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.casDropdown);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.genProgramAdministration);
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(createCRPage.requesterField, "Albanes");
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.albanesDemetrius);
		CommonUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.sendKeys(createCRPage.submissionTitleField,"Test submission title");
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(createCRPage.abstractField, "test abstract");
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.publication);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.publicationDropdown);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.originJournlPublicationDropdown);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.nihRightConfirm);
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(createCRPage.journalField, "JNCI");
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.publisherCredibilityConfirm);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.publisherCredibilityConfirm);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.genomicDataGenerationConfirm);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.labResourcesDeny);
		CommonUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(createCRPage.dataSharingPlanPublication);
		CommonUtils.clickOnElement(createCRPage.dataSharingPlanPublication);
		CommonUtils.sleep(5000);
		CucumberLogUtils.logScreenshot();
		flowStepsImplementation.uploadDataSharing();
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.employeeInventionChoice);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.selectAgentNo);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.helixBiowulfYES);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.btrisYES);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.dualUseNO);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.highProfileYES);
		CommonUtils.sleep(2000);
		CommonUtils.sendKeys(createCRPage.authorsField, "test authors");
		CommonUtils.sleep(2000);
		JavascriptUtils.clickByJS(createCRPage.submitForReview);
		CommonUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.sleep(5000);
	}
}