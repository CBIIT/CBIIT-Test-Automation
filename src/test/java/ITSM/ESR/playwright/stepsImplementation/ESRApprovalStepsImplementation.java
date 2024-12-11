package ITSM.ESR.playwright.stepsImplementation;

import APPS_COMMON.Pages.Playwright_Common_Locators;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ESRApprovalStepsImplementation {

    /**
     * This method approves the ESR from a Federal Lead
     */
    public static void federalLeadApproval() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (1)").click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Requested - Open record:").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("approved");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method confirms that the Federal Intake Approval is completed
     */
    public static void confirmFederalIntakeApprovalIsCompleted() {
        assertThat(Playwright_Common_Locators.iframeLocator().locator("//select[@aria-label='Stage']")).containsText("ESR Board Intake Review");
    }

    /**
     * This method completes the required ESR Board Intake approvals
     */
    public static void esrBoardIntakeApprovals() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (9)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[9]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("approved");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[11]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("approved");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (9)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[13]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("approved");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[15]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("approved");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[17]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("approved");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method confirms that the ESR Board Intake Approvals are completed
     */
    public static void confirmESRBoardIntakeApprovalsAreCompleted() {
        assertThat(Playwright_Common_Locators.iframeLocator().locator("//select[@aria-label='Stage']")).containsText("Engineering Project Execution");
    }

    /**
     * This method approves the ESR from the Operational POC
     */
    public static void operationalPOCApproval() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (10)").click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Requested - Open record:").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("approved");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();

    }

    /**
     * This method confirms that the Operational POC Approval is completed
     */
    public static void confirmOperationalPOCApprovalIsCompleted() {
        assertThat(Playwright_Common_Locators.iframeLocator().locator("//select[@aria-label='Stage']")).containsText("Federal Lead Closeout Approval");
    }
}