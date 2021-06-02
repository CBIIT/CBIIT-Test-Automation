package CustomBusinessApp.EIDP.Steps;

import appsCommon.PageInitializer;
import cucumber.api.java.en.When;

public class TraineeReviewSteps extends PageInitializer{

	@When("User reviews comments and feedbacks in all the tabs")
	public void userReadsFeedback() throws Exception{
		traineeReviewPage.reivewIDPRequest();
	}
}
