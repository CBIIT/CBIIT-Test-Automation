package ServiceNow.ATO.Steps;

import org.openqa.selenium.support.PageFactory;

import ServiceNow.ATO.Pages.CommonPage;
import ServiceNow.ATO.Utils.DriverObjectFactory;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
<<<<<<< HEAD
import cucumber.api.java.en.Then;
=======
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
import cucumber.api.java.en.When;

public class CommonSteps {
	private Scenario scenario;
	private CommonPage commonPage;
<<<<<<< HEAD

=======
	
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
	@Before
	public void before() {
		this.commonPage = PageFactory.initElements(DriverObjectFactory.getWebDriver(), CommonPage.class);
	}
<<<<<<< HEAD

=======
	
	
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
	@When("User clicks on \"([^\"]*)\" tab")
	public void clickOnTab(String tabName) {
		commonPage.clickOnTabByName(tabName);
	}
<<<<<<< HEAD

=======
	
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
	@When("User clicks on \"([^\"]*)\" tab of fast ato")
	public void clickOnFastAtoTab(String tabName) {
		commonPage.clickOnTabOnFastAto(tabName);
	}
<<<<<<< HEAD

=======
	
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
	@When("User clicks on update button")
	public void clickOnUpdateButton() {
		commonPage.clickOnUpdateButton();
	}
<<<<<<< HEAD

=======
	
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
	@When("User clicks on new button to add role")
	public void clickOnNewButton() {
		commonPage.clickOnNewButton();
	}
<<<<<<< HEAD

=======
	
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
	@When("User clicks on save button")
	public void clickOnSaveButton() {
		commonPage.clickOnSaveButton();
	}
	
<<<<<<< HEAD
	@Then("Switch to iframe id {string}")
	public void frameidSwitch(String frameId) {
		commonPage.switchToFrme(frameId);
	}

	@When("User clicks on save button without frame")
	public void clickOnSaveButtonNonFrame() throws InterruptedException {
		try {
			commonPage.clickOnSaveButtonNonFrame();
		} catch (Exception e) {
			commonPage.clickOnButtonInIframe("Save");
		}
	}

=======
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
	@When("User clicks on submit button")
	public void clickOnSubmitButton() {
		commonPage.clickOnSubmitButton();
	}
<<<<<<< HEAD

=======
	
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
	@When("User clicks on cancel ato button")
	public void clickOnCancleAtoButton() {
		commonPage.clickOnCancelAtoButton();
	}
<<<<<<< HEAD

=======
	
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8
	@When("User clicks on login to get started button")
	public void clickOnLoginToGetStartedButton() {
		commonPage.clickOnLoginInToGetStartedButton();
	}

}
