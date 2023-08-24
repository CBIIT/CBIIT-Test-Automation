package AnalysisTools.CEDCD.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import com.nci.automation.utils.MiscUtils;
import appsCommon.PageInitializer;

public class CEDCDBiospecimenCountClearAllSteps extends PageInitializer {

    @When("the user selects All Types from the Specimen Type drop down")
    public void the_user_selects_All_Types_from_the_Specimen_Type_drop_down() {
        cedcd_public_site_steps_impl.user_Selects_All_Types_From_the_Specimen_Type_dropdown();
    }

    @When("the user selects All Cancers from the Cancer Type drop down")
    public void the_user_selects_All_Cancers_from_the_Cancer_Type_drop_down() {
        cedcd_public_site_steps_impl.the_User_Selects_All_Cancers_from_the_Cancer_Type_drop_down();
    }

    @When("the user selects All Cohorts from the Cohorts drop down")
    public void the_user_selects_All_Cohorts_from_the_Cohorts_drop_down() {
        cedcd_public_site_steps_impl.the_User_Selects_All_Cohorts_from_the_Cohorts_drop_down();
    }

    @Given("the user clicks search on Biospecimen Counts tab")
    public void the_user_clicks_search_on_biospecimen_counts_tab() {
        cedcd_public_site_steps_impl.the_User_Clicks_search_on_biospecimen_counts_tab();
    }

    @When("the user clicks on the Clear All button")
    public void the_user_clicks_on_the_Clear_All_button() {
        cedcd_public_site_steps_impl.the_user_clicks_on_the_Clear_All_button();
    }

    /**
     * VERIFY BELOW FUNCTIONALITY WITH DEVELOPER
     * */
    @Then("all previously selected fields are no longer selected")
    public void all_previously_selected_fields_are_no_longer_selected() {
        Assert.assertTrue(cedcdBiospecimenCountsPage.biospecimenSubmitBtn.isEnabled());
        MiscUtils.sleep(2000);
    }
}