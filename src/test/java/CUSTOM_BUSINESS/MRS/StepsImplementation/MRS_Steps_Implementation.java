package CUSTOM_BUSINESS.MRS.StepsImplementation;

import CUSTOM_BUSINESS.MRS.Pages.I_Trust_Page;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.EncryptionUtils;
import io.cucumber.java.en.Given;
import static com.nci.automation.web.PlaywrightUtils.page;
import static com.nci.automation.web.TestProperties.*;

public class MRS_Steps_Implementation {

    /**
     * User is logging into MRS application
     */
    @Given("User is logged in MRS application")
    public static void user_is_logged_in_mrs() {
        page.navigate(getMRSUrl());
        page.locator(I_Trust_Page.usernameTextBox).fill(I_TRUST_USERNAME);
        page.locator(I_Trust_Page.passwordTextBox).fill(EncryptionUtils.decrypt(I_TRUST_PASSWORD));
        page.locator(I_Trust_Page.passwordTextBox).press("Enter");
        CucumberLogUtils.playwrightScreenshot(page);
    }
}