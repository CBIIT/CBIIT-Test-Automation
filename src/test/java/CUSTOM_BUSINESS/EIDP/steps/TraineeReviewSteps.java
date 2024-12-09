package CUSTOM_BUSINESS.EIDP.steps;

import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.When;

public class TraineeReviewSteps extends PageInitializer{

	@When("User reviews comments and feedbacks in all the tabs")
	public void userReadsFeedback() throws Exception{
		traineeReviewStepsImpl.reivewIDPRequest();
	}
}