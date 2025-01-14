package PLATFORM_BUSINESS.NERD.selenium.Steps;

import PLATFORM_BUSINESS.NERD.selenium.StepsImplementation.NERDOGSRMemberOfCongressStepImpl;
import PLATFORM_BUSINESS.NERD.selenium.StepsImplementation.NerdOGCREntryPageStepsImplementation;
import APPS_COMMON.PageInitializers.PageInitializer;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NerdOGCREntryPageSteps extends PageInitializer {

    @Then("I should Only see the following options in the Special Topic field dropdown list {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void i_should_only_see_the_following_options_in_the_special_topic_field_dropdown_list(String DDValuePayline, String bigDataDataSharing,
                                                                                                 String CCDI, String COVID19, String healthDisparities, String lowDoseRadiation,
                                                                                                 String mCDEarlyDetection, String moonshot, String pediatric, String rare, String sTARAct, String survivorship) {
        NerdOGCREntryPageStepsImplementation.newEntrySpecialTopicDropDownValues(DDValuePayline, bigDataDataSharing, CCDI, COVID19, healthDisparities,
                lowDoseRadiation, mCDEarlyDetection, moonshot, pediatric, rare, sTARAct, survivorship);
    }

    @Then("I should Only see the following options in the OCGR Content Type dropdown list {string}, {string}, {string} , {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void i_should_only_see_the_following_options_in_the_ocgr_content_type_dropdown_list(String none, String billSummaryText, String biography, String brainBrief, String cACR,
                                                                                               String formalCorrespondence, String gAOOIG, String hearingBriefingVisitSummary, String informalCorrespondence, String preparatoryDocument,
                                                                                               String presentationLegislativeUpdate, String qFR, String significantItem, String technicalAssistance, String other) {
        NerdOGCREntryPageStepsImplementation.newEntryOGCRContentTypeDropDownValues(none, billSummaryText, biography, brainBrief, cACR,
                formalCorrespondence, gAOOIG, hearingBriefingVisitSummary, informalCorrespondence, preparatoryDocument,
                presentationLegislativeUpdate, qFR, significantItem, technicalAssistance, other);
    }

    @Given("clicks the {string} Drop down filter")
    public void clicks_the_drop_down_filter(String memberOfCongress) {
        NerdOGCREntryPageStepsImplementation.clicksTheDropDownFilter(memberOfCongress);
    }

    @Then("All Drop Down field options are same as the Add New Entry form page for the Member of Congress field.")
    public void all_drop_down_field_options_are_same_as_the_add_new_entry_form_page_for_the_member_of_congress_field() {
        NerdOGCREntryPageStepsImplementation.allDropDownFieldOptionsAreSameAsTheAddNewEntryFormPageForTheField();
    }

    @When("I am on the NERD OGCR portal page")
    public void i_am_on_the_nerd_ogcr_portal_page() {
        CommonUtils.waitForVisibility(nerdHomePage.ogcrKnowledgeBaseText);
        CommonUtils.assertTrue(nerdHomePage.ogcrKnowledgeBaseText.isDisplayed());
        CucumberLogUtils.logScreenshot();
    }

    @Then("I should be able to see the the same date, calendar format on the OGCR portal page as the Add New Entry form page for the {string} field.")
    public void i_should_be_able_to_see_the_the_same_date_calendar_format_on_the_ogcr_portal_page_as_the_add_new_entry_form_page_for_the_field() {
        NERDOGSRMemberOfCongressStepImpl.theOgcrUserClicksTheButton();
    }
}