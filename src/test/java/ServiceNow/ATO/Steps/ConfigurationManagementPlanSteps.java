package ServiceNow.ATO.Steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.support.PageFactory;

import ServiceNow.ATO.Pages.BasePage;
import ServiceNow.ATO.Pages.CommonPage;
import ServiceNow.ATO.Pages.ConfigurationManagementPlanPage;
import ServiceNow.ATO.StepsImplementation.ConfigurationManagementPlanStepsImpl;
import ServiceNow.ATO.Utils.CommonUtils;
import ServiceNow.ATO.Utils.DriverObjectFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ConfigurationManagementPlanSteps {

	private Scenario scenario;
	private ConfigurationManagementPlanStepsImpl configurationManagementPlanStepsImpl;
	private CommonPage commonPage;
	private BasePage basePage;
	
	@Before
	public void before() {
		this.configurationManagementPlanStepsImpl = new ConfigurationManagementPlanStepsImpl();
		this.commonPage = PageFactory.initElements(DriverObjectFactory.getWebDriver(), CommonPage.class);
		this.basePage = PageFactory.initElements(DriverObjectFactory.getWebDriver(), BasePage.class);
	}
	
	@When("User adds new configuration item")
	public void addNewConfiguration() throws Exception{
		commonPage.clickOnNewButton();
		CommonUtils.waitBrowser(2000);
		configurationManagementPlanStepsImpl.enterName("test name");
		configurationManagementPlanStepsImpl.enterAssetTag("Test asset tag");
		configurationManagementPlanStepsImpl.enterCategory("Test category");
		configurationManagementPlanStepsImpl.clickOnSubmit();

	}
	
	
	@When("User adds new system contacts")
	public void addNewSystemContacts() throws Exception {
		CommonUtils.waitBrowser(4000);
		configurationManagementPlanStepsImpl.clickOnNewButton();
		CommonUtils.waitBrowser(2000);
		configurationManagementPlanStepsImpl.selectContact("Satya Gugulothu");
		configurationManagementPlanStepsImpl.selectRole("Data owner");
		configurationManagementPlanStepsImpl.clickOnSubmit();
	}
}