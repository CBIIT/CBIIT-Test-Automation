package ServiceNow.ATO.Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import ServiceNow.ATO.Pages.CommonPage;
import ServiceNow.ATO.Utils.DriverObjectFactory;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CommonSteps {
	private Scenario scenario;
	private CommonPage commonPage;

	@Before
	public void before() {
		this.commonPage = PageFactory.initElements(DriverObjectFactory.getWebDriver(), CommonPage.class);
	}

	@When("User clicks on \"([^\"]*)\" tab")
	public void clickOnTab(String tabName) {
		commonPage.clickOnTabByName(tabName);
	}

	@When("User clicks on \"([^\"]*)\" tab of fast ato")
	public void clickOnFastAtoTab(String tabName) {
		commonPage.clickOnTabOnFastAto(tabName);
	}

	@Then("user enters comment in a {string} package")
	public void enterDataIntoPackage(String packageName) {
		commonPage.clickOnElement(By.xpath(
				String.format("//div[@ng-click='openPackage(package)' and contains(text(),'%s')]", packageName)));
		commonPage.clickOnElement(By.xpath("//span[@class=\"ng-scope\" and text()='Verify Details →']"));
		commonPage.clickOnElement(By.xpath("//div[@ng-click=\"certifyAndSubmit()\"]"));
		commonPage.clickOnElement(By.xpath("//span[@class=\"ng-scope\" and text()='Verify Details →']"));
		commonPage.clickOnElement(By.xpath("//a[text()='I need to edit or update the FIPS 199 categorization']"));
		commonPage.setTextInLocator(By.tagName("textarea"), "Testing");
		commonPage.clickOnElement(By.xpath("//div[@ng-click=\"requestUpdate()\"]"));
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
		commonPage.clickOnSubmitButton();
	}

	@When("User clicks on cancel ato button")
	public void clickOnCancleAtoButton() {
		commonPage.clickOnCancelAtoButton();
	}

	@When("User clicks on login to get started button")
	public void clickOnLoginToGetStartedButton() {
		commonPage.clickOnLoginInToGetStartedButton();
	}

}
