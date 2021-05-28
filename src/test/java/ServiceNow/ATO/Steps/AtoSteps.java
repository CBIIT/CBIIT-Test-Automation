package ServiceNow.ATO.Steps;

import ServiceNow.ATO.StepsImplementation.AtoStepsImpl;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;

public class AtoSteps {
	private AtoStepsImpl atoStepsImpl;
	
	@Before
	public void before() {
		this.atoStepsImpl = new AtoStepsImpl();
	}
	
	
	@Then("User opens the first inprogress package and sets everything to pending ISSO Review")
	public void performPendingISSOreview() {
		try {
			atoStepsImpl.clickOnFirstPackage();
			atoStepsImpl.clickOnAudiAccountability();
			atoStepsImpl.setFormStatusToIssoPending();
			atoStepsImpl.clickOnUpdateButton();
			
			atoStepsImpl.clickConfigurationManagLink();
			atoStepsImpl.setFormStatusToIssoPending();
			atoStepsImpl.clickOnUpdateButton();
			
			atoStepsImpl.clickcontigencyLink();
			atoStepsImpl.setFormStatusToIssoPending();
			atoStepsImpl.clickOnUpdateButton();


			atoStepsImpl.clickeAuthenticationLink();
			atoStepsImpl.setFormStatusToIssoPending();
			atoStepsImpl.setOnlineTransactionsAsNo();
			atoStepsImpl.clickOnUpdateButton();
			
			atoStepsImpl.clickFIPS199Link();
			atoStepsImpl.setFormStatusToIssoPending();
			atoStepsImpl.clickOnUpdateButton();
			
			atoStepsImpl.clickIdentityandAccessManagementLink();
			atoStepsImpl.setFormStatusToIssoPending();
			atoStepsImpl.clickOnUpdateButton();
			
			atoStepsImpl.clickIncidentResponseContactListLink();
			atoStepsImpl.setFormStatusToIssoPending();
			atoStepsImpl.clickOnUpdateButton();
			
			atoStepsImpl.clickSecurityPlan();
			atoStepsImpl.setFormStatusToIssoPendingFSecond();
			atoStepsImpl.clickOnUpdateButton();
			
			
			atoStepsImpl.clickOnSignAto();
		}catch(Exception e) {
			throw e;
		}
	}

}
