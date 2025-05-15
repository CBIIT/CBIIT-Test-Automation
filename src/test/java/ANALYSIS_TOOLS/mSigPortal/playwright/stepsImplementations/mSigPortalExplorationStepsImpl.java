package ANALYSIS_TOOLS.mSigPortal.playwright.stepsImplementations;

import com.nci.automation.web.PlaywrightUtils;

public class mSigPortalExplorationStepsImpl {

    /**
     * CLICKS ON THE NAVIGATION BAR AND THEN CLICKS ON THE RESET BUTTOn
     */
    public static void clickResetButton() {
        PlaywrightUtils.page.locator("//i[contains(@class,'fa fa-lg')]").click();
        PlaywrightUtils.page.locator("//button[normalize-space()='Reset']").click();
    }
}
