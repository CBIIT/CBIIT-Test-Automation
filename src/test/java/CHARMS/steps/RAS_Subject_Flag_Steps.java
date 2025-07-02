package CHARMS.steps;

import io.cucumber.java.en.Then;
import static APPS_COMMON.PageInitializers.PageInitializer.*;

public class RAS_Subject_Flag_Steps {

    @Then("Study Team member fills in a new Subject Flags for {string}")
    public void study_team_member_fills_in_a_new_subject_flags_for(String sheetName) {
        rasSubjectFlagsStepsImpl.study_team_member_fills_in_a_new_subject_flags_for(sheetName);
    }
}