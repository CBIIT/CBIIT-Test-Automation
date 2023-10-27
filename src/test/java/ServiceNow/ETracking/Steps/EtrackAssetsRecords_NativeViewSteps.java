package ServiceNow.ETracking.Steps;

import ServiceNow.ETracking.StepsImplementation.EtrackAssetsRecords_NativeViewStepImplimentation;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.xceptions.TestingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EtrackAssetsRecords_NativeViewSteps extends PageInitializer {

    @Given("a eTracking user opens an Asset record")
    public void a_e_tracking_user_opens_an_asset_record() throws TestingException{
        EtrackAssetsRecords_NativeViewStepImplimentation.aEtrackingUserOpensAnAssetRecord();
    }

    @Then("there is a Delete button")
    public void there_is_a_delete_button() {
        EtrackAssetsRecords_NativeViewStepImplimentation.thereIsDeleteButton();
    }

    @When("the user clicks the Delete button")
    public void the_user_clicks_the_delete_button() {
        EtrackAssetsRecords_NativeViewStepImplimentation.theUserClicksTheDeleteButton();
    }

    @Then("the record is deleted")
    public void the_record_is_deleted() {
       EtrackAssetsRecords_NativeViewStepImplimentation.theRecordIsDeleted();
    }

    @Given("an eTracking user is on an Asset record")
    public void an_e_tracking_user_is_on_an_asset_record() throws TestingException {
       EtrackAssetsRecords_NativeViewStepImplimentation.anEtrackingUserIsOnAnAssetRecord();
    }

    @Then("there is a free text field called {string}")
    public void there_is_a_free_text_field_called(String AssetInformation) {
       EtrackAssetsRecords_NativeViewStepImplimentation.thereIsAFreeTextFieldCalled(AssetInformation);
    }

    @Then("the user is able to enter at least one thousand characters")
    public void the_user_is_able_to_enter_at_least_one_thousand_characters() {
        EtrackAssetsRecords_NativeViewStepImplimentation.theUserIsAbleToEnterAtLeastOneThousandCharacters();
    }

    @Then("the user opens the Model record")
    public void the_user_opens_the_model_record() {
        EtrackAssetsRecords_NativeViewStepImplimentation.theUserOpensTheModelRecord();
    }

    @Then("there is field called {string}")
    public void there_is_field_called(String description) {
        EtrackAssetsRecords_NativeViewStepImplimentation.thereIsFieldCalled(description);
    }

    @Then("the user is able to make text changes to the Description field at any time")
    public void the_user_is_able_to_make_text_changes_to_the_description_field_at_any_time() {
        EtrackAssetsRecords_NativeViewStepImplimentation.theUserIsAbleToMakeTextChangesToTheDescriptionField();
    }

    @Then("there is a date picker field called {string}")
    public void there_is_a_date_picker_field_called(String expirationDate) {
        EtrackAssetsRecords_NativeViewStepImplimentation.thereIsADatePickerFieldCalled(expirationDate);
    }

    @When("the user clicks the Expiration Date Calendar icon field")
    public void the_user_clicks_the_expiration_date_calendar_icon_field() {
        EtrackAssetsRecords_NativeViewStepImplimentation.theUserClicksTheExpirationDateCalendarIconField();
    }

    @Then("the user is able to select any date")
    public void the_user_is_able_to_select_any_date() {
        EtrackAssetsRecords_NativeViewStepImplimentation.theUserIsAbleToSelectAnyDate();
    }

    @Then("there is a field called {string}")
    public void there_is_a_field_called(String decalNumber) {
        EtrackAssetsRecords_NativeViewStepImplimentation.thereIsAFieldCalled(decalNumber);
    }

    @Then("there is no field called {string}")
    public void there_is_no_field_called(String barcode) {
        EtrackAssetsRecords_NativeViewStepImplimentation.thereIsNoFieldCalled(barcode);
    }
}
