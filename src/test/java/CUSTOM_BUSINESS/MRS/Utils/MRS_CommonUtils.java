package CUSTOM_BUSINESS.MRS.Utils;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;
import com.nci.automation.utils.CucumberLogUtils;
import static com.nci.automation.web.PlaywrightUtils.page;

public class MRS_CommonUtils {

    /**
     * Clicks on the locator if it is visible
     * @param locator the locator to click.
     */
    public static void clickIfVisible(Locator locator) {
        if (locator.isVisible()) {
            locator.click();
        }
    }

    /**
     * Waits dynamically for the element to be visible, checks for visibility every 300ms
     * @param selector the selector to wait for
     */
    public static void waitForElementToBeVisible(String selector) {
        while (true) {
            if (page.locator(selector).isVisible()) {
                break;
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * This method handles adding Delegate Users
     */
    public static void addDelegateUser() {
        page.locator("xpath=//input[@id='delegateSelect']").click();
        page.locator("xpath=//input[@id='delegateSelect']").fill(MRS_Constants.DELEGATE_USER);
        page.getByText(MRS_Constants.DELEGATE_USER).nth(1).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }

    /**
     * This method handles adding Organization Approvers
     */
    public static void addOrganizationApprover() {
        page.locator("xpath=//input[@id='searchApprover']").click();
        page.locator("xpath=//input[@id='searchApprover']").fill(MRS_Constants.DELEGATE_USER);
        page.getByText(MRS_Constants.DELEGATE_USER).nth(1).click();
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Save")).click();
        CucumberLogUtils.playwrightScreenshot(page);
    }
}