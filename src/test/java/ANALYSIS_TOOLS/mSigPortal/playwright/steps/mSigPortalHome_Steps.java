package ANALYSIS_TOOLS.mSigPortal.playwright.steps;

import ANALYSIS_TOOLS.mSigPortal.playwright.pages.mSigPortalHomePage;
import ANALYSIS_TOOLS.mSigPortal.playwright.utils.mSigPortalHome_Constants;
import com.nci.automation.web.CommonUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.TestProperties.getMsigPortalUrl;
import ANALYSIS_TOOLS.mSigPortal.playwright.stepsImplementations.mSigPortalHomeStepsImpl;
import io.cucumber.java.en.When;

public class mSigPortalHome_Steps {

    @Given("User navigates to the mSigPortal Website")
    public void user_navigates_to_the_m_sig_portal_website() {
        PlaywrightUtils.page.navigate(getMsigPortalUrl());
        CommonUtils.sleep(2000);
    }

    @Then("Verify the title of the mSigPortal Website")
    public void verify_the_title_of_the_m_sig_portal_website() {
        assertThat(PlaywrightUtils.page).hasTitle(mSigPortalHome_Constants.M_SIG_PORTAL_HOME_PAGE_TITLE);
    }

    @Then("Verify user is on the home page of the mSigPortal website")
    public void verify_user_is_on_the_home_page_of_the_m_sig_portal_website() {
        mSigPortalHomeStepsImpl.verifyHomeNavBarSelection();
    }

    @When("User clicks on the learn more about mSigPortal button")
    public void user_clicks_on_the_learn_more_about_m_sig_portal_button() {
        PlaywrightUtils.page.locator(mSigPortalHomePage.learnMoreMsigButton).click();
    }

    @Then("Validate User is on the about navbar on the mSigPortal website")
    public void validate_user_is_on_the_about_navbar_on_the_m_sig_portal_website() {
        mSigPortalHomeStepsImpl.verifyAboutNavBarSelection();
    }

    @When("User clicks on the catalogue card on the mSigPortal website")
    public void user_clicks_on_the_catalogue_card_on_the_m_sig_portal_website() {
        PlaywrightUtils.page.locator(mSigPortalHomePage.catalogueCard).click();
    }

    @Then("Validate User is on the catalogue navbar on the mSigPortal website")
    public void validate_user_is_on_the_catalogue_navbar_on_the_m_sig_portal_website() {
        mSigPortalHomeStepsImpl.verifyCatalogueNavBarSelection();
    }

    @When("User clicks on the visualisation card on the mSigPortal website")
    public void user_clicks_on_the_visualisation_card_on_the_m_sig_portal_website() {
        PlaywrightUtils.page.locator(mSigPortalHomePage.visualisationCard).click();
    }

    @Then("Validate User is on the visualisation navbar on the mSigPortal website")
    public void validate_user_is_on_the_visualisation_navbar_on_the_m_sig_portal_website() {
        mSigPortalHomeStepsImpl.verifyVisualisationNavBarSelection();
    }

    @When("User clicks on the exploration card on the mSigPortal website")
    public void user_clicks_on_the_exploration_card_on_the_m_sig_portal_website() {
        PlaywrightUtils.page.locator(mSigPortalHomePage.explorationCard).click();
    }

    @Then("Validate User is on the exploration navbar on the mSigPortal website")
    public void validate_user_is_on_the_exploration_navbar_on_the_m_sig_portal_website() {
        mSigPortalHomeStepsImpl.verifyExplorationNavBarSelection();
    }

    @When("User clicks on the association card on the mSigPortal website")
    public void user_clicks_on_the_association_card_on_the_m_sig_portal_website() {
        PlaywrightUtils.page.locator(mSigPortalHomePage.associationCard).click();
    }

    @Then("Validate User is on the association navbar on the mSigPortal website")
    public void validate_user_is_on_the_association_navbar_on_the_m_sig_portal_website() {
        mSigPortalHomeStepsImpl.verifyAssociationNavBarSelection();
    }
}