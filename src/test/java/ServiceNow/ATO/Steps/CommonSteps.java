package ServiceNow.ATO.Steps;

import org.openqa.selenium.support.PageFactory;

import ServiceNow.ATO.Pages.CommonPage;
import ServiceNow.ATO.Utils.DriverObjectFactory;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
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
