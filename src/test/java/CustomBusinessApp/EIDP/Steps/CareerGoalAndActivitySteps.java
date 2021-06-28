package CustomBusinessApp.EIDP.Steps;

import CustomBusinessApp.EIDP.Util.CommonUtil;
import appsCommon.PageInitializer;
import cucumber.api.java.en.When;

public class CareerGoalAndActivitySteps extends PageInitializer{
	

	@When("User fills mandatory fields in career goals page")
	public void fillCareerGoal() throws Exception{
		careerGoalAndActiveStepImpl.fillCarrerGoalActivite();
	}
	
	@When("User adds new career training activities")
	public void editTrainning() {
		careerGoalAndActiveStepImpl.markAllExistingCareerGoalsAsCompleted();
<<<<<<< Updated upstream
		CommonUtil.waitBrowser(6000);
=======
		CommonUtil.waitBrowser(3000);
>>>>>>> Stashed changes
		careerGoalAndActiveStepImpl.addNewCareerGoal();
		CommonUtil.waitBrowser(3000);
		careerGoalAndActiveStepImpl.clickOnSaveAndContinueButton();
		CommonUtil.waitBrowser(5000);
	}
}
