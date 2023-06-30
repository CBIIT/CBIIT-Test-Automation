package CustomBusiness.EIDP.Steps;

import appsCommon.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TraineeReviewSteps extends PageInitializer{

	@When("User reviews comments and feedbacks in all the tabs")
	public void userReadsFeedback() throws Exception{
		traineeReviewPage.reivewIDPRequest();
	}
}