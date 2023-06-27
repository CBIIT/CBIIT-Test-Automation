package ServiceNow.ATO.Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.nci.automation.common.QcTestResult;
import com.nci.automation.common.ScenarioContext;
import com.nci.automation.utils.MiscUtils;
import com.nci.automation.web.ConfUtils;
import com.nci.automation.web.WebDriverUtils;
import com.nci.automation.xceptions.TestingException;

import ServiceNow.ATO.Pages.BasePage;
import ServiceNow.ATO.Pages.CommonPage;
import ServiceNow.ATO.Utils.DriverObjectFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonSteps {
	private Scenario scenario;
	private CommonPage commonPage;
	private BasePage basePage;

	@Before
	public void before() {
		this.commonPage = PageFactory.initElements(DriverObjectFactory.getWebDriver(), CommonPage.class);
		this.basePage = PageFactory.initElements(DriverObjectFactory.getWebDriver(), BasePage.class);
	}

	@When("User clicks on \"([^\"]*)\" tab")
	public void clickOnTab(String tabName) {
		commonPage.clickOnTabByName(tabName);
	}

	@When("User clicks on \"([^\"]*)\" tab of fast ato")
	public void clickOnFastAtoTab(String tabName) {
		commonPage.clickOnTabOnFastAto(tabName);
	}

	@When("User clicks on update button")
	public void clickOnUpdateButton() {
		commonPage.clickOnUpdateButton();
	}

	@When("User clicks on new button to add role")
	public void clickOnNewButton() {
		commonPage.clickOnNewButton();
	}

	@When("User clicks on save button")
	public void clickOnSaveButton() {
		commonPage.clickOnSaveButton();
	}

	@Then("Switch to iframe id {string}")
	public void frameidSwitch(String frameId) {
		commonPage.switchToFrme(frameId);
	}

	@Then("Check fips is under aanda review")
	public void validateAAReview() throws Exception {
		
		String status = commonPage.getText(By.xpath("//a[text()='FIPS199']/parent::td/following-sibling::td[2]"));
		if (!status.equals("Pending A&A Review")) {
			throw new Exception("FOR FIPS199 expected value was Pending A&A Review but found=>" + status);
		}
	}

	@When("User clicks on save button without frame")
	public void clickOnSaveButtonNonFrame() throws InterruptedException {
		try {
			commonPage.clickOnSaveButtonNonFrame();
		} catch (Exception e) {
			commonPage.clickOnButtonInIframe("Save");
		}
	}

	@When("User clicks on submit button")
	public void clickOnSubmitButton() {
		basePage.captureScreenshot("Before submit");
		commonPage.clickOnSubmitButton();
	}
	
	@When("User clicks submit button")
	public void clickSubmitButton() {
		basePage.captureScreenshot("Before submit");
		commonPage.clickSubmitButton();
	}

	@When("User clicks on cancel ato button")
	public void clickOnCancleAtoButton() {
		commonPage.clickOnCancelAtoButton();
	}

	@When("User clicks on login to get started button")
	public void clickOnLoginToGetStartedButton() {
		commonPage.clickOnLoginInToGetStartedButton();
	}

	@After
	public void genericTearDown(Scenario s) throws TestingException {
		System.out.println("Inside After");
		DriverObjectFactory.closeDriver();
	}
}