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
     * This method rejects the intake approval from a Federal Lead with a need more info
     */
    public static void federalLeadNeedMoreInfo() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (1)").click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Requested - Open record:").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("more");
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").click();
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").fill("Need more information");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method confirms that the Federal Lead Intake Approval was rejected
     */
    public static void federalLeadIntakeRejectionForESRQ() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (1)").click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Requested - Open record:").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("rejected");
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").click();
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").fill("Approval was rejected");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method confirms that the Federal Intake Approval was rejected and ESR-Q is cancelled
     */
    public static void confirmFederalIntakeApprovalWasRejectedForESRQ() {
        assertThat(Playwright_Common_Locators.iframeLocator().locator("//select[@aria-label='Stage']")).containsText("Request Cancelled");
    }

    /**
     * This method rejects the intake approval from a Federal Lead with a rejection approval for ESR-I
     */
    public static void federalLeadIntakeRejectionForESRI() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (1)").click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Requested - Open record:").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("rejected");
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").click();
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").fill("Approval was rejected");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method confirms that the Federal Intake Approval was rejected and ESR-I is cancelled
     */
    public static void confirmFederalIntakeApprovalWasRejectedForESRI() {
        assertThat(Playwright_Common_Locators.iframeLocator().locator("//select[@aria-label='Stage']")).containsText("Request Cancelled");
    }

    /**
     * This method completes the Intake Preparation task again after user receives a "Need More Info" from Federal Lead
     */
    public static void completeIntakePreparation() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Catalog Tasks (1)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//tbody/tr/td/a[1])[2]").click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Catalog Task form section").getByLabel("State").selectOption("3");
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
     * This method rejects the ESR Board Intake approvals with a need more info for ESR-Q tickets
     */
    public static void esrBoardNeedMoreInfoForESRQ() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (9)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[9]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("more");
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").click();
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").fill("Need more information");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method confirms that more information is needed for the ESR-Q ticket
     */
    public static void confirmMoreInfoNeededForESRQ() {
        assertThat(Playwright_Common_Locators.iframeLocator().locator("//select[@aria-label='Stage']")).containsText("Information Required for Intake");
    }

    /**
     * This method rejects the ESR Board Intake approvals with a rejection approval for ESR-Q tickets
     */
    public static void esrBoardRejectionForESRQ() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (9)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[9]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("rejected");
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").click();
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").fill("Approval was rejected");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method confirms that the ESR Board Intake approvals were rejected for ESR-Q tickets
     */
    public static void confirmESRBoardIntakeApprovalWasRejectedForESRQ() {
        assertThat(Playwright_Common_Locators.iframeLocator().locator("//select[@aria-label='Stage']")).containsText("Information Required for Intake");
    }

    /**
     * This method rejects the ESR Board Intake approvals with a need more info for ESR-I tickets
     */
    public static void esrBoardNeedMoreInfoForESRI() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (9)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[11]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("more");
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").click();
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").fill("Need more information");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method confirms that more information is needed for the ESR-I ticket
     */
    public static void confirmMoreInfoNeededForESRI() {
        assertThat(Playwright_Common_Locators.iframeLocator().locator("//select[@aria-label='Stage']")).containsText("Information Required for Intake");
    }

    /**
     * This method rejects the ESR Board Intake approvals with a rejection approval for ESR-I tickets
     */
    public static void esrBoardRejectionForESRI() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (9)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[11]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("rejected");
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").click();
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").fill("Approval was rejected");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method confirms that the ESR Board Intake approvals were rejected for ESR-I tickets
     */
    public static void confirmESRBoardIntakeApprovalWasRejectedForESRI() {
        assertThat(Playwright_Common_Locators.iframeLocator().locator("//select[@aria-label='Stage']")).containsText("Information Required for Intake");
    }

    /**
     * This method completes the required Operational POC approval
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

    /**
     * This method completes the Federal Lead Closeout approval
     */
    public static void federalLeadCloseoutApproval() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (10)").click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Requested - Open record:").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("approved");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method rejects the Federal Lead Closeout approval with a need more info
     */
    public static void federalLeadCloseoutNeedMoreInfo() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (10)").click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Requested - Open record:").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("more");
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").click();
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").fill("Need more information");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method completes the Closeout Preparation task again after user receives a "Need More Info" from Federal Lead
     */
    public static void completeCloseoutPreparation() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Catalog Tasks").click();
        Playwright_Common_Locators.iframeLocator().locator("(//tbody/tr/td/a[1])[2]").click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Catalog Task form section").getByLabel("State").selectOption("3");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method confirms that the Federal Lead Closeout Approval was rejected for ESR-Q tickets
     */
    public static void federalLeadCloseoutRejectionForESRQ() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (10)").click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Requested - Open record:").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("rejected");
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").click();
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").fill("Approval was rejected");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method confirms that the Federal Lead Closeout Approval was rejected for ESR-Q tickets
     */
    public static void confirmFederalLeadCloseoutApprovalWasRejectedForESRQ() {
        assertThat(Playwright_Common_Locators.iframeLocator().locator("//select[@aria-label='Stage']")).containsText("Information Required for Closeout");
    }

    /**
     * This method confirms that the Federal Lead Closeout Approval is completed
     */
    public static void confirmFederalLeadCloseoutApprovalIsCompleted() {
        assertThat(Playwright_Common_Locators.iframeLocator().locator("//select[@aria-label='Stage']")).containsText("ESR Board Closeout Review");
    }

    /**
     * This method completes the Federal Lead Closeout approval for ESR-I
     */
    public static void federalLeadESRIApproval() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (11)").click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Requested - Open record:").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("approved");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method rejects the Federal Lead Closeout approval for ESR-I with a need more info
     */
    public static void federalLeadCloseoutNeedMoreInfoForESRI() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (11)").click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Requested - Open record:").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("more");
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").click();
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").fill("Need more information");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method completes the Closeout Preparation task again after user receives a "Need More Info" from Federal Lead for ESR-I
     */
    public static void completeCloseoutPreparationForESRI() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Catalog Tasks").click();
        Playwright_Common_Locators.iframeLocator().locator("(//tbody/tr/td/a[1])[2]").click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Catalog Task form section").getByLabel("State").selectOption("3");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method completes the ESR Board Closeout Review approvals for ESR-Q tickets
     */
    public static void esrBoardCloseoutApprovalsForESRQ() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (18)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[16]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("approved");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[18]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("approved");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (18)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[20]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("approved");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[22]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("approved");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[24]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("approved");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method rejects the ESR Board Closeout Review approvals with a need more info for ESR-Q tickets
     */
    public static void esrBoardCloseoutNeedMoreInfoForESRQ() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (18)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[16]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("more");
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").click();
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").fill("Need more information");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method confirms that more information is needed for the ESR-Q ticket
     */
    public static void esrBoardCloseoutRejectionForESRQ() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (18)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[16]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("rejected");
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").click();
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").fill("Approval was rejected");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method confirms that the ESR Board Closeout Approval was rejected for the ESR-Q ticket
     */
    public static void confirmESRBoardCloseoutApprovalWasRejectedForESRQ() {
        assertThat(Playwright_Common_Locators.iframeLocator().locator("//select[@aria-label='Stage']")).containsText("Information Required for Closeout");
    }

    /**
     * This method completes the ESR Board Closeout Review approvals for ESR-I tickets
     */
    public static void esrBoardCloseoutApprovalsForESRI() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (19)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[16]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("approved");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[18]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("approved");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (19)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[20]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("approved");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[22]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("approved");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[24]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("approved");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method rejects the ESR Board Closeout Review approvals with a need more info for ESR-I tickets
     */
    public static void esrBoardCloseoutNeedMoreInfoForESRI() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (19)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[16]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("more");
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").click();
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").fill("Need more information");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method completes the ESR Board Closeout Approval as rejected for the ESR-I ticket
     */
    public static void esrBoardCloseoutRejectionForESRI() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Approvers (19)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[16]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//select[@aria-required='false'])[1]").selectOption("rejected");
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").click();
        Playwright_Common_Locators.iframeLocator().locator("//div[@ng-show='multipleInputs']//div//div//div//textarea[@placeholder='Comments']").fill("Approval was rejected");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * This method confirms that the ESR Board Closeout Approval was rejected for the ESR-I ticket
     */
    public static void confirmESRBoardCloseoutApprovalWasRejectedForESRI() {
        assertThat(Playwright_Common_Locators.iframeLocator().locator("//select[@aria-label='Stage']")).containsText("Information Required for Closeout");
    }

    /**
     * This method confirms that the ESR Board Closeout Review approvals are completed
     */
    public static void confirmESRBoardCloseoutReviewApprovalsAreCompleted() {
        assertThat(Playwright_Common_Locators.iframeLocator().locator("//select[@aria-label='Stage']")).containsText("Completed");
    }
}