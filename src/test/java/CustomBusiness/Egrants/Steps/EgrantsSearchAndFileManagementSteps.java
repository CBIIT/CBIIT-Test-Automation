package CustomBusiness.Egrants.Steps;

import CustomBusiness.Egrants.StepsImplementation.EgrantsStepImplementation;
import appsCommon.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class EgrantsSearchAndFileManagementSteps extends PageInitializer {

    @Given("searches for {string}")
    public void searches_for(String string) {
       EgrantsStepImplementation.searches_for(string);
    }

    @Given("verifies the Project title as BAYLOR COLLEGE OF MEDICINE CANCER CENTER-CANCER CENTER SUPPO…")
    public void verifies_the_project_title_as_baylor_college_of_medicine_cancer_center_cancer_center_suppo() {
        EgrantsStepImplementation.verifies_the_project_title_as();
    }

    @Given("verifies the Institution name as BAYLOR COLLEGE OF MEDICINE")
    public void verifies_the_institution_name_as_baylor_college_of_medicine () {
        EgrantsStepImplementation.verifies_the_institution_name_as();
    }

    @Given("clicks on year {int}")
    public void clicks_on_year(Integer year) {
       EgrantsStepImplementation.clicks_on_year(year);
    }

    @Given("verifies {string} is the landed grant folder")
    public void verifies_is_the_landed_grant_folder(String string) {
        EgrantsStepImplementation.verifies_is_the_landed_grant_folder(string);
    }

    @Given("clicks on Add Document button")
    public void clicks_on_add_document_button() {
        EgrantsStepImplementation.clicks_on_add_document_button();
    }

    @Given("searches for grant {string}")
    public void searches_for_grant(String string) {
        EgrantsStepImplementation.searches_for_grant(string);
    }

    @Given("selects grant year 18")
    public void selects_grant_year_18() {
        EgrantsStepImplementation.selects_grant_year();
    }

    @Given("selects category as Application File")
    public void selects_category_as_application_file() {
        EgrantsStepImplementation.selects_category_as_application_file();
    }

    @Given("passes {string} as subcategory")
    public void passes_as_subcategory(String string) {
        EgrantsStepImplementation.passes_as_subcategory(string);
    }

    @Given("clicks on Locate File and Upload tab")
    public void clicks_on_locate_file_and_upload_tab() {
       EgrantsStepImplementation.clicks_on_locate_file_and_upload_tab();
    }

    @Given("uploads a file")
    public void uploads_a_file() {
        EgrantsStepImplementation.uploads_a_file();
    }

    @Then("verifies the success message {string}")
    public void verifies_the_success_message(String string) {
       EgrantsStepImplementation.verifies_the_success_message(string);
    }

    @Given("clicks on uploaded document")
    public void clicks_on_uploaded_document() {
        EgrantsStepImplementation.clicks_on_uploaded_document();
    }

    @Given("clicks on Institutional Files menu")
    public void clicks_on_institutional_files_menu() {
        EgrantsStepImplementation.user_clicks_on_institutional_files();
    }

    @Given("clicks on AAVOGEN, INC.")
    public void clicks_on_aavogen_inc() {
        EgrantsStepImplementation.user_selects_aavogen();
    }

    @Given("clicks on Create New Document link")
    public void clicks_on_create_new_document_link() {
        EgrantsStepImplementation.clicks_on_create_new_document_link();
    }
    @Given("selects Organization Document from category dropdown")
    public void selects_organization_document_from_category_dropdown() {
        EgrantsStepImplementation.selects_organization_document_from_category_dropdown();
    }
    @Given("provides {string} as a subcategory")
    public void provides_as_a_subcategory(String string) {
        EgrantsStepImplementation.provides_as_a_subcategory(string);
    }
    @Then("clicks on Create New button")
    public void clicks_on_create_new_button() {
        EgrantsStepImplementation.clicks_on_create_new_button();
    }
}