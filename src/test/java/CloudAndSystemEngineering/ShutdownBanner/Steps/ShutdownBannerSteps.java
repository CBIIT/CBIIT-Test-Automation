package CloudAndSystemEngineering.ShutdownBanner.Steps;

import CloudAndSystemEngineering.ShutdownBanner.StepsImplementation.ShutdownBannerStepImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class ShutdownBannerSteps {
    @Given("a user is on the webpage")
    public void a_user_is_on_the_webpage () {
        ShutdownBannerStepImpl.getAllLinksFromSitemap();
        ShutdownBannerStepImpl.generatingLinksFromUrl();
//        ShutdownBannerStepImpl.theUserShouldSeeTheShutdownBannerNoSiteMap();
//        ShutdownBannerStepImpl.theUserShouldSeeTheShutdownBanner();
    }
    @Then("the user should see the shutdown banner")
    public void the_user_should_see_the_shutdown_banner() {
        ShutdownBannerStepImpl.theUserShouldSeeTheShutdownBanner();
    }
}
