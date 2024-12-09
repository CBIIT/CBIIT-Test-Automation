package CUSTOM_BUSINESS.DCEG.steps;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.JavascriptUtils;
import com.nci.automation.web.WebDriverUtils;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BranchAdminAdjunctOrgSteps extends PageInitializer {
	@Given("User logged in as Gitau Nancy")
	public void user_logged_in_as_Gitau_Nancy() {
		WebDriverUtils.webDriver.get("");
		iTrustloginPage.enterUsername(iTrustloginPage.userNameField, "nekrashevicha2Username");
		iTrustloginPage.enterPassword("nekrashevicha2Password");
		CommonUtils.sleep(3000);
		iTrustloginPage.clickSignInButton();
		CommonUtils.sleep(3000);
		CommonUtils.sleep(5000);
	}

	@Given("User can edit a Draft cr listed under TDRP CGB")
	public void user_can_edit_a_Draft_cr_listed_under_TDRP_CGB() {
		JavascriptUtils.clickByJS(adminFlowPage.draftClRequestStatus);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(adminFlowPage.searchButton);
		CommonUtils.sleep(4000);
		CommonUtils.clickOnElement(adminFlowPage.draftTDRPCGB);
		CommonUtils.sleep(3000);
		CommonUtils.sendKeys(adminFlowPage.journalName, "Edited journal name");
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();

	}

	@Given("User can edit a Submitted for Verification cr listed under TDRP CGB")
	public void user_can_edit_a_Submitted_for_Verification_cr_listed_under_TDRP_CGB() {
		CommonUtils.clickOnElement(adminFlowPage.searchActiveTab);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(adminFlowPage.submittedForVerificationClRequestStatus);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(adminFlowPage.searchButton);
		CommonUtils.sleep(4000);
		CommonUtils.clickOnElement(adminFlowPage.submittedForVerificationTDRPCGB);
		CommonUtils.sleep(3000);
		CommonUtils.sendKeys(adminFlowPage.journalName, "Edited journal name");
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	@Given("User can edit a Returned for Revision cr listed under TDRP CGB")
	public void user_can_edit_a_Returned_for_Revision_cr_listed_under_TDRP_CGB() {
		CommonUtils.clickOnElement(adminFlowPage.searchActiveTab);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(adminFlowPage.returnedForRevisionClRequestStatus);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(adminFlowPage.searchButton);
		CommonUtils.sleep(4000);
		CommonUtils.clickOnElement(adminFlowPage.returnedForRevisionTDRPCGB);
		CommonUtils.sleep(3000);
		CommonUtils.sendKeys(adminFlowPage.journalName, "Edited journal name");
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
	}

	@Then("User can verify that User can not operate on publications outside of their Adjunct org only-TDRP CGB")
	public void user_can_verify_that_User_can_not_on_publications_outside_of_their_Adjunct_org_only_TDRP_CGB() {
		CommonUtils.clickOnElement(adminFlowPage.publication301442TDRPCGB);
		CommonUtils.sleep(3000);
		JavascriptUtils.scrollIntoView(adminFlowPage.disabledJournalName);
		CommonUtils.sleep(2000);
		WebElement e = adminFlowPage.disabledJournalName;
		boolean button = e.isEnabled();
		if (button) {
			System.out.println(" Save Changes Button is Enabled");
		} else {
			System.out.println("Save Changes Button is Disabled");
		}
		CucumberLogUtils.logScreenshot();
	}

	@Given("User can not edit a Drafts that are not TDRP CGB")
	public void user_can_not_edit_a_Drafts_that_are_not_TDRP_CGB() {
		JavascriptUtils.clickByJS(adminFlowPage.draftClRequestStatus);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(adminFlowPage.searchButton);
		CommonUtils.sleep(4000);
		List<WebElement> entry = WebDriverUtils.webDriver.findElements(By.xpath("//td[6]"));
		for (WebElement each : entry) {
			if (each.getText().contains("TDRP CGB")) {
				System.out.println("Organization is TDRP CGB");
				List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
				for (WebElement e : view) {
					Assert.assertTrue(e.isDisplayed());
				}
				System.out.println("View button is available for data entry");

			} else {
				System.out.println("Organization is NOT TDRP CGB");
			}
		}

	}

	@Given("User can not edit a Submitted for Verification cr that is not listed under TDRP CGB")
	public void user_can_not_edit_a_Submitted_for_Verification_cr_that_is_not_listed_under_TDRP_CGB() {
		JavascriptUtils.clickByJS(adminFlowPage.searchActiveTab);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(adminFlowPage.submittedForVerificationClRequestStatus);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(adminFlowPage.searchButton);
		CommonUtils.sleep(4000);
		List<WebElement> entry = WebDriverUtils.webDriver.findElements(By.xpath("//td[6]"));
		for (WebElement each : entry) {
			if (each.getText().contains("TDRP CGB")) {
				System.out.println("Organization is TDRP CGB");
				List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
				for (WebElement e : view) {
					Assert.assertTrue(e.isDisplayed());
				}
				System.out.println("View button is available for data entry");

			} else {
				System.out.println("Organization is NOT TDRP CGB");
			}
		}
	}

	@Given("User can not edit a Returned for Revision  cr that is not listed under TDRP CGB")
	public void user_can_not_edit_a_Returned_for_Revision_cr_that_is_not_listed_under_TDRP_CGB() {
		JavascriptUtils.clickByJS(adminFlowPage.searchActiveTab);
		CommonUtils.sleep(2000);
		CommonUtils.clickOnElement(adminFlowPage.returnedForRevisionClRequestStatus);
		CommonUtils.sleep(3000);
		CucumberLogUtils.logScreenshot();
		CommonUtils.clickOnElement(adminFlowPage.searchButton);
		CommonUtils.sleep(4000);
		List<WebElement> entry = WebDriverUtils.webDriver.findElements(By.xpath("//td[6]"));
		for (WebElement each : entry) {
			if (each.getText().contains("TDRP CGB")) {
				System.out.println("Organization is TDRP CGB");
				List<WebElement> view = WebDriverUtils.webDriver.findElements(By.xpath("//a[@id='editpub']"));
				for (WebElement e : view) {
					Assert.assertTrue(e.isDisplayed());
				}
				System.out.println("View button is available for data entry");

			} else {
				System.out.println("Organization is NOT TDRP CGB");
			}
		}
	}
}
