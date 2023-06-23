package ServiceNow.ATO.Steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.support.PageFactory;

import ServiceNow.ATO.Pages.BasePage;
import ServiceNow.ATO.Pages.CommonPage;
import ServiceNow.ATO.Pages.ContingencyPlanPage;
import ServiceNow.ATO.StepsImplementation.ContingencyPlanStepsImpl;
import ServiceNow.ATO.Utils.DriverObjectFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContingencyPlanSteps {
	private Scenario scenario;
	private ContingencyPlanStepsImpl contingencyPlanStepsImpl;
	private CommonPage commonPage;
	private BasePage basePage;
	
	@Before
	public void before() {
		this.contingencyPlanStepsImpl = new ContingencyPlanStepsImpl();
		this.commonPage = PageFactory.initElements(DriverObjectFactory.getWebDriver(), CommonPage.class);
		this.basePage = PageFactory.initElements(DriverObjectFactory.getWebDriver(), BasePage.class);
	}
	
	@When("User enters contingency plan data")
	public void enterContingencyPlanData() {
		contingencyPlanStepsImpl.enterContingencyPlanData();
	}
	
	@When("User fills line of succession form")
	public void fillLineOfSuccession() {
		contingencyPlanStepsImpl.selectFirstContact("Satya Gugulothu");
		contingencyPlanStepsImpl.selectSecondContact("Satya Das");
		contingencyPlanStepsImpl.selectThirdContact("Satya C");
	}
	
	
}