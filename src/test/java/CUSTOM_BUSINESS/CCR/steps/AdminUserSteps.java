package CUSTOM_BUSINESS.CCR.steps;

import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;

public class AdminUserSteps extends PageInitializer {

    @Given("Admin User deletes a newly created vacancy")
    public void admin_user_deletes_a_newly_created_vacancy()  {
        cCRStepsImplementation.adminUserDeletesNewVacancy();
    }

    @Given("Admin User creates a new vacancy")
    public void admin_user_creates_a_new_vacancy() {
        cCRStepsImplementation.adminUserCreatesNewVacancy();
    }
}
