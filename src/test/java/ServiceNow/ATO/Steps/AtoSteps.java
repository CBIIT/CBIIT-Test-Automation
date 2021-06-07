package ServiceNow.ATO.Steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.TimeZone;

import ServiceNow.ATO.StepsImplementation.AtoStepsImpl;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;

public class AtoSteps {
	private AtoStepsImpl atoStepsImpl;

	@Before
	public void before() {
		this.atoStepsImpl = new AtoStepsImpl();
	}

	@Then("User opens the first package")
	public void openFirstPackage() {
		atoStepsImpl.clickOnFirstPackage();
	}

	@Then("user clicks on renew button and validates the closed data")
	public void renewAndValidate() throws Exception {
		atoStepsImpl.clickOnRenewButton();
		atoStepsImpl.gotoDatesSection();
		DateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		formatter.setTimeZone(TimeZone.getTimeZone("EST"));
		if (!String.valueOf(formatter.format(new Date())).equals(atoStepsImpl.getStartDate())) {
			throw new Exception("Expected date==>" + (formatter.format(new Date())) + " but found==>"
					+ atoStepsImpl.getStartDate());
		}
	}

	@Then("Check If resume button is available on screen")
	public void resumeButton() throws Exception {
		try {
			atoStepsImpl.validateIfResumeButtonIsAvailable();
		} catch (Exception e) {
			throw e;
		}
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
		} catch (Exception e) {
			throw e;
		}
	}

}
