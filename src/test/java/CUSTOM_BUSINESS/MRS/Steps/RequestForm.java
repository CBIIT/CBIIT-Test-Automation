package CUSTOM_BUSINESS.MRS.Steps;

import CUSTOM_BUSINESS.MRS.StepsImplementation.MRS_Steps_Implementation;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.web.CommonUtils;
import io.cucumber.java.en.Given;

public class RequestForm {

    /**
     * This method is logging into the application
    */
    @Given("User is logged in the application")
    public void user_is_logged_in_the_application() {
        MRS_Steps_Implementation.user_is_logged_in_mrs();
        CommonUtils.sleep(3000);
        CucumberLogUtils.playwrightScreenshot(page);
    }
}