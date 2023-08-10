package CustomBusiness.DCEG.StepsImplementation;

import CustomBusiness.DCEG.Steps.HooksSteps;
import appsCommon.PageInitializer;
//import cucumber.api.java.en.When;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.ConfUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

public class FlowStepsImplementation extends PageInitializer {

	public void dcegLoginMadigan() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("dcegMadigan"));
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
		iTrustloginPage.enterPassword("nekrashevicha2Password");
		MiscUtils.sleep(3000);
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(3000);
		MiscUtils.sleep(5000);
	}

	public void dcegLoginDemetrius() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("dcegDemetrius"));
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
		iTrustloginPage.enterPassword("nekrashevicha2Password");
		MiscUtils.sleep(3000);
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(3000);
		MiscUtils.sleep(5000);
	}
	public void dcegLoginChanock() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("dcegChanock"));
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
		iTrustloginPage.enterPassword("nekrashevicha2Password");
		MiscUtils.sleep(3000);
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(3000);
		MiscUtils.sleep(5000);
	}

	public void dcegLoginTobias() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("dcegTobias"));
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
		iTrustloginPage.enterPassword("nekrashevicha2Password");
		MiscUtils.sleep(3000);
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(3000);
		MiscUtils.sleep(5000);
	}
	
	public void dcegLogin(String UserName) throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl(UserName));
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "Username");
		iTrustloginPage.enterPassword("Password");
		MiscUtils.sleep(3000);
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(3000);
		MiscUtils.sleep(5000);
	}
	
	public void dcegLoginHolmes() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("dcegHolmes"));
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
		iTrustloginPage.enterPassword("nekrashevicha2Password");
		MiscUtils.sleep(3000);
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(3000);
		MiscUtils.sleep(5000);
	}
	
	public void dcegLoginBerrington() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("dcegBerrington"));
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
		iTrustloginPage.enterPassword("nekrashevicha2Password");
		MiscUtils.sleep(3000);
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(3000);
		MiscUtils.sleep(5000);
	}
	public void dcegLoginGarcia() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("dcegGarcia"));
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
		iTrustloginPage.enterPassword("nekrashevicha2Password");
		MiscUtils.sleep(3000);
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(3000);
		MiscUtils.sleep(5000);
	}
	
	public void dcegLoginAbnet() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("dcegAbnet"));
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
		iTrustloginPage.enterPassword("nekrashevicha2Password");
		MiscUtils.sleep(3000);
		iTrustloginPage.clickSignInButton();
		MiscUtils.sleep(3000);
		MiscUtils.sleep(5000);
	}
	public void checkButton() {
		String str = WebDriverUtils.webDriver.findElement(By.className("clearanceRequestTypeRadio"))
				.getAttribute("checked");
		if (str.equalsIgnoreCase("true")) {
			System.out.println("Checkbox selected");
		}
	}

	public void uploadManuscript() {
		MiscUtils.sleep(3000);
		WebElement uploadFile = WebDriverUtils.getWebDriver().findElement(By.xpath("//input[@name='upload']"));
		MiscUtils.sleep(3000);
		uploadFile.sendKeys("C:\\Users\\zamant2\\Desktop\\TEST-DATA\\Manuscript.docx");
		CucumberLogUtils.logScreenshot();
		MiscUtils.sleep(3000);
	}

	public void uploadDataSharing() {
		MiscUtils.sleep(3000);
		WebElement uploadFile = WebDriverUtils.getWebDriver().findElement(By.xpath("//input[@name='upload']"));
		MiscUtils.sleep(3000);
		uploadFile.sendKeys("C:\\Users\\zamant2\\Desktop\\TEST-DATA\\DataSharingPLan.pdf");
		CucumberLogUtils.logScreenshot();
		MiscUtils.sleep(3000);
	}

	public void uploadAbstract() {
		MiscUtils.sleep(3000);
		WebElement uploadFile = WebDriverUtils.getWebDriver().findElement(By.xpath("//input[@name='upload']"));
		MiscUtils.sleep(3000);
		uploadFile.sendKeys("C:\\Users\\zamant2\\Desktop\\TEST-DATA\\Abstract.docx");
		CucumberLogUtils.logScreenshot();
		MiscUtils.sleep(3000);
	}

	public void selectRole(String role) {
		switch (role) {
		case "Reviewer":
			CommonUtils.clickOnElement(adminFlowPage.dropdownRole);
			MiscUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.selectAllCheckmark);
			MiscUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.reviewerCheckmark);
			MiscUtils.sleep(2000);
			break;
		case "Requestor":
			CommonUtils.clickOnElement(adminFlowPage.dropdownRole);
			MiscUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.selectAllCheckmark);
			MiscUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.requestorCheckmark);
			MiscUtils.sleep(2000);
			break;
		case "Submitter":
			CommonUtils.clickOnElement(adminFlowPage.anyDrop);
			MiscUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.checkedRequesterMark);
			MiscUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.submitterCheckmark);
			MiscUtils.sleep(2000);
			break;
		}
	}

	public void selectDropDown(String role) {
		switch (role) {
		case "DOGBE, NADIA":
			String clearanceID = adminFlowPage.cR.getText();
			System.out.println(clearanceID);
			CommonUtils.clickOnElement(adminFlowPage.firstCRcheckbox);
			MiscUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.reassign);
			MiscUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.reassigName);
			MiscUtils.sleep(2000);
			CommonUtils.sendKeys(adminFlowPage.reassigName, "DOGBE, NADIA");
			MiscUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.dogbeNadiaDropdown);
			MiscUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.reassignDialogButton);
			MiscUtils.sleep(2000);
			CucumberLogUtils.logScreenshot();
			break;
		case "HOLMES-LILLIE, SADIE":
			String clearanceID1 = adminFlowPage.cR.getText();
			System.out.println(clearanceID1);
			CommonUtils.clickOnElement(adminFlowPage.firstCRcheckbox);
			MiscUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.reassign);
			MiscUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.reassigName);
			MiscUtils.sleep(2000);
			CommonUtils.sendKeys(adminFlowPage.reassigName, "HOLMES-LILLIE, SADIE");
			MiscUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.HOLMESSADIEDropdown);
			MiscUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.reassignDialogButton);
			MiscUtils.sleep(2000);
			CucumberLogUtils.logScreenshot();
			break;
		case "CHANG, VICKY":
			String clearanceID2 = adminFlowPage.cR.getText();
			System.out.println(clearanceID2);
			CommonUtils.clickOnElement(adminFlowPage.firstCRcheckbox);
			MiscUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.reassign);
			MiscUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.reassigName);
			MiscUtils.sleep(2000);
			CommonUtils.sendKeys(adminFlowPage.reassigName, "CHANG, VICKY");
			MiscUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.CHANGVICKYDropdown);
			MiscUtils.sleep(2000);
			CommonUtils.clickOnElement(adminFlowPage.reassignDialogButton);
			MiscUtils.sleep(2000);
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
	
	public void loginasUser(String user) throws TestingException {
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
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.casDropdown);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.genProgramAdministration);
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(createCRPage.requesterField, "Albanes");
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.albanesDemetrius);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.sendKeys(createCRPage.submissionTitleField,"Test submission title");
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(createCRPage.abstractField, "test abstract");
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.publication);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.publicationDropdown);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.originJournlPublicationDropdown);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.nihRightConfirm);
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(createCRPage.journalField, "JNCI");
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.publisherCredibilityConfirm);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.publisherCredibilityConfirm);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.genomicDataGenerationConfirm);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.labResourcesDeny);
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(createCRPage.dataSharingPlanPublication);
		CommonUtils.clickOnElement(createCRPage.dataSharingPlanPublication);
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenshot();
		flowStepsImplementation.uploadDataSharing();
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.employeeInventionChoice);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.selectAgentNo);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.helixBiowulfYES);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.btrisYES);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.dualUseNO);
		MiscUtils.sleep(2000);
		CommonUtils.clickOnElement(createCRPage.highProfileYES);
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(createCRPage.authorsField, "test authors");
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(createCRPage.submitForReview);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenshot();
		MiscUtils.sleep(5000);
	}
}