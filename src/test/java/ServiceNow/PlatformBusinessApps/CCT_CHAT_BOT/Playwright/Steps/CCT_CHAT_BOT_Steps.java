package ServiceNow.PlatformBusinessApps.CCT_CHAT_BOT.Playwright.Steps;

import ServiceNow.PlatformBusinessApps.CCT_CHAT_BOT.Playwright.StepImpl.CCT_CHAT_BOT_StepImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CCT_CHAT_BOT_Steps {

    @Given("the user opens the Find Funding Chatbot on the NV")
    public void the_user_opens_the_find_funding_chatbot_on_the_nv() {
        CCT_CHAT_BOT_StepImpl.the_user_opens_the_find_funding_chatbot_on_the_nv();
    }

    @When("selects Yes to Q1 regarding finding funding opportunities")
    public void selects_yes_to_q1_regarding_finding_funding_opportunities() {
        CCT_CHAT_BOT_StepImpl.selects_yes_to_q1_regarding_finding_funding_opportunities();
    }

    @When("selects {string} for Q2 regarding career stage")
    public void selects_for_q2_regarding_career_stage(String establishedInvestigator) {
        CCT_CHAT_BOT_StepImpl.selects_for_q2_regarding_career_stage(establishedInvestigator);
    }

    @When("selects {string} for Q3 about research training location")
    public void selects_for_q3_about_research_training_location(String usa) {
        CCT_CHAT_BOT_StepImpl.selects_for_q3_about_research_training_location(usa);
    }

    @When("the user selects {string} for Q4 indicating they belong to an underrepresented group")
    public void the_user_selects_for_q4_indicating_they_belong_to_an_underrepresented_group(String yes) {
        CCT_CHAT_BOT_StepImpl.the_user_selects_for_q4_indicating_they_belong_to_an_underrepresented_group(yes);
    }

    @Then("the {string} link should be displayed at the top of the list")
    public void the_link_should_be_displayed_at_the_top_of_the_list(String careerDevelopmentAwardLink) {
        CCT_CHAT_BOT_StepImpl.the_link_should_be_displayed_at_the_top_of_the_list(careerDevelopmentAwardLink);
    }

    @Then("the link to Career Development Award for Community Oncology and Prevention Research \\(K12) PI {string} should be clickable")
    public void the_link_to_career_development_award_for_community_oncology_and_prevention_research_k12_pi_should_be_clickable(String expectedURL) {
        CCT_CHAT_BOT_StepImpl.the_link_to_career_development_award_for_community_oncology_and_prevention_research_k12_pi_should_be_clickable(expectedURL);
    }

    @Then("the link should open in a new tab")
    public void the_link_should_open_in_a_new_tab() {
        CCT_CHAT_BOT_StepImpl.the_link_should_open_in_a_new_tab();
    }
}