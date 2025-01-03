package CUSTOM_BUSINESS.OASYS.StepsImplementation;

import CUSTOM_BUSINESS.OASYS.Pages.I_Trust_Page;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import com.nci.automation.utils.EncryptionUtils;
import static com.nci.automation.web.PlaywrightUtils.page;
import static com.nci.automation.web.TestProperties.*;

public class OASYS_Steps_Implementation {

    /**
     * User is logged into OASYS
     */
    public static void user_is_logged_in_oasys() {
        page.navigate(getOasysUrl());
        page.locator(I_Trust_Page.usernameTextBox).fill(I_TRUST_USERNAME);
        page.locator(I_Trust_Page.passwordTextBox).fill(EncryptionUtils.decrypt(I_TRUST_PASSWORD));
        page.locator(I_Trust_Page.passwordTextBox).press("Enter");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("ACCEPT")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }
}