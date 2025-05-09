package ANALYSIS_TOOLS.mSigPortal.playwright.stepsImplementations;

import com.nci.automation.web.PlaywrightUtils;

public class mSigPortalExplorationStepsImpl {

    /**
     * CLICKING ON THE RESET BUTTON
     */
    public static void clickResetButton() {
        PlaywrightUtils.page.locator("//i[contains(@class,'fa fa-lg')]").click();
        PlaywrightUtils.page.locator("//button[normalize-space()='Reset']").click();
    }
}
