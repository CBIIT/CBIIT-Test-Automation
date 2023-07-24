package CustomBusiness.EIDP.Steps;

import CustomBusiness.EIDP.Util.CommonUtil;
import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CareerGoalAndActivitySteps extends PageInitializer{
	
	@When("User fills mandatory fields in career goals page NHGRI")
	public void fillCareerGoalNHGRI() throws Exception{
		careerGoalAndActiveStepImpl.fillCarrerGoalActiviteNHGRI();
		CommonUtil.waitBrowser(3000);
	}
	
	@When("User fills mandatory fields in career goals page")
	public void fillCareerGoal() throws Exception{
		careerGoalAndActiveStepImpl.fillCarrerGoalActivite();
		CommonUtil.waitBrowser(3000);
	}
	
	@When("User fills mandatory fields in career goals page for renew idp")
	public void fillCareerGoalForRenewIdp() throws Exception{
		careerGoalAndActiveStepImpl.fillCarrerGoalActiviteForRenewIdp();
	}
	
	@When("User fills mandatory fields in career goals page for NIDCR renew idp")
	public void fillCareerGoalForNIDCRRenewIdp() throws Exception{
		careerGoalAndActiveStepImpl.fillCarrerGoalActiviteForNIDCRRenewIdp();
	}
	
	@When("User adds new career training activities")
	public void editTrainning() {
		careerGoalAndActiveStepImpl.markAllExistingCareerGoalsAsCompleted();
		CommonUtil.waitBrowser(6000);
		careerGoalAndActiveStepImpl.addNewCareerGoal();
		CommonUtil.waitBrowser(3000);
		careerGoalAndActiveStepImpl.clickOnSaveAndContinueButton();
		CommonUtil.waitBrowser(5000);
	}
}
