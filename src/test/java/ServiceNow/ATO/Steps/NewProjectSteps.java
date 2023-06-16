package ServiceNow.ATO.Steps;

import io.cucumber.java.Before;
import org.openqa.selenium.support.PageFactory;

import ServiceNow.ATO.Pages.BasePage;
import ServiceNow.ATO.Pages.NewProjectPage;
import ServiceNow.ATO.StepsImplementation.NewProjectStepsImpl;
import ServiceNow.ATO.Utils.DriverObjectFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewProjectSteps {
	private NewProjectStepsImpl newProjectStepsImpl;
	private BasePage basePage;

	@Before
	public void before() {
		this.newProjectStepsImpl = new NewProjectStepsImpl();
		this.basePage = PageFactory.initElements(DriverObjectFactory.getWebDriver(), BasePage.class);
	}

	@Then("User selects the system as {string}")
	public void selectSystem(String system) throws InterruptedException {
		newProjectStepsImpl.selectSystem(system);
	}

	@Then("User selects the Application hosting solution as {string}")
	public void selectApplicationHost(String hostigSolution) {
		newProjectStepsImpl.selectApplicationHosting(hostigSolution);
		basePage.captureScreenshot("System Information app hot solution");

	}

	@Then("Goto dates tab and set approver name as {string}")
	public void setApproverName(String name) throws Exception {
		try {
			newProjectStepsImpl.clickOnTab("Dates");
			newProjectStepsImpl.setDates();
			newProjectStepsImpl.setValue(name);
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("User clicks on the contacts tab")
	public void clickOnContactsTab() throws InterruptedException {
		newProjectStepsImpl.clickOnTab("Contacts");
		basePage.captureScreenshot("contact tab");
	}

	@Then("go back and sort packages")
	public void goBack_And_Sort_packages() {
		newProjectStepsImpl.gobackToAllPackages();
		//newProjectStepsImpl.sortPackages();
		// button[@data-original-title="Back"]
	}

	@Then("Sort packages")
	public void sort_packages() throws InterruptedException {
		
		newProjectStepsImpl.sortPackages();
	}
	
	@Then("goto first package and click on verify button")
	public void verifyPackageAfterFormEdit() {
		try {
			newProjectStepsImpl.clickOnFIrstPackage();
			
			newProjectStepsImpl.verifyChange();
		}catch(Exception e) {
			throw e;
		}
	}
	
	@Then("Goto first package and delete it")
	public void deletePackage() {
		try {
			newProjectStepsImpl.clickOnFIrstPackage();
			newProjectStepsImpl.deletePackage();
		}catch(Exception e) {
			throw e;
		}
	}

	@Then("complete the pending approvals for first package")
	public void completeAASignOff() {
		newProjectStepsImpl.clickOnFIrstPackage();
		newProjectStepsImpl.verifyAAReviewForFIPSFOrm();
		newProjectStepsImpl.verifyAAReviewForeAuthenticationFOrm();
		newProjectStepsImpl.validatePendingAAForms();
		newProjectStepsImpl.signAto();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//newProjectStepsImpl.openALlFormsAndUpdateAASignOff();
	}

	@Then("CLick On Renew Button")
	public void clickOnRenewButton() {
		newProjectStepsImpl.renewPackage();
	}
	
	@Then("Validate the status of the first package as {string}")
	public void verifyStatus(String expectedStatus) throws Exception {
		try {
			if (!expectedStatus.equalsIgnoreCase(newProjectStepsImpl.getStatus())) {
				throw new Exception(
						"Expected status was==>" + expectedStatus + " but found==>" + newProjectStepsImpl.getStatus());
			}
		} catch (Exception e) {
			throw e;
		}
	}

	@Then("User selects the dates")
	public void selectDates() throws InterruptedException {
		newProjectStepsImpl.setDate();
		basePage.captureScreenshot("Dates tab data");
	}
	
	@Then("User enters the dates")
	public void enterDates() throws InterruptedException {
		newProjectStepsImpl.enterDates();
		basePage.captureScreenshot("Dates tab data");
	}

	@Then("User enters the note as {string}")
	public void enterNotes(String notes) throws InterruptedException {
		newProjectStepsImpl.setNotes(notes);
	}

	@Then("Set approved By to {string}")
	public void setApprovedBy(String approverName) throws InterruptedException {
		Thread.sleep(20000);
		newProjectStepsImpl.setValue(approverName);

	}

	@Then("User click on {string} package code")
	public void clickOnPackage(String packageCode) throws InterruptedException {
		if (packageCode.equals("first") || packageCode.isEmpty()) {
			newProjectStepsImpl.getFirstPackageCode();
			newProjectStepsImpl.clickOnPackageCode(NewProjectPage.packageCode);
		}
	}

	@Then("User click on Ok button in the popup")
	public void clickOnOkbutton() throws InterruptedException {
		newProjectStepsImpl.clickPopUpOkButton();
	}
}