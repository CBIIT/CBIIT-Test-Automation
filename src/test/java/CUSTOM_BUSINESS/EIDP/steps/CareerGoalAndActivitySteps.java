package CUSTOM_BUSINESS.EIDP.steps;

import CUSTOM_BUSINESS.EIDP.utils.CommonUtil;
import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.web.CommonUtils;
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
		careerGoalAndActiveStepImpl.addNewCareerGoal();
		CommonUtils.sleep(2000);
		careerGoalAndActiveStepImpl.clickOnSaveAndContinueButton();
		CommonUtils.sleep(2000);
	}
}
