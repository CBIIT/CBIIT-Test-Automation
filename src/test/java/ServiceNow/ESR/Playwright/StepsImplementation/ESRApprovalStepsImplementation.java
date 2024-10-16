package ServiceNow.ESR.Playwright.StepsImplementation;

import ServiceNow.ESR.Playwright.Pages.CreateESRPage;
import com.nci.automation.web.CommonUtils;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static com.nci.automation.web.PlaywrightUtils.page;

public class ESRApprovalStepsImplementation {

    /**
     * This method approves the ESR from a Federal Lead
     */
    public static void federalLeadApproval() {
        page.frameLocator(CreateESRPage.iframeSelector).locator("#tabs2_list").getByText("Approvers (1)").click();
        page.frameLocator(CreateESRPage.iframeSelector).getByLabel("Requested - Open record:").click();
        page.frameLocator(CreateESRPage.iframeSelector).locator("#approve").click();
        CommonUtils.sleep(2000);
        page.frameLocator(CreateESRPage.iframeSelector).locator("#sysverb_update").click();
    }

    /**
     * This method confirms that the Federal Intake Approval is completed
     */
    public static void confirmFederalIntakeApprovalisCompleted() {
        assertThat(page.frameLocator(CreateESRPage.iframeSelector).locator("//select[@aria-label='Stage']")).containsText("ESR Board Intake Review");
    }

}
