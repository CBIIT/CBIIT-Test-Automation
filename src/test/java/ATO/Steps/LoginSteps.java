package ATO.Steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.support.PageFactory;
import ATO.Pages.BasePage;
import ATO.Pages.CommonPage;
import ATO.Pages.NewProjectPage;
import ATO.StepsImplementation.LoginStepsImpl;
import ATO.Utils.Constants;
import ATO.Utils.DriverObjectFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

	@Given("User opens ATO application in browser")
	public void openATOApp() {
		loginStepsImpl.openApp();
	}

	@Given("User opens Ato application url {string}")
	public void openATOAppWithUrl(String url) throws InterruptedException {
		Thread.sleep(5000);
		loginStepsImpl.openApp(url);
	}

	@Given("User opens fast ato app in browser")
	public void openServiceApp() {
		loginStepsImpl.openServiceApp();
	}

	@When("User will login to ato application")
	public void login() throws Exception {
		if (loginStepsImpl.isLoginButtonDisplayed()) {
			loginStepsImpl.clckOnLoginButton();
		}
//		loginStepsImpl.enterUsername(ConfUtils.getProperty("sgugulothuUsername"));
//		String decyptedPass = EncryptionUtils.decrypt(ConfUtils.getProperty("sgugulothuPassword"));
		// loginStepsImpl.enterUsername(ConfUtils.getProperty("Username"));
		// decyptedPass=EncryptionUtils.decrypt(ConfUtils.getProperty("Password"));
//		loginStepsImpl.enterPassword(decyptedPass);
		// loginPage.enterUsername(ConfigFileReader.getConfigFileReader().getUserName());
		// loginPage.enterPassword(ConfigFileReader.getConfigFileReader().getPassword());
		loginStepsImpl.clickOnSignInButton();
	}

	/*
	 * @When("User will login to the application as \"([^\"]*)\" user") public void
	 * loginByUsername(String username) throws InterruptedException {
	 * loginStepsImpl.clckOnLoginButton(); Thread.sleep(3000);
	 * loginStepsImpl.enterUsername(username);
	 * loginStepsImpl.enterPassword(Constants.passwords.get(username));
	 * basePage.captureScreenshot("Before Login");
	 * loginStepsImpl.clickOnSignInButton(); }
	 */

//	@When("User will login to the application as \"([^\"]*)\" user")
//	public void loginByUsername(String username) throws InterruptedException, TestingException {
//		//COMPILER IS GETTING CONFUSED HERE
//		WebDriverUtils.webDriver.get(EnvUtils.getApplicationUrl("CEDCD"));
//		loginStepsImpl.clckOnLoginButton();
//		Thread.sleep(3000);
//		loginStepsImpl.enterUsername(username);
//		loginStepsImpl.enterPassword(Constants.passwords.get(username));
//		basePage.captureScreenshot("Before Login");
//		loginStepsImpl.clickOnSignInButton();
//	}

	@When("User will login to the application as \"([^\"]*)\" user into fast ato")
	public void loginByUsernameFastAto(String username) throws InterruptedException {
		loginStepsImpl.loginButtonFastAto();
		Thread.sleep(3000);
		loginStepsImpl.enterUsername(username);
		loginStepsImpl.enterPassword(Constants.passwords.get(username));
		loginStepsImpl.clickOnSignInButton();
	}

	@Given("user opens the fast ato page")
	public void accessFastAtoPage() {
		loginStepsImpl.openServiceApp();
	}

	@Then("User navigates to fast ato page and validates the header")
	public void validateFastAtoHeader() {
		loginStepsImpl.validateHeader();
	}

	@Given("User will login to the fast ato application")
	public void loginToFastAto(String userName) throws Exception {
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
		loginStepsImpl.waitForListToLoad();
	}

	@Then("User filters value as {string}")
	public void filtersValueAs(String value) {
		loginStepsImpl.setFilterValue(value);
	}

	@Then("User clicks on {string} package")
	public void clickOnAllPackage(String name) throws InterruptedException {
		loginStepsImpl.clickOnLeftSideMenuItem(name);
	}

	@Then("User click on {string} button")
	public void clickOnButton(String btnName) {
		loginStepsImpl.clickOnButton(btnName);
	}

	@Then("User click on {string} button in iframe")
	public void click_on_button_in_iframe(String btnName) throws InterruptedException {
		loginStepsImpl.clickOnButtonInIframe(btnName);
	}
}