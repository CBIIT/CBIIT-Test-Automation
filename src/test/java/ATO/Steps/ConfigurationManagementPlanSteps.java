package ATO.Steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.support.PageFactory;
import ATO.Pages.BasePage;
import ATO.Pages.CommonPage;
import ATO.StepsImplementation.ConfigurationManagementPlanStepsImpl;
import ATO.Utils.CommonUtils;
import ATO.Utils.DriverObjectFactory;
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