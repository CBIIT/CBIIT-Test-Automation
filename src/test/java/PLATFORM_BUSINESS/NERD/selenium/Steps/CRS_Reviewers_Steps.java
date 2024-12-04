package PLATFORM_BUSINESS.NERD.selenium.Steps;

import ServiceNow.PLATFORM_BUSINESS.NERD.selenium.StepsImplementation.NERDApplicationStepsImplementation;
import ServiceNow.PLATFORM_BUSINESS.NERD.selenium.StepsImplementation.NERD_CRS_ReviewersStepImplementation;
import APPS_COMMON.PageInitializers.PageInitializer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CRS_Reviewers_Steps extends PageInitializer {

    NERD_CRS_ReviewersStepImplementation nerdCrsRevuewerStepImplementation = new NERD_CRS_ReviewersStepImplementation();

    @Given("a CRS reviewer {string} is logged into NERDs CRS Knowledge Management System")
    public void a_crs_reviewer_is_logged_into_ner_ds_crs_knowledge_management_system(String crsReviewer) {
        NERD_CRS_ReviewersStepImplementation.aCRSReviewerIsLoggedIntoNERDsCRSKnowledgeManagementSystem(crsReviewer);
    }

    @When("adding a new OM entry")
    public void adding_a_new_OM_entry() {
        NERDApplicationStepsImplementation.addingNewOM_Entry();
    }

    @Then("OM Content Type {string} displays")
    public void om_Content_Type_displays(String omContentType) {
        NERDApplicationStepsImplementation.verifyingOM_ContentType(omContentType);
    }

    @Then("the following check box options are also available, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_check_box_options_are_also_available(String administrationTransitionMaterial,
                                                                   String congressionalJustification, String hhsRequests, String antiHarrassmentCivilityMaterial,
                                                                   String donnasBlog, String furloughPlanning, String equityAndInclusionProgram, String covid19LeadershipMessages) {
        NERD_CRS_ReviewersStepImplementation.theFollowingCheckBoxOptionsAreAlsoAvailable(administrationTransitionMaterial,
                congressionalJustification, hhsRequests, antiHarrassmentCivilityMaterial,
                donnasBlog, furloughPlanning, equityAndInclusionProgram,
                covid19LeadershipMessages);
    }

    @Then("when selecting Other {string}")
    public void when_selecting_Other(String otherOmContent) {
        NERDApplicationStepsImplementation.selectingOfOtherOM_Content(otherOmContent);
    }

    @Then("the If Other is selected above, please specify {string} field displays")
    public void the_If_Other_is_selected_above_please_specify_field_displays(String omContentTypeOtherPleaseSpecify) {
        NERDApplicationStepsImplementation.pleaseSpecifyFieldIsDisplayed(omContentTypeOtherPleaseSpecify);
    }

    @Then("the following check box option is displayed as COVID19 Leadership Messages {string}")
    public void the_following_check_box_option_is_displayed_as_covid_leadership_messages( String covid19LeadershipMessages) {
        NERD_CRS_ReviewersStepImplementation.theFollowingCheckBoxOptionIsDisplayed(covid19LeadershipMessages);
    }

    @Given("clicks the {string} filter")
    public void clicks_the_filter(String specialTopic) {
        NERD_CRS_ReviewersStepImplementation.clicksTheFilter(specialTopic);
    }

    @Then("the field options are {string}, {string}, {string},{string},{string},{string},{string},{string},{string},{string},{string}, {string}, {string}, {string}, {string}, and {string}")
    public void the_field_options_are_and(String all, String bigDataDataSharing, String covid19, String communications, String earlyDetection, String metastatic,
                                          String minorityHealthHealthDisparities, String moonshot, String partnerships, String pediatric, String rare, String reportGuidancePolicy,
                                          String sexGenderDifferences, String trainingWorkforceDevelopment, String womensHealth, String workforce) {
        NERD_CRS_ReviewersStepImplementation.theFieldOptionsAre(all, bigDataDataSharing, covid19, communications, earlyDetection,
                metastatic, minorityHealthHealthDisparities, moonshot, partnerships, pediatric, rare,
                reportGuidancePolicy, sexGenderDifferences, trainingWorkforceDevelopment, womensHealth, workforce);
   }

    @Given("a CRS Reviewer {string} is on the NERD Home Page")
    public void a_crs_reviewer_is_on_the_nerd_home_page(String crsReviewer) {
        NERD_CRS_ReviewersStepImplementation.aCRSReviewerIsOnTheNERDHomePage(crsReviewer);
    }

    @Then("there are three knowledge bases called {string}, {string}, and {string}")
    public void there_are_three_knowledge_bases_called_and(String nerd, String rock, String moonshotEvaluation) {
        NERD_CRS_ReviewersStepImplementation.thereAreThreeKnowledgeBasesCalledAnd(nerd, rock, moonshotEvaluation);
    }

    @When("the user clicks the NERD Knowledge Base")
    public void the_user_clicks_the_NERD_Knowledge_Base() {
        NERD_CRS_ReviewersStepImplementation.theUserClicksTheNERDKnowledgeBase();
    }

    @Then("the user is redirected to the Knowledge Base view page")
    public void the_user_is_redirected_to_the_Knowledge_Base_view_page() {
        NERD_CRS_ReviewersStepImplementation.theUserIsRedirectedToTheKnowledgeBaseViewPage();
    }

    @Then("there is a collapsed accordion with the header labeled {string}")
    public void there_is_a_collapsed_accordion_with_the_header_labeled(String topAccomplishmentsAccordionText) {
        NERD_CRS_ReviewersStepImplementation.thereIsACollapsedAccordionWithRheHeaderLabeled(topAccomplishmentsAccordionText);
    }

    @When("the user clicks the {string} accordion header")
    public void the_user_clicks_the_accordion_header(String topAccomplishmentsAccordion) {
        NERD_CRS_ReviewersStepImplementation.theUserClicksTheAccordionHeader(topAccomplishmentsAccordion);
    }

    @Then("the {string} accordion expands")
    public void the_accordion_expands(String itemsPerPageAccordionText) {
        NERD_CRS_ReviewersStepImplementation.theAccordionExpands(itemsPerPageAccordionText);
    }

    @Then("a list of all published {string} records is visible")
    public void a_list_of_all_published_records_is_visible(String topAccomplishments) {
        NERD_CRS_ReviewersStepImplementation.aListOfAllPublishedRecordsIsVisible(topAccomplishments);
    }

    @Given("a CRS Reviewer {string} is viewing the list of the published {string}")
    public void a_crs_reviewer_is_viewing_the_list_of_the_published(String crsReviewer, String topAccomplishmentsAccordion) {
        nerdCrsRevuewerStepImplementation.aCRSReviewerIsViewingTheListOfThePublished(crsReviewer, topAccomplishmentsAccordion);
    }

    @Then("there is a record called {string}")
    public void there_is_a_record_called(String publishedArticleTitle) {
        nerdCrsRevuewerStepImplementation.thereIsARecordCalled(publishedArticleTitle);
    }

    @When("the user clicks the title of the record {string}")
    public void the_user_clicks_the_title_of_the_record(String titleOfPublishedArticle) {
        NERD_CRS_ReviewersStepImplementation.theUserClicksTheTitleOfTheRecord(titleOfPublishedArticle);
    }

    @Then("the user is redirected to the Article View of the {string} record")
    public void the_user_is_redirected_to_the_Article_View_of_the_record(String titleOfPublishedArticle) {
        NERD_CRS_ReviewersStepImplementation.theUserIsRedirectedToTheArticleViewOfTheRecord(titleOfPublishedArticle);
    }

    @Then("the following fields and their associated data are visible, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, and {string}")
    public void the_following_fields_and_their_associated_data_are_visible_IF_RESEARCH_RESOURCES_IS_SELECTED_ABOVE_Specify_Type_NIH_strategic_alignment_HHS_Strategic_Plan_Alignment_Author(
            String category, String pleaseSpecify, String acronym, String fiscalYear, String description,
            String websiteURLs,
            String fyTheCollaborativeActivityOriginated, String leadDOC, String otherDOCs, String poc,
            String references,
            String nihICsODCollaborators, String hhsAgencyCollaborators,
            String otherFederalAgencyCollaborators, String tribalStateLocalGovernmentCollaborators,
            String foreignGovernmentCollaborators,
            String nonGovernmentalCollaborators, String otherCollaborators,
            String selectTypeOfCollaborativeActivity, String ifCommiteeIsSelectedAboveIsThisAFacaCommittee,
            String isThisCollaborationRelatedToaRegulatoryActivity,
            String wasNihFundingProvidedForThisActivity, String productsOutputs,
            String ifResearchResourceIsSelectedAboveSpecifyType, String nihStrategicAlignment,
            String hhsStrategicPlanAlignment, String author) {
        NERD_CRS_ReviewersStepImplementation.theFollowingFieldsAndTheirAssociatedDataAreVisibleIfResearchResourceIsSelectedAboveSpecifyTypeNihStrategicAlignmentHhsStrategicPlanAlignmentAuthor(category, pleaseSpecify, acronym, fiscalYear, description, websiteURLs,
                fyTheCollaborativeActivityOriginated, leadDOC, otherDOCs, poc, references, nihICsODCollaborators, hhsAgencyCollaborators, otherFederalAgencyCollaborators, tribalStateLocalGovernmentCollaborators, foreignGovernmentCollaborators, nonGovernmentalCollaborators, otherCollaborators,selectTypeOfCollaborativeActivity, ifCommiteeIsSelectedAboveIsThisAFacaCommittee,
                isThisCollaborationRelatedToaRegulatoryActivity, wasNihFundingProvidedForThisActivity, productsOutputs, ifResearchResourceIsSelectedAboveSpecifyType, nihStrategicAlignment, hhsStrategicPlanAlignment, author);
    }

    @Then("the following fields and their associated data are visible for Top Accomplishments, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void the_following_fields_and_their_associated_data_are_visible_for_Top_Accomplishments(String category,
                                                                                                   String rank, String title, String doc, String description, String cancerSiteType,
                                                                                                   String researchType,
                                                                                                   String specialTopic, String references, String otherReferences, String collaborations,
                                                                                                   String fiscalYear,
                                                                                                   String pointOfContact,
                                                                                                   String pointOfContactEmail, String crsContact, String author) {
        NERD_CRS_ReviewersStepImplementation.theFollowingFieldsAndTheirAssociatedDataAreVisibleForTopAccomplishments(category,
                rank, title, doc, description, cancerSiteType, researchType, specialTopic, references, otherReferences, collaborations, fiscalYear, pointOfContact, pointOfContactEmail, crsContact, author);
    }

    @Then("the following fields and their associated data are visible for Other Accomplishments, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string},{string}")
    public void the_following_fields_and_their_associated_data_are_visible_for_Other_Accomplishments(String category, String doc, String otherAccomplishmentType, String description, String cancerSiteType,
                                                                                                     String researchType, String specialTopic, String references, String otherReferences,
                                                                                                     String collaborations, String fiscalYear, String pointOfContact, String crsContact, String author) {
        NERD_CRS_ReviewersStepImplementation.theFollowingFieldsAndTheirAssociatedDataAreVisibleForOtherAccomplishments(category, doc, otherAccomplishmentType, description, cancerSiteType, researchType, specialTopic, references, otherReferences, collaborations, fiscalYear, pointOfContact, crsContact, author);
    }
}