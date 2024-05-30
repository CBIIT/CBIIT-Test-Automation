package AnalysisTools.Soccer.playwright.Steps;

import AnalysisTools.Soccer.playwright.StepsImplementation.SoccerStepsImpl;
import appsCommon.PageInitializers.PageInitializer;
import com.nci.automation.web.EnvUtils;
import com.nci.automation.web.PlaywrightUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Soccer_Steps extends PageInitializer {

    @Given("User navigates to soccer home page")
    public void user_navigates_to_soccer_home_page() {PlaywrightUtils.page.navigate(EnvUtils.getApplicationUrl("Soccer"));
    }

    @Then("User click on run soccer button")
    public void user_click_on_run_soccer_button() {SoccerStepsImpl.clickOnRunSoccerButton();
    }

    @Then("verify that user is on soccer page")
    public void verify_that_user_is_on_soccer_page() {SoccerStepsImpl.verifySoccerPage();
    }

    @Then("user click on the doi link")
    public void user_click_on_the_doi_link() {SoccerStepsImpl.clickDOILink();
    }

    @Then("verify that user is on oxford Academic page")
    public void verify_that_user_is_on_oxford_Academic_page() {SoccerStepsImpl.validateOxfordAcademicTab();
    }

    @Then("User click on model button")
    public void user_click_on_model_button() {SoccerStepsImpl.clickOnModelButton();
    }

    @Then("verify that graph is getting displayed in model page")
    public void verify_graph_on_model_page() {SoccerStepsImpl.verifyGraphOnModels();
    }

    @When("User click on socassign button")
    public void user_click_on_socassign_button() {SoccerStepsImpl.ClickOnSocassignButton();
    }

    @Then("User is able to click download button and download socassign jar file")
    public void User_is_able_to_click_download_button_and_download_socassign_jar_file() {SoccerStepsImpl.DownloadSocAssignJarFile();
    }

    @Then("User is able to click socassign and download jnlp file")
    public void User_is_able_to_click_socassign_and_download_jnlp_file() {SoccerStepsImpl.ClickOnSocassignLink();
    }

    @When("User click on resources button")
    public void user_click_on_resources_button() {SoccerStepsImpl.ClickOnResourcesButton();
    }

    @Then("verify that all the hyperlinks are clickable and navigating to respective page.")
    public void verify_that_all_the_hyperlinks_are_clickable_and_navigating_to_respective_page() {SoccerStepsImpl.clickOnAllHyperlinksAndVerify();
    }

    @Then("user click on the doi link in models page")
    public void user_click_on_the_doi_link_in_models_page() {SoccerStepsImpl.clickDOILinkInModelsPage();
    }

    @Then("User click on the computer based coding link and verify it")
    public void User_click_on_the_computer_based_coding_link_and_verify_it() {SoccerStepsImpl.clickOnComputerBasedCodingLink();
    }

    @When("User click on help button")
    public void user_click_on_help_button() {SoccerStepsImpl.ClickOnHelpButton();
    }

    @Then("verify that user is able to navigate to {int} different soccer section in help page")
    public void verify_that_user_is_able_to_navigate_to_different_soccer_section_in_help_page(Integer int1) {SoccerStepsImpl.validateAllSections(int1);
    }

    @Then("User click on FAQ button")
    public void User_click_on_FAQ_button() {SoccerStepsImpl.clickOnFAQButton();
    }

    @Then("verify that user is able to navigate to FAQ Page")
    public void verify_that_user_is_able_to_navigate_to_faq_page() {SoccerStepsImpl.verifyFAQPage();
    }
}