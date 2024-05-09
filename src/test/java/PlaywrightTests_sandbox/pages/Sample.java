package PlaywrightTests_sandbox.pages;

import com.microsoft.playwright.Locator;
import com.nci.automation.web.PlaywrightUtils;

public class Sample {

    public static Locator usernameTextBox = PlaywrightUtils.page.getByLabel("User name");

}
