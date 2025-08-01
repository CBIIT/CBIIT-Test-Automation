package CHARMS.steps;

import io.cucumber.java.en.Given;
import static APPS_COMMON.PageInitializers.PageInitializer.nativeViewScreeningFollowUpStepsImpl;

public class NativeViewScreeningFollowUpSteps {

    @Given("creates a new Screening record for scenario {string}")
    public void creates_a_new_screening_record_for_scenario(String sheetName) {
        nativeViewScreeningFollowUpStepsImpl.createScreeningRecord(sheetName);
    }
}
