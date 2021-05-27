package ServiceNow.ATO.Steps;

import org.openqa.selenium.support.PageFactory;

import ServiceNow.ATO.Pages.NewProjectPage;
import ServiceNow.ATO.StepsImplementation.NewProjectStepsImpl;
import ServiceNow.ATO.Utils.DriverObjectFactory;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;

public class NewProjectSteps {
	private NewProjectStepsImpl newProjectStepsImpl;
	
	
	@Before
	public void before() {
		this.newProjectStepsImpl = new NewProjectStepsImpl();
	}
	@Then("User selects the system as {string}")
	public void selectSystem(String system) throws InterruptedException {
		newProjectStepsImpl.selectSystem(system); 
	}

	@Then("User selects the Application hosting solution as {string}")
	public void selectApplicationHost(String hostigSolution) {
		newProjectStepsImpl.selectApplicationHosting(hostigSolution);
	}

	@Then("User clicks on the contacts tab")
	public void clickOnContactsTab() throws InterruptedException {
	    newProjectStepsImpl.clickOnTab("Contacts");
	}
<<<<<<< HEAD
	
	@Then("go back and sort packages")
	public void goBack_And_Sort_packages() {
		newProjectStepsImpl.gobackToAllPackages();
		newProjectStepsImpl.sortPackages();
		//button[@data-original-title="Back"]
	}
=======
>>>>>>> 3654b208295f96cd2c28cfa67b69b114e67078e8

	@Then("User selects the dates")
	public void selectDates() throws InterruptedException {
	    newProjectStepsImpl.setDates();
	}

	@Then("User enters the note as {string}")
	public void enterNotes(String notes) throws InterruptedException {
	    newProjectStepsImpl.setNotes(notes);
	}
	
	@Then("User click on {string} package code")
	public void clickOnPackage(String packageCode) throws InterruptedException {
		if(packageCode.equals("first") || packageCode.isEmpty()) {
			newProjectStepsImpl.getFirstPackageCode();
			newProjectStepsImpl.clickOnPackageCode(NewProjectPage.packageCode);
		}
	}
	
	@Then("User click on Ok button in the popup")
	public void clickOnOkbutton() throws InterruptedException {
	    newProjectStepsImpl.clickPopUpOkButton();
	}
}
