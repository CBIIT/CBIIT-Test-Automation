package CustomBusiness.DCEG.StepsImplementation;

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
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(3000);
	}

	public void uploadDataSharing() {
		MiscUtils.sleep(3000);
		WebElement uploadFile = WebDriverUtils.getWebDriver().findElement(By.xpath("//input[@name='upload']"));
		MiscUtils.sleep(3000);
		uploadFile.sendKeys("C:\\Users\\zamant2\\Desktop\\TEST-DATA\\DataSharingPLan.pdf");
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(3000);
	}

	public void uploadAbstract() {
		MiscUtils.sleep(3000);
		WebElement uploadFile = WebDriverUtils.getWebDriver().findElement(By.xpath("//input[@name='upload']"));
		MiscUtils.sleep(3000);
		uploadFile.sendKeys("C:\\Users\\zamant2\\Desktop\\TEST-DATA\\Abstract.docx");
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(3000);
	}

	public void selectRole(String role) {
		switch (role) {
		case "Reviewer":
			CommonUtils.click(adminFlowPage.dropdownRole);
			MiscUtils.sleep(2000);
			CommonUtils.click(adminFlowPage.selectAllCheckmark);
			MiscUtils.sleep(2000);
			CommonUtils.click(adminFlowPage.reviewerCheckmark);
			MiscUtils.sleep(2000);
			break;
		case "Requestor":
			CommonUtils.click(adminFlowPage.dropdownRole);
			MiscUtils.sleep(2000);
			CommonUtils.click(adminFlowPage.selectAllCheckmark);
			MiscUtils.sleep(2000);
			CommonUtils.click(adminFlowPage.requestorCheckmark);
			MiscUtils.sleep(2000);
			break;
		case "Submitter":
			CommonUtils.click(adminFlowPage.anyDrop);
			MiscUtils.sleep(2000);
			CommonUtils.click(adminFlowPage.checkedRequesterMark);
			MiscUtils.sleep(2000);
			CommonUtils.click(adminFlowPage.submitterCheckmark);
			MiscUtils.sleep(2000);
			break;
		}
	}

	public void selectDropDown(String role) {
		switch (role) {
		case "DOGBE, NADIA":
			String clearanceID = adminFlowPage.cR.getText();
			System.out.println(clearanceID);
			CommonUtils.click(adminFlowPage.firstCRcheckbox);
			MiscUtils.sleep(2000);
			CommonUtils.click(adminFlowPage.reassign);
			MiscUtils.sleep(2000);
			CommonUtils.click(adminFlowPage.reassigName);
			MiscUtils.sleep(2000);
			CommonUtils.sendKeys(adminFlowPage.reassigName, "DOGBE, NADIA");
			MiscUtils.sleep(2000);
			CommonUtils.click(adminFlowPage.dogbeNadiaDropdown);
			MiscUtils.sleep(2000);
			CommonUtils.click(adminFlowPage.reassignDialogButton);
			MiscUtils.sleep(2000);
			CucumberLogUtils.logScreenShot();
			break;
		case "HOLMES-LILLIE, SADIE":
			String clearanceID1 = adminFlowPage.cR.getText();
			System.out.println(clearanceID1);
			CommonUtils.click(adminFlowPage.firstCRcheckbox);
			MiscUtils.sleep(2000);
			CommonUtils.click(adminFlowPage.reassign);
			MiscUtils.sleep(2000);
			CommonUtils.click(adminFlowPage.reassigName);
			MiscUtils.sleep(2000);
			CommonUtils.sendKeys(adminFlowPage.reassigName, "HOLMES-LILLIE, SADIE");
			MiscUtils.sleep(2000);
			CommonUtils.click(adminFlowPage.HOLMESSADIEDropdown);
			MiscUtils.sleep(2000);
			CommonUtils.click(adminFlowPage.reassignDialogButton);
			MiscUtils.sleep(2000);
			CucumberLogUtils.logScreenShot();
			break;
		case "CHANG, VICKY":
			String clearanceID2 = adminFlowPage.cR.getText();
			System.out.println(clearanceID2);
			CommonUtils.click(adminFlowPage.firstCRcheckbox);
			MiscUtils.sleep(2000);
			CommonUtils.click(adminFlowPage.reassign);
			MiscUtils.sleep(2000);
			CommonUtils.click(adminFlowPage.reassigName);
			MiscUtils.sleep(2000);
			CommonUtils.sendKeys(adminFlowPage.reassigName, "CHANG, VICKY");
			MiscUtils.sleep(2000);
			CommonUtils.click(adminFlowPage.CHANGVICKYDropdown);
			MiscUtils.sleep(2000);
			CommonUtils.click(adminFlowPage.reassignDialogButton);
			MiscUtils.sleep(2000);
			CucumberLogUtils.logScreenShot();
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
		CucumberLogUtils.logScreenShot();

	} else if (user.equals("Branch chief")) {
		dcegLogin("CHRISTIAN_ABNET");
		CucumberLogUtils.logScreenShot();

	} else if (user.equals("Division director")) {
		dcegLogin("STEPHEN_CHANOCK");
		CucumberLogUtils.logScreenShot();

	} else if (user.equals("Program director")) {
		dcegLogin("MONTSERRAT_GARCIA-CLOSAS");
		CucumberLogUtils.logScreenShot();
	}
}
	public void submitCLrequest() {
		CommonUtils.click(createCRPage.createClearanceRequestButton);
		MiscUtils.sleep(2000);
		CommonUtils.click(createCRPage.casDropdown);
		MiscUtils.sleep(2000);
		CommonUtils.click(createCRPage.genProgramAdministration);
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(createCRPage.requesterField, "Albanes");
		MiscUtils.sleep(2000);
		CommonUtils.click(createCRPage.albanesDemetrius);
		MiscUtils.sleep(1000);
		CucumberLogUtils.logScreenShot();
		CommonUtils.sendKeys(createCRPage.submissionTitleField,"Test submission title");
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(createCRPage.abstractField, "test abstract");
		MiscUtils.sleep(2000);
		CommonUtils.click(createCRPage.publication);
		MiscUtils.sleep(2000);
		CommonUtils.click(createCRPage.publicationDropdown);
		MiscUtils.sleep(2000);
		CommonUtils.click(createCRPage.originJournlPublicationDropdown);
		MiscUtils.sleep(2000);
		CommonUtils.click(createCRPage.nihRightConfirm);
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(createCRPage.journalField, "JNCI");
		MiscUtils.sleep(2000);
		CommonUtils.click(createCRPage.publisherCredibilityConfirm);
		MiscUtils.sleep(2000);
		CommonUtils.click(createCRPage.publisherCredibilityConfirm);
		MiscUtils.sleep(2000);
		CommonUtils.click(createCRPage.genomicDataGenerationConfirm);
		MiscUtils.sleep(2000);
		CommonUtils.click(createCRPage.labResourcesDeny);
		MiscUtils.sleep(2000);
		JavascriptUtils.scrollIntoView(createCRPage.dataSharingPlanPublication);
		CommonUtils.click(createCRPage.dataSharingPlanPublication);
		MiscUtils.sleep(5000);
		CucumberLogUtils.logScreenShot();
		flowStepsImplementation.uploadDataSharing();
		MiscUtils.sleep(2000);
		CommonUtils.click(createCRPage.employeeInventionChoice);
		MiscUtils.sleep(2000);
		CommonUtils.click(createCRPage.selectAgentNo);
		MiscUtils.sleep(2000);
		CommonUtils.click(createCRPage.helixBiowulfYES);
		MiscUtils.sleep(2000);
		CommonUtils.click(createCRPage.btrisYES);
		MiscUtils.sleep(2000);
		CommonUtils.click(createCRPage.dualUseNO);
		MiscUtils.sleep(2000);
		CommonUtils.click(createCRPage.highProfileYES);
		MiscUtils.sleep(2000);
		CommonUtils.sendKeys(createCRPage.authorsField, "test authors");
		MiscUtils.sleep(2000);
		JavascriptUtils.clickByJS(createCRPage.submitForReview);
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		MiscUtils.sleep(5000);
	}
}