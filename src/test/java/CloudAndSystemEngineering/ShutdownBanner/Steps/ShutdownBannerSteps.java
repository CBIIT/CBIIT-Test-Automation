package CloudAndSystemEngineering.ShutdownBanner.Steps;

import CloudAndSystemEngineering.ShutdownBanner.StepsImplementation.ShutdownBannerStepImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class ShutdownBannerSteps {
    @Given("a user is on the webpage")
    public void a_user_is_on_the_webpage () {
        ShutdownBannerStepImpl.getAllLinksFromExcelSheet();
    }
    @Then("the user should see the shutdown banner")
    public void the_user_should_see_the_shutdown_banner() {
        ShutdownBannerStepImpl.theUserShouldSeeTheShutdownBannerNoSiteMap();
    }

    @Then("the user should be able to gather all application pages")
    public void the_user_should_be_able_to_gather_all_application_pages() {
        ShutdownBannerStepImpl.generatingLinksFromUrlExcelSheet();
    }

    @Then("the user should see the shutdown banner on the sitemap urls")
    public void the_user_should_see_the_shutdown_banner_on_the_sitemap_urls() {
        ShutdownBannerStepImpl.theUserShouldSeeTheShutdownBanner();
    }

    @Then("the user should see the page loading time in the console")
    public void the_user_should_see_the_page_loading_time_in_the_console() {
        ShutdownBannerStepImpl.checkPageLoadingTime();
    }
}
