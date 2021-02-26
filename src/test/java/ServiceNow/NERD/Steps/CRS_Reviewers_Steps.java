package ServiceNow.NERD.Steps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import appsCommon.PageInitializer;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CRS_Reviewers_Steps extends PageInitializer {

	@Given("a CRS Reviewer is on the NERD Knowledge Base page")
	public void a_CRS_Reviewer_is_on_the_NERD_Knowledge_Base_page() throws TestingException {
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("NERD"));
		CucumberLogUtils.logScreenShot();
		loginImpl.loginToITrust();
		MiscUtils.sleep(2000);
		CucumberLogUtils.logScreenShot();
		JavascriptExecutor js = (JavascriptExecutor) WebDriverUtils.webDriver;
		js.executeScript("window.open('about:blank','_blank');");
		String mainPageWindow = WebDriverUtils.webDriver.getWindowHandle();
		Set<String> allWindowHandles = WebDriverUtils.webDriver.getWindowHandles();
		for (String nativeViewWindow : allWindowHandles) {
			WebDriverUtils.webDriver.switchTo().window(nativeViewWindow);
		}
		MiscUtils.sleep(3000);
		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("nativeview"));
		MiscUtils.sleep(2000);
		WebDriverUtils.webDriver.findElement(By.linkText("Native View")).click();
		MiscUtils.sleep(5000);
		nativeViewDashPage.clickUserDropDown();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateUserLink();
		MiscUtils.sleep(2000);
		nativeViewDashPage.clickImpersonateSearchDD();
		MiscUtils.sleep(3000);
		nativeViewDashPage.enterTextImpersntSearchBox("Grace Liou");
		MiscUtils.sleep(5000);
		WebDriverUtils.webDriver.switchTo().window(mainPageWindow);
		WebDriverUtils.webDriver.navigate().refresh();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.crsKnowledgeManagementSystemHomePageNERDButton.click();
		MiscUtils.sleep(5000);
		nerdCrsKnowledgeDatabaseSubmissionsPage.nerdSpecialTopicsDD.click();
	}

	@Given("clicks the {string} filter")
	public void clicks_the_filter(String string) {
		nerdCrsKnowledgeDatabaseSubmissionsPage.nerdSpecialTopicsDD.click();
		MiscUtils.sleep(1000);	
	}

	@Then("the field options are {string}, {string}, {string},{string},{string},{string},{string},{string},{string},{string},{string}, {string}, {string}, {string}, and {string}")
	public void the_field_options_are_and(String All, String BigdataDataSharing, String COVID19, String Communications, String EarlyDetection, String Metastatic, String MinorityhealthHealthdisparities, String Moonshot, String Partnerships, String Pediatric, String Rare, String SexGenderdifferences, String TrainingWorkforcedevelopment, String Womenshealth, String Workforce) { 
		System.out.println(nerdCrsKnowledgeDatabaseSubmissionsPage.nerdSpecialTopicsDDvalues);
	}
}