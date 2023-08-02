package ServiceNow.SCSS.Steps;

import appsCommon.PageInitializer;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.Given;

public class OWMVacancySteps  extends PageInitializer {

    @Given("User is on SCSS Landing page and user is {string}")
    public void user_is_on_scss_landing_page_and_user_is(String user) {
        sCCSLoginStepsImplementation.sCSSLogin(user);
    }

    @Given("User is on SCSS landing page")
    public void user_is_on_SCSS_landing_page() {
        CommonUtils.waitForVisibility(owmVacancyPage.scssLandingPageTitle);
        CommonUtils.assertTrue(owmVacancyPage.scssLandingPageTitle.isDisplayed());
    }
}
