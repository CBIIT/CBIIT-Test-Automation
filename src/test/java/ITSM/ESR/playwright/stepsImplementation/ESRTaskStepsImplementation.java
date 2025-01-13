package ITSM.ESR.playwright.stepsImplementation;

import ITSM.ESR.playwright.pages.CreateESRPage;
import APPS_COMMON.Pages.Playwright_Common_Locators;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.options.AriaRole;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class ESRTaskStepsImplementation {

    /**
     * Clicks on the catalog task called Intake Preparation in the ESR ticket
     */
    public static void clickOnIntakePreparationCatalogTask() {
        Playwright_Common_Locators.iframeLocator().locator(CreateESRPage.newESRTicketSelector).click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[1]").click();
    }

    /**
     * Fills out all required information in the ESR-Q Intake Preparation catalog task
     */
    public static void fillOutAllRequiredInformationForESRQIntakePreparation() {
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName("Assigned to")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Assigned to")).fill("CBIIT Test Account");
        Playwright_Common_Locators.iframeLocator().getByText("Cost Optimization").click();
        Playwright_Common_Locators.iframeLocator().getByText("Innovation").click();
        Playwright_Common_Locators.iframeLocator().getByText("Automation").click();
        Playwright_Common_Locators.iframeLocator().getByText("Process Improvement").click();
        Playwright_Common_Locators.iframeLocator().getByText("Modernization").click();
        Playwright_Common_Locators.iframeLocator().getByText("Standardization").click();
        Playwright_Common_Locators.iframeLocator().getByText("Security Posture").click();
        Playwright_Common_Locators.iframeLocator().getByText("Staff Productivity").click();
        Playwright_Common_Locators.iframeLocator().getByText("Other Business Justification").click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Justification")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Justification")).fill("Test");
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Why is this project important")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Why is this project important")).fill("Test");
        Playwright_Common_Locators.iframeLocator().locator("(//div[@class='col-xs-6  form-field input_controls sc-form-field ']/select)[1]").selectOption("CBIIT");
        Playwright_Common_Locators.iframeLocator().getByText("Yes").first().click();
        Playwright_Common_Locators.iframeLocator().getByText("Labor", new FrameLocator.GetByTextOptions().setExact(true)).click();
        Playwright_Common_Locators.iframeLocator().getByText("Software licensing").click();
        Playwright_Common_Locators.iframeLocator().getByText("Hardware").click();
        Playwright_Common_Locators.iframeLocator().getByText("Other", new FrameLocator.GetByTextOptions().setExact(true)).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Funding Type")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Funding Type")).fill("Test");
        Playwright_Common_Locators.iframeLocator().getByText("Yes").nth(1).click();
        Playwright_Common_Locators.iframeLocator().getByText("Yes").nth(2).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(" Choose date...")).nth(1).click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Go to Today", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(" Choose date...")).nth(2).click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Go to Today", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Scope")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Scope")).fill("Test");
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Definition of Done")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Definition of Done")).fill("Test");
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Assumptions/Risks/Constraints")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Assumptions/Risks/Constraints")).fill("Test");
        Playwright_Common_Locators.iframeLocator().getByLabel("Catalog Task form section").getByLabel("State").selectOption("3");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * Fills out all required information in the ESR-I Intake Preparation catalog task
     */
    public static void fillOutAllRequiredInformationForESRIIntakePreparation() {
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.SEARCHBOX, new FrameLocator.GetByRoleOptions().setName("Assigned to")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Assigned to")).fill("CBIIT Test Account");
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Operational Readiness")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Operational Readiness")).fill("Sue Pan");
        Playwright_Common_Locators.iframeLocator().getByText("Cost Optimization").click();
        Playwright_Common_Locators.iframeLocator().getByText("Innovation").click();
        Playwright_Common_Locators.iframeLocator().getByText("Automation").click();
        Playwright_Common_Locators.iframeLocator().getByText("Process Improvement").click();
        Playwright_Common_Locators.iframeLocator().getByText("Modernization").click();
        Playwright_Common_Locators.iframeLocator().getByText("Standardization").click();
        Playwright_Common_Locators.iframeLocator().getByText("Security Posture").click();
        Playwright_Common_Locators.iframeLocator().getByText("Staff Productivity").click();
        Playwright_Common_Locators.iframeLocator().getByText("Other Business Justification").click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Justification")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Justification")).fill("Test");
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Why is this project important")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Why is this project important")).fill("Test");
        Playwright_Common_Locators.iframeLocator().locator("(//div[@class='col-xs-6  form-field input_controls sc-form-field ']/select)[1]").selectOption("CBIIT");
        Playwright_Common_Locators.iframeLocator().getByText("Yes").first().click();
        Playwright_Common_Locators.iframeLocator().getByText("Labor", new FrameLocator.GetByTextOptions().setExact(true)).click();
        Playwright_Common_Locators.iframeLocator().getByText("Software licensing").click();
        Playwright_Common_Locators.iframeLocator().getByText("Hardware").click();
        Playwright_Common_Locators.iframeLocator().getByText("Other", new FrameLocator.GetByTextOptions().setExact(true)).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Funding Type")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("   Other Funding Type")).fill("Test");
        Playwright_Common_Locators.iframeLocator().getByText("Yes").nth(1).click();
        Playwright_Common_Locators.iframeLocator().getByText("Yes").nth(2).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(" Choose date...")).nth(1).click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Go to Today", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.LINK, new FrameLocator.GetByRoleOptions().setName(" Choose date...")).nth(2).click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Go to Today", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Scope")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Scope")).fill("Test");
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Definition of Done")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Definition of Done")).fill("Test");
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Assumptions/Risks/Constraints")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Assumptions/Risks/Constraints")).fill("Test");
        Playwright_Common_Locators.iframeLocator().locator("(//div[@style='width: 100%; line-height: 32px;']/span)[7]").click();
        Playwright_Common_Locators.iframeLocator().locator("(//div[@style='width: 100%; line-height: 32px;']/span)[9]").click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Catalog Task form section").getByLabel("State").selectOption("3");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * Confirms that the Intake Preparation catalog task is completed by moving to the next stage
     */
    public static void confirmIntakePreparationTaskIsCompleted() {
        assertThat(Playwright_Common_Locators.iframeLocator().locator("//select[@aria-label='Stage']")).containsText("Federal Lead Intake Approval");
    }

    /**
     * Completes the ESR Board Intake Review catalog task
     */
    public static void completeESRBoardIntakeReviewCatalogTask() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Catalog Tasks (2)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[1]").click();
        Playwright_Common_Locators.iframeLocator().locator("//input[@aria-labelledby='label.sc_task.assigned_to']").fill("Kui Wu");
        Playwright_Common_Locators.iframeLocator().getByLabel("Catalog Task form section").getByLabel("State").selectOption("3");
        Playwright_Common_Locators.iframeLocator().locator("//input[@id='sc_task.short_description']").click();
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * Confirms that the ESR Board Intake Review catalog task is completed
     */
    public static void confirmESRBoardIntakeReviewCatalogTaskIsCompleted() {
        assertThat(Playwright_Common_Locators.iframeLocator().locator("//select[@aria-label='Approval']")).containsText("Requested");
    }

    /**
     * Completes the Engineering Project Execution catalog task
     */
    public static void completeEngineeringProjectExecutionCatalogTask() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Catalog Tasks (3)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[1]").click();
        Playwright_Common_Locators.iframeLocator().locator("//input[@aria-labelledby='label.sc_task.assigned_to']").click();
        Playwright_Common_Locators.iframeLocator().locator("//input[@aria-labelledby='label.sc_task.assigned_to']").fill("CBIIT Test Account");
        Playwright_Common_Locators.iframeLocator().getByLabel("Catalog Task form section").getByLabel("State").selectOption("3");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * Confirms that the Engineering Project Execution catalog task is completed
     */
    public static void confirmEngineeringProjectExecutionCatalogTaskIsCompleted() {
        assertThat(Playwright_Common_Locators.iframeLocator().locator("//select[@aria-label='Stage']")).containsText("Closeout Preparation");
    }

    /**
     * Completes the Closeout Preparation catalog task for ESR-Q
     */
    public static void completeCloseoutPreparationCatalogTaskForESRQ() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Catalog Tasks (4)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[1]").click();
        Playwright_Common_Locators.iframeLocator().locator("//input[@aria-labelledby='label.sc_task.assigned_to']").click();
        Playwright_Common_Locators.iframeLocator().locator("//input[@aria-labelledby='label.sc_task.assigned_to']").fill("CBIIT Test Account");
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.ROW, new FrameLocator.GetByRoleOptions().setName("Actual Start Date  Choose")).getByRole(AriaRole.LINK).first().click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Go to Today", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        Playwright_Common_Locators.iframeLocator().locator("(//a[@class=' btn btn-default btn-ref'])[5]").click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Go to Today", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Findings")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Findings")).fill("Findings Test");
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Recommendations").setExact(true)).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Recommendations").setExact(true)).fill("Recommendations Test");
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Justification for")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Justification for")).fill("Justification Test");
        Playwright_Common_Locators.iframeLocator().locator("(//div[@class='sc_variable_editor']/div/select)[4]").selectOption("Proceed to Implementation");
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("   OCIO Federal Lead to")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("   OCIO Federal Lead to")).fill("Jennifer Kwok");
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("   Project Assignment Group")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("   Project Assignment Group")).fill("CHARMS Technical Support");
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Project Lead to implement Q-")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.COMBOBOX, new FrameLocator.GetByRoleOptions().setName("Project Lead to implement Q-")).fill("Larry Brem");
        Playwright_Common_Locators.iframeLocator().getByLabel("Add a row for Technology").click();
        Playwright_Common_Locators.iframeLocator().frameLocator("iframe[name=\"dialog_frame\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Name")).click();
        Playwright_Common_Locators.iframeLocator().frameLocator("iframe[name=\"dialog_frame\"]").getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Name")).fill("Test Technology");
        Playwright_Common_Locators.iframeLocator().frameLocator("iframe[name=\"dialog_frame\"]").getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Add")).click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Catalog Task form section").getByLabel("State").selectOption("3");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * Completes the Closeout Preparation catalog task for ESR-I
     */
    public static void completeCloseoutPreparationCatalogTaskForESRI() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Catalog Tasks (4)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[1]").click();
        Playwright_Common_Locators.iframeLocator().locator("//input[@aria-labelledby='label.sc_task.assigned_to']").click();
        Playwright_Common_Locators.iframeLocator().locator("//input[@aria-labelledby='label.sc_task.assigned_to']").fill("CBIIT Test Account");
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.ROW, new FrameLocator.GetByRoleOptions().setName("Actual Start Date  Choose")).getByRole(AriaRole.LINK).first().click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Go to Today", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        Playwright_Common_Locators.iframeLocator().locator("(//a[@title='Choose date...'])[4]").click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Go to Today", new FrameLocator.GetByLabelOptions().setExact(true)).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Outcomes")).click();
        Playwright_Common_Locators.iframeLocator().getByRole(AriaRole.TEXTBOX, new FrameLocator.GetByRoleOptions().setName("Outcomes")).fill("Outcomes Test");
        Playwright_Common_Locators.iframeLocator().locator("(//select)[8]").selectOption("Proceed to Operations and Maintanence");
        Playwright_Common_Locators.iframeLocator().getByText("Linked all artifacts from the").click();
        Playwright_Common_Locators.iframeLocator().getByText("Conducted knowledge sharing").click();
        Playwright_Common_Locators.iframeLocator().getByLabel("Catalog Task form section").getByLabel("State").selectOption("3");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    /**
     * Confirms that the Closeout Preparation catalog task is completed
     */
    public static void confirmCloseoutPreparationCatalogTaskIsCompleted() {
        assertThat(Playwright_Common_Locators.iframeLocator().locator("//select[@aria-label='Stage']")).containsText("Federal Lead Closeout Approval");
    }

    /**
     * Completes the ESR Board Closeout Review catalog task for an ESR-Q ticket
     */
    public static void completeESRBoardCloseoutReviewCatalogTask() {
        Playwright_Common_Locators.iframeLocator().locator("#tabs2_list").getByText("Catalog Tasks (5)").click();
        Playwright_Common_Locators.iframeLocator().locator("(//td[@class='vt']/a)[1]").click();
        Playwright_Common_Locators.iframeLocator().locator("//input[@aria-labelledby='label.sc_task.assigned_to']").click();
        Playwright_Common_Locators.iframeLocator().locator("//input[@aria-labelledby='label.sc_task.assigned_to']").fill("Kui Wu");
        Playwright_Common_Locators.iframeLocator().getByLabel("Catalog Task form section").getByLabel("State").selectOption("3");
        Playwright_Common_Locators.iframeLocator().locator("#sysverb_update").click();
    }

    public static void confirmESRBoardCloseoutReviewCatalogTaskIsCompleted() {
        assertThat(Playwright_Common_Locators.iframeLocator().locator("//select[@aria-label='Approval']")).containsText("Requested");
    }
}