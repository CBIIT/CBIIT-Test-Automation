package ServiceNow.ATO.Steps;

import org.openqa.selenium.support.PageFactory;

import com.nci.automation.utils.EncryptionUtils;
import com.nci.automation.web.ConfUtils;

import ServiceNow.ATO.Pages.BasePage;
import ServiceNow.ATO.Pages.CommonPage;
import ServiceNow.ATO.Pages.LoginPage;
import ServiceNow.ATO.Pages.NewProjectPage;
import ServiceNow.ATO.StepsImplementation.LoginStepsImpl;
import ServiceNow.ATO.Utils.Constants;
import ServiceNow.ATO.Utils.DriverObjectFactory;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	private Scenario scenario;
	private LoginStepsImpl loginStepsImpl;
	private CommonPage commonPage;
	private BasePage basePage;
	private NewProjectPage newProjectPage;
	
	@Before
	public void before() {
		this.loginStepsImpl = new LoginStepsImpl();
		this.basePage = PageFactory.initElements(DriverObjectFactory.getWebDriver(), BasePage.class);
		this.commonPage = PageFactory.initElements(DriverObjectFactory.getWebDriver(), CommonPage.class);
		this.newProjectPage = PageFactory.initElements(DriverObjectFactory.getWebDriver(), NewProjectPage.class);
	}
  
	@Given("User opens nih application in browser")
	public void openApp() {
		loginStepsImpl.openApp();
	}
	
	@Given("User opens ATO application in browser")
	public void openATOApp() {
		loginStepsImpl.openApp();
	}
	
	@Given("User opens fast ato app in browser")
	public void openServiceApp( ) {
		loginStepsImpl.openServiceApp();
	}
	
	@When("User will login to ato application") 
	public void login() throws Exception {
		if(loginStepsImpl.isLoginButtonDisplayed()) {
			loginStepsImpl.clckOnLoginButton();
			loginStepsImpl.enterUsername(ConfUtils.getProperty("Username"));
			String decyptedPass=EncryptionUtils.decrypt(ConfUtils.getProperty("Password"));
			loginStepsImpl.enterPassword(decyptedPass);
			//loginPage.enterUsername(ConfigFileReader.getConfigFileReader().getUserName());
			//loginPage.enterPassword(ConfigFileReader.getConfigFileReader().getPassword());
			basePage.captureScreenshot("Before Login");
			loginStepsImpl.clickOnSignInButton();
		}
		
		
	}
	
	@When("User will login to the application as \"([^\"]*)\" user")
	public void loginByUsername(String username) throws InterruptedException {
		loginStepsImpl.clckOnLoginButton();
		Thread.sleep(3000);
		loginStepsImpl.enterUsername(username);
		loginStepsImpl.enterPassword(Constants.passwords.get(username));
		basePage.captureScreenshot("Before Login");
		loginStepsImpl.clickOnSignInButton();
	}
	
	@Given("User will login to the fast ato application")
	public void loginToFastAto(String userName) throws Exception{
		loginStepsImpl.openServiceApp();
//		commonPage.clickOnLoginInToGetStartedButton();
//		Thread.sleep(3000);
//		loginPage.enterUsername(userName);
//		loginPage.enterPassword(Constants.passwords.get(userName));
//		basePage.captureScreenshot("Before Login");
//		loginPage.clickOnSignInButton();
	}
	
	@Then("User clicks on {string} in header menu")
	public void clickOnHeaderMenu(String menu) throws InterruptedException {
		loginStepsImpl.clickOnHeaderMenu(menu);
		basePage.captureScreenshot("Inside "+menu+" Menu");
	}
	
	@Then("User filters value as {string}")
	public void filtersValueAs(String value) {
		loginStepsImpl.setFilterValue(value);
	}
	
	@Then("User clicks on {string} package")
	public void clickOnAllPackage(String name) throws InterruptedException {
		loginStepsImpl.clickOnLeftSideMenuItem(name);
		basePage.captureScreenshot("Clicking on "+name+" menu item");
	}
	
	@Then("User click on {string} button")
	public void clickOnButton(String btnName) {
		basePage.captureScreenshot("Before clicking on button "+btnName);
		loginStepsImpl.clickOnButton(btnName);
		basePage.captureScreenshot("After clicking on button "+btnName);
	}
	
	@Then("User click on {string} button in iframe")
	public void click_on_button_in_iframe(String btnName) throws InterruptedException {
		basePage.captureScreenshot("Before clicking on button "+btnName);
		loginStepsImpl.clickOnButtonInIframe(btnName);
		
	}
	
	
	
}
